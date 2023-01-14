package p477h.p478a.p479a.p485e.p486a;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import p477h.p478a.p479a.p480b.C10484a;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p488f.C10544k;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.e.a.a */
class C10507a extends C10508b<C10484a> {

    /* renamed from: A */
    private int f27748A = 0;

    /* renamed from: s */
    private byte[] f27749s = new byte[1];

    /* renamed from: t */
    private byte[] f27750t = new byte[16];

    /* renamed from: u */
    private int f27751u = 0;

    /* renamed from: v */
    private int f27752v = 0;

    /* renamed from: w */
    private int f27753w = 0;

    /* renamed from: x */
    private int f27754x = 0;

    /* renamed from: y */
    private int f27755y = 0;

    /* renamed from: z */
    private int f27756z = 0;

    public C10507a(C10517j jVar, C10544k kVar, char[] cArr) {
        super(jVar, kVar, cArr);
    }

    /* renamed from: I */
    private void m35486I(byte[] bArr, int i) {
        int i2 = this.f27753w;
        int i3 = this.f27752v;
        if (i2 >= i3) {
            i2 = i3;
        }
        this.f27756z = i2;
        System.arraycopy(this.f27750t, this.f27751u, bArr, i, i2);
        m35490e0(this.f27756z);
        m35487L(this.f27756z);
        int i4 = this.f27755y;
        int i5 = this.f27756z;
        this.f27755y = i4 + i5;
        this.f27753w -= i5;
        this.f27754x += i5;
    }

    /* renamed from: L */
    private void m35487L(int i) {
        int i2 = this.f27752v - i;
        this.f27752v = i2;
        if (i2 <= 0) {
            this.f27752v = 0;
        }
    }

    /* renamed from: W */
    private byte[] m35488W() {
        byte[] bArr = new byte[2];
        mo25918E(bArr);
        return bArr;
    }

    /* renamed from: X */
    private byte[] m35489X(C10544k kVar) {
        if (kVar.mo26033c() != null) {
            byte[] bArr = new byte[kVar.mo26033c().mo26009c().mo26195z()];
            mo25918E(bArr);
            return bArr;
        }
        throw new IOException("invalid aes extra data record");
    }

    /* renamed from: e0 */
    private void m35490e0(int i) {
        int i2 = this.f27751u + i;
        this.f27751u = i2;
        if (i2 >= 15) {
            this.f27751u = 15;
        }
    }

    /* renamed from: s0 */
    private void m35491s0(byte[] bArr) {
        if (!mo25922r().mo26049r() || !C10555d.DEFLATE.equals(C10585h.m35939f(mo25922r()))) {
            byte[] bArr2 = new byte[10];
            System.arraycopy(((C10484a) mo25920h()).mo25874b(), 0, bArr2, 0, 10);
            if (!Arrays.equals(bArr, bArr2)) {
                throw new IOException("Reached end of data for this entry, but aes verification failed");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25912b(InputStream inputStream) {
        m35491s0(mo25914n0(inputStream));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public C10484a mo25911A(C10544k kVar, char[] cArr) {
        return new C10484a(kVar.mo26033c(), cArr, m35489X(kVar), m35488W());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public byte[] mo25914n0(InputStream inputStream) {
        byte[] bArr = new byte[10];
        if (C10585h.m35941h(inputStream, bArr) == 10) {
            return bArr;
        }
        throw new C10497a("Invalid AES Mac bytes. Could not read sufficient data");
    }

    public int read() {
        if (read(this.f27749s) == -1) {
            return -1;
        }
        return this.f27749s[0];
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        this.f27753w = i2;
        this.f27754x = i;
        this.f27755y = 0;
        if (this.f27752v != 0) {
            m35486I(bArr, i);
            int i3 = this.f27755y;
            if (i3 == i2) {
                return i3;
            }
        }
        if (this.f27753w < 16) {
            byte[] bArr2 = this.f27750t;
            int read = super.read(bArr2, 0, bArr2.length);
            this.f27748A = read;
            this.f27751u = 0;
            if (read == -1) {
                this.f27752v = 0;
                int i4 = this.f27755y;
                if (i4 > 0) {
                    return i4;
                }
                return -1;
            }
            this.f27752v = read;
            m35486I(bArr, this.f27754x);
            int i5 = this.f27755y;
            if (i5 == i2) {
                return i5;
            }
        }
        int i6 = this.f27754x;
        int i7 = this.f27753w;
        int read2 = super.read(bArr, i6, i7 - (i7 % 16));
        if (read2 != -1) {
            return read2 + this.f27755y;
        }
        int i8 = this.f27755y;
        if (i8 > 0) {
            return i8;
        }
        return -1;
    }
}
