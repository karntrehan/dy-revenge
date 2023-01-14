package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
class JSCJavaScriptExecutor extends JavaScriptExecutor {
    static {
        ReactBridge.staticInit();
    }

    JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    public String getName() {
        return "JSCJavaScriptExecutor";
    }
}
