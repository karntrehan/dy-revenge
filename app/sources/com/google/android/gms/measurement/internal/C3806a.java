package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a */
final class C3806a implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f10498f;

    /* renamed from: o */
    final /* synthetic */ long f10499o;

    /* renamed from: p */
    final /* synthetic */ C3848d2 f10500p;

    C3806a(C3848d2 d2Var, String str, long j) {
        this.f10500p = d2Var;
        this.f10498f = str;
        this.f10499o = j;
    }

    public final void run() {
        C3848d2.m14675i(this.f10500p, this.f10498f, this.f10499o);
    }
}
