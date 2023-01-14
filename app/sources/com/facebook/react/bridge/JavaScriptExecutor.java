package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    protected JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.resetNative();
    }

    public abstract String getName();
}
