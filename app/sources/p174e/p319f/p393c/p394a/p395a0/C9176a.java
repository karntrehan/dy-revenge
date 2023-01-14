package p174e.p319f.p393c.p394a.p395a0;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: e.f.c.a.a0.a */
public final class C9176a implements C9205p {

    /* renamed from: a */
    private static final ThreadLocal<Cipher> f25059a = new C9177a();

    /* renamed from: b */
    private final SecretKeySpec f25060b;

    /* renamed from: c */
    private final int f25061c;

    /* renamed from: d */
    private final int f25062d;

    /* renamed from: e.f.c.a.a0.a$a */
    class C9177a extends ThreadLocal<Cipher> {
        C9177a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C9195m.f25103c.mo23175a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C9176a(byte[] bArr, int i) {
        C9214w.m30605a(bArr.length);
        this.f25060b = new SecretKeySpec(bArr, "AES");
        int blockSize = f25059a.get().getBlockSize();
        this.f25062d = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f25061c = i;
    }

    /* renamed from: c */
    private void m30499c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = f25059a.get();
        byte[] bArr4 = new byte[this.f25062d];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f25061c);
        cipher.init(z ? 1 : 2, this.f25060b, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    /* renamed from: a */
    public byte[] mo23155a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f25061c;
        if (length <= RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] c = C9211u.m30601c(i);
            System.arraycopy(c, 0, bArr2, 0, this.f25061c);
            m30499c(bArr, 0, bArr.length, bArr2, this.f25061c, c, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - this.f25061c));
    }

    /* renamed from: b */
    public byte[] mo23156b(byte[] bArr) {
        int length = bArr.length;
        int i = this.f25061c;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i2 = this.f25061c;
            byte[] bArr3 = new byte[(length2 - i2)];
            m30499c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
