package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    @C6410a
    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void run();
}
