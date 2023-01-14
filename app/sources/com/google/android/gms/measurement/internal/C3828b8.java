package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
final class C3828b8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4114y7 f10545f;

    /* renamed from: o */
    final /* synthetic */ C4114y7 f10546o;

    /* renamed from: p */
    final /* synthetic */ long f10547p;

    /* renamed from: q */
    final /* synthetic */ boolean f10548q;

    /* renamed from: r */
    final /* synthetic */ C3893g8 f10549r;

    C3828b8(C3893g8 g8Var, C4114y7 y7Var, C4114y7 y7Var2, long j, boolean z) {
        this.f10549r = g8Var;
        this.f10545f = y7Var;
        this.f10546o = y7Var2;
        this.f10547p = j;
        this.f10548q = z;
    }

    public final void run() {
        this.f10549r.m14758p(this.f10545f, this.f10546o, this.f10547p, this.f10548q, (Bundle) null);
    }
}
