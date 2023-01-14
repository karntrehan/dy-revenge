package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.x0 */
public class C2559x0<T> implements C2529o0<Void> {

    /* renamed from: a */
    private final C2529o0<T> f7543a;

    /* renamed from: com.facebook.imagepipeline.producers.x0$a */
    class C2560a extends C2530p<T, Void> {
        C2560a(C2505l lVar) {
            super(lVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo8209i(T t, int i) {
            if (C2459b.m10210e(i)) {
                mo8320p().mo8223d(null, i);
            }
        }
    }

    public C2559x0(C2529o0<T> o0Var) {
        this.f7543a = o0Var;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<Void> lVar, C2531p0 p0Var) {
        this.f7543a.mo8198b(new C2560a(lVar), p0Var);
    }
}
