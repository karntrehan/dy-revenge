package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p130z.C3730a;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
final class C3983n8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11080f;

    /* renamed from: o */
    final /* synthetic */ C3894g9 f11081o;

    C3983n8(C3894g9 g9Var, C3844cb cbVar) {
        this.f11081o = g9Var;
        this.f11080f = cbVar;
    }

    public final void run() {
        C3894g9 g9Var = this.f11081o;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C3705r.m14346k(this.f11080f);
            H.mo11911b0(this.f11080f);
            this.f11081o.f10651a.mo12151C().mo12410t();
            this.f11081o.mo11998r(H, (C3730a) null, this.f11080f);
            this.f11081o.m14779E();
        } catch (RemoteException e) {
            this.f11081o.f10651a.mo11935b().mo12544r().mo12477b("Failed to send app launch to the service", e);
        }
    }
}
