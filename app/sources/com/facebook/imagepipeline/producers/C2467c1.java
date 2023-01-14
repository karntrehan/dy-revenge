package com.facebook.imagepipeline.producers;

import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: com.facebook.imagepipeline.producers.c1 */
public class C2467c1 implements C2529o0<C6369d> {

    /* renamed from: a */
    private final C2471d1<C6369d>[] f7279a;

    /* renamed from: com.facebook.imagepipeline.producers.c1$a */
    private class C2468a extends C2530p<C6369d, C6369d> {

        /* renamed from: c */
        private final C2531p0 f7280c;

        /* renamed from: d */
        private final int f7281d;

        /* renamed from: e */
        private final C6316e f7282e;

        public C2468a(C2505l<C6369d> lVar, C2531p0 p0Var, int i) {
            super(lVar);
            this.f7280c = p0Var;
            this.f7281d = i;
            this.f7282e = p0Var.mo8240f().mo18934n();
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo8225h(Throwable th) {
            if (!C2467c1.this.m10244e(this.f7281d + 1, mo8320p(), this.f7280c)) {
                mo8320p().mo8221b(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo8209i(C6369d dVar, int i) {
            if (dVar != null && (C2459b.m10211f(i) || C2476e1.m10300c(dVar, this.f7282e))) {
                mo8320p().mo8223d(dVar, i);
            } else if (C2459b.m10210e(i)) {
                C6369d.m24309h(dVar);
                if (!C2467c1.this.m10244e(this.f7281d + 1, mo8320p(), this.f7280c)) {
                    mo8320p().mo8223d(null, 1);
                }
            }
        }
    }

    public C2467c1(C2471d1<C6369d>... d1VarArr) {
        C2471d1<C6369d>[] d1VarArr2 = (C2471d1[]) C6062k.m22839g(d1VarArr);
        this.f7279a = d1VarArr2;
        C6062k.m22837e(0, d1VarArr2.length);
    }

    /* renamed from: d */
    private int m10243d(int i, C6316e eVar) {
        while (true) {
            C2471d1<C6369d>[] d1VarArr = this.f7279a;
            if (i >= d1VarArr.length) {
                return -1;
            }
            if (d1VarArr[i].mo8197a(eVar)) {
                return i;
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m10244e(int i, C2505l<C6369d> lVar, C2531p0 p0Var) {
        int d = m10243d(i, p0Var.mo8240f().mo18934n());
        if (d == -1) {
            return false;
        }
        this.f7279a[d].mo8198b(new C2468a(lVar, p0Var, d), p0Var);
        return true;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        if (p0Var.mo8240f().mo18934n() == null || !m10244e(0, lVar, p0Var)) {
            lVar.mo8223d(null, 1);
        }
    }
}
