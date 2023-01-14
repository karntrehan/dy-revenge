package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
final class C3958l8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f10937f;

    /* renamed from: o */
    final /* synthetic */ C3844cb f10938o;

    /* renamed from: p */
    final /* synthetic */ C3894g9 f10939p;

    C3958l8(C3894g9 g9Var, AtomicReference atomicReference, C3844cb cbVar) {
        this.f10939p = g9Var;
        this.f10937f = atomicReference;
        this.f10938o = cbVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f10937f) {
            try {
                if (!this.f10939p.f10651a.mo12154F().mo12257q().mo12123i(C3910i.ANALYTICS_STORAGE)) {
                    this.f10939p.f10651a.mo11935b().mo12550x().mo12476a("Analytics storage consent denied; will not get app instance id");
                    this.f10939p.f10651a.mo12156I().mo12351C((String) null);
                    this.f10939p.f10651a.mo12154F().f11112h.mo12239b((String) null);
                    this.f10937f.set((Object) null);
                    this.f10937f.notify();
                    return;
                }
                C3894g9 g9Var = this.f10939p;
                C4002p3 H = g9Var.f10698d;
                if (H == null) {
                    g9Var.f10651a.mo11935b().mo12544r().mo12476a("Failed to get app instance id");
                    this.f10937f.notify();
                    return;
                }
                C3705r.m14346k(this.f10938o);
                this.f10937f.set(H.mo11904D(this.f10938o));
                String str = (String) this.f10937f.get();
                if (str != null) {
                    this.f10939p.f10651a.mo12156I().mo12351C(str);
                    this.f10939p.f10651a.mo12154F().f11112h.mo12239b(str);
                }
                this.f10939p.m14779E();
                atomicReference = this.f10937f;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f10939p.f10651a.mo11935b().mo12544r().mo12477b("Failed to get app instance id", e);
                    atomicReference = this.f10937f;
                } catch (Throwable th) {
                    this.f10937f.notify();
                    throw th;
                }
            }
        }
    }
}
