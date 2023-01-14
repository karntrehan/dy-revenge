package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.C3624b0;
import com.google.android.gms.common.C3630e0;
import com.google.android.gms.common.C3634g0;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6687a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6689c;

/* renamed from: com.google.android.gms.common.internal.a1 */
public final class C3645a1 extends C6687a implements C3658c1 {
    C3645a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: T */
    public final boolean mo11519T(C3634g0 g0Var, C6634a aVar) {
        Parcel k = mo19480k();
        C6689c.m25351c(k, g0Var);
        C6689c.m25352d(k, aVar);
        Parcel j = mo19479j(5, k);
        boolean e = C6689c.m25353e(j);
        j.recycle();
        return e;
    }

    /* renamed from: X */
    public final C3630e0 mo11520X(C3624b0 b0Var) {
        Parcel k = mo19480k();
        C6689c.m25351c(k, b0Var);
        Parcel j = mo19479j(6, k);
        C3630e0 e0Var = (C3630e0) C6689c.m25349a(j, C3630e0.CREATOR);
        j.recycle();
        return e0Var;
    }

    /* renamed from: h */
    public final boolean mo11521h() {
        Parcel j = mo19479j(7, mo19480k());
        boolean e = C6689c.m25353e(j);
        j.recycle();
        return e;
    }
}
