package p174e.p319f.p393c.p394a.p396t;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9237p;
import p174e.p319f.p393c.p394a.C9241q;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p395a0.C9189g;

/* renamed from: e.f.c.a.t.b */
public class C9249b implements C9241q<C9175a, C9175a> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f25176a = Logger.getLogger(C9249b.class.getName());

    /* renamed from: e.f.c.a.t.b$b */
    private static class C9251b implements C9175a {

        /* renamed from: a */
        private final C9237p<C9175a> f25177a;

        private C9251b(C9237p<C9175a> pVar) {
            this.f25177a = pVar;
        }

        /* renamed from: a */
        public byte[] mo23153a(byte[] bArr, byte[] bArr2) {
            return C9189g.m30530a(this.f25177a.mo23229b().mo23234a(), this.f25177a.mo23229b().mo23236c().mo23153a(bArr, bArr2));
        }

        /* renamed from: b */
        public byte[] mo23154b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C9237p.C9239b c : this.f25177a.mo23230c(copyOfRange)) {
                    try {
                        return ((C9175a) c.mo23236c()).mo23154b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger d = C9249b.f25176a;
                        d.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (C9237p.C9239b c2 : this.f25177a.mo23232e()) {
                try {
                    return ((C9175a) c2.mo23236c()).mo23154b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    C9249b() {
    }

    /* renamed from: e */
    public static void m30730e() {
        C9242r.m30712r(new C9249b());
    }

    /* renamed from: a */
    public Class<C9175a> mo23243a() {
        return C9175a.class;
    }

    /* renamed from: b */
    public Class<C9175a> mo23244b() {
        return C9175a.class;
    }

    /* renamed from: f */
    public C9175a mo23245c(C9237p<C9175a> pVar) {
        return new C9251b(pVar);
    }
}
