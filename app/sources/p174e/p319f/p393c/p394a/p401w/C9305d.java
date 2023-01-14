package p174e.p319f.p393c.p394a.p401w;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p174e.p319f.p393c.p394a.C9236o;
import p174e.p319f.p393c.p394a.C9237p;
import p174e.p319f.p393c.p394a.C9241q;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9189g;
import p174e.p319f.p393c.p394a.p403y.C9364i0;

/* renamed from: e.f.c.a.w.d */
class C9305d implements C9241q<C9236o, C9236o> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f25228a = Logger.getLogger(C9305d.class.getName());

    /* renamed from: e.f.c.a.w.d$b */
    private static class C9307b implements C9236o {

        /* renamed from: a */
        private final C9237p<C9236o> f25229a;

        /* renamed from: b */
        private final byte[] f25230b;

        private C9307b(C9237p<C9236o> pVar) {
            this.f25230b = new byte[]{0};
            this.f25229a = pVar;
        }

        /* renamed from: a */
        public void mo23187a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C9237p.C9239b next : this.f25229a.mo23230c(copyOf)) {
                    try {
                        if (next.mo23235b().equals(C9364i0.LEGACY)) {
                            ((C9236o) next.mo23236c()).mo23187a(copyOfRange, C9189g.m30530a(bArr2, this.f25230b));
                            return;
                        }
                        ((C9236o) next.mo23236c()).mo23187a(copyOfRange, bArr2);
                        return;
                    } catch (GeneralSecurityException e) {
                        Logger d = C9305d.f25228a;
                        d.info("tag prefix matches a key, but cannot verify: " + e);
                    }
                }
                for (C9237p.C9239b c : this.f25229a.mo23232e()) {
                    try {
                        ((C9236o) c.mo23236c()).mo23187a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        /* renamed from: b */
        public byte[] mo23188b(byte[] bArr) {
            if (this.f25229a.mo23229b().mo23235b().equals(C9364i0.LEGACY)) {
                return C9189g.m30530a(this.f25229a.mo23229b().mo23234a(), this.f25229a.mo23229b().mo23236c().mo23188b(C9189g.m30530a(bArr, this.f25230b)));
            }
            return C9189g.m30530a(this.f25229a.mo23229b().mo23234a(), this.f25229a.mo23229b().mo23236c().mo23188b(bArr));
        }
    }

    C9305d() {
    }

    /* renamed from: e */
    public static void m31007e() {
        C9242r.m30712r(new C9305d());
    }

    /* renamed from: a */
    public Class<C9236o> mo23243a() {
        return C9236o.class;
    }

    /* renamed from: b */
    public Class<C9236o> mo23244b() {
        return C9236o.class;
    }

    /* renamed from: f */
    public C9236o mo23245c(C9237p<C9236o> pVar) {
        return new C9307b(pVar);
    }
}
