package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.i1 */
public final class C3677i1 extends C3728y0 {

    /* renamed from: a */
    private C3651c f10320a;

    /* renamed from: b */
    private final int f10321b;

    public C3677i1(C3651c cVar, int i) {
        this.f10320a = cVar;
        this.f10321b = i;
    }

    /* renamed from: N */
    public final void mo11615N(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    /* renamed from: e0 */
    public final void mo11616e0(int i, IBinder iBinder, Bundle bundle) {
        C3705r.m14347l(this.f10320a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f10320a.mo11540S(i, iBinder, bundle, this.f10321b);
        this.f10320a = null;
    }

    /* renamed from: l0 */
    public final void mo11617l0(int i, IBinder iBinder, C3690m1 m1Var) {
        C3651c cVar = this.f10320a;
        C3705r.m14347l(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C3705r.m14346k(m1Var);
        C3651c.m14164h0(cVar, m1Var);
        mo11616e0(i, iBinder, m1Var.f10338f);
    }
}
