// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$63 {

    static final FunctionDescriptor crypto_secretstream_xchacha20poly1305_pull$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_secretstream_xchacha20poly1305_pull$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretstream_xchacha20poly1305_pull",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;J)I",
        constants$63.crypto_secretstream_xchacha20poly1305_pull$FUNC, false
    );
    static final FunctionDescriptor crypto_secretstream_xchacha20poly1305_rekey$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_secretstream_xchacha20poly1305_rekey$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretstream_xchacha20poly1305_rekey",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$63.crypto_secretstream_xchacha20poly1305_rekey$FUNC, false
    );
    static final FunctionDescriptor crypto_shorthash_siphash24_bytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_shorthash_siphash24_bytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_shorthash_siphash24_bytes",
        "()J",
        constants$63.crypto_shorthash_siphash24_bytes$FUNC, false
    );
    static final FunctionDescriptor crypto_shorthash_siphash24_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_shorthash_siphash24_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_shorthash_siphash24_keybytes",
        "()J",
        constants$63.crypto_shorthash_siphash24_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_shorthash_siphash24$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle crypto_shorthash_siphash24$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_shorthash_siphash24",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$63.crypto_shorthash_siphash24$FUNC, false
    );
    static final FunctionDescriptor crypto_shorthash_siphashx24_bytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_shorthash_siphashx24_bytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_shorthash_siphashx24_bytes",
        "()J",
        constants$63.crypto_shorthash_siphashx24_bytes$FUNC, false
    );
}

