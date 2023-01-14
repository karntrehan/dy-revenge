package p174e.p319f.p393c.p394a;

import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.p403y.C9324c0;
import p174e.p319f.p393c.p394a.p403y.C9332d0;
import p174e.p319f.p393c.p394a.p403y.C9405t;
import p174e.p319f.p393c.p394a.p404z.p405a.C9443c0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;

/* renamed from: e.f.c.a.i */
public final class C9230i {

    /* renamed from: a */
    private final C9324c0 f25144a;

    private C9230i(C9324c0 c0Var) {
        this.f25144a = c0Var;
    }

    /* renamed from: a */
    public static void m30650a(C9405t tVar) {
        if (tVar == null || tVar.mo23454P().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: b */
    public static void m30651b(C9324c0 c0Var) {
        if (c0Var == null || c0Var.mo23364S() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: c */
    private static C9324c0 m30652c(C9405t tVar, C9175a aVar) {
        try {
            C9324c0 W = C9324c0.m31064W(aVar.mo23154b(tVar.mo23454P().mo23644G(), new byte[0]), C9526q.m32218b());
            m30651b(W);
            return W;
        } catch (C9443c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: d */
    private static C9405t m30653d(C9324c0 c0Var, C9175a aVar) {
        byte[] a = aVar.mo23153a(c0Var.mo23479i(), new byte[0]);
        try {
            if (C9324c0.m31064W(aVar.mo23154b(a, new byte[0]), C9526q.m32218b()).equals(c0Var)) {
                return (C9405t) C9405t.m31327Q().mo23456z(C9468i.m31674k(a)).mo23455B(C9247s.m30724b(c0Var)).mo23985b();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (C9443c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: e */
    static final C9230i m30654e(C9324c0 c0Var) {
        m30651b(c0Var);
        return new C9230i(c0Var);
    }

    /* renamed from: i */
    private <B, P> P m30655i(Class<P> cls, Class<B> cls2) {
        return C9242r.m30714t(C9242r.m30706l(this, cls2), cls);
    }

    /* renamed from: j */
    public static final C9230i m30656j(C9232k kVar, C9175a aVar) {
        C9405t a = kVar.mo23222a();
        m30650a(a);
        return new C9230i(m30652c(a, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C9324c0 mo23213f() {
        return this.f25144a;
    }

    /* renamed from: g */
    public C9332d0 mo23214g() {
        return C9247s.m30724b(this.f25144a);
    }

    /* renamed from: h */
    public <P> P mo23215h(Class<P> cls) {
        Class<?> e = C9242r.m30699e(cls);
        if (e != null) {
            return m30655i(cls, e);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* renamed from: k */
    public void mo23216k(C9233l lVar, C9175a aVar) {
        lVar.mo23225b(m30653d(this.f25144a, aVar));
    }

    public String toString() {
        return mo23214g().toString();
    }
}
