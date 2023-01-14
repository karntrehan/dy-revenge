package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p320a.p335c.p345f.p352g.C6924o1;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
public final class C4005p6 {

    /* renamed from: a */
    final Context f11133a;

    /* renamed from: b */
    String f11134b;

    /* renamed from: c */
    String f11135c;

    /* renamed from: d */
    String f11136d;

    /* renamed from: e */
    Boolean f11137e;

    /* renamed from: f */
    long f11138f;

    /* renamed from: g */
    C6924o1 f11139g;

    /* renamed from: h */
    boolean f11140h = true;

    /* renamed from: i */
    final Long f11141i;

    /* renamed from: j */
    String f11142j;

    public C4005p6(Context context, C6924o1 o1Var, Long l) {
        C3705r.m14346k(context);
        Context applicationContext = context.getApplicationContext();
        C3705r.m14346k(applicationContext);
        this.f11133a = applicationContext;
        this.f11141i = l;
        if (o1Var != null) {
            this.f11139g = o1Var;
            this.f11134b = o1Var.f18735s;
            this.f11135c = o1Var.f18734r;
            this.f11136d = o1Var.f18733q;
            this.f11140h = o1Var.f18732p;
            this.f11138f = o1Var.f18731o;
            this.f11142j = o1Var.f18737u;
            Bundle bundle = o1Var.f18736t;
            if (bundle != null) {
                this.f11137e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
