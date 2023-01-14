package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.b9 */
final class C3829b9 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ ComponentName f10550f;

    /* renamed from: o */
    final /* synthetic */ C3881f9 f10551o;

    C3829b9(C3881f9 f9Var, ComponentName componentName) {
        this.f10551o = f9Var;
        this.f10550f = componentName;
    }

    public final void run() {
        C3894g9.m14786M(this.f10551o.f10676c, this.f10550f);
    }
}
