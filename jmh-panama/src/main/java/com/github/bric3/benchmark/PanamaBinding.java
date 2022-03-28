/*
 * MIT License
 *
 * Copyright (c) 2021 Brice Dutheil <brice.dutheil@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.bric3.benchmark;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import jdk.incubator.foreign.SymbolLookup;
import org.apache.commons.lang3.SystemUtils;

import java.lang.invoke.MethodHandle;

import static java.nio.charset.StandardCharsets.UTF_8;
import static jdk.incubator.foreign.ValueLayout.ADDRESS;
import static jdk.incubator.foreign.ValueLayout.JAVA_BYTE;
import static jdk.incubator.foreign.ValueLayout.JAVA_INT;
import static jdk.incubator.foreign.ValueLayout.JAVA_LONG;

public class PanamaBinding {
    private static final SymbolLookup libsodiumLookup;

    static {
        System.load(switch (SystemUtils.OS_NAME) {
            case "Linux" -> "/usr/local/lib/libsodium.so";
            case "Mac OS X" -> "/usr/local/lib/libsodium.dylib";
            case "Windows" -> "C:/libsodium/libsodium.dll";
            default -> throw new IllegalStateException(SystemUtils.OS_NAME);
        });
        libsodiumLookup = SymbolLookup.loaderLookup();

        MethodHandle crypto_box_sealbytes =
                CLinker.systemCLinker()
                       .downcallHandle(
                               libsodiumLookup.lookup("sodium_version_string").get(),
                               FunctionDescriptor.of(ADDRESS)
                       );

        try {
            var v = (MemoryAddress) crypto_box_sealbytes.invokeExact();
            System.out.println("PanamaBinding using libsodium " + v.getUtf8String(0));
        } catch (Throwable throwable) {
            throw new ExceptionInInitializerError(throwable);
        }
    }

    // size_t  crypto_box_publickeybytes(void);
    public static final MethodHandle crypto_box_publickeybytes = CLinker.systemCLinker()
                                                                        .downcallHandle(
                                                                                libsodiumLookup.lookup("crypto_box_publickeybytes").get(),
                                                                                FunctionDescriptor.of(JAVA_INT)
                                                                        );
    // crypto_box_secretkeybytes(void);
    public static final MethodHandle crypto_box_secretkeybytes = CLinker.systemCLinker()
                                                                        .downcallHandle(
                                                                                libsodiumLookup.lookup("crypto_box_secretkeybytes").get(),
                                                                                FunctionDescriptor.of(JAVA_INT)
                                                                        );
    // int crypto_box_keypair(unsigned char *pk, unsigned char *sk)
    // __attribute__ ((nonnull));
    public static final MethodHandle crypto_box_keypair = CLinker.systemCLinker().downcallHandle(
            libsodiumLookup.lookup("crypto_box_keypair").get(),
            FunctionDescriptor.ofVoid(ADDRESS, ADDRESS)
    );

    // size_t crypto_box_sealbytes(void);
    private static final MethodHandle crypto_box_sealbytes =
            CLinker.systemCLinker()
                   .downcallHandle(
                           libsodiumLookup.lookup("crypto_box_sealbytes").get(),
                           FunctionDescriptor.of(JAVA_INT));

    public static final MethodHandle crypto_box_seal = CLinker.systemCLinker().downcallHandle(
            libsodiumLookup.lookup("crypto_box_seal").get(),
            // src/libsodium/include/sodium/crypto_box.h
            // SODIUM_EXPORT
            // int crypto_box_seal(unsigned char *c, const unsigned char *m,
            //                    unsigned long long mlen, const unsigned char *pk)
            //            __attribute__ ((nonnull(1, 4)));
            //
            // "(
            //   Ljdk/incubator/foreign/MemoryAddress;
            //   Ljdk/incubator/foreign/MemoryAddress;
            //   J
            //   Ljdk/incubator/foreign/MemoryAddress;
            // )"
            //
            // c.address(), m.address(), mlen, pk.address()
            FunctionDescriptor.of(JAVA_INT,
                                  ADDRESS,
                                  ADDRESS,
                                  JAVA_LONG,
                                  ADDRESS)

    );

    public static final MethodHandle crypto_box_seal_open = CLinker.systemCLinker().downcallHandle(
            libsodiumLookup.lookup("crypto_box_seal_open").get(),
            // "(Ljdk/incubator/foreign/MemoryAddress;
            //   Ljdk/incubator/foreign/MemoryAddress;
            //   J
            //   Ljdk/incubator/foreign/MemoryAddress;
            //   Ljdk/incubator/foreign/MemoryAddress;)I"
            FunctionDescriptor.of(JAVA_INT,
                                  ADDRESS,
                                  ADDRESS,
                                  JAVA_LONG,
                                  ADDRESS,
                                  ADDRESS
            )
    );


    public byte[] cryptoSealedBox(byte[] message) throws Throwable {
        // Recipient creates a long-term key pair
        var keyPair = crypto_box_keypair();

        // Anonymous sender encrypts a message using an ephemeral key pair
        // and the recipient's public key
        var cipherText = crypto_box_seal(message, keyPair.publicKey);

        // Recipient decrypts the ciphertext
        return crypto_box_seal_open(cipherText, keyPair.publicKey, keyPair.secretKey);
    }

    public byte[] cryptoSealedBox_off_heap(byte[] message) throws Throwable {
        try (var scope = ResourceScope.newConfinedScope()) {
            // Recipient creates a long-term key pair
            var segmentAllocator = SegmentAllocator.nativeAllocator(scope);
            var publicKey = segmentAllocator.allocate(crypto_box_publickeybytes());
            var secretKey = segmentAllocator.allocate(crypto_box_secretkeybytes());

            crypto_box_keypair.invoke(publicKey.address(),
                                      secretKey.address());

            // Anonymous sender encrypts a message using an ephemeral key pair
            // and the recipient's public key
            var nativeMessage = segmentAllocator.allocateArray(JAVA_BYTE, message);
            var cipherText = segmentAllocator.allocate(crypto_box_sealbytes() + nativeMessage.byteSize());
            var ret_Seal = (int) crypto_box_seal.invoke(cipherText.address(),
                                                        nativeMessage.address(),
                                                        (long) nativeMessage.byteSize(),
                                                        publicKey.address());

            // Recipient decrypts the ciphertext
            var decipheredText = segmentAllocator.allocateArray(JAVA_BYTE, cipherText.byteSize() - crypto_box_sealbytes());
            var ret_seal_opn = (int) crypto_box_seal_open.invoke(decipheredText.address(),
                                                                 cipherText.address(),
                                                                 (long) cipherText.byteSize(),
                                                                 publicKey.address(),
                                                                 secretKey.address());

            return decipheredText.toArray(JAVA_BYTE);
        }
    }


    public int crypto_box_sealbytes() throws Throwable {
        return (int) crypto_box_sealbytes.invokeExact();
    }

    public int crypto_box_publickeybytes() throws Throwable {
        return (int) crypto_box_publickeybytes.invokeExact();
    }

    public int crypto_box_secretkeybytes() throws Throwable {
        return (int) crypto_box_secretkeybytes.invokeExact();
    }


    public CryptoBoxKeyPair crypto_box_keypair() throws Throwable {
        try (var scope = ResourceScope.newConfinedScope()) {
            var segmentAllocator = SegmentAllocator.nativeAllocator(scope);
            var recipientPublicKey = segmentAllocator.allocate(crypto_box_publickeybytes());
            var recipientSecretKey = segmentAllocator.allocate(crypto_box_secretkeybytes());

            crypto_box_keypair.invoke(recipientPublicKey.address(),
                                      recipientSecretKey.address());

            return new CryptoBoxKeyPair(
                    recipientPublicKey.toArray(JAVA_BYTE),
                    recipientSecretKey.toArray(JAVA_BYTE)
            );
        }
    }


    public byte[] crypto_box_seal(byte[] message,
                                  byte[] publicKey
    ) throws Throwable {
        try (var scope = ResourceScope.newConfinedScope()) {
            var segmentAllocator = SegmentAllocator.nativeAllocator(scope);
            var nativeMessage = segmentAllocator.allocateArray(JAVA_BYTE, message);
            var cipherText = segmentAllocator.allocate(crypto_box_sealbytes() + nativeMessage.byteSize());
            var ret = (int) crypto_box_seal.invoke(
                    cipherText.address(),
                    nativeMessage.address(),
                    (long) nativeMessage.byteSize(),
                    segmentAllocator.allocateArray(JAVA_BYTE, publicKey).address());
            return cipherText.toArray(JAVA_BYTE);
        }
    }

    public byte[] crypto_box_seal_open(byte[] cipherText,
                                       byte[] publicKey,
                                       byte[] secretKey
    ) throws Throwable {
        try (var scope = ResourceScope.newConfinedScope()) {
            var segmentAllocator = SegmentAllocator.newNativeArena(scope);
            var decipheredText = segmentAllocator.allocateArray(JAVA_BYTE, cipherText.length - crypto_box_sealbytes());
            var ret = (int) crypto_box_seal_open.invoke(decipheredText.address(),
                                                        segmentAllocator.allocateArray(JAVA_BYTE, cipherText).address(),
                                                        (long) cipherText.length,
                                                        segmentAllocator.allocateArray(JAVA_BYTE, publicKey).address(),
                                                        segmentAllocator.allocateArray(JAVA_BYTE, secretKey).address());

            return decipheredText.toArray(JAVA_BYTE);
        }
    }

    private record CryptoBoxKeyPair(byte[] publicKey, byte[] secretKey) {
    }

    public static void main(String[] args) throws Throwable {
        PanamaBinding panamaBinding = new PanamaBinding();
        byte[] message = "Panama JEP-412 Binding".getBytes(UTF_8);
        System.out.println(new String(panamaBinding.cryptoSealedBox(message), UTF_8));
        System.out.println(new String(panamaBinding.cryptoSealedBox_off_heap(message), UTF_8));
    }
}
