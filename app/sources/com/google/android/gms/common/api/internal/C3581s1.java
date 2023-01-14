package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3480b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3663e;
import com.google.android.gms.common.internal.C3694o;
import com.google.android.gms.common.internal.C3708s;
import com.google.android.gms.common.internal.C3711t;
import com.google.android.gms.common.util.C3755b;
import p174e.p319f.p320a.p335c.p362h.C8951f;
import p174e.p319f.p320a.p335c.p362h.C8963l;

/* renamed from: com.google.android.gms.common.api.internal.s1 */
final class C3581s1<T> implements C8951f<T> {

    /* renamed from: a */
    private final C3521f f10078a;

    /* renamed from: b */
    private final int f10079b;

    /* renamed from: c */
    private final C3500b<?> f10080c;

    /* renamed from: d */
    private final long f10081d;

    /* renamed from: e */
    private final long f10082e;

    C3581s1(C3521f fVar, int i, C3500b<?> bVar, long j, long j2, String str, String str2) {
        this.f10078a = fVar;
        this.f10079b = i;
        this.f10080c = bVar;
        this.f10081d = j;
        this.f10082e = j2;
    }

    /* renamed from: b */
    static <T> C3581s1<T> m13923b(C3521f fVar, int i, C3500b<?> bVar) {
        boolean z;
        if (!fVar.mo11318g()) {
            return null;
        }
        C3711t a = C3708s.m14363b().mo11669a();
        if (a == null) {
            z = true;
        } else if (!a.mo11675r()) {
            return null;
        } else {
            z = a.mo11671C();
            C3528g1 x = fVar.mo11322x(bVar);
            if (x != null) {
                if (!(x.mo11345v() instanceof C3651c)) {
                    return null;
                }
                C3651c cVar = (C3651c) x.mo11345v();
                if (cVar.mo11536O() && !cVar.mo11550f()) {
                    C3663e c = m13924c(x, cVar, i);
                    if (c == null) {
                        return null;
                    }
                    x.mo11332G();
                    z = c.mo11586E();
                }
            }
        }
        return new C3581s1(fVar, i, bVar, z ? System.currentTimeMillis() : 0, z ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    /* renamed from: c */
    private static C3663e m13924c(C3528g1<?> g1Var, C3651c<?> cVar, int i) {
        int[] p;
        int[] r;
        C3663e M = cVar.mo11535M();
        if (M == null || !M.mo11585C() || ((p = M.mo11589p()) != null ? !C3755b.m14501b(p, i) : !((r = M.mo11590r()) == null || !C3755b.m14501b(r, i))) || g1Var.mo11343s() >= M.mo11588o()) {
            return null;
        }
        return M;
    }

    /* renamed from: a */
    public final void mo11417a(C8963l<T> lVar) {
        C3528g1 x;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        if (this.f10078a.mo11318g()) {
            C3711t a = C3708s.m14363b().mo11669a();
            if ((a == null || a.mo11675r()) && (x = this.f10078a.mo11322x(this.f10080c)) != null && (x.mo11345v() instanceof C3651c)) {
                C3651c cVar = (C3651c) x.mo11345v();
                boolean z = true;
                boolean z2 = this.f10081d > 0;
                int E = cVar.mo11530E();
                if (a != null) {
                    boolean C = z2 & a.mo11671C();
                    int o = a.mo11673o();
                    int p = a.mo11674p();
                    i3 = a.mo11672E();
                    if (cVar.mo11536O() && !cVar.mo11550f()) {
                        C3663e c = m13924c(x, cVar, this.f10079b);
                        if (c != null) {
                            if (!c.mo11586E() || this.f10081d <= 0) {
                                z = false;
                            }
                            p = c.mo11588o();
                            C = z;
                        } else {
                            return;
                        }
                    }
                    i2 = o;
                    i = p;
                } else {
                    i3 = 0;
                    i2 = 5000;
                    i = 100;
                }
                C3521f fVar = this.f10078a;
                if (lVar.mo22779o()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (lVar.mo22777m()) {
                        i5 = 100;
                    } else {
                        Exception k = lVar.mo22775k();
                        if (k instanceof C3480b) {
                            Status a2 = ((C3480b) k).mo11200a();
                            int p2 = a2.mo11172p();
                            C3623b o2 = a2.mo11171o();
                            i4 = o2 == null ? -1 : o2.mo11462o();
                            i5 = p2;
                        } else {
                            i5 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z2) {
                    long j3 = this.f10081d;
                    j = System.currentTimeMillis();
                    j2 = j3;
                    i6 = (int) (SystemClock.elapsedRealtime() - this.f10082e);
                } else {
                    j2 = 0;
                    j = 0;
                    i6 = -1;
                }
                fVar.mo11312G(new C3694o(this.f10079b, i5, i4, j2, j, (String) null, (String) null, E, i6), i3, (long) i2, i);
            }
        }
    }
}
