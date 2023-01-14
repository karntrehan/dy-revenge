package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
final class C3995o8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4114y7 f11097f;

    /* renamed from: o */
    final /* synthetic */ C3894g9 f11098o;

    C3995o8(C3894g9 g9Var, C4114y7 y7Var) {
        this.f11098o = g9Var;
        this.f11097f = y7Var;
    }

    public final void run() {
        C3894g9 g9Var = this.f11098o;
        C4002p3 H = g9Var.f10698d;
        if (H == null) {
            g9Var.f10651a.mo11935b().mo12544r().mo12476a("Failed to send current screen to service");
            return;
        }
        try {
            C4114y7 y7Var = this.f11097f;
            if (y7Var == null) {
                H.mo11913j0(0, (String) null, (String) null, g9Var.f10651a.mo11938f().getPackageName());
            } else {
                H.mo11913j0(y7Var.f11429c, y7Var.f11427a, y7Var.f11428b, g9Var.f10651a.mo11938f().getPackageName());
            }
            this.f11098o.m14779E();
        } catch (RemoteException e) {
            this.f11098o.f10651a.mo11935b().mo12544r().mo12477b("Failed to send current screen to the service", e);
        }
    }
}
