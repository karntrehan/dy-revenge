package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
final class C3971m8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3844cb f11047f;

    /* renamed from: o */
    final /* synthetic */ C6828i1 f11048o;

    /* renamed from: p */
    final /* synthetic */ C3894g9 f11049p;

    C3971m8(C3894g9 g9Var, C3844cb cbVar, C6828i1 i1Var) {
        this.f11049p = g9Var;
        this.f11047f = cbVar;
        this.f11048o = i1Var;
    }

    public final void run() {
        String str = null;
        try {
            if (!this.f11049p.f10651a.mo12154F().mo12257q().mo12123i(C3910i.ANALYTICS_STORAGE)) {
                this.f11049p.f10651a.mo11935b().mo12550x().mo12476a("Analytics storage consent denied; will not get app instance id");
                this.f11049p.f10651a.mo12156I().mo12351C((String) null);
                this.f11049p.f10651a.mo12154F().f11112h.mo12239b((String) null);
            } else {
                C3894g9 g9Var = this.f11049p;
                C4002p3 H = g9Var.f10698d;
                if (H == null) {
                    g9Var.f10651a.mo11935b().mo12544r().mo12476a("Failed to get app instance id");
                } else {
                    C3705r.m14346k(this.f11047f);
                    str = H.mo11904D(this.f11047f);
                    if (str != null) {
                        this.f11049p.f10651a.mo12156I().mo12351C(str);
                        this.f11049p.f10651a.mo12154F().f11112h.mo12239b(str);
                    }
                    this.f11049p.m14779E();
                }
            }
        } catch (RemoteException e) {
            this.f11049p.f10651a.mo11935b().mo12544r().mo12477b("Failed to get app instance id", e);
        } catch (Throwable th) {
            this.f11049p.f10651a.mo12161N().mo12493J(this.f11048o, (String) null);
            throw th;
        }
        this.f11049p.f10651a.mo12161N().mo12493J(this.f11048o, str);
    }
}
