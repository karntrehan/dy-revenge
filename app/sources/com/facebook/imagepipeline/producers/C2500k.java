package com.facebook.imagepipeline.producers;

import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.k */
public class C2500k implements C2529o0<C6369d> {

    /* renamed from: a */
    private final C2529o0<C6369d> f7378a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2529o0<C6369d> f7379b;

    /* renamed from: com.facebook.imagepipeline.producers.k$b */
    private class C2502b extends C2530p<C6369d, C6369d> {

        /* renamed from: c */
        private C2531p0 f7380c;

        private C2502b(C2505l<C6369d> lVar, C2531p0 p0Var) {
            super(lVar);
            this.f7380c = p0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo8225h(Throwable th) {
            C2500k.this.f7379b.mo8198b(mo8320p(), this.f7380c);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo8209i(C6369d dVar, int i) {
            C6384b f = this.f7380c.mo8240f();
            boolean e = C2459b.m10210e(i);
            boolean c = C2476e1.m10300c(dVar, f.mo18934n());
            if (dVar != null && (c || f.mo18925f())) {
                if (!e || !c) {
                    i = C2459b.m10215o(i, 1);
                }
                mo8320p().mo8223d(dVar, i);
            }
            if (e && !c) {
                C6369d.m24309h(dVar);
                C2500k.this.f7379b.mo8198b(mo8320p(), this.f7380c);
            }
        }
    }

    public C2500k(C2529o0<C6369d> o0Var, C2529o0<C6369d> o0Var2) {
        this.f7378a = o0Var;
        this.f7379b = o0Var2;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        this.f7378a.mo8198b(new C2502b(lVar, p0Var), p0Var);
    }
}
