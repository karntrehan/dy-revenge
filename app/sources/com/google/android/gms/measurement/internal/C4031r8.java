package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
final class C4031r8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4094x f11248f;

    /* renamed from: o */
    final /* synthetic */ String f11249o;

    /* renamed from: p */
    final /* synthetic */ C6828i1 f11250p;

    /* renamed from: q */
    final /* synthetic */ C3894g9 f11251q;

    C4031r8(C3894g9 g9Var, C4094x xVar, String str, C6828i1 i1Var) {
        this.f11251q = g9Var;
        this.f11248f = xVar;
        this.f11249o = str;
        this.f11250p = i1Var;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C3894g9 g9Var = this.f11251q;
            C4002p3 H = g9Var.f10698d;
            if (H == null) {
                g9Var.f10651a.mo11935b().mo12544r().mo12476a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = H.mo11902A(this.f11248f, this.f11249o);
                this.f11251q.m14779E();
            }
        } catch (RemoteException e) {
            this.f11251q.f10651a.mo11935b().mo12544r().mo12477b("Failed to send event to the service to bundle", e);
        } catch (Throwable th) {
            this.f11251q.f10651a.mo12161N().mo12490G(this.f11250p, bArr);
            throw th;
        }
        this.f11251q.f10651a.mo12161N().mo12490G(this.f11250p, bArr);
    }
}
