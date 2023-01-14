package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.t */
final class C4046t {

    /* renamed from: a */
    final String f11282a;

    /* renamed from: b */
    final String f11283b;

    /* renamed from: c */
    final long f11284c;

    /* renamed from: d */
    final long f11285d;

    /* renamed from: e */
    final long f11286e;

    /* renamed from: f */
    final long f11287f;

    /* renamed from: g */
    final long f11288g;

    /* renamed from: h */
    final Long f11289h;

    /* renamed from: i */
    final Long f11290i;

    /* renamed from: j */
    final Long f11291j;

    /* renamed from: k */
    final Boolean f11292k;

    C4046t(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C3705r.m14342g(str);
        C3705r.m14342g(str2);
        boolean z = true;
        C3705r.m14336a(j6 >= 0);
        C3705r.m14336a(j7 >= 0);
        C3705r.m14336a(j8 >= 0);
        C3705r.m14336a(j9 < 0 ? false : z);
        this.f11282a = str;
        this.f11283b = str2;
        this.f11284c = j6;
        this.f11285d = j7;
        this.f11286e = j8;
        this.f11287f = j4;
        this.f11288g = j9;
        this.f11289h = l;
        this.f11290i = l2;
        this.f11291j = l3;
        this.f11292k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4046t mo12420a(Long l, Long l2, Boolean bool) {
        return new C4046t(this.f11282a, this.f11283b, this.f11284c, this.f11285d, this.f11286e, this.f11287f, this.f11288g, this.f11289h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4046t mo12421b(long j, long j2) {
        return new C4046t(this.f11282a, this.f11283b, this.f11284c, this.f11285d, this.f11286e, this.f11287f, j, Long.valueOf(j2), this.f11290i, this.f11291j, this.f11292k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C4046t mo12422c(long j) {
        return new C4046t(this.f11282a, this.f11283b, this.f11284c, this.f11285d, this.f11286e, j, this.f11288g, this.f11289h, this.f11290i, this.f11291j, this.f11292k);
    }
}
