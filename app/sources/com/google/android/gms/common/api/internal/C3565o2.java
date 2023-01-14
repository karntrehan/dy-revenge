package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.o2 */
public abstract class C3565o2 {

    /* renamed from: a */
    public final int f10035a;

    public C3565o2(int i) {
        this.f10035a = i;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ Status m13833e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo11353a(Status status);

    /* renamed from: b */
    public abstract void mo11354b(Exception exc);

    /* renamed from: c */
    public abstract void mo11355c(C3528g1<?> g1Var);

    /* renamed from: d */
    public abstract void mo11383d(C3595w wVar, boolean z);
}
