package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.ia */
final class C3921ia implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f10803f;

    /* renamed from: o */
    final /* synthetic */ String f10804o = "_err";

    /* renamed from: p */
    final /* synthetic */ Bundle f10805p;

    /* renamed from: q */
    final /* synthetic */ C3947ka f10806q;

    C3921ia(C3947ka kaVar, String str, String str2, Bundle bundle) {
        this.f10806q = kaVar;
        this.f10803f = str;
        this.f10805p = bundle;
    }

    public final void run() {
        this.f10806q.f10866a.mo12294k((C4094x) C3705r.m14346k(this.f10806q.f10866a.mo12289h0().mo12527w0(this.f10803f, this.f10804o, this.f10805p, "auto", this.f10806q.f10866a.mo11936c().mo11730a(), false, true)), this.f10803f);
    }
}
