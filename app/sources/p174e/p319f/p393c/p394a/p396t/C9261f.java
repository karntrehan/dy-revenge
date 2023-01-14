package p174e.p319f.p393c.p394a.p396t;

import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9224g;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9181c;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9378l;
import p174e.p319f.p393c.p394a.p403y.C9384m;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.f */
public final class C9261f extends C9227h<C9378l> {

    /* renamed from: e.f.c.a.t.f$a */
    class C9262a extends C9227h.C9229b<C9175a, C9378l> {
        C9262a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9175a mo23211a(C9378l lVar) {
            return new C9181c(lVar.mo23433P().mo23644G());
        }
    }

    /* renamed from: e.f.c.a.t.f$b */
    class C9263b extends C9227h.C9228a<C9384m, C9378l> {
        C9263b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9378l mo23207a(C9384m mVar) {
            return (C9378l) C9378l.m31253R().mo23436z(C9468i.m31674k(C9211u.m30601c(mVar.mo23437O()))).mo23435B(C9261f.this.mo23272l()).mo23985b();
        }

        /* renamed from: f */
        public C9384m mo23209c(C9468i iVar) {
            return C9384m.m31268Q(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9384m mVar) {
            C9214w.m30605a(mVar.mo23437O());
        }
    }

    C9261f() {
        super(C9378l.class, new C9262a(C9175a.class));
    }

    /* renamed from: j */
    public static final C9224g m30789j() {
        return m30790k(32, C9224g.C9226b.TINK);
    }

    /* renamed from: k */
    private static C9224g m30790k(int i, C9224g.C9226b bVar) {
        return C9224g.m30632a(new C9261f().mo23200c(), ((C9384m) C9384m.m31267P().mo23438z(i).mo23985b()).mo23479i(), bVar);
    }

    /* renamed from: n */
    public static void m30791n(boolean z) {
        C9242r.m30711q(new C9261f(), z);
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9384m, C9378l> mo23202e() {
        return new C9263b(C9384m.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: l */
    public int mo23272l() {
        return 0;
    }

    /* renamed from: m */
    public C9378l mo23204g(C9468i iVar) {
        return C9378l.m31254S(iVar, C9526q.m32218b());
    }

    /* renamed from: o */
    public void mo23206i(C9378l lVar) {
        C9214w.m30607c(lVar.mo23434Q(), mo23272l());
        C9214w.m30605a(lVar.mo23433P().size());
    }
}
