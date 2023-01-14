package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6775ee;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
final class C3839c6 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f10571f;

    /* renamed from: o */
    final /* synthetic */ String f10572o;

    /* renamed from: p */
    final /* synthetic */ String f10573p;

    /* renamed from: q */
    final /* synthetic */ long f10574q;

    /* renamed from: r */
    final /* synthetic */ C3852d6 f10575r;

    C3839c6(C3852d6 d6Var, String str, String str2, String str3, long j) {
        this.f10575r = d6Var;
        this.f10571f = str;
        this.f10572o = str2;
        this.f10573p = str3;
        this.f10574q = j;
    }

    public final void run() {
        C6775ee.m25666b();
        if (this.f10575r.f10629a.mo12275U().mo12010B((String) null, C3966m3.f11011m0)) {
            String str = this.f10571f;
            if (str == null) {
                this.f10575r.f10629a.mo12307w(this.f10572o, (C4114y7) null);
                return;
            }
            this.f10575r.f10629a.mo12307w(this.f10572o, new C4114y7(this.f10573p, str, this.f10574q));
            return;
        }
        String str2 = this.f10571f;
        if (str2 == null) {
            this.f10575r.f10629a.mo12282c0().mo12158K().mo11978G(this.f10572o, (C4114y7) null);
            return;
        }
        this.f10575r.f10629a.mo12282c0().mo12158K().mo11978G(this.f10572o, new C4114y7(this.f10573p, str2, this.f10574q));
    }
}
