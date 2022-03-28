// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor crypto_aead_aes256gcm_encrypt_detached$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_aead_aes256gcm_encrypt_detached$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_aes256gcm_encrypt_detached",
        constants$3.crypto_aead_aes256gcm_encrypt_detached$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_aes256gcm_decrypt_detached$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
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
    static final MethodHandle crypto_aead_aes256gcm_decrypt_detached$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_aes256gcm_decrypt_detached",
        constants$3.crypto_aead_aes256gcm_decrypt_detached$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_aes256gcm_beforenm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_aead_aes256gcm_beforenm$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_aes256gcm_beforenm",
        constants$3.crypto_aead_aes256gcm_beforenm$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_aes256gcm_encrypt_afternm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_aead_aes256gcm_encrypt_afternm$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_aes256gcm_encrypt_afternm",
        constants$3.crypto_aead_aes256gcm_encrypt_afternm$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_aes256gcm_decrypt_afternm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_aead_aes256gcm_decrypt_afternm$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_aes256gcm_decrypt_afternm",
        constants$3.crypto_aead_aes256gcm_decrypt_afternm$FUNC, false
    );
    static final FunctionDescriptor crypto_aead_aes256gcm_encrypt_detached_afternm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_aead_aes256gcm_encrypt_detached_afternm$MH = RuntimeHelper.downcallHandle(
        "crypto_aead_aes256gcm_encrypt_detached_afternm",
        constants$3.crypto_aead_aes256gcm_encrypt_detached_afternm$FUNC, false
    );
}


