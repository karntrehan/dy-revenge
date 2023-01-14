package p174e.p319f.p393c.p394a.p401w;

import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9236o;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9207r;
import p174e.p319f.p393c.p394a.p395a0.C9210t;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9309a;
import p174e.p319f.p393c.p394a.p403y.C9315b;
import p174e.p319f.p393c.p394a.p403y.C9321c;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.w.a */
public final class C9297a extends C9227h<C9309a> {

    /* renamed from: e.f.c.a.w.a$a */
    class C9298a extends C9227h.C9229b<C9236o, C9309a> {
        C9298a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9236o mo23211a(C9309a aVar) {
            return new C9210t(new C9207r(aVar.mo23347Q().mo23644G()), aVar.mo23348R().mo23362O());
        }
    }

    /* renamed from: e.f.c.a.w.a$b */
    class C9299b extends C9227h.C9228a<C9315b, C9309a> {
        C9299b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9309a mo23207a(C9315b bVar) {
            return (C9309a) C9309a.m31019T().mo23352C(0).mo23353z(C9468i.m31674k(C9211u.m30601c(bVar.mo23360N()))).mo23351B(bVar.mo23361O()).mo23985b();
        }

        /* renamed from: f */
        public C9315b mo23209c(C9468i iVar) {
            return C9315b.m31048P(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9315b bVar) {
            C9297a.m30967p(bVar.mo23361O());
            C9297a.m30968q(bVar.mo23360N());
        }
    }

    C9297a() {
        super(C9309a.class, new C9298a(C9236o.class));
    }

    /* renamed from: n */
    public static void m30966n(boolean z) {
        C9242r.m30711q(new C9297a(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static void m30967p(C9321c cVar) {
        if (cVar.mo23362O() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.mo23362O() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m30968q(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9315b, C9309a> mo23202e() {
        return new C9299b(C9315b.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: l */
    public int mo23332l() {
        return 0;
    }

    /* renamed from: m */
    public C9309a mo23204g(C9468i iVar) {
        return C9309a.m31020U(iVar, C9526q.m32218b());
    }

    /* renamed from: o */
    public void mo23206i(C9309a aVar) {
        C9214w.m30607c(aVar.mo23349S(), mo23332l());
        m30968q(aVar.mo23347Q().size());
        m30967p(aVar.mo23348R());
    }
}
