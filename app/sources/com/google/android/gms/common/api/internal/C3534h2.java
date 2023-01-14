package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3480b;
import com.google.android.gms.common.api.Status;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.h2 */
abstract class C3534h2<T> extends C3568p1 {

    /* renamed from: b */
    protected final C8965m<T> f9974b;

    public C3534h2(int i, C8965m<T> mVar) {
        super(i);
        this.f9974b = mVar;
    }

    /* renamed from: a */
    public final void mo11353a(Status status) {
        this.f9974b.mo22785d(new C3480b(status));
    }

    /* renamed from: b */
    public final void mo11354b(Exception exc) {
        this.f9974b.mo22785d(exc);
    }

    /* renamed from: c */
    public final void mo11355c(C3528g1<?> g1Var) {
        try {
            mo11356h(g1Var);
        } catch (DeadObjectException e) {
            mo11353a(C3565o2.m13833e(e));
            throw e;
        } catch (RemoteException e2) {
            mo11353a(C3565o2.m13833e(e2));
        } catch (RuntimeException e3) {
            this.f9974b.mo22785d(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo11356h(C3528g1<?> g1Var);
}
