package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
final class C4055t8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11304f;

    /* renamed from: o */
    final /* synthetic */ C3894g9 f11305o;

    C4055t8(C3894g9 g9Var, C3844cb cbVar) {
        this.f11305o = g9Var;
        this.f11304f = cbVar;
    }

    public final void run() {
        C3894g9 g9Var = this.f11305o;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C3705r.m14346k(this.f11304f);
            H.mo11916q(this.f11304f);
            this.f11305o.m14779E();
        } catch (RemoteException e) {
            this.f11305o.f10651a.mo11935b().mo12544r().mo12477b("Failed to send measurementEnabled to the service", e);
        }
    }
}
