package p174e.p319f.p393c.p394a;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.p403y.C9324c0;
import p174e.p319f.p393c.p394a.p403y.C9332d0;
import p174e.p319f.p393c.p394a.p403y.C9364i0;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p403y.C9424z;

/* renamed from: e.f.c.a.s */
class C9247s {

    /* renamed from: a */
    public static final Charset f25164a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static C9332d0.C9335c m30723a(C9324c0.C9327c cVar) {
        return (C9332d0.C9335c) C9332d0.C9335c.m31128S().mo23393D(cVar.mo23372R().mo23469S()).mo23392C(cVar.mo23375U()).mo23391B(cVar.mo23374T()).mo23394z(cVar.mo23373S()).mo23985b();
    }

    /* renamed from: b */
    public static C9332d0 m30724b(C9324c0 c0Var) {
        C9332d0.C9334b B = C9332d0.m31117S().mo23388B(c0Var.mo23366U());
        for (C9324c0.C9327c a : c0Var.mo23365T()) {
            B.mo23389z(m30723a(a));
        }
        return (C9332d0) B.mo23985b();
    }

    /* renamed from: c */
    public static void m30725c(C9324c0.C9327c cVar) {
        if (!cVar.mo23376V()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(cVar.mo23373S())}));
        } else if (cVar.mo23374T() == C9364i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(cVar.mo23373S())}));
        } else if (cVar.mo23375U() == C9424z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(cVar.mo23373S())}));
        }
    }

    /* renamed from: d */
    public static void m30726d(C9324c0 c0Var) {
        int U = c0Var.mo23366U();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (C9324c0.C9327c next : c0Var.mo23365T()) {
            if (next.mo23375U() == C9424z.ENABLED) {
                m30725c(next);
                if (next.mo23373S() == U) {
                    if (!z) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (next.mo23372R().mo23468R() != C9419y.C9422c.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
