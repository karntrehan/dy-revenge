package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
public final /* synthetic */ class C4032r9 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C4044s9 f11252f;

    public /* synthetic */ C4032r9(C4044s9 s9Var) {
        this.f11252f = s9Var;
    }

    public final void run() {
        C4044s9 s9Var = this.f11252f;
        C4056t9 t9Var = s9Var.f11274p;
        long j = s9Var.f11272f;
        long j2 = s9Var.f11273o;
        t9Var.f11307b.mo11931h();
        t9Var.f11307b.f10651a.mo11935b().mo12543q().mo12476a("Application going to the background");
        t9Var.f11307b.f10651a.mo12154F().f11122r.mo12127a(true);
        Bundle bundle = new Bundle();
        if (!t9Var.f11307b.f10651a.mo12181z().mo12012D()) {
            t9Var.f11307b.f11409e.mo12461b(j2);
            t9Var.f11307b.f11409e.mo12463d(false, false, j2);
        }
        t9Var.f11307b.f10651a.mo12156I().mo12382v("auto", "_ab", j, bundle);
    }
}
