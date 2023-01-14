package p174e.p319f.p393c.p394a.p396t;

import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9236o;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9194l;
import p174e.p319f.p393c.p394a.p395a0.C9205p;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p401w.C9300b;
import p174e.p319f.p393c.p394a.p403y.C9329d;
import p174e.p319f.p393c.p394a.p403y.C9337e;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.c */
public final class C9252c extends C9227h<C9329d> {

    /* renamed from: e.f.c.a.t.c$a */
    class C9253a extends C9227h.C9229b<C9175a, C9329d> {
        C9253a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9175a mo23211a(C9329d dVar) {
            return new C9194l((C9205p) new C9255d().mo23201d(dVar.mo23381Q(), C9205p.class), (C9236o) new C9300b().mo23201d(dVar.mo23382R(), C9236o.class), dVar.mo23382R().mo23459S().mo23467P());
        }
    }

    /* renamed from: e.f.c.a.t.c$b */
    class C9254b extends C9227h.C9228a<C9337e, C9329d> {
        C9254b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9329d mo23207a(C9337e eVar) {
            return (C9329d) C9329d.m31100T().mo23386z(new C9255d().mo23202e().mo23207a(eVar.mo23395N())).mo23384B(new C9300b().mo23202e().mo23207a(eVar.mo23396O())).mo23385C(C9252c.this.mo23251j()).mo23985b();
        }

        /* renamed from: f */
        public C9337e mo23209c(C9468i iVar) {
            return C9337e.m31140P(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9337e eVar) {
            new C9255d().mo23202e().mo23210d(eVar.mo23395N());
            new C9300b().mo23202e().mo23210d(eVar.mo23396O());
            C9214w.m30605a(eVar.mo23395N().mo23408O());
        }
    }

    C9252c() {
        super(C9329d.class, new C9253a(C9175a.class));
    }

    /* renamed from: l */
    public static void m30737l(boolean z) {
        C9242r.m30711q(new C9252c(), z);
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9337e, C9329d> mo23202e() {
        return new C9254b(C9337e.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: j */
    public int mo23251j() {
        return 0;
    }

    /* renamed from: k */
    public C9329d mo23204g(C9468i iVar) {
        return C9329d.m31101U(iVar, C9526q.m32218b());
    }

    /* renamed from: m */
    public void mo23206i(C9329d dVar) {
        C9214w.m30607c(dVar.mo23383S(), mo23251j());
        new C9255d().mo23206i(dVar.mo23381Q());
        new C9300b().mo23206i(dVar.mo23382R());
    }
}
