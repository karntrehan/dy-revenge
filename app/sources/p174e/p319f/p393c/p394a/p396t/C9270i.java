package p174e.p319f.p393c.p394a.p396t;

import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9235n;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9340e0;
import p174e.p319f.p393c.p394a.p403y.C9346f0;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.i */
public class C9270i extends C9227h<C9340e0> {

    /* renamed from: e.f.c.a.t.i$a */
    class C9271a extends C9227h.C9229b<C9175a, C9340e0> {
        C9271a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9175a mo23211a(C9340e0 e0Var) {
            String O = e0Var.mo23397P().mo23407O();
            return C9235n.m30677a(O).mo23227b(O);
        }
    }

    /* renamed from: e.f.c.a.t.i$b */
    class C9272b extends C9227h.C9228a<C9346f0, C9340e0> {
        C9272b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9340e0 mo23207a(C9346f0 f0Var) {
            return (C9340e0) C9340e0.m31147R().mo23400z(f0Var).mo23399B(C9270i.this.mo23293j()).mo23985b();
        }

        /* renamed from: f */
        public C9346f0 mo23209c(C9468i iVar) {
            return C9346f0.m31175P(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9346f0 f0Var) {
        }
    }

    C9270i() {
        super(C9340e0.class, new C9271a(C9175a.class));
    }

    /* renamed from: l */
    public static void m30843l(boolean z) {
        C9242r.m30711q(new C9270i(), z);
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9346f0, C9340e0> mo23202e() {
        return new C9272b(C9346f0.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.REMOTE;
    }

    /* renamed from: j */
    public int mo23293j() {
        return 0;
    }

    /* renamed from: k */
    public C9340e0 mo23204g(C9468i iVar) {
        return C9340e0.m31148S(iVar, C9526q.m32218b());
    }

    /* renamed from: m */
    public void mo23206i(C9340e0 e0Var) {
        C9214w.m30607c(e0Var.mo23398Q(), mo23293j());
    }
}
