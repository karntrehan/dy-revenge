package p174e.p319f.p393c.p394a.p395a0;

import java.security.SecureRandom;

/* renamed from: e.f.c.a.a0.u */
public final class C9211u {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f25123a = new C9212a();

    /* renamed from: e.f.c.a.a0.u$a */
    class C9212a extends ThreadLocal<SecureRandom> {
        C9212a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SecureRandom initialValue() {
            return C9211u.m30600b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static SecureRandom m30600b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: c */
    public static byte[] m30601c(int i) {
        byte[] bArr = new byte[i];
        f25123a.get().nextBytes(bArr);
        return bArr;
    }
}
