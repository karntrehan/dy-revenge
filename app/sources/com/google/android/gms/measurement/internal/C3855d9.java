package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
final class C3855d9 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3881f9 f10639f;

    C3855d9(C3881f9 f9Var) {
        this.f10639f = f9Var;
    }

    public final void run() {
        C3894g9 g9Var = this.f10639f.f10676c;
        Context f = g9Var.f10651a.mo11938f();
        this.f10639f.f10676c.f10651a.mo11937d();
        C3894g9.m14786M(g9Var, new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
