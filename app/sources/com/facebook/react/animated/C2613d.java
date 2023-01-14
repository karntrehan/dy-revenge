package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.d */
abstract class C2613d {

    /* renamed from: a */
    boolean f7661a = false;

    /* renamed from: b */
    C2636s f7662b;

    /* renamed from: c */
    Callback f7663c;

    /* renamed from: d */
    int f7664d;

    C2613d() {
    }

    /* renamed from: a */
    public void mo8428a(ReadableMap readableMap) {
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }

    /* renamed from: b */
    public abstract void mo8429b(long j);
}
