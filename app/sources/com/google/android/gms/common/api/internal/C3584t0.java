package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
final class C3584t0 extends C3556m1 {

    /* renamed from: a */
    private final WeakReference<C3588u0> f10099a;

    C3584t0(C3588u0 u0Var) {
        this.f10099a = new WeakReference<>(u0Var);
    }

    /* renamed from: a */
    public final void mo11384a() {
        C3588u0 u0Var = (C3588u0) this.f10099a.get();
        if (u0Var != null) {
            C3588u0.m13960v(u0Var);
        }
    }
}
