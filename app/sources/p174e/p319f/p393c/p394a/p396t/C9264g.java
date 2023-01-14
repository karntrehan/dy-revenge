package p174e.p319f.p393c.p394a.p396t;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p396t.p397m.C9280a;
import p174e.p319f.p393c.p394a.p403y.C9387n;
import p174e.p319f.p393c.p394a.p403y.C9390o;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.g */
public final class C9264g extends C9227h<C9387n> {

    /* renamed from: e.f.c.a.t.g$a */
    class C9265a extends C9227h.C9229b<C9175a, C9387n> {
        C9265a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9175a mo23211a(C9387n nVar) {
            return new C9280a(nVar.mo23439P().mo23644G());
        }
    }

    /* renamed from: e.f.c.a.t.g$b */
    class C9266b extends C9227h.C9228a<C9390o, C9387n> {
        C9266b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9387n mo23207a(C9390o oVar) {
            return (C9387n) C9387n.m31276R().mo23442z(C9468i.m31674k(C9211u.m30601c(oVar.mo23443N()))).mo23441B(C9264g.this.mo23279k()).mo23985b();
        }

        /* renamed from: f */
        public C9390o mo23209c(C9468i iVar) {
            return C9390o.m31286O(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9390o oVar) {
            C9214w.m30605a(oVar.mo23443N());
        }
    }

    C9264g() {
        super(C9387n.class, new C9265a(C9175a.class));
    }

    /* renamed from: j */
    private static boolean m30808j() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static void m30809m(boolean z) {
        if (m30808j()) {
            C9242r.m30711q(new C9264g(), z);
        }
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9390o, C9387n> mo23202e() {
        return new C9266b(C9390o.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: k */
    public int mo23279k() {
        return 0;
    }

    /* renamed from: l */
    public C9387n mo23204g(C9468i iVar) {
        return C9387n.m31277S(iVar, C9526q.m32218b());
    }

    /* renamed from: n */
    public void mo23206i(C9387n nVar) {
        C9214w.m30607c(nVar.mo23440Q(), mo23279k());
        C9214w.m30605a(nVar.mo23439P().size());
    }
}
