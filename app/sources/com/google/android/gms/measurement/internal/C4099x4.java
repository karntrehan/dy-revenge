package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p174e.p319f.p320a.p335c.p345f.p352g.C6708af;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
public final /* synthetic */ class C4099x4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C3838c5 f11392a;

    /* renamed from: b */
    public final /* synthetic */ String f11393b;

    public /* synthetic */ C4099x4(C3838c5 c5Var, String str) {
        this.f11392a = c5Var;
        this.f11393b = str;
    }

    public final Object call() {
        return new C6708af("internal.appMetadata", new C4075v4(this.f11392a, this.f11393b));
    }
}
