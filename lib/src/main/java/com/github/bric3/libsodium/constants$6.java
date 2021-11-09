// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$6 {

    static final FunctionDescriptor crypto_aead_chacha20poly1305_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_aead_chacha20poly1305_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_aead_chacha20poly1305_keybytes",
        "()J",
        constants$6.crypto_aead_chacha20poly1305_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_nsecbytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_aead_chacha20poly1305_nsecbytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_aead_chacha20poly1305_nsecbytes",
        "()J",
        constants$6.crypto_aead_chacha20poly1305_nsecbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_npubbytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_aead_chacha20poly1305_npubbytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_aead_chacha20poly1305_npubbytes",
        "()J",
        constants$6.crypto_aead_chacha20poly1305_npubbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_abytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_aead_chacha20poly1305_abytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_aead_chacha20poly1305_abytes",
        "()J",
        constants$6.crypto_aead_chacha20poly1305_abytes$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_messagebytes_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_aead_chacha20poly1305_messagebytes_max$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_aead_chacha20poly1305_messagebytes_max",
        "()J",
        constants$6.crypto_aead_chacha20poly1305_messagebytes_max$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_encrypt$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_aead_chacha20poly1305_encrypt$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_aead_chacha20poly1305_encrypt",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$6.crypto_aead_chacha20poly1305_encrypt$FUNC, false
    );
}

