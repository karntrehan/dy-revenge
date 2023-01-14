package p174e.p319f.p393c.p394a.p395a0;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p174e.p319f.p393c.p394a.C9220d;

/* renamed from: e.f.c.a.a0.d */
public final class C9183d implements C9220d {

    /* renamed from: a */
    private static final Collection<Integer> f25071a = Arrays.asList(new Integer[]{64});

    /* renamed from: b */
    private static final byte[] f25072b = new byte[16];

    /* renamed from: c */
    private static final byte[] f25073c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: d */
    private final C9207r f25074d;

    /* renamed from: e */
    private final byte[] f25075e;

    public C9183d(byte[] bArr) {
        if (f25071a.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f25075e = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f25074d = new C9207r(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    /* renamed from: c */
    private byte[] m30516c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f25074d.mo23184a(f25073c, 16);
        }
        byte[] a = this.f25074d.mo23184a(f25072b, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            a = C9189g.m30534e(C9184e.m30520b(a), this.f25074d.mo23184a(bArr[i] == null ? new byte[0] : bArr[i], 16));
        }
        byte[] bArr2 = bArr[bArr.length - 1];
        return this.f25074d.mo23184a(bArr2.length >= 16 ? C9189g.m30535f(bArr2, a) : C9189g.m30534e(C9184e.m30519a(bArr2), C9184e.m30520b(a)), 16);
    }

    /* renamed from: a */
    public byte[] mo23165a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a = C9195m.f25103c.mo23175a("AES/CTR/NoPadding");
            byte[] c = m30516c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(1, new SecretKeySpec(this.f25075e, "AES"), new IvParameterSpec(bArr3));
            return C9189g.m30530a(c, a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo23166b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a = C9195m.f25103c.mo23175a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(2, new SecretKeySpec(this.f25075e, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && C9213v.m30604b()) {
                doFinal = new byte[0];
            }
            if (C9189g.m30531b(copyOfRange, m30516c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
