package p174e.p319f.p393c.p394a.p396t;

import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.p395a0.C9176a;
import p174e.p319f.p393c.p394a.p395a0.C9205p;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9343f;
import p174e.p319f.p393c.p394a.p403y.C9349g;
import p174e.p319f.p393c.p394a.p403y.C9355h;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.d */
public class C9255d extends C9227h<C9343f> {

    /* renamed from: e.f.c.a.t.d$a */
    class C9256a extends C9227h.C9229b<C9205p, C9343f> {
        C9256a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9205p mo23211a(C9343f fVar) {
            return new C9176a(fVar.mo23401R().mo23644G(), fVar.mo23402S().mo23414O());
        }
    }

    /* renamed from: e.f.c.a.t.d$b */
    class C9257b extends C9227h.C9228a<C9349g, C9343f> {
        C9257b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9343f mo23207a(C9349g gVar) {
            return (C9343f) C9343f.m31161U().mo23404B(gVar.mo23409P()).mo23406z(C9468i.m31674k(C9211u.m30601c(gVar.mo23408O()))).mo23405C(C9255d.this.mo23258k()).mo23985b();
        }

        /* renamed from: f */
        public C9349g mo23209c(C9468i iVar) {
            return C9349g.m31180Q(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9349g gVar) {
            C9214w.m30605a(gVar.mo23408O());
            C9255d.this.m30755n(gVar.mo23409P());
        }
    }

    C9255d() {
        super(C9343f.class, new C9256a(C9205p.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m30755n(C9355h hVar) {
        if (hVar.mo23414O() < 12 || hVar.mo23414O() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9349g, C9343f> mo23202e() {
        return new C9257b(C9349g.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: k */
    public int mo23258k() {
        return 0;
    }

    /* renamed from: l */
    public C9343f mo23204g(C9468i iVar) {
        return C9343f.m31162V(iVar, C9526q.m32218b());
    }

    /* renamed from: m */
    public void mo23206i(C9343f fVar) {
        C9214w.m30607c(fVar.mo23403T(), mo23258k());
        C9214w.m30605a(fVar.mo23401R().size());
        m30755n(fVar.mo23402S());
    }
}
