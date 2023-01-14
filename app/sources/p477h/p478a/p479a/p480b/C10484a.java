package p477h.p478a.p479a.p480b;

import java.util.Arrays;
import p477h.p478a.p479a.p480b.p481f.C10489a;
import p477h.p478a.p479a.p480b.p482i.C10495a;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p488f.C10534a;
import p477h.p478a.p479a.p488f.p489r.C10552a;

/* renamed from: h.a.a.b.a */
public class C10484a implements C10487d {

    /* renamed from: a */
    private C10534a f27662a;

    /* renamed from: b */
    private char[] f27663b;

    /* renamed from: c */
    private C10495a f27664c;

    /* renamed from: d */
    private C10489a f27665d;

    /* renamed from: e */
    private int f27666e = 1;

    /* renamed from: f */
    private byte[] f27667f;

    /* renamed from: g */
    private byte[] f27668g;

    public C10484a(C10534a aVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        this.f27662a = aVar;
        this.f27663b = cArr;
        this.f27667f = new byte[16];
        this.f27668g = new byte[16];
        m35371c(bArr, bArr2);
    }

    /* renamed from: c */
    private void m35371c(byte[] bArr, byte[] bArr2) {
        char[] cArr = this.f27663b;
        if (cArr == null || cArr.length <= 0) {
            throw new C10497a("empty or null password provided for AES decryption");
        }
        C10552a c = this.f27662a.mo26009c();
        byte[] a = C10486c.m35380a(bArr, this.f27663b, c);
        if (Arrays.equals(bArr2, C10486c.m35381b(a, c))) {
            this.f27664c = C10486c.m35382c(a, c);
            this.f27665d = C10486c.m35383d(a, c);
            return;
        }
        throw new C10497a("Wrong Password", C10497a.C10498a.WRONG_PASSWORD);
    }

    /* renamed from: a */
    public int mo25873a(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                return i2;
            }
            int i5 = i3 + 16;
            int i6 = i5 <= i4 ? 16 : i4 - i3;
            this.f27665d.mo25883e(bArr, i3, i6);
            C10486c.m35384e(this.f27667f, this.f27666e);
            this.f27664c.mo25894e(this.f27667f, this.f27668g);
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = i3 + i7;
                bArr[i8] = (byte) (bArr[i8] ^ this.f27668g[i7]);
            }
            this.f27666e++;
            i3 = i5;
        }
    }

    /* renamed from: b */
    public byte[] mo25874b() {
        return this.f27665d.mo25882d();
    }
}
