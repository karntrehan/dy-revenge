package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3469a.C3471b;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.api.internal.d */
public abstract class C3511d<R extends C3612k, A extends C3469a.C3471b> extends BasePendingResult<R> {

    /* renamed from: r */
    private final C3469a.C3472c<A> f9916r;

    /* renamed from: s */
    private final C3469a<?> f9917s;

    protected C3511d(C3469a<?> aVar, C3486f fVar) {
        super((C3486f) C3705r.m14347l(fVar, "GoogleApiClient must not be null"));
        C3705r.m14347l(aVar, "Api must not be null");
        this.f9916r = aVar.mo11177b();
        this.f9917s = aVar;
    }

    /* renamed from: u */
    private void m13637u(RemoteException remoteException) {
        mo11301v(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo11141p(A a);

    /* renamed from: q */
    public final C3469a<?> mo11297q() {
        return this.f9917s;
    }

    /* renamed from: r */
    public final C3469a.C3472c<A> mo11298r() {
        return this.f9916r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo11299s(R r) {
    }

    /* renamed from: t */
    public final void mo11300t(A a) {
        try {
            mo11141p(a);
        } catch (DeadObjectException e) {
            m13637u(e);
            throw e;
        } catch (RemoteException e2) {
            m13637u(e2);
        }
    }

    /* renamed from: v */
    public final void mo11301v(Status status) {
        C3705r.m14337b(!status.mo11167E(), "Failed result must not be success");
        C3612k d = mo11140d(status);
        mo11242h(d);
        mo11299s(d);
    }
}
