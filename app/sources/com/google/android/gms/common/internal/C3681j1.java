package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.common.internal.j1 */
public final class C3681j1 implements ServiceConnection {

    /* renamed from: a */
    private final int f10323a;

    /* renamed from: b */
    final /* synthetic */ C3651c f10324b;

    public C3681j1(C3651c cVar, int i) {
        this.f10324b = cVar;
        this.f10323a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3651c cVar = this.f10324b;
        if (iBinder == null) {
            C3651c.m14165i0(cVar, 16);
            return;
        }
        synchronized (cVar.f10247p) {
            C3651c cVar2 = this.f10324b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f10248q = (queryLocalInterface == null || !(queryLocalInterface instanceof C3688m)) ? new C3736z0(iBinder) : (C3688m) queryLocalInterface;
        }
        this.f10324b.mo11555j0(0, (Bundle) null, this.f10323a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f10324b.f10247p) {
            this.f10324b.f10248q = null;
        }
        Handler handler = this.f10324b.f10245n;
        handler.sendMessage(handler.obtainMessage(6, this.f10323a, 1));
    }
}
