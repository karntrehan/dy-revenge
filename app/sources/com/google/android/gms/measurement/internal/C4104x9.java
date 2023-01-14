package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import p174e.p319f.p320a.p335c.p345f.p352g.C6694a1;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
public final class C4104x9 extends C3876f4 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f11407c;

    /* renamed from: d */
    protected final C4092w9 f11408d = new C4092w9(this);

    /* renamed from: e */
    protected final C4080v9 f11409e = new C4080v9(this);

    /* renamed from: f */
    protected final C4056t9 f11410f = new C4056t9(this);

    C4104x9(C3955l5 l5Var) {
        super(l5Var);
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m15390q(C4104x9 x9Var, long j) {
        x9Var.mo11931h();
        x9Var.m15392s();
        x9Var.f10651a.mo11935b().mo12548v().mo12477b("Activity paused, time", Long.valueOf(j));
        x9Var.f11410f.mo12427a(j);
        if (x9Var.f10651a.mo12181z().mo12012D()) {
            x9Var.f11409e.mo12461b(j);
        }
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m15391r(C4104x9 x9Var, long j) {
        x9Var.mo11931h();
        x9Var.m15392s();
        x9Var.f10651a.mo11935b().mo12548v().mo12477b("Activity resumed, time", Long.valueOf(j));
        if (x9Var.f10651a.mo12181z().mo12012D() || x9Var.f10651a.mo12154F().f11122r.mo12128b()) {
            x9Var.f11409e.mo12462c(j);
        }
        x9Var.f11410f.mo12428b();
        C4092w9 w9Var = x9Var.f11408d;
        w9Var.f11380a.mo11931h();
        if (w9Var.f11380a.f10651a.mo12174o()) {
            w9Var.mo12472b(w9Var.f11380a.f10651a.mo11936c().mo11730a(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m15392s() {
        mo11931h();
        if (this.f11407c == null) {
            this.f11407c = new C6694a1(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo11954n() {
        return false;
    }
}
