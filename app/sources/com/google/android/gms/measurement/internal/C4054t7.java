package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
public final /* synthetic */ class C4054t7 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C4066u7 f11299f;

    /* renamed from: o */
    public final /* synthetic */ int f11300o;

    /* renamed from: p */
    public final /* synthetic */ Exception f11301p;

    /* renamed from: q */
    public final /* synthetic */ byte[] f11302q;

    /* renamed from: r */
    public final /* synthetic */ Map f11303r;

    public /* synthetic */ C4054t7(C4066u7 u7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f11299f = u7Var;
        this.f11300o = i;
        this.f11301p = exc;
        this.f11302q = bArr;
        this.f11303r = map;
    }

    public final void run() {
        this.f11299f.mo12444a(this.f11300o, this.f11301p, this.f11302q, this.f11303r);
    }
}
