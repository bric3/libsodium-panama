// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$68 {

    static final FunctionDescriptor crypto_sign_ed25519ph_update$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_sign_ed25519ph_update$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_sign_ed25519ph_update",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$68.crypto_sign_ed25519ph_update$FUNC, false
    );
    static final FunctionDescriptor crypto_sign_ed25519ph_final_create$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_sign_ed25519ph_final_create$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_sign_ed25519ph_final_create",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$68.crypto_sign_ed25519ph_final_create$FUNC, false
    );
    static final FunctionDescriptor crypto_sign_ed25519ph_final_verify$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_sign_ed25519ph_final_verify$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_sign_ed25519ph_final_verify",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$68.crypto_sign_ed25519ph_final_verify$FUNC, false
    );
    static final FunctionDescriptor crypto_sign_statebytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_sign_statebytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_sign_statebytes",
        "()J",
        constants$68.crypto_sign_statebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_sign_bytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_sign_bytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_sign_bytes",
        "()J",
        constants$68.crypto_sign_bytes$FUNC, false
    );
    static final FunctionDescriptor crypto_sign_seedbytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_sign_seedbytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_sign_seedbytes",
        "()J",
        constants$68.crypto_sign_seedbytes$FUNC, false
    );
}

