package p174e.p319f.p393c.p394a.p396t;

import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p395a0.C9216y;
import p174e.p319f.p393c.p394a.p403y.C9375k0;
import p174e.p319f.p393c.p394a.p403y.C9381l0;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.l */
public class C9277l extends C9227h<C9375k0> {

    /* renamed from: e.f.c.a.t.l$a */
    class C9278a extends C9227h.C9229b<C9175a, C9375k0> {
        C9278a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9175a mo23211a(C9375k0 k0Var) {
            return new C9216y(k0Var.mo23429P().mo23644G());
        }
    }

    /* renamed from: e.f.c.a.t.l$b */
    class C9279b extends C9227h.C9228a<C9381l0, C9375k0> {
        C9279b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9375k0 mo23207a(C9381l0 l0Var) {
            return (C9375k0) C9375k0.m31241R().mo23431B(C9277l.this.mo23307j()).mo23432z(C9468i.m31674k(C9211u.m30601c(32))).mo23985b();
        }

        /* renamed from: f */
        public C9381l0 mo23209c(C9468i iVar) {
            return C9381l0.m31263N(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9381l0 l0Var) {
        }
    }

    C9277l() {
        super(C9375k0.class, new C9278a(C9175a.class));
    }

    /* renamed from: l */
    public static void m30880l(boolean z) {
        C9242r.m30711q(new C9277l(), z);
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9381l0, C9375k0> mo23202e() {
        return new C9279b(C9381l0.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: j */
    public int mo23307j() {
        return 0;
    }

    /* renamed from: k */
    public C9375k0 mo23204g(C9468i iVar) {
        return C9375k0.m31242S(iVar, C9526q.m32218b());
    }

    /* renamed from: m */
    public void mo23206i(C9375k0 k0Var) {
        C9214w.m30607c(k0Var.mo23430Q(), mo23307j());
        if (k0Var.mo23429P().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
