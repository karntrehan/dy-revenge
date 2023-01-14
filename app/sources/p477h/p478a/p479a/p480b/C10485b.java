package p477h.p478a.p479a.p480b;

import java.security.SecureRandom;
import p477h.p478a.p479a.p480b.p481f.C10489a;
import p477h.p478a.p479a.p480b.p482i.C10495a;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p488f.p489r.C10552a;

/* renamed from: h.a.a.b.b */
public class C10485b implements C10488e {

    /* renamed from: a */
    private char[] f27669a;

    /* renamed from: b */
    private C10552a f27670b;

    /* renamed from: c */
    private C10495a f27671c;

    /* renamed from: d */
    private C10489a f27672d;

    /* renamed from: e */
    private SecureRandom f27673e = new SecureRandom();

    /* renamed from: f */
    private boolean f27674f;

    /* renamed from: g */
    private int f27675g = 1;

    /* renamed from: h */
    private int f27676h = 0;

    /* renamed from: i */
    private byte[] f27677i;

    /* renamed from: j */
    private byte[] f27678j;

    /* renamed from: k */
    private byte[] f27679k;

    /* renamed from: l */
    private byte[] f27680l;

    public C10485b(char[] cArr, C10552a aVar) {
        if (cArr == null || cArr.length == 0) {
            throw new C10497a("input password is empty or null");
        } else if (aVar == C10552a.KEY_STRENGTH_128 || aVar == C10552a.KEY_STRENGTH_256) {
            this.f27669a = cArr;
            this.f27670b = aVar;
            this.f27674f = false;
            this.f27678j = new byte[16];
            this.f27677i = new byte[16];
            m35375f();
        } else {
            throw new C10497a("Invalid AES key strength");
        }
    }

    /* renamed from: b */
    private byte[] m35374b(int i) {
        if (i == 8 || i == 16) {
            int i2 = i == 8 ? 2 : i == 16 ? 4 : 0;
            byte[] bArr = new byte[i];
            for (int i3 = 0; i3 < i2; i3++) {
                int nextInt = this.f27673e.nextInt();
                int i4 = i3 * 4;
                bArr[i4 + 0] = (byte) (nextInt >> 24);
                bArr[i4 + 1] = (byte) (nextInt >> 16);
                bArr[i4 + 2] = (byte) (nextInt >> 8);
                bArr[i4 + 3] = (byte) nextInt;
            }
            return bArr;
        }
        throw new C10497a("invalid salt size, cannot generate salt");
    }

    /* renamed from: f */
    private void m35375f() {
        byte[] b = m35374b(this.f27670b.mo26195z());
        this.f27680l = b;
        byte[] a = C10486c.m35380a(b, this.f27669a, this.f27670b);
        this.f27679k = C10486c.m35381b(a, this.f27670b);
        this.f27671c = C10486c.m35382c(a, this.f27670b);
        this.f27672d = C10486c.m35383d(a, this.f27670b);
    }

    /* renamed from: a */
    public int mo25875a(byte[] bArr, int i, int i2) {
        int i3;
        if (!this.f27674f) {
            if (i2 % 16 != 0) {
                this.f27674f = true;
            }
            int i4 = i;
            while (true) {
                int i5 = i + i2;
                if (i4 >= i5) {
                    return i2;
                }
                int i6 = i4 + 16;
                this.f27676h = i6 <= i5 ? 16 : i5 - i4;
                C10486c.m35384e(this.f27677i, this.f27675g);
                this.f27671c.mo25894e(this.f27677i, this.f27678j);
                int i7 = 0;
                while (true) {
                    i3 = this.f27676h;
                    if (i7 >= i3) {
                        break;
                    }
                    int i8 = i4 + i7;
                    bArr[i8] = (byte) (bArr[i8] ^ this.f27678j[i7]);
                    i7++;
                }
                this.f27672d.mo25883e(bArr, i4, i3);
                this.f27675g++;
                i4 = i6;
            }
        } else {
            throw new C10497a("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
        }
    }

    /* renamed from: c */
    public byte[] mo25876c() {
        return this.f27679k;
    }

    /* renamed from: d */
    public byte[] mo25877d() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.f27672d.mo25882d(), 0, bArr, 0, 10);
        return bArr;
    }

    /* renamed from: e */
    public byte[] mo25878e() {
        return this.f27680l;
    }
}
