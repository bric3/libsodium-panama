// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$44 {

    static final FunctionDescriptor crypto_pwhash_argon2i_memlimit_moderate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_argon2i_memlimit_moderate$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_argon2i_memlimit_moderate",
        constants$44.crypto_pwhash_argon2i_memlimit_moderate$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_opslimit_sensitive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_argon2i_opslimit_sensitive$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_argon2i_opslimit_sensitive",
        constants$44.crypto_pwhash_argon2i_opslimit_sensitive$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_memlimit_sensitive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_argon2i_memlimit_sensitive$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_argon2i_memlimit_sensitive",
        constants$44.crypto_pwhash_argon2i_memlimit_sensitive$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle crypto_pwhash_argon2i$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_argon2i",
        constants$44.crypto_pwhash_argon2i$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_str$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_pwhash_argon2i_str$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_argon2i_str",
        constants$44.crypto_pwhash_argon2i_str$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_str_verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_pwhash_argon2i_str_verify$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_argon2i_str_verify",
        constants$44.crypto_pwhash_argon2i_str_verify$FUNC, false
    );
}


