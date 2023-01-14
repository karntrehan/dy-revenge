package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b0 */
final class C3820b0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f10531f;

    /* renamed from: o */
    final /* synthetic */ long f10532o;

    /* renamed from: p */
    final /* synthetic */ C3848d2 f10533p;

    C3820b0(C3848d2 d2Var, String str, long j) {
        this.f10533p = d2Var;
        this.f10531f = str;
        this.f10532o = j;
    }

    public final void run() {
        C3848d2.m14676j(this.f10533p, this.f10531f, this.f10532o);
    }
}
