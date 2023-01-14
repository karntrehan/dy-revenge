package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.C2790a;

/* renamed from: com.facebook.react.uimanager.f */
public abstract class C2961f extends C2790a.C2791a {

    /* renamed from: b */
    private final ReactContext f8287b;

    protected C2961f(ReactContext reactContext) {
        this.f8287b = reactContext;
    }

    /* renamed from: a */
    public final void mo9129a(long j) {
        try {
            mo8416c(j);
        } catch (RuntimeException e) {
            this.f8287b.handleException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo8416c(long j);
}
