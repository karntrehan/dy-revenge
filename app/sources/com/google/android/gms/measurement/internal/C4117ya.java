package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.ya */
final class C4117ya implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C6828i1 f11440f;

    /* renamed from: o */
    final /* synthetic */ String f11441o;

    /* renamed from: p */
    final /* synthetic */ String f11442p;

    /* renamed from: q */
    final /* synthetic */ AppMeasurementDynamiteService f11443q;

    C4117ya(AppMeasurementDynamiteService appMeasurementDynamiteService, C6828i1 i1Var, String str, String str2) {
        this.f11443q = appMeasurementDynamiteService;
        this.f11440f = i1Var;
        this.f11441o = str;
        this.f11442p = str2;
    }

    public final void run() {
        this.f11443q.f10496a.mo12159L().mo11991T(this.f11440f, this.f11441o, this.f11442p);
    }
}
