// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$94 {

    static final FunctionDescriptor crypto_scalarmult_ed25519_base$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_scalarmult_ed25519_base$MH = RuntimeHelper.downcallHandle(
        "crypto_scalarmult_ed25519_base",
        constants$94.crypto_scalarmult_ed25519_base$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ed25519_base_noclamp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_scalarmult_ed25519_base_noclamp$MH = RuntimeHelper.downcallHandle(
        "crypto_scalarmult_ed25519_base_noclamp",
        constants$94.crypto_scalarmult_ed25519_base_noclamp$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ristretto255_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_scalarmult_ristretto255_bytes$MH = RuntimeHelper.downcallHandle(
        "crypto_scalarmult_ristretto255_bytes",
        constants$94.crypto_scalarmult_ristretto255_bytes$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ristretto255_scalarbytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_scalarmult_ristretto255_scalarbytes$MH = RuntimeHelper.downcallHandle(
        "crypto_scalarmult_ristretto255_scalarbytes",
        constants$94.crypto_scalarmult_ristretto255_scalarbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ristretto255$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_scalarmult_ristretto255$MH = RuntimeHelper.downcallHandle(
        "crypto_scalarmult_ristretto255",
        constants$94.crypto_scalarmult_ristretto255$FUNC, false
    );
    static final FunctionDescriptor crypto_scalarmult_ristretto255_base$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_scalarmult_ristretto255_base$MH = RuntimeHelper.downcallHandle(
        "crypto_scalarmult_ristretto255_base",
        constants$94.crypto_scalarmult_ristretto255_base$FUNC, false
    );
}


