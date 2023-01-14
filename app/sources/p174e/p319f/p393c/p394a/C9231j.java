package p174e.p319f.p393c.p394a;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
import p174e.p319f.p393c.p394a.p403y.C9312a0;
import p174e.p319f.p393c.p394a.p403y.C9324c0;
import p174e.p319f.p393c.p394a.p403y.C9364i0;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p403y.C9424z;

/* renamed from: e.f.c.a.j */
public final class C9231j {

    /* renamed from: a */
    private final C9324c0.C9326b f25145a;

    private C9231j(C9324c0.C9326b bVar) {
        this.f25145a = bVar;
    }

    /* renamed from: d */
    private synchronized boolean m30661d(int i) {
        boolean z;
        Iterator<C9324c0.C9327c> it = this.f25145a.mo23369D().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo23373S() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    /* renamed from: e */
    private synchronized C9324c0.C9327c m30662e(C9312a0 a0Var) {
        C9419y p;
        int f;
        C9364i0 R;
        p = C9242r.m30710p(a0Var);
        f = m30663f();
        R = a0Var.mo23354R();
        if (R == C9364i0.UNKNOWN_PREFIX) {
            R = C9364i0.TINK;
        }
        return (C9324c0.C9327c) C9324c0.C9327c.m31081W().mo23380z(p).mo23377B(f).mo23379D(C9424z.ENABLED).mo23378C(R).mo23985b();
    }

    /* renamed from: f */
    private synchronized int m30663f() {
        int g;
        do {
            g = m30664g();
        } while (m30661d(g));
        return g;
    }

    /* renamed from: g */
    private static int m30664g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    /* renamed from: i */
    public static C9231j m30665i() {
        return new C9231j(C9324c0.m31063V());
    }

    /* renamed from: j */
    public static C9231j m30666j(C9230i iVar) {
        return new C9231j((C9324c0.C9326b) iVar.mo23213f().mo23979d());
    }

    /* renamed from: a */
    public synchronized C9231j mo23218a(C9224g gVar) {
        mo23219b(gVar.mo23197b(), false);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public synchronized int mo23219b(C9312a0 a0Var, boolean z) {
        C9324c0.C9327c e;
        e = m30662e(a0Var);
        this.f25145a.mo23371z(e);
        if (z) {
            this.f25145a.mo23370F(e.mo23373S());
        }
        return e.mo23373S();
    }

    /* renamed from: c */
    public synchronized C9230i mo23220c() {
        return C9230i.m30654e((C9324c0) this.f25145a.mo23985b());
    }

    /* renamed from: h */
    public synchronized C9231j mo23221h(int i) {
        int i2 = 0;
        while (i2 < this.f25145a.mo23368C()) {
            C9324c0.C9327c B = this.f25145a.mo23367B(i2);
            if (B.mo23373S() != i) {
                i2++;
            } else if (B.mo23375U().equals(C9424z.ENABLED)) {
                this.f25145a.mo23370F(i);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
