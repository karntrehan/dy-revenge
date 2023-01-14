package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p352g.C6863k4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7039v4;

/* renamed from: com.google.android.gms.measurement.internal.ma */
final class C3973ma {

    /* renamed from: a */
    C7039v4 f11052a;

    /* renamed from: b */
    List f11053b;

    /* renamed from: c */
    List f11054c;

    /* renamed from: d */
    long f11055d;

    /* renamed from: e */
    final /* synthetic */ C4009pa f11056e;

    /* synthetic */ C3973ma(C4009pa paVar, C3960la laVar) {
        this.f11056e = paVar;
    }

    /* renamed from: b */
    private static final long m15029b(C6863k4 k4Var) {
        return ((k4Var.mo19914A() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo12195a(long j, C6863k4 k4Var) {
        C3705r.m14346k(k4Var);
        if (this.f11054c == null) {
            this.f11054c = new ArrayList();
        }
        if (this.f11053b == null) {
            this.f11053b = new ArrayList();
        }
        if (!this.f11054c.isEmpty() && m15029b((C6863k4) this.f11054c.get(0)) != m15029b(k4Var)) {
            return false;
        }
        long g = this.f11055d + ((long) k4Var.mo19520g());
        this.f11056e.mo12275U();
        if (g >= ((long) Math.max(0, ((Integer) C3966m3.f11004j.mo12145a((Object) null)).intValue()))) {
            return false;
        }
        this.f11055d = g;
        this.f11054c.add(k4Var);
        this.f11053b.add(Long.valueOf(j));
        int size = this.f11054c.size();
        this.f11056e.mo12275U();
        return size < Math.max(1, ((Integer) C3966m3.f11006k.mo12145a((Object) null)).intValue());
    }
}
