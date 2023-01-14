package p174e.p319f.p393c.p394a.p398u;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p174e.p319f.p393c.p394a.C9220d;
import p174e.p319f.p393c.p394a.C9237p;
import p174e.p319f.p393c.p394a.C9241q;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9189g;

/* renamed from: e.f.c.a.u.c */
public class C9286c implements C9241q<C9220d, C9220d> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f25196a = Logger.getLogger(C9286c.class.getName());

    /* renamed from: e.f.c.a.u.c$a */
    private static class C9287a implements C9220d {

        /* renamed from: a */
        private C9237p<C9220d> f25197a;

        public C9287a(C9237p<C9220d> pVar) {
            this.f25197a = pVar;
        }

        /* renamed from: a */
        public byte[] mo23165a(byte[] bArr, byte[] bArr2) {
            return C9189g.m30530a(this.f25197a.mo23229b().mo23234a(), this.f25197a.mo23229b().mo23236c().mo23165a(bArr, bArr2));
        }

        /* renamed from: b */
        public byte[] mo23166b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C9237p.C9239b c : this.f25197a.mo23230c(copyOfRange)) {
                    try {
                        return ((C9220d) c.mo23236c()).mo23166b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger d = C9286c.f25196a;
                        d.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (C9237p.C9239b c2 : this.f25197a.mo23232e()) {
                try {
                    return ((C9220d) c2.mo23236c()).mo23166b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    C9286c() {
    }

    /* renamed from: e */
    public static void m30924e() {
        C9242r.m30712r(new C9286c());
    }

    /* renamed from: a */
    public Class<C9220d> mo23243a() {
        return C9220d.class;
    }

    /* renamed from: b */
    public Class<C9220d> mo23244b() {
        return C9220d.class;
    }

    /* renamed from: f */
    public C9220d mo23245c(C9237p<C9220d> pVar) {
        return new C9287a(pVar);
    }
}
