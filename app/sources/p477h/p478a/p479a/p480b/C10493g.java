package p477h.p478a.p479a.p480b;

import p477h.p478a.p479a.p480b.p482i.C10496b;
import p477h.p478a.p479a.p483c.C10497a;

/* renamed from: h.a.a.b.g */
public class C10493g implements C10487d {

    /* renamed from: a */
    private char[] f27691a;

    /* renamed from: b */
    private byte[] f27692b;

    /* renamed from: c */
    private byte[] f27693c = new byte[4];

    /* renamed from: d */
    private C10496b f27694d;

    public C10493g(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.f27691a = cArr;
        this.f27692b = bArr;
        this.f27694d = new C10496b();
        m35405b(bArr2);
    }

    /* renamed from: b */
    private void m35405b(byte[] bArr) {
        byte[] bArr2 = this.f27693c;
        byte[] bArr3 = this.f27692b;
        bArr2[3] = (byte) (bArr3[3] & 255);
        bArr2[2] = (byte) ((bArr3[3] >> 8) & 255);
        bArr2[1] = (byte) ((bArr3[3] >> 16) & 255);
        int i = 0;
        bArr2[0] = (byte) ((bArr3[3] >> 24) & 255);
        if (bArr2[2] > 0 || bArr2[1] > 0 || bArr2[0] > 0) {
            throw new IllegalStateException("Invalid CRC in File Header");
        }
        char[] cArr = this.f27691a;
        if (cArr == null || cArr.length <= 0) {
            throw new C10497a("Wrong password!", C10497a.C10498a.WRONG_PASSWORD);
        }
        this.f27694d.mo25896c(cArr);
        byte b = bArr[0];
        while (i < 12) {
            C10496b bVar = this.f27694d;
            bVar.mo25897d((byte) (bVar.mo25895b() ^ b));
            i++;
            if (i != 12) {
                b = bArr[i];
            }
        }
    }

    /* renamed from: a */
    public int mo25873a(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new C10497a("one of the input parameters were null in standard decrypt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b = (byte) (((bArr[i3] & 255) ^ this.f27694d.mo25895b()) & 255);
            this.f27694d.mo25897d(b);
            bArr[i3] = b;
        }
        return i2;
    }
}
