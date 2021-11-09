// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$94 {

    static final FunctionDescriptor crypto_scalarmult_ed25519_base$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_scalarmult_ed25519_base$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_scalarmult_ed25519_base",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$94.crypto_scalarmult_ed25519_base$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ed25519_base_noclamp$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_scalarmult_ed25519_base_noclamp$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_scalarmult_ed25519_base_noclamp",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$94.crypto_scalarmult_ed25519_base_noclamp$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ristretto255_bytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_scalarmult_ristretto255_bytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_scalarmult_ristretto255_bytes",
        "()J",
        constants$94.crypto_scalarmult_ristretto255_bytes$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ristretto255_scalarbytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_scalarmult_ristretto255_scalarbytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_scalarmult_ristretto255_scalarbytes",
        "()J",
        constants$94.crypto_scalarmult_ristretto255_scalarbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ristretto255$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_scalarmult_ristretto255$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_scalarmult_ristretto255",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$94.crypto_scalarmult_ristretto255$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ristretto255_base$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_scalarmult_ristretto255_base$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_scalarmult_ristretto255_base",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$94.crypto_scalarmult_ristretto255_base$FUNC, false
    );
}

