package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import p174e.p319f.p320a.p335c.p345f.p352g.C6825he;
import p174e.p319f.p320a.p335c.p345f.p352g.C7111zc;

/* renamed from: com.google.android.gms.measurement.internal.w9 */
final class C4092w9 {

    /* renamed from: a */
    final /* synthetic */ C4104x9 f11380a;

    C4092w9(C4104x9 x9Var) {
        this.f11380a = x9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12471a() {
        this.f11380a.mo11931h();
        if (this.f11380a.f10651a.mo12154F().mo12262v(this.f11380a.f10651a.mo11936c().mo11730a())) {
            this.f11380a.f10651a.mo12154F().f11117m.mo12127a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f11380a.f10651a.mo11935b().mo12548v().mo12476a("Detected application was in foreground");
                mo12473c(this.f11380a.f10651a.mo11936c().mo11730a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12472b(long j, boolean z) {
        this.f11380a.mo11931h();
        this.f11380a.m15392s();
        if (this.f11380a.f10651a.mo12154F().mo12262v(j)) {
            this.f11380a.f10651a.mo12154F().f11117m.mo12127a(true);
            C6825he.m25843b();
            if (this.f11380a.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10953B0)) {
                this.f11380a.f10651a.mo12150B().mo12322v();
            }
        }
        this.f11380a.f10651a.mo12154F().f11120p.mo12148b(j);
        if (this.f11380a.f10651a.mo12154F().f11117m.mo12128b()) {
            mo12473c(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12473c(long j, boolean z) {
        this.f11380a.mo11931h();
        if (this.f11380a.f10651a.mo12174o()) {
            this.f11380a.f10651a.mo12154F().f11120p.mo12148b(j);
            this.f11380a.f10651a.mo11935b().mo12548v().mo12477b("Session started, time", Long.valueOf(this.f11380a.f10651a.mo11936c().mo11731b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f11380a.f10651a.mo12156I().mo12361M("auto", "_sid", valueOf, j);
            this.f11380a.f10651a.mo12154F().f11117m.mo12127a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f11380a.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10989b0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f11380a.f10651a.mo12156I().mo12382v("auto", "_s", j, bundle);
            C7111zc.m27095b();
            if (this.f11380a.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10995e0)) {
                String a = this.f11380a.f10651a.mo12154F().f11125u.mo12238a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f11380a.f10651a.mo12156I().mo12382v("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
