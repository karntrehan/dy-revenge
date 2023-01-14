package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
final class C3932j8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f10829f;

    /* renamed from: o */
    final /* synthetic */ boolean f10830o;

    /* renamed from: p */
    final /* synthetic */ C4045sa f10831p;

    /* renamed from: q */
    final /* synthetic */ C3894g9 f10832q;

    C3932j8(C3894g9 g9Var, C3844cb cbVar, boolean z, C4045sa saVar) {
        this.f10832q = g9Var;
        this.f10829f = cbVar;
        this.f10830o = z;
        this.f10831p = saVar;
    }

    public final void run() {
        C3894g9 g9Var = this.f10832q;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Discarding data. Failed to set user property");
            return;
        }
        C3705r.m14346k(this.f10829f);
        this.f10832q.mo11998r(H, this.f10830o ? null : this.f10831p, this.f10829f);
        this.f10832q.m14779E();
    }
}
