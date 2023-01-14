package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
final class C4076v5 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11339f;

    /* renamed from: o */
    final /* synthetic */ C3852d6 f11340o;

    C4076v5(C3852d6 d6Var, C3844cb cbVar) {
        this.f11340o = d6Var;
        this.f11339f = cbVar;
    }

    public final void run() {
        this.f11340o.f10629a.mo12284e();
        C4009pa Y = this.f11340o.f10629a;
        C3844cb cbVar = this.f11339f;
        Y.mo11934a().mo11931h();
        Y.mo12286g();
        C3705r.m14342g(cbVar.f10593f);
        C3923j b = C3923j.m14935b(cbVar.f10590I);
        C3923j V = Y.mo12276V(cbVar.f10593f);
        Y.mo11935b().mo12548v().mo12478c("Setting consent, package, consent", cbVar.f10593f, b);
        Y.mo12267A(cbVar.f10593f, b);
        if (b.mo12124k(V)) {
            Y.mo12306v(cbVar);
        }
    }
}
