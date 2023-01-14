package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
final class C3919i8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C6828i1 f10794f;

    /* renamed from: o */
    final /* synthetic */ C4094x f10795o;

    /* renamed from: p */
    final /* synthetic */ String f10796p;

    /* renamed from: q */
    final /* synthetic */ AppMeasurementDynamiteService f10797q;

    C3919i8(AppMeasurementDynamiteService appMeasurementDynamiteService, C6828i1 i1Var, C4094x xVar, String str) {
        this.f10797q = appMeasurementDynamiteService;
        this.f10794f = i1Var;
        this.f10795o = xVar;
        this.f10796p = str;
    }

    public final void run() {
        this.f10797q.f10496a.mo12159L().mo11996p(this.f10794f, this.f10795o, this.f10796p);
    }
}
