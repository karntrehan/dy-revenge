package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.p8 */
final class C4007p8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11143f;

    /* renamed from: o */
    final /* synthetic */ Bundle f11144o;

    /* renamed from: p */
    final /* synthetic */ C3894g9 f11145p;

    C4007p8(C3894g9 g9Var, C3844cb cbVar, Bundle bundle) {
        this.f11145p = g9Var;
        this.f11143f = cbVar;
        this.f11144o = bundle;
    }

    public final void run() {
        C3894g9 g9Var = this.f11145p;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Failed to send default event parameters to service");
            return;
        }
        try {
            C3705r.m14346k(this.f11143f);
            H.mo11917u(this.f11144o, this.f11143f);
        } catch (RemoteException e) {
            this.f11145p.f10651a.mo11935b().mo12544r().mo12477b("Failed to send default event parameters to service", e);
        }
    }
}
