package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
final class C4091w8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11375f;

    /* renamed from: o */
    final /* synthetic */ boolean f11376o;

    /* renamed from: p */
    final /* synthetic */ C3845d f11377p;

    /* renamed from: q */
    final /* synthetic */ C3845d f11378q;

    /* renamed from: r */
    final /* synthetic */ C3894g9 f11379r;

    C4091w8(C3894g9 g9Var, boolean z, C3844cb cbVar, boolean z2, C3845d dVar, C3845d dVar2) {
        this.f11379r = g9Var;
        this.f11375f = cbVar;
        this.f11376o = z2;
        this.f11377p = dVar;
        this.f11378q = dVar2;
    }

    public final void run() {
        C3894g9 g9Var = this.f11379r;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C3705r.m14346k(this.f11375f);
        this.f11379r.mo11998r(H, this.f11376o ? null : this.f11377p, this.f11375f);
        this.f11379r.m14779E();
    }
}
