package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class CxxCallbackImpl implements Callback {
    @C6410a
    private final HybridData mHybridData;

    @C6410a
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeInvoke(NativeArray nativeArray);

    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
