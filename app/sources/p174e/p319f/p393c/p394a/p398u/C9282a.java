package p174e.p319f.p393c.p394a.p398u;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import p174e.p319f.p393c.p394a.C9220d;
import p174e.p319f.p393c.p394a.C9224g;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9183d;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9393p;
import p174e.p319f.p393c.p394a.p403y.C9396q;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.u.a */
public final class C9282a extends C9227h<C9393p> {

    /* renamed from: e.f.c.a.u.a$a */
    class C9283a extends C9227h.C9229b<C9220d, C9393p> {
        C9283a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9220d mo23211a(C9393p pVar) {
            return new C9183d(pVar.mo23444P().mo23644G());
        }
    }

    /* renamed from: e.f.c.a.u.a$b */
    class C9284b extends C9227h.C9228a<C9396q, C9393p> {
        C9284b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9393p mo23207a(C9396q qVar) {
            return (C9393p) C9393p.m31292R().mo23447z(C9468i.m31674k(C9211u.m30601c(qVar.mo23448O()))).mo23446B(C9282a.this.mo23316l()).mo23985b();
        }

        /* renamed from: f */
        public C9396q mo23209c(C9468i iVar) {
            return C9396q.m31304Q(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9396q qVar) {
            if (qVar.mo23448O() != 64) {
                throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.mo23448O() + ". Valid keys must have 64 bytes.");
            }
        }
    }

    C9282a() {
        super(C9393p.class, new C9283a(C9220d.class));
    }

    /* renamed from: j */
    public static final C9224g m30902j() {
        return m30903k(64, C9224g.C9226b.TINK);
    }

    /* renamed from: k */
    private static C9224g m30903k(int i, C9224g.C9226b bVar) {
        return C9224g.m30632a(new C9282a().mo23200c(), ((C9396q) C9396q.m31303P().mo23449z(i).mo23985b()).mo23479i(), bVar);
    }

    /* renamed from: n */
    public static void m30904n(boolean z) {
        C9242r.m30711q(new C9282a(), z);
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9396q, C9393p> mo23202e() {
        return new C9284b(C9396q.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: l */
    public int mo23316l() {
        return 0;
    }

    /* renamed from: m */
    public C9393p mo23204g(C9468i iVar) {
        return C9393p.m31293S(iVar, C9526q.m32218b());
    }

    /* renamed from: o */
    public void mo23206i(C9393p pVar) {
        C9214w.m30607c(pVar.mo23445Q(), mo23316l());
        if (pVar.mo23444P().size() != 64) {
            throw new InvalidKeyException("invalid key size: " + pVar.mo23444P().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
