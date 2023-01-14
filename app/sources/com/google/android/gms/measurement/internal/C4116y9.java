package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3758e;

/* renamed from: com.google.android.gms.measurement.internal.y9 */
final class C4116y9 {

    /* renamed from: a */
    private final C3758e f11438a;

    /* renamed from: b */
    private long f11439b;

    public C4116y9(C3758e eVar) {
        C3705r.m14346k(eVar);
        this.f11438a = eVar;
    }

    /* renamed from: a */
    public final void mo12536a() {
        this.f11439b = 0;
    }

    /* renamed from: b */
    public final void mo12537b() {
        this.f11439b = this.f11438a.mo11731b();
    }

    /* renamed from: c */
    public final boolean mo12538c(long j) {
        return this.f11439b == 0 || this.f11438a.mo11731b() - this.f11439b >= 3600000;
    }
}
