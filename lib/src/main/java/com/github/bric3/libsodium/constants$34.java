// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$34 {

    static final FunctionDescriptor crypto_generichash_final$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_generichash_final$MH = RuntimeHelper.downcallHandle(
        "crypto_generichash_final",
        constants$34.crypto_generichash_final$FUNC, false
    );
    static final FunctionDescriptor crypto_generichash_keygen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypto_generichash_keygen$MH = RuntimeHelper.downcallHandle(
        "crypto_generichash_keygen",
        constants$34.crypto_generichash_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_hash_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_hash_bytes$MH = RuntimeHelper.downcallHandle(
        "crypto_hash_bytes",
        constants$34.crypto_hash_bytes$FUNC, false
    );
    static final FunctionDescriptor crypto_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle crypto_hash$MH = RuntimeHelper.downcallHandle(
        "crypto_hash",
        constants$34.crypto_hash$FUNC, false
    );
    static final FunctionDescriptor crypto_hash_primitive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle crypto_hash_primitive$MH = RuntimeHelper.downcallHandle(
        "crypto_hash_primitive",
        constants$34.crypto_hash_primitive$FUNC, false
    );
    static final FunctionDescriptor crypto_kdf_blake2b_bytes_min$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle crypto_kdf_blake2b_bytes_min$MH = RuntimeHelper.downcallHandle(
        "crypto_kdf_blake2b_bytes_min",
        constants$34.crypto_kdf_blake2b_bytes_min$FUNC, false
    );
}


