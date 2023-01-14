package p174e.p319f.p393c.p394a.p395a0;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p174e.p319f.p393c.p394a.C9175a;

/* renamed from: e.f.c.a.a0.b */
public final class C9178b implements C9175a {

    /* renamed from: a */
    private static final ThreadLocal<Cipher> f25063a = new C9179a();

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f25064b = new C9180b();

    /* renamed from: c */
    private final byte[] f25065c;

    /* renamed from: d */
    private final byte[] f25066d;

    /* renamed from: e */
    private final SecretKeySpec f25067e;

    /* renamed from: f */
    private final int f25068f;

    /* renamed from: e.f.c.a.a0.b$a */
    class C9179a extends ThreadLocal<Cipher> {
        C9179a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C9195m.f25103c.mo23175a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: e.f.c.a.a0.b$b */
    class C9180b extends ThreadLocal<Cipher> {
        C9180b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C9195m.f25103c.mo23175a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C9178b(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f25068f = i;
            C9214w.m30605a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f25067e = secretKeySpec;
            Cipher cipher = f25063a.get();
            cipher.init(1, secretKeySpec);
            byte[] c = m30503c(cipher.doFinal(new byte[16]));
            this.f25065c = c;
            this.f25066d = m30503c(c);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: c */
    private static byte[] m30503c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    /* renamed from: d */
    private byte[] m30504d(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m30506f(bArr2, this.f25065c));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        return cipher.doFinal(m30506f(doFinal, m30505e(Arrays.copyOfRange(bArr, i4 + i2, i2 + i3))));
    }

    /* renamed from: e */
    private byte[] m30505e(byte[] bArr) {
        if (bArr.length == 16) {
            return m30506f(bArr, this.f25065c);
        }
        byte[] copyOf = Arrays.copyOf(this.f25066d, 16);
        for (int i = 0; i < bArr.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ bArr[i]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    /* renamed from: f */
    private static byte[] m30506f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public byte[] mo23153a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i = this.f25068f;
        if (length <= (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i + 16)];
            byte[] c = C9211u.m30601c(i);
            System.arraycopy(c, 0, bArr4, 0, this.f25068f);
            Cipher cipher = f25063a.get();
            cipher.init(1, this.f25067e);
            byte[] d = m30504d(cipher, 0, c, 0, c.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] d2 = m30504d(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = f25064b.get();
            cipher2.init(1, this.f25067e, new IvParameterSpec(d));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.f25068f);
            byte[] d3 = m30504d(cipher, 2, bArr4, this.f25068f, bArr3.length);
            int length2 = bArr3.length + this.f25068f;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr4[length2 + i2] = (byte) ((d2[i2] ^ d[i2]) ^ d3[i2]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo23154b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f25068f) - 16;
        if (length >= 0) {
            Cipher cipher = f25063a.get();
            cipher.init(1, this.f25067e);
            byte[] d = m30504d(cipher, 0, bArr, 0, this.f25068f);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d2 = m30504d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d3 = m30504d(cipher, 2, bArr, this.f25068f, length);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i = 0; i < 16; i++) {
                b = (byte) (b | (((bArr[length2 + i] ^ d2[i]) ^ d[i]) ^ d3[i]));
            }
            if (b == 0) {
                Cipher cipher2 = f25064b.get();
                cipher2.init(1, this.f25067e, new IvParameterSpec(d));
                return cipher2.doFinal(bArr, this.f25068f, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
