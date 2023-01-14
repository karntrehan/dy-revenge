package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;
import java.util.ArrayList;
import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
final class C4115y8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f11433f;

    /* renamed from: o */
    final /* synthetic */ String f11434o;

    /* renamed from: p */
    final /* synthetic */ C3844cb f11435p;

    /* renamed from: q */
    final /* synthetic */ C6828i1 f11436q;

    /* renamed from: r */
    final /* synthetic */ C3894g9 f11437r;

    C4115y8(C3894g9 g9Var, String str, String str2, C3844cb cbVar, C6828i1 i1Var) {
        this.f11437r = g9Var;
        this.f11433f = str;
        this.f11434o = str2;
        this.f11435p = cbVar;
        this.f11436q = i1Var;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            C3894g9 g9Var = this.f11437r;
            C4002p3 H = g9Var.f10698d;
            if (H == null) {
                g9Var.f10651a.mo11935b().mo12544r().mo12478c("Failed to get conditional properties; not connected to service", this.f11433f, this.f11434o);
            } else {
                C3705r.m14346k(this.f11435p);
                arrayList = C4105xa.m15407v(H.mo11912d0(this.f11433f, this.f11434o, this.f11435p));
                this.f11437r.m14779E();
            }
        } catch (RemoteException e) {
            this.f11437r.f10651a.mo11935b().mo12544r().mo12479d("Failed to get conditional properties; remote exception", this.f11433f, this.f11434o, e);
        } catch (Throwable th) {
            this.f11437r.f10651a.mo12161N().mo12488E(this.f11436q, arrayList);
            throw th;
        }
        this.f11437r.f10651a.mo12161N().mo12488E(this.f11436q, arrayList);
    }
}
