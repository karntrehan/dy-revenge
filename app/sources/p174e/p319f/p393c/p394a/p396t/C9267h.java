package p174e.p319f.p393c.p394a.p396t;

import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9192j;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9399r;
import p174e.p319f.p393c.p394a.p403y.C9402s;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.h */
public class C9267h extends C9227h<C9399r> {

    /* renamed from: e.f.c.a.t.h$a */
    class C9268a extends C9227h.C9229b<C9175a, C9399r> {
        C9268a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9175a mo23211a(C9399r rVar) {
            return new C9192j(rVar.mo23450P().mo23644G());
        }
    }

    /* renamed from: e.f.c.a.t.h$b */
    class C9269b extends C9227h.C9228a<C9402s, C9399r> {
        C9269b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9399r mo23207a(C9402s sVar) {
            return (C9399r) C9399r.m31312R().mo23452B(C9267h.this.mo23286j()).mo23453z(C9468i.m31674k(C9211u.m30601c(32))).mo23985b();
        }

        /* renamed from: f */
        public C9402s mo23209c(C9468i iVar) {
            return C9402s.m31322N(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9402s sVar) {
        }
    }

    C9267h() {
        super(C9399r.class, new C9268a(C9175a.class));
    }

    /* renamed from: l */
    public static void m30826l(boolean z) {
        C9242r.m30711q(new C9267h(), z);
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9402s, C9399r> mo23202e() {
        return new C9269b(C9402s.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: j */
    public int mo23286j() {
        return 0;
    }

    /* renamed from: k */
    public C9399r mo23204g(C9468i iVar) {
        return C9399r.m31313S(iVar, C9526q.m32218b());
    }

    /* renamed from: m */
    public void mo23206i(C9399r rVar) {
        C9214w.m30607c(rVar.mo23451Q(), mo23286j());
        if (rVar.mo23450P().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
