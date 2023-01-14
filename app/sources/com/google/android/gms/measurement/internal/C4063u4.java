package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p320a.p335c.p345f.p352g.C6924o1;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
public final class C4063u4 {

    /* renamed from: a */
    private final C4051t4 f11317a;

    public C4063u4(C4051t4 t4Var) {
        C3705r.m14346k(t4Var);
        this.f11317a = t4Var;
    }

    /* renamed from: a */
    public final void mo12441a(Context context, Intent intent) {
        C3955l5 H = C3955l5.m14977H(context, (C6924o1) null, (Long) null);
        C4122z3 b = H.mo11935b();
        if (intent == null) {
            b.mo12549w().mo12476a("Receiver called with null intent");
            return;
        }
        H.mo11937d();
        String action = intent.getAction();
        b.mo12548v().mo12477b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b.mo12548v().mo12476a("Starting wakeful intent.");
            this.f11317a.mo11776a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            b.mo12549w().mo12476a("Install Referrer Broadcasts are deprecated");
        }
    }
}
