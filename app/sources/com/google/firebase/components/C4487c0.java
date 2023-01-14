package com.google.firebase.components;

import com.google.firebase.p162p.C4925a;
import com.google.firebase.p162p.C4927b;

/* renamed from: com.google.firebase.components.c0 */
class C4487c0<T> implements C4927b<T>, C4925a<T> {

    /* renamed from: a */
    private static final C4925a.C4926a<Object> f12782a = C4498k.f12806a;

    /* renamed from: b */
    private static final C4927b<Object> f12783b = C4497j.f12805a;

    /* renamed from: c */
    private C4925a.C4926a<T> f12784c;

    /* renamed from: d */
    private volatile C4927b<T> f12785d;

    private C4487c0(C4925a.C4926a<T> aVar, C4927b<T> bVar) {
        this.f12784c = aVar;
        this.f12785d = bVar;
    }

    /* renamed from: b */
    static <T> C4487c0<T> m17099b() {
        return new C4487c0<>(f12782a, f12783b);
    }

    /* renamed from: c */
    static /* synthetic */ void m17100c(C4927b bVar) {
    }

    /* renamed from: d */
    static /* synthetic */ Object m17101d() {
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ void m17102e(C4925a.C4926a aVar, C4925a.C4926a aVar2, C4927b bVar) {
        aVar.mo14022a(bVar);
        aVar2.mo14022a(bVar);
    }

    /* renamed from: f */
    static <T> C4487c0<T> m17103f(C4927b<T> bVar) {
        return new C4487c0<>((C4925a.C4926a) null, bVar);
    }

    /* renamed from: a */
    public void mo14011a(C4925a.C4926a<T> aVar) {
        C4927b<T> bVar;
        C4927b<T> bVar2 = this.f12785d;
        C4927b<Object> bVar3 = f12783b;
        if (bVar2 != bVar3) {
            aVar.mo14022a(bVar2);
            return;
        }
        C4927b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f12785d;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                this.f12784c = new C4499l(this.f12784c, aVar);
            }
        }
        if (bVar4 != null) {
            aVar.mo14022a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo14012g(C4927b<T> bVar) {
        C4925a.C4926a<T> aVar;
        if (this.f12785d == f12783b) {
            synchronized (this) {
                aVar = this.f12784c;
                this.f12784c = null;
                this.f12785d = bVar;
            }
            aVar.mo14022a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    public T get() {
        return this.f12785d.get();
    }
}
