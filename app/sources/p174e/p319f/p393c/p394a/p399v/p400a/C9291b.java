package p174e.p319f.p393c.p394a.p399v.p400a;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p174e.p319f.p393c.p394a.C9175a;

/* renamed from: e.f.c.a.v.a.b */
public final class C9291b implements C9175a {

    /* renamed from: a */
    private static final String f25210a = "b";

    /* renamed from: b */
    private final SecretKey f25211b;

    C9291b(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f25211b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
        }
    }

    /* renamed from: c */
    private byte[] m30945c(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f25211b, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    private byte[] m30946d(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f25211b);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: e */
    private static void m30947e() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 100.0d)));
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: a */
    public byte[] mo23153a(byte[] bArr, byte[] bArr2) {
        try {
            return m30946d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f25210a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m30947e();
            return m30946d(bArr, bArr2);
        }
    }

    /* renamed from: b */
    public byte[] mo23154b(byte[] bArr, byte[] bArr2) {
        try {
            return m30945c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f25210a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m30947e();
            return m30945c(bArr, bArr2);
        }
    }
}
