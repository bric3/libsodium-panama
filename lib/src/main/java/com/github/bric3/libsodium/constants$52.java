// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$52 {

    static final FunctionDescriptor crypto_pwhash_memlimit_sensitive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_memlimit_sensitive$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_memlimit_sensitive",
        constants$52.crypto_pwhash_memlimit_sensitive$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle crypto_pwhash$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash",
        constants$52.crypto_pwhash$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_str$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_pwhash_str$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_str",
        constants$52.crypto_pwhash_str$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_str_alg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle crypto_pwhash_str_alg$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_str_alg",
        constants$52.crypto_pwhash_str_alg$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_str_verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_pwhash_str_verify$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_str_verify",
        constants$52.crypto_pwhash_str_verify$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_str_needs_rehash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_pwhash_str_needs_rehash$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_str_needs_rehash",
        constants$52.crypto_pwhash_str_needs_rehash$FUNC, false
    );
}


