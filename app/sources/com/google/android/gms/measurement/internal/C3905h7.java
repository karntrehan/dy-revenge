package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
final class C3905h7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C6828i1 f10757f;

    /* renamed from: o */
    final /* synthetic */ AppMeasurementDynamiteService f10758o;

    C3905h7(AppMeasurementDynamiteService appMeasurementDynamiteService, C6828i1 i1Var) {
        this.f10758o = appMeasurementDynamiteService;
        this.f10757f = i1Var;
    }

    public final void run() {
        this.f10758o.f10496a.mo12159L().mo11989R(this.f10757f);
    }
}
