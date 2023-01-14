package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3705r;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
final class C3906h8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f10759f;

    /* renamed from: o */
    final /* synthetic */ String f10760o;

    /* renamed from: p */
    final /* synthetic */ C3844cb f10761p;

    /* renamed from: q */
    final /* synthetic */ boolean f10762q;

    /* renamed from: r */
    final /* synthetic */ C6828i1 f10763r;

    /* renamed from: s */
    final /* synthetic */ C3894g9 f10764s;

    C3906h8(C3894g9 g9Var, String str, String str2, C3844cb cbVar, boolean z, C6828i1 i1Var) {
        this.f10764s = g9Var;
        this.f10759f = str;
        this.f10760o = str2;
        this.f10761p = cbVar;
        this.f10762q = z;
        this.f10763r = i1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C3894g9 g9Var = this.f10764s;
            C4002p3 H = g9Var.f10698d;
            if (H == null) {
                g9Var.f10651a.mo11935b().mo12544r().mo12478c("Failed to get user properties; not connected to service", this.f10759f, this.f10760o);
                this.f10764s.f10651a.mo12161N().mo12489F(this.f10763r, bundle2);
                return;
            }
            C3705r.m14346k(this.f10761p);
            List<C4045sa> v0 = H.mo11919v0(this.f10759f, this.f10760o, this.f10762q, this.f10761p);
            bundle = new Bundle();
            if (v0 != null) {
                for (C4045sa saVar : v0) {
                    String str = saVar.f11279r;
                    if (str != null) {
                        bundle.putString(saVar.f11276o, str);
                    } else {
                        Long l = saVar.f11278q;
                        if (l != null) {
                            bundle.putLong(saVar.f11276o, l.longValue());
                        } else {
                            Double d = saVar.f11281t;
                            if (d != null) {
                                bundle.putDouble(saVar.f11276o, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f10764s.m14779E();
                this.f10764s.f10651a.mo12161N().mo12489F(this.f10763r, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f10764s.f10651a.mo11935b().mo12544r().mo12478c("Failed to get user properties; remote exception", this.f10759f, e);
                    this.f10764s.f10651a.mo12161N().mo12489F(this.f10763r, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f10764s.f10651a.mo12161N().mo12489F(this.f10763r, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f10764s.f10651a.mo11935b().mo12544r().mo12478c("Failed to get user properties; remote exception", this.f10759f, e);
            this.f10764s.f10651a.mo12161N().mo12489F(this.f10763r, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f10764s.f10651a.mo12161N().mo12489F(this.f10763r, bundle2);
            throw th;
        }
    }
}
