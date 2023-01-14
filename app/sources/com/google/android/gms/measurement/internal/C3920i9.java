package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
final class C3920i9 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C6828i1 f10798f;

    /* renamed from: o */
    final /* synthetic */ String f10799o;

    /* renamed from: p */
    final /* synthetic */ String f10800p;

    /* renamed from: q */
    final /* synthetic */ boolean f10801q;

    /* renamed from: r */
    final /* synthetic */ AppMeasurementDynamiteService f10802r;

    C3920i9(AppMeasurementDynamiteService appMeasurementDynamiteService, C6828i1 i1Var, String str, String str2, boolean z) {
        this.f10802r = appMeasurementDynamiteService;
        this.f10798f = i1Var;
        this.f10799o = str;
        this.f10800p = str2;
        this.f10801q = z;
    }

    public final void run() {
        this.f10802r.f10496a.mo12159L().mo11993V(this.f10798f, this.f10799o, this.f10800p, this.f10801q);
    }
}
