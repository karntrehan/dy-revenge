package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p174e.p319f.p320a.p335c.p345f.p352g.C6876l1;

/* renamed from: com.google.android.gms.measurement.internal.bb */
final class C3831bb implements C3981n6 {

    /* renamed from: a */
    public final C6876l1 f10553a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f10554b;

    C3831bb(AppMeasurementDynamiteService appMeasurementDynamiteService, C6876l1 l1Var) {
        this.f10554b = appMeasurementDynamiteService;
        this.f10553a = l1Var;
    }

    /* renamed from: a */
    public final void mo11865a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f10553a.mo19849n(str, str2, bundle, j);
        } catch (RemoteException e) {
            C3955l5 l5Var = this.f10554b.f10496a;
            if (l5Var != null) {
                l5Var.mo11935b().mo12549w().mo12477b("Event listener threw exception", e);
            }
        }
    }
}
