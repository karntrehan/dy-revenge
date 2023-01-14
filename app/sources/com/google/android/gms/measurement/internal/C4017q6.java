package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
public final /* synthetic */ class C4017q6 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C4030r7 f11209f;

    /* renamed from: o */
    public final /* synthetic */ Bundle f11210o;

    /* renamed from: p */
    public final /* synthetic */ long f11211p;

    public /* synthetic */ C4017q6(C4030r7 r7Var, Bundle bundle, long j) {
        this.f11209f = r7Var;
        this.f11210o = bundle;
        this.f11211p = j;
    }

    public final void run() {
        C4030r7 r7Var = this.f11209f;
        Bundle bundle = this.f11210o;
        long j = this.f11211p;
        if (TextUtils.isEmpty(r7Var.f10651a.mo12150B().mo12320t())) {
            r7Var.mo12354F(bundle, 0, j);
        } else {
            r7Var.f10651a.mo11935b().mo12550x().mo12476a("Using developer consent only; google app id found");
        }
    }
}
