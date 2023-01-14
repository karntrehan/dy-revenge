package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public abstract class NativeArray implements NativeArrayInterface {
    @C6410a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    protected NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}
