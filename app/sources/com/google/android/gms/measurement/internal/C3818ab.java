package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p174e.p319f.p320a.p335c.p345f.p352g.C6876l1;

/* renamed from: com.google.android.gms.measurement.internal.ab */
final class C3818ab implements C3969m6 {

    /* renamed from: a */
    public final C6876l1 f10524a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f10525b;

    C3818ab(AppMeasurementDynamiteService appMeasurementDynamiteService, C6876l1 l1Var) {
        this.f10525b = appMeasurementDynamiteService;
        this.f10524a = l1Var;
    }

    /* renamed from: a */
    public final void mo11856a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f10524a.mo19849n(str, str2, bundle, j);
        } catch (RemoteException e) {
            C3955l5 l5Var = this.f10525b.f10496a;
            if (l5Var != null) {
                l5Var.mo11935b().mo12549w().mo12477b("Event interceptor threw exception", e);
            }
        }
    }
}
