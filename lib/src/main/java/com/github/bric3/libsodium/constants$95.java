// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$95 {

    static final FunctionDescriptor crypto_secretbox_xchacha20poly1305_keybytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_xchacha20poly1305_keybytes$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_xchacha20poly1305_keybytes",
        constants$95.crypto_secretbox_xchacha20poly1305_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_xchacha20poly1305_noncebytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_xchacha20poly1305_noncebytes$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_xchacha20poly1305_noncebytes",
        constants$95.crypto_secretbox_xchacha20poly1305_noncebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_xchacha20poly1305_macbytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_xchacha20poly1305_macbytes$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_xchacha20poly1305_macbytes",
        constants$95.crypto_secretbox_xchacha20poly1305_macbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_xchacha20poly1305_messagebytes_max$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_secretbox_xchacha20poly1305_messagebytes_max$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_xchacha20poly1305_messagebytes_max",
        constants$95.crypto_secretbox_xchacha20poly1305_messagebytes_max$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_xchacha20poly1305_easy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_secretbox_xchacha20poly1305_easy$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_xchacha20poly1305_easy",
        constants$95.crypto_secretbox_xchacha20poly1305_easy$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_xchacha20poly1305_open_easy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_secretbox_xchacha20poly1305_open_easy$MH = RuntimeHelper.downcallHandle(
        "crypto_secretbox_xchacha20poly1305_open_easy",
        constants$95.crypto_secretbox_xchacha20poly1305_open_easy$FUNC, false
    );
}


