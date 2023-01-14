package p477h.p478a.p479a.p484d;

import java.nio.charset.Charset;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p488f.C10534a;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10544k;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p488f.p489r.C10552a;
import p477h.p478a.p479a.p488f.p489r.C10554c;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p488f.p489r.C10556e;
import p477h.p478a.p479a.p492i.C10579b;
import p477h.p478a.p479a.p492i.C10581d;
import p477h.p478a.p479a.p492i.C10582e;
import p477h.p478a.p479a.p492i.C10583f;
import p477h.p478a.p479a.p492i.C10585h;
import p477h.p478a.p479a.p492i.C10586i;

/* renamed from: h.a.a.d.b */
public class C10500b {
    /* renamed from: a */
    private int m35426a(String str, Charset charset) {
        return str.getBytes(charset).length;
    }

    /* renamed from: b */
    private byte[] m35427b(boolean z, C10550q qVar, Charset charset) {
        byte[] bArr = new byte[2];
        bArr[0] = m35429e(z, qVar);
        if (charset.equals(C10582e.f28021b)) {
            bArr[1] = C10579b.m35877b(bArr[1], 3);
        }
        return bArr;
    }

    /* renamed from: c */
    private C10534a m35428c(C10550q qVar) {
        C10534a aVar = new C10534a();
        if (qVar.mo26166b() != null) {
            aVar.mo26015i(qVar.mo26166b());
        }
        C10552a a = qVar.mo26165a();
        C10552a aVar2 = C10552a.KEY_STRENGTH_128;
        if (a == aVar2 || qVar.mo26165a() == (aVar2 = C10552a.KEY_STRENGTH_192) || qVar.mo26165a() == (aVar2 = C10552a.KEY_STRENGTH_256)) {
            aVar.mo26014h(aVar2);
            aVar.mo26016j(qVar.mo26169d());
            return aVar;
        }
        throw new C10497a("invalid AES key strength");
    }

    /* renamed from: e */
    private byte m35429e(boolean z, C10550q qVar) {
        byte b;
        byte b2;
        byte b3 = 0;
        if (z) {
            b3 = C10579b.m35877b((byte) 0, 0);
        }
        if (C10555d.DEFLATE.equals(qVar.mo26169d())) {
            if (C10554c.NORMAL.equals(qVar.mo26167c())) {
                b2 = C10579b.m35878c(b3, 1);
            } else if (C10554c.MAXIMUM.equals(qVar.mo26167c())) {
                b2 = C10579b.m35877b(b3, 1);
            } else {
                if (C10554c.FAST.equals(qVar.mo26167c())) {
                    b = C10579b.m35878c(b3, 1);
                } else if (C10554c.FASTEST.equals(qVar.mo26167c()) || C10554c.ULTRA.equals(qVar.mo26167c())) {
                    b = C10579b.m35877b(b3, 1);
                }
                b3 = C10579b.m35877b(b, 2);
            }
            b3 = C10579b.m35878c(b2, 2);
        }
        return qVar.mo26186u() ? C10579b.m35877b(b3, 3) : b3;
    }

    /* renamed from: g */
    private String m35430g(String str) {
        if (C10585h.m35940g(str)) {
            return str;
        }
        throw new C10497a("fileNameInZip is null or empty");
    }

    /* renamed from: d */
    public C10543j mo25899d(C10550q qVar, boolean z, int i, Charset charset, C10583f fVar) {
        C10543j jVar = new C10543j();
        jVar.mo26140b(C10502d.CENTRAL_DIRECTORY);
        jVar.mo26102Z(C10586i.m35944a(qVar, fVar));
        jVar.mo26031M(C10586i.m35945b(qVar).mo25910e());
        if (!qVar.mo26180o() || qVar.mo26171f() != C10556e.AES) {
            jVar.mo26055x(qVar.mo26169d());
        } else {
            jVar.mo26055x(C10555d.AES_INTERNAL_ONLY);
            jVar.mo26053v(m35428c(qVar));
            jVar.mo26024F(jVar.mo26041j() + 11);
        }
        if (qVar.mo26180o()) {
            if (qVar.mo26171f() == null || qVar.mo26171f() == C10556e.NONE) {
                throw new C10497a("Encryption method has to be set when encryptFiles flag is set in zip parameters");
            }
            jVar.mo26021C(true);
            jVar.mo26022D(qVar.mo26171f());
        }
        String g = m35430g(qVar.mo26176k());
        jVar.mo26025G(g);
        jVar.mo26026H(m35426a(g, charset));
        if (!z) {
            i = 0;
        }
        jVar.mo26096T(i);
        jVar.mo26029K(C10585h.m35938e(qVar.mo26177l() > 0 ? qVar.mo26177l() : System.currentTimeMillis()));
        boolean z2 = C10581d.m35911z(g);
        jVar.mo26020B(z2);
        jVar.mo26097U(C10581d.m35894i(z2));
        if (!qVar.mo26186u() || qVar.mo26173h() != -1) {
            jVar.mo26030L(qVar.mo26173h());
        } else {
            jVar.mo26030L(0);
        }
        if (qVar.mo26180o() && qVar.mo26171f() == C10556e.ZIP_STANDARD) {
            jVar.mo26056y(qVar.mo26172g());
        }
        jVar.mo26028J(m35427b(jVar.mo26051t(), qVar, charset));
        jVar.mo26019A(qVar.mo26186u());
        jVar.mo26098V(qVar.mo26175j());
        return jVar;
    }

    /* renamed from: f */
    public C10544k mo25900f(C10543j jVar) {
        C10544k kVar = new C10544k();
        kVar.mo26140b(C10502d.LOCAL_FILE_HEADER);
        kVar.mo26031M(jVar.mo26047p());
        kVar.mo26055x(jVar.mo26035e());
        kVar.mo26029K(jVar.mo26045n());
        kVar.mo26030L(jVar.mo26046o());
        kVar.mo26026H(jVar.mo26043l());
        kVar.mo26025G(jVar.mo26042k());
        kVar.mo26021C(jVar.mo26051t());
        kVar.mo26022D(jVar.mo26039h());
        kVar.mo26053v(jVar.mo26033c());
        kVar.mo26056y(jVar.mo26037f());
        kVar.mo26054w(jVar.mo26034d());
        kVar.mo26028J((byte[]) jVar.mo26044m().clone());
        kVar.mo26019A(jVar.mo26049r());
        kVar.mo26024F(jVar.mo26041j());
        return kVar;
    }
}
