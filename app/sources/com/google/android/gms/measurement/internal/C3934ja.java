package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ja */
final class C3934ja implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3818ab f10839f;

    /* renamed from: o */
    final /* synthetic */ AppMeasurementDynamiteService f10840o;

    C3934ja(AppMeasurementDynamiteService appMeasurementDynamiteService, C3818ab abVar) {
        this.f10840o = appMeasurementDynamiteService;
        this.f10839f = abVar;
    }

    public final void run() {
        this.f10840o.f10496a.mo12156I().mo12356H(this.f10839f);
    }
}
