// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$72 {

    static final FunctionDescriptor crypto_stream$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_stream$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$72.crypto_stream$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_xor$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_stream_xor$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_xor",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$72.crypto_stream_xor$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_stream_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$72.crypto_stream_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_salsa20_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_salsa20_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa20_keybytes",
        "()J",
        constants$72.crypto_stream_salsa20_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_salsa20_noncebytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_salsa20_noncebytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa20_noncebytes",
        "()J",
        constants$72.crypto_stream_salsa20_noncebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_salsa20_messagebytes_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_salsa20_messagebytes_max$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa20_messagebytes_max",
        "()J",
        constants$72.crypto_stream_salsa20_messagebytes_max$FUNC, false
    );
}

