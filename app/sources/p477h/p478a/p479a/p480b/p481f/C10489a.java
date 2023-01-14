package p477h.p478a.p479a.p480b.p481f;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: h.a.a.b.f.a */
public class C10489a implements C10492d {

    /* renamed from: a */
    private Mac f27681a;

    /* renamed from: b */
    private int f27682b;

    /* renamed from: c */
    private String f27683c;

    public C10489a(String str) {
        this.f27683c = str;
        try {
            Mac instance = Mac.getInstance(str);
            this.f27681a = instance;
            this.f27682b = instance.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public byte[] mo25879a(byte[] bArr) {
        return this.f27681a.doFinal(bArr);
    }

    /* renamed from: b */
    public int mo25880b() {
        return this.f27682b;
    }

    /* renamed from: c */
    public void mo25881c(byte[] bArr) {
        try {
            this.f27681a.init(new SecretKeySpec(bArr, this.f27683c));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public byte[] mo25882d() {
        return this.f27681a.doFinal();
    }

    /* renamed from: e */
    public void mo25883e(byte[] bArr, int i, int i2) {
        try {
            this.f27681a.update(bArr, i, i2);
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }
}
