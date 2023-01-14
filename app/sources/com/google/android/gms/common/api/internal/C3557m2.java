package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.Status;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.m2 */
public final class C3557m2<ResultT> extends C3568p1 {

    /* renamed from: b */
    private final C3574r<C3469a.C3471b, ResultT> f10028b;

    /* renamed from: c */
    private final C8965m<ResultT> f10029c;

    /* renamed from: d */
    private final C3566p f10030d;

    public C3557m2(int i, C3574r<C3469a.C3471b, ResultT> rVar, C8965m<ResultT> mVar, C3566p pVar) {
        super(i);
        this.f10029c = mVar;
        this.f10028b = rVar;
        this.f10030d = pVar;
        if (i == 2 && rVar.mo11404c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo11353a(Status status) {
        this.f10029c.mo22785d(this.f10030d.mo11257a(status));
    }

    /* renamed from: b */
    public final void mo11354b(Exception exc) {
        this.f10029c.mo22785d(exc);
    }

    /* renamed from: c */
    public final void mo11355c(C3528g1<?> g1Var) {
        try {
            this.f10028b.mo11304b(g1Var.mo11345v(), this.f10029c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo11353a(C3565o2.m13833e(e2));
        } catch (RuntimeException e3) {
            this.f10029c.mo22785d(e3);
        }
    }

    /* renamed from: d */
    public final void mo11383d(C3595w wVar, boolean z) {
        wVar.mo11430d(this.f10029c, z);
    }

    /* renamed from: f */
    public final boolean mo11385f(C3528g1<?> g1Var) {
        return this.f10028b.mo11404c();
    }

    /* renamed from: g */
    public final C3627d[] mo11386g(C3528g1<?> g1Var) {
        return this.f10028b.mo11406e();
    }
}
