package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
final class C3853d7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f10632f;

    /* renamed from: o */
    final /* synthetic */ String f10633o;

    /* renamed from: p */
    final /* synthetic */ String f10634p;

    /* renamed from: q */
    final /* synthetic */ boolean f10635q;

    /* renamed from: r */
    final /* synthetic */ C4030r7 f10636r;

    C3853d7(C4030r7 r7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f10636r = r7Var;
        this.f10632f = atomicReference;
        this.f10633o = str2;
        this.f10634p = str3;
        this.f10635q = z;
    }

    public final void run() {
        this.f10636r.f10651a.mo12159L().mo11994W(this.f10632f, (String) null, this.f10633o, this.f10634p, this.f10635q);
    }
}
