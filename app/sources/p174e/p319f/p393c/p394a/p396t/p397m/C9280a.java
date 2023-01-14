package p174e.p319f.p393c.p394a.p396t.p397m;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.p395a0.C9195m;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9213v;
import p174e.p319f.p393c.p394a.p395a0.C9214w;

/* renamed from: e.f.c.a.t.m.a */
public final class C9280a implements C9175a {

    /* renamed from: a */
    private static final ThreadLocal<Cipher> f25190a = new C9281a();

    /* renamed from: b */
    private final SecretKey f25191b;

    /* renamed from: e.f.c.a.t.m.a$a */
    class C9281a extends ThreadLocal<Cipher> {
        C9281a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C9195m.f25103c.mo23175a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C9280a(byte[] bArr) {
        C9214w.m30605a(bArr.length);
        this.f25191b = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    private static AlgorithmParameterSpec m30897c(byte[] bArr) {
        return m30898d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    private static AlgorithmParameterSpec m30898d(byte[] bArr, int i, int i2) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i, i2);
        } catch (ClassNotFoundException unused) {
            if (C9213v.m30604b()) {
                return new IvParameterSpec(bArr, i, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    /* renamed from: a */
    public byte[] mo23153a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] c = C9211u.m30601c(12);
            System.arraycopy(c, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c2 = m30897c(c);
            ThreadLocal<Cipher> threadLocal = f25190a;
            threadLocal.get().init(1, this.f25191b, c2);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo23154b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec d = m30898d(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = f25190a;
            threadLocal.get().init(2, this.f25191b, d);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
