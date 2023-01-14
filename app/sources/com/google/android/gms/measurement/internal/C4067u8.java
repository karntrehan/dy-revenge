package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
final class C4067u8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11325f;

    /* renamed from: o */
    final /* synthetic */ C3894g9 f11326o;

    C4067u8(C3894g9 g9Var, C3844cb cbVar) {
        this.f11326o = g9Var;
        this.f11325f = cbVar;
    }

    public final void run() {
        C3894g9 g9Var = this.f11326o;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Failed to send consent settings to service");
            return;
        }
        try {
            C3705r.m14346k(this.f11325f);
            H.mo11918u0(this.f11325f);
            this.f11326o.m14779E();
        } catch (RemoteException e) {
            this.f11326o.f10651a.mo11935b().mo12544r().mo12477b("Failed to send consent settings to the service", e);
        }
    }
}
