package com.facebook.imagepipeline.producers;

import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: com.facebook.imagepipeline.producers.a */
public class C2448a implements C2529o0<C6369d> {

    /* renamed from: a */
    private final C2529o0<C6369d> f7244a;

    /* renamed from: com.facebook.imagepipeline.producers.a$b */
    private static class C2450b extends C2530p<C6369d, C6369d> {
        private C2450b(C2505l<C6369d> lVar) {
            super(lVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo8209i(C6369d dVar, int i) {
            if (dVar == null) {
                mo8320p().mo8223d(null, i);
                return;
            }
            if (!C6369d.m24311x0(dVar)) {
                dVar.mo18880A0();
            }
            mo8320p().mo8223d(dVar, i);
        }
    }

    public C2448a(C2529o0<C6369d> o0Var) {
        this.f7244a = o0Var;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        this.f7244a.mo8198b(new C2450b(lVar), p0Var);
    }
}
