// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$50 {

    static final FunctionDescriptor crypto_pwhash_saltbytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_saltbytes$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_saltbytes",
        constants$50.crypto_pwhash_saltbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_strbytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_strbytes$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_strbytes",
        constants$50.crypto_pwhash_strbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_strprefix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle crypto_pwhash_strprefix$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_strprefix",
        constants$50.crypto_pwhash_strprefix$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_opslimit_min$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_opslimit_min$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_opslimit_min",
        constants$50.crypto_pwhash_opslimit_min$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_opslimit_max$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_opslimit_max$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_opslimit_max",
        constants$50.crypto_pwhash_opslimit_max$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_memlimit_min$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_pwhash_memlimit_min$MH = RuntimeHelper.downcallHandle(
        "crypto_pwhash_memlimit_min",
        constants$50.crypto_pwhash_memlimit_min$FUNC, false
    );
}


