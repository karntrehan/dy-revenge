package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class JSCExecutor extends JavaScriptExecutor {
    static {
        m11086a();
    }

    JSCExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    /* renamed from: a */
    public static void m11086a() {
        SoLoader.m12782j("jscexecutor");
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    public String getName() {
        return "JSCExecutor";
    }
}
