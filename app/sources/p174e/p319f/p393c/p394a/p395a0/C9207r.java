package p174e.p319f.p393c.p394a.p395a0;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p174e.p319f.p393c.p394a.p402x.C9308a;

/* renamed from: e.f.c.a.a0.r */
public final class C9207r implements C9308a {

    /* renamed from: a */
    private final SecretKey f25113a;

    /* renamed from: b */
    private byte[] f25114b;

    /* renamed from: c */
    private byte[] f25115c;

    public C9207r(byte[] bArr) {
        C9214w.m30605a(bArr.length);
        this.f25113a = new SecretKeySpec(bArr, "AES");
        m30590b();
    }

    /* renamed from: b */
    private void m30590b() {
        Cipher c = m30591c();
        c.init(1, this.f25113a);
        byte[] b = C9184e.m30520b(c.doFinal(new byte[16]));
        this.f25114b = b;
        this.f25115c = C9184e.m30520b(b);
    }

    /* renamed from: c */
    private static Cipher m30591c() {
        return C9195m.f25103c.mo23175a("AES/ECB/NoPadding");
    }

    /* renamed from: a */
    public byte[] mo23184a(byte[] bArr, int i) {
        if (i <= 16) {
            Cipher c = m30591c();
            c.init(1, this.f25113a);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            byte[] d = max * 16 == bArr.length ? C9189g.m30533d(bArr, (max - 1) * 16, this.f25114b, 0, 16) : C9189g.m30534e(C9184e.m30519a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f25115c);
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = c.doFinal(C9189g.m30533d(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(c.doFinal(C9189g.m30534e(d, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
