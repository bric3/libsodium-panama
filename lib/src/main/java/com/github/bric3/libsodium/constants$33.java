// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor crypto_generichash_keybytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_generichash_keybytes$MH = RuntimeHelper.downcallHandle(
        "crypto_generichash_keybytes",
        constants$33.crypto_generichash_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_generichash_primitive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle crypto_generichash_primitive$MH = RuntimeHelper.downcallHandle(
        "crypto_generichash_primitive",
        constants$33.crypto_generichash_primitive$FUNC, false
    );
    static final FunctionDescriptor crypto_generichash_statebytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_generichash_statebytes$MH = RuntimeHelper.downcallHandle(
        "crypto_generichash_statebytes",
        constants$33.crypto_generichash_statebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_generichash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_generichash$MH = RuntimeHelper.downcallHandle(
        "crypto_generichash",
        constants$33.crypto_generichash$FUNC, false
    );
    static final FunctionDescriptor crypto_generichash_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_generichash_init$MH = RuntimeHelper.downcallHandle(
        "crypto_generichash_init",
        constants$33.crypto_generichash_init$FUNC, false
    );
    static final FunctionDescriptor crypto_generichash_update$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_generichash_update$MH = RuntimeHelper.downcallHandle(
        "crypto_generichash_update",
        constants$33.crypto_generichash_update$FUNC, false
    );
}


