// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$79 {

    static final FunctionDescriptor sodium_memcmp$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle sodium_memcmp$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_memcmp",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$79.sodium_memcmp$FUNC, false
    );
    static final FunctionDescriptor sodium_compare$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle sodium_compare$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_compare",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$79.sodium_compare$FUNC, false
    );
    static final FunctionDescriptor sodium_is_zero$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle sodium_is_zero$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_is_zero",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$79.sodium_is_zero$FUNC, false
    );
    static final FunctionDescriptor sodium_increment$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG
    );
    static final MethodHandle sodium_increment$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_increment",
        "(Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$79.sodium_increment$FUNC, false
    );
    static final FunctionDescriptor sodium_add$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle sodium_add$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_add",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$79.sodium_add$FUNC, false
    );
    static final FunctionDescriptor sodium_sub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle sodium_sub$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_sub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$79.sodium_sub$FUNC, false
    );
}

