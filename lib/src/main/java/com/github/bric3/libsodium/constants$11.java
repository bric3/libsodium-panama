// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$11 {

    static final FunctionDescriptor crypto_auth_hmacsha512_statebytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_auth_hmacsha512_statebytes$MH = RuntimeHelper.downcallHandle(
        "crypto_auth_hmacsha512_statebytes",
        constants$11.crypto_auth_hmacsha512_statebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_auth_hmacsha512_init$MH = RuntimeHelper.downcallHandle(
        "crypto_auth_hmacsha512_init",
        constants$11.crypto_auth_hmacsha512_init$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512_update$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_auth_hmacsha512_update$MH = RuntimeHelper.downcallHandle(
        "crypto_auth_hmacsha512_update",
        constants$11.crypto_auth_hmacsha512_update$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512_final$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_auth_hmacsha512_final$MH = RuntimeHelper.downcallHandle(
        "crypto_auth_hmacsha512_final",
        constants$11.crypto_auth_hmacsha512_final$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512_keygen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_auth_hmacsha512_keygen$MH = RuntimeHelper.downcallHandle(
        "crypto_auth_hmacsha512_keygen",
        constants$11.crypto_auth_hmacsha512_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512256_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_auth_hmacsha512256_bytes$MH = RuntimeHelper.downcallHandle(
        "crypto_auth_hmacsha512256_bytes",
        constants$11.crypto_auth_hmacsha512256_bytes$FUNC, false
    );
}


