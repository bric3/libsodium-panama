// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$56 {

    static final FunctionDescriptor crypto_secretbox_xsalsa20poly1305_zerobytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_xsalsa20poly1305_zerobytes$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_xsalsa20poly1305_zerobytes",
        constants$56.crypto_secretbox_xsalsa20poly1305_zerobytes$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_keybytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_keybytes$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_keybytes",
        constants$56.crypto_secretbox_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_noncebytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_noncebytes$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_noncebytes",
        constants$56.crypto_secretbox_noncebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_macbytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_macbytes$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_macbytes",
        constants$56.crypto_secretbox_macbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_primitive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle crypto_secretbox_primitive$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_primitive",
        constants$56.crypto_secretbox_primitive$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_messagebytes_max$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_messagebytes_max$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_messagebytes_max",
        constants$56.crypto_secretbox_messagebytes_max$FUNC, false
    );
}


