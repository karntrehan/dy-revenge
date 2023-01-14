package p174e.p319f.p393c.p394a.p396t;

import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9235n;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9352g0;
import p174e.p319f.p393c.p394a.p403y.C9358h0;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.k */
public class C9274k extends C9227h<C9352g0> {

    /* renamed from: e.f.c.a.t.k$a */
    class C9275a extends C9227h.C9229b<C9175a, C9352g0> {
        C9275a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9175a mo23211a(C9352g0 g0Var) {
            String P = g0Var.mo23410P().mo23416P();
            return new C9273j(g0Var.mo23410P().mo23415O(), C9235n.m30677a(P).mo23227b(P));
        }
    }

    /* renamed from: e.f.c.a.t.k$b */
    class C9276b extends C9227h.C9228a<C9358h0, C9352g0> {
        C9276b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9352g0 mo23207a(C9358h0 h0Var) {
            return (C9352g0) C9352g0.m31187R().mo23413z(h0Var).mo23412B(C9274k.this.mo23300j()).mo23985b();
        }

        /* renamed from: f */
        public C9358h0 mo23209c(C9468i iVar) {
            return C9358h0.m31202Q(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9358h0 h0Var) {
        }
    }

    C9274k() {
        super(C9352g0.class, new C9275a(C9175a.class));
    }

    /* renamed from: l */
    public static void m30863l(boolean z) {
        C9242r.m30711q(new C9274k(), z);
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9358h0, C9352g0> mo23202e() {
        return new C9276b(C9358h0.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.REMOTE;
    }

    /* renamed from: j */
    public int mo23300j() {
        return 0;
    }

    /* renamed from: k */
    public C9352g0 mo23204g(C9468i iVar) {
        return C9352g0.m31188S(iVar, C9526q.m32218b());
    }

    /* renamed from: m */
    public void mo23206i(C9352g0 g0Var) {
        C9214w.m30607c(g0Var.mo23411Q(), mo23300j());
    }
}
