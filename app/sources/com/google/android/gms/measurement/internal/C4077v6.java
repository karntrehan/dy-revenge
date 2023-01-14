package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
final class C4077v6 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ long f11341f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f11342o;

    C4077v6(C4030r7 r7Var, long j) {
        this.f11342o = r7Var;
        this.f11341f = j;
    }

    public final void run() {
        this.f11342o.f10651a.mo12154F().f11116l.mo12148b(this.f11341f);
        this.f11342o.f10651a.mo11935b().mo12543q().mo12477b("Session timeout duration set", Long.valueOf(this.f11341f));
    }
}
