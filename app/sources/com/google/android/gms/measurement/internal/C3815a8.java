package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
final class C3815a8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Bundle f10514f;

    /* renamed from: o */
    final /* synthetic */ C4114y7 f10515o;

    /* renamed from: p */
    final /* synthetic */ C4114y7 f10516p;

    /* renamed from: q */
    final /* synthetic */ long f10517q;

    /* renamed from: r */
    final /* synthetic */ C3893g8 f10518r;

    C3815a8(C3893g8 g8Var, Bundle bundle, C4114y7 y7Var, C4114y7 y7Var2, long j) {
        this.f10518r = g8Var;
        this.f10514f = bundle;
        this.f10515o = y7Var;
        this.f10516p = y7Var2;
        this.f10517q = j;
    }

    public final void run() {
        C3893g8.m14763x(this.f10518r, this.f10514f, this.f10515o, this.f10516p, this.f10517q);
    }
}
