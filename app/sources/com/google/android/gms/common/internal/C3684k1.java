package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C3623b;

/* renamed from: com.google.android.gms.common.internal.k1 */
public final class C3684k1 extends C3724x0 {

    /* renamed from: g */
    public final IBinder f10326g;

    /* renamed from: h */
    final /* synthetic */ C3651c f10327h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3684k1(C3651c cVar, int i, IBinder iBinder, Bundle bundle) {
        super(cVar, i, bundle);
        this.f10327h = cVar;
        this.f10326g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo11622f(C3623b bVar) {
        if (this.f10327h.f10255x != null) {
            this.f10327h.f10255x.mo11567k(bVar);
        }
        this.f10327h.mo11538Q(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo11623g() {
        String str;
        try {
            IBinder iBinder = this.f10326g;
            C3705r.m14346k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f10327h.mo11133J().equals(interfaceDescriptor)) {
                String J = this.f10327h.mo11133J();
                StringBuilder sb = new StringBuilder(String.valueOf(J).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(J);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                str = sb.toString();
                Log.w("GmsClient", str);
                return false;
            }
            IInterface x = this.f10327h.mo11139x(this.f10326g);
            if (x == null || (!C3651c.m14167l0(this.f10327h, 2, 4, x) && !C3651c.m14167l0(this.f10327h, 3, 4, x))) {
                return false;
            }
            this.f10327h.f10230B = null;
            Bundle C = this.f10327h.mo11528C();
            C3651c cVar = this.f10327h;
            if (cVar.f10254w == null) {
                return true;
            }
            cVar.f10254w.mo11566m(C);
            return true;
        } catch (RemoteException unused) {
            str = "service probably died";
        }
    }
}
