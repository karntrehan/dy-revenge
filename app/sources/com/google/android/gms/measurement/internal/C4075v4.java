package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
public final /* synthetic */ class C4075v4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C3838c5 f11337a;

    /* renamed from: b */
    public final /* synthetic */ String f11338b;

    public /* synthetic */ C4075v4(C3838c5 c5Var, String str) {
        this.f11337a = c5Var;
        this.f11338b = str;
    }

    public final Object call() {
        C3838c5 c5Var = this.f11337a;
        String str = this.f11338b;
        C3904h6 R = c5Var.f10552b.mo12277W().mo12204R(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        c5Var.f10651a.mo12181z().mo12023q();
        hashMap.put("gmp_version", 68000L);
        if (R != null) {
            String g0 = R.mo12075g0();
            if (g0 != null) {
                hashMap.put("app_version", g0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo12047L()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo12056U()));
        }
        return hashMap;
    }
}
