// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$34 {

    static final FunctionDescriptor crypto_generichash_final$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle crypto_generichash_final$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_generichash_final",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$34.crypto_generichash_final$FUNC, false
    );
    static final FunctionDescriptor crypto_generichash_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_generichash_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_generichash_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$34.crypto_generichash_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_hash_bytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_hash_bytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_hash_bytes",
        "()J",
        constants$34.crypto_hash_bytes$FUNC, false
    );
    static final FunctionDescriptor crypto_hash$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_hash$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_hash",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$34.crypto_hash$FUNC, false
    );
    static final FunctionDescriptor crypto_hash_primitive$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle crypto_hash_primitive$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_hash_primitive",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$34.crypto_hash_primitive$FUNC, false
    );
    static final FunctionDescriptor crypto_kdf_blake2b_bytes_min$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_kdf_blake2b_bytes_min$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_kdf_blake2b_bytes_min",
        "()J",
        constants$34.crypto_kdf_blake2b_bytes_min$FUNC, false
    );
}

