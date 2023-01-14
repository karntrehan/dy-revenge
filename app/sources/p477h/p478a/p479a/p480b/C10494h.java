package p477h.p478a.p479a.p480b;

import java.security.SecureRandom;
import java.util.Objects;
import p477h.p478a.p479a.p480b.p482i.C10496b;
import p477h.p478a.p479a.p483c.C10497a;

/* renamed from: h.a.a.b.h */
public class C10494h implements C10488e {

    /* renamed from: a */
    private C10496b f27695a = new C10496b();

    /* renamed from: b */
    private byte[] f27696b = new byte[12];

    public C10494h(char[] cArr, long j) {
        m35407f(cArr, j);
    }

    /* renamed from: f */
    private void m35407f(char[] cArr, long j) {
        if (cArr == null || cArr.length <= 0) {
            throw new C10497a("input password is null or empty, cannot initialize standard encrypter");
        }
        this.f27695a.mo25896c(cArr);
        this.f27696b = mo25891d(12);
        this.f27695a.mo25896c(cArr);
        byte[] bArr = this.f27696b;
        bArr[11] = (byte) ((int) (j >>> 24));
        bArr[10] = (byte) ((int) (j >>> 16));
        if (bArr.length >= 12) {
            mo25890c(bArr);
            return;
        }
        throw new C10497a("invalid header bytes generated, cannot perform standard encryption");
    }

    /* renamed from: a */
    public int mo25875a(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            for (int i3 = i; i3 < i + i2; i3++) {
                bArr[i3] = mo25889b(bArr[i3]);
            }
            return i2;
        }
        throw new C10497a("invalid length specified to decrpyt data");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte mo25889b(byte b) {
        byte b2 = (byte) ((this.f27695a.mo25895b() & 255) ^ b);
        this.f27695a.mo25897d(b);
        return b2;
    }

    /* renamed from: c */
    public int mo25890c(byte[] bArr) {
        Objects.requireNonNull(bArr);
        return mo25875a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo25891d(int i) {
        if (i > 0) {
            byte[] bArr = new byte[i];
            SecureRandom secureRandom = new SecureRandom();
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = mo25889b((byte) secureRandom.nextInt(256));
            }
            return bArr;
        }
        throw new C10497a("size is either 0 or less than 0, cannot generate header for standard encryptor");
    }

    /* renamed from: e */
    public byte[] mo25892e() {
        return this.f27696b;
    }
}
