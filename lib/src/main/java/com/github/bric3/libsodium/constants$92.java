// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$92 {

    static final FunctionDescriptor crypto_core_ristretto255_scalar_random$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ristretto255_scalar_random$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ristretto255_scalar_random",
        constants$92.crypto_core_ristretto255_scalar_random$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ristretto255_scalar_invert$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ristretto255_scalar_invert$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ristretto255_scalar_invert",
        constants$92.crypto_core_ristretto255_scalar_invert$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ristretto255_scalar_negate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ristretto255_scalar_negate$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ristretto255_scalar_negate",
        constants$92.crypto_core_ristretto255_scalar_negate$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ristretto255_scalar_complement$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ristretto255_scalar_complement$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ristretto255_scalar_complement",
        constants$92.crypto_core_ristretto255_scalar_complement$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ristretto255_scalar_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ristretto255_scalar_add$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ristretto255_scalar_add",
        constants$92.crypto_core_ristretto255_scalar_add$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ristretto255_scalar_sub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ristretto255_scalar_sub$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ristretto255_scalar_sub",
        constants$92.crypto_core_ristretto255_scalar_sub$FUNC, false
    );
}


