package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
public final /* synthetic */ class C3959l9 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C3996o9 f10940f;

    /* renamed from: o */
    public final /* synthetic */ int f10941o;

    /* renamed from: p */
    public final /* synthetic */ C4122z3 f10942p;

    /* renamed from: q */
    public final /* synthetic */ Intent f10943q;

    public /* synthetic */ C3959l9(C3996o9 o9Var, int i, C4122z3 z3Var, Intent intent) {
        this.f10940f = o9Var;
        this.f10941o = i;
        this.f10942p = z3Var;
        this.f10943q = intent;
    }

    public final void run() {
        this.f10940f.mo12246c(this.f10941o, this.f10942p, this.f10943q);
    }
}
