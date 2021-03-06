// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$4 {

    static final FunctionDescriptor crypto_aead_aes256gcm_decrypt_detached_afternm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_aead_aes256gcm_decrypt_detached_afternm$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_aes256gcm_decrypt_detached_afternm",
        constants$4.crypto_aead_aes256gcm_decrypt_detached_afternm$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_aes256gcm_keygen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_aead_aes256gcm_keygen$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_aes256gcm_keygen",
        constants$4.crypto_aead_aes256gcm_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_ietf_keybytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_aead_chacha20poly1305_ietf_keybytes$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_chacha20poly1305_ietf_keybytes",
        constants$4.crypto_aead_chacha20poly1305_ietf_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_ietf_nsecbytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_aead_chacha20poly1305_ietf_nsecbytes$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_chacha20poly1305_ietf_nsecbytes",
        constants$4.crypto_aead_chacha20poly1305_ietf_nsecbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_ietf_npubbytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_aead_chacha20poly1305_ietf_npubbytes$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_chacha20poly1305_ietf_npubbytes",
        constants$4.crypto_aead_chacha20poly1305_ietf_npubbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_chacha20poly1305_ietf_abytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_aead_chacha20poly1305_ietf_abytes$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_chacha20poly1305_ietf_abytes",
        constants$4.crypto_aead_chacha20poly1305_ietf_abytes$FUNC, false
    );
}


