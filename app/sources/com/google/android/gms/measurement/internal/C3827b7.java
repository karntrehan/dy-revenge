package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
final class C3827b7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f10541f;

    /* renamed from: o */
    final /* synthetic */ String f10542o;

    /* renamed from: p */
    final /* synthetic */ String f10543p;

    /* renamed from: q */
    final /* synthetic */ C4030r7 f10544q;

    C3827b7(C4030r7 r7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f10544q = r7Var;
        this.f10541f = atomicReference;
        this.f10542o = str2;
        this.f10543p = str3;
    }

    public final void run() {
        this.f10544q.f10651a.mo12159L().mo11992U(this.f10541f, (String) null, this.f10542o, this.f10543p);
    }
}
