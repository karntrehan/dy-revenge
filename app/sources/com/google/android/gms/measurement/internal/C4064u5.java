package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
final class C4064u5 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11318f;

    /* renamed from: o */
    final /* synthetic */ C3852d6 f11319o;

    C4064u5(C3852d6 d6Var, C3844cb cbVar) {
        this.f11319o = d6Var;
        this.f11318f = cbVar;
    }

    public final void run() {
        this.f11319o.f10629a.mo12284e();
        C4009pa Y = this.f11319o.f10629a;
        C3844cb cbVar = this.f11318f;
        Y.mo11934a().mo11931h();
        Y.mo12286g();
        C3705r.m14342g(cbVar.f10593f);
        Y.mo12273S(cbVar);
    }
}
