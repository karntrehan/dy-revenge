package com.swmansion.reanimated.layoutReanimation;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.Map;
import p174e.p247e.p317m.p318a.C6410a;

public class LayoutAnimations {

    /* renamed from: a */
    private WeakReference<ReactApplicationContext> f26590a;
    @C6410a
    private final HybridData mHybridData = initHybrid();

    static {
        System.loadLibrary("reanimated");
    }

    public LayoutAnimations(ReactApplicationContext reactApplicationContext) {
        this.f26590a = new WeakReference<>(reactApplicationContext);
    }

    private native HybridData initHybrid();

    public native boolean isLayoutAnimationEnabled();

    public native void removeConfigForTag(int i);

    public native void startAnimationForTag(int i, String str, Map<String, String> map);
}
