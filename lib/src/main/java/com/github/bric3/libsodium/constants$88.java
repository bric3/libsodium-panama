// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$88 {

    static final FunctionDescriptor crypto_core_ed25519_nonreducedscalarbytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_core_ed25519_nonreducedscalarbytes$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ed25519_nonreducedscalarbytes",
        constants$88.crypto_core_ed25519_nonreducedscalarbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ed25519_is_valid_point$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ed25519_is_valid_point$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ed25519_is_valid_point",
        constants$88.crypto_core_ed25519_is_valid_point$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ed25519_add$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ed25519_add$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ed25519_add",
        constants$88.crypto_core_ed25519_add$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ed25519_sub$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ed25519_sub$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ed25519_sub",
        constants$88.crypto_core_ed25519_sub$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ed25519_from_uniform$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ed25519_from_uniform$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ed25519_from_uniform",
        constants$88.crypto_core_ed25519_from_uniform$FUNC, false
    );
    static final FunctionDescriptor crypto_core_ed25519_from_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_core_ed25519_from_hash$MH = RuntimeHelper.downcallHandle(
        "crypto_core_ed25519_from_hash",
        constants$88.crypto_core_ed25519_from_hash$FUNC, false
    );
}


