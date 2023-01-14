package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p174e.p319f.p320a.p335c.p345f.p352g.C7062wb;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
public final /* synthetic */ class C4087w4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C3838c5 f11361a;

    /* renamed from: b */
    public final /* synthetic */ String f11362b;

    public /* synthetic */ C4087w4(C3838c5 c5Var, String str) {
        this.f11361a = c5Var;
        this.f11362b = str;
    }

    public final Object call() {
        return new C7062wb("internal.remoteConfig", new C3825b5(this.f11361a, this.f11362b));
    }
}
