package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p */
final class C3998p implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3891g6 f11102f;

    /* renamed from: o */
    final /* synthetic */ C4010q f11103o;

    C3998p(C4010q qVar, C3891g6 g6Var) {
        this.f11103o = qVar;
        this.f11102f = g6Var;
    }

    public final void run() {
        this.f11102f.mo11937d();
        if (C3832c.m14640a()) {
            this.f11102f.mo11934a().mo12110z(this);
            return;
        }
        boolean e = this.f11103o.mo12314e();
        this.f11103o.f11183d = 0;
        if (e) {
            this.f11103o.mo12312c();
        }
    }
}
