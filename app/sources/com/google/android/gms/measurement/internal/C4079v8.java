package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
final class C4079v8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11343f;

    /* renamed from: o */
    final /* synthetic */ boolean f11344o;

    /* renamed from: p */
    final /* synthetic */ C4094x f11345p;

    /* renamed from: q */
    final /* synthetic */ String f11346q;

    /* renamed from: r */
    final /* synthetic */ C3894g9 f11347r;

    C4079v8(C3894g9 g9Var, boolean z, C3844cb cbVar, boolean z2, C4094x xVar, String str) {
        this.f11347r = g9Var;
        this.f11343f = cbVar;
        this.f11344o = z2;
        this.f11345p = xVar;
        this.f11346q = str;
    }

    public final void run() {
        C3894g9 g9Var = this.f11347r;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Discarding data. Failed to send event to service");
            return;
        }
        C3705r.m14346k(this.f11343f);
        this.f11347r.mo11998r(H, this.f11344o ? null : this.f11345p, this.f11343f);
        this.f11347r.m14779E();
    }
}
