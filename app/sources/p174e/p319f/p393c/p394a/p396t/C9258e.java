package p174e.p319f.p393c.p394a.p396t;

import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9178b;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;
import p174e.p319f.p393c.p394a.p403y.C9361i;
import p174e.p319f.p393c.p394a.p403y.C9366j;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.t.e */
public final class C9258e extends C9227h<C9361i> {

    /* renamed from: e.f.c.a.t.e$a */
    class C9259a extends C9227h.C9229b<C9175a, C9361i> {
        C9259a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C9175a mo23211a(C9361i iVar) {
            return new C9178b(iVar.mo23417Q().mo23644G(), iVar.mo23418R().mo23428O());
        }
    }

    /* renamed from: e.f.c.a.t.e$b */
    class C9260b extends C9227h.C9228a<C9366j, C9361i> {
        C9260b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public C9361i mo23207a(C9366j jVar) {
            return (C9361i) C9361i.m31210T().mo23422z(C9468i.m31674k(C9211u.m30601c(jVar.mo23426N()))).mo23420B(jVar.mo23427O()).mo23421C(C9258e.this.mo23265j()).mo23985b();
        }

        /* renamed from: f */
        public C9366j mo23209c(C9468i iVar) {
            return C9366j.m31227P(iVar, C9526q.m32218b());
        }

        /* renamed from: g */
        public void mo23210d(C9366j jVar) {
            C9214w.m30605a(jVar.mo23426N());
            if (jVar.mo23427O().mo23428O() != 12 && jVar.mo23427O().mo23428O() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    C9258e() {
        super(C9361i.class, new C9259a(C9175a.class));
    }

    /* renamed from: l */
    public static void m30772l(boolean z) {
        C9242r.m30711q(new C9258e(), z);
    }

    /* renamed from: c */
    public String mo23200c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: e */
    public C9227h.C9228a<C9366j, C9361i> mo23202e() {
        return new C9260b(C9366j.class);
    }

    /* renamed from: f */
    public C9419y.C9422c mo23203f() {
        return C9419y.C9422c.SYMMETRIC;
    }

    /* renamed from: j */
    public int mo23265j() {
        return 0;
    }

    /* renamed from: k */
    public C9361i mo23204g(C9468i iVar) {
        return C9361i.m31211U(iVar, C9526q.m32218b());
    }

    /* renamed from: m */
    public void mo23206i(C9361i iVar) {
        C9214w.m30607c(iVar.mo23419S(), mo23265j());
        C9214w.m30605a(iVar.mo23417Q().size());
        if (iVar.mo23418R().mo23428O() != 12 && iVar.mo23418R().mo23428O() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
