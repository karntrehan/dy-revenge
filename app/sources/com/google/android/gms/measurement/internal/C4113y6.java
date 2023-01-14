package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
final class C4113y6 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ long f11425f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f11426o;

    C4113y6(C4030r7 r7Var, long j) {
        this.f11426o = r7Var;
        this.f11425f = j;
    }

    public final void run() {
        this.f11426o.mo12386z(this.f11425f, true);
        this.f11426o.f10651a.mo12159L().mo11990S(new AtomicReference());
    }
}
