package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
final class C3945k8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f10861f;

    /* renamed from: o */
    final /* synthetic */ C3894g9 f10862o;

    C3945k8(C3894g9 g9Var, C3844cb cbVar) {
        this.f10862o = g9Var;
        this.f10861f = cbVar;
    }

    public final void run() {
        C3894g9 g9Var = this.f10862o;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C3705r.m14346k(this.f10861f);
            H.mo11903B0(this.f10861f);
        } catch (RemoteException e) {
            this.f10862o.f10651a.mo11935b().mo12544r().mo12477b("Failed to reset data on the service: remote exception", e);
        }
        this.f10862o.m14779E();
    }
}
