package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.w6 */
final class C4089w6 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f11366f;

    /* renamed from: o */
    final /* synthetic */ String f11367o;

    /* renamed from: p */
    final /* synthetic */ long f11368p;

    /* renamed from: q */
    final /* synthetic */ Bundle f11369q;

    /* renamed from: r */
    final /* synthetic */ boolean f11370r;

    /* renamed from: s */
    final /* synthetic */ boolean f11371s;

    /* renamed from: t */
    final /* synthetic */ boolean f11372t;

    /* renamed from: u */
    final /* synthetic */ String f11373u;

    /* renamed from: v */
    final /* synthetic */ C4030r7 f11374v;

    C4089w6(C4030r7 r7Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f11374v = r7Var;
        this.f11366f = str;
        this.f11367o = str2;
        this.f11368p = j;
        this.f11369q = bundle;
        this.f11370r = z;
        this.f11371s = z2;
        this.f11372t = z3;
        this.f11373u = str3;
    }

    public final void run() {
        this.f11374v.mo12383w(this.f11366f, this.f11367o, this.f11368p, this.f11369q, this.f11370r, this.f11371s, this.f11372t, this.f11373u);
    }
}
