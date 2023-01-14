package p174e.p199d.p217b;

import java.nio.charset.Charset;
import p174e.p199d.p218c.C5737g;

/* renamed from: e.d.b.o */
public abstract class C5714o {

    /* renamed from: a */
    private boolean f16174a = true;

    /* renamed from: a */
    public abstract int mo17079a();

    /* renamed from: b */
    public abstract byte mo17080b();

    /* renamed from: c */
    public abstract void mo17081c(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public abstract byte[] mo17082d(int i);

    /* renamed from: e */
    public short mo17086e() {
        short b;
        short b2;
        if (this.f16174a) {
            b = (((short) mo17080b()) << 8) & -256;
            b2 = ((short) mo17080b()) & 255;
        } else {
            b = ((short) mo17080b()) & 255;
            b2 = (((short) mo17080b()) << 8) & -256;
        }
        return (short) (b | b2);
    }

    /* renamed from: f */
    public int mo17087f() {
        byte b;
        byte b2;
        if (this.f16174a) {
            b = ((mo17080b() << 24) & -16777216) | ((mo17080b() << 16) & 16711680) | ((mo17080b() << 8) & 65280);
            b2 = mo17080b() & 255;
        } else {
            b = (mo17080b() & 255) | (65280 & (mo17080b() << 8)) | (16711680 & (mo17080b() << 16));
            b2 = -16777216 & (mo17080b() << 24);
        }
        return b | b2;
    }

    /* renamed from: g */
    public long mo17088g() {
        long b;
        long b2;
        if (this.f16174a) {
            b = ((((long) mo17080b()) << 56) & -72057594037927936L) | ((((long) mo17080b()) << 48) & 71776119061217280L) | ((((long) mo17080b()) << 40) & 280375465082880L) | ((((long) mo17080b()) << 32) & 1095216660480L) | ((((long) mo17080b()) << 24) & 4278190080L) | ((((long) mo17080b()) << 16) & 16711680) | ((((long) mo17080b()) << 8) & 65280);
            b2 = ((long) mo17080b()) & 255;
        } else {
            b = ((((long) mo17080b()) << 8) & 65280) | (((long) mo17080b()) & 255) | ((((long) mo17080b()) << 16) & 16711680) | ((((long) mo17080b()) << 24) & 4278190080L) | (1095216660480L & (((long) mo17080b()) << 32)) | (280375465082880L & (((long) mo17080b()) << 40)) | (71776119061217280L & (((long) mo17080b()) << 48));
            b2 = (((long) mo17080b()) << 56) & -72057594037927936L;
        }
        return b | b2;
    }

    /* renamed from: h */
    public byte mo17089h() {
        return mo17080b();
    }

    /* renamed from: i */
    public byte[] mo17090i(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            byte b = mo17080b();
            bArr[i2] = b;
            if (b == 0) {
                break;
            }
            i2++;
        }
        if (i2 == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        if (i2 > 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i2);
        }
        return bArr2;
    }

    /* renamed from: j */
    public String mo17091j(int i, Charset charset) {
        return mo17092k(i, charset).toString();
    }

    /* renamed from: k */
    public C5737g mo17092k(int i, Charset charset) {
        return new C5737g(mo17090i(i), charset);
    }

    /* renamed from: l */
    public abstract long mo17083l();

    /* renamed from: m */
    public String mo17093m(int i) {
        return new String(mo17082d(i));
    }

    /* renamed from: n */
    public String mo17094n(int i, Charset charset) {
        return new String(mo17082d(i), charset);
    }

    /* renamed from: o */
    public C5737g mo17095o(int i, Charset charset) {
        return new C5737g(mo17082d(i), charset);
    }

    /* renamed from: p */
    public int mo17096p() {
        byte b;
        byte b2;
        if (this.f16174a) {
            b = (mo17080b() << 8) & 65280;
            b2 = mo17080b() & 255;
        } else {
            b = mo17080b() & 255;
            b2 = 65280 & (mo17080b() << 8);
        }
        return b | b2;
    }

    /* renamed from: q */
    public long mo17097q() {
        if (this.f16174a) {
            return ((((long) mo17080b()) << 24) & 4278190080L) | ((((long) mo17080b()) << 16) & 16711680) | ((((long) mo17080b()) << 8) & 65280) | (((long) mo17080b()) & 255);
        }
        long b = 255 & ((long) mo17080b());
        long b2 = 16711680 & (((long) mo17080b()) << 16);
        return ((((long) mo17080b()) << 24) & 4278190080L) | b2 | (65280 & (((long) mo17080b()) << 8)) | b;
    }

    /* renamed from: r */
    public short mo17098r() {
        return (short) (mo17080b() & 255);
    }

    /* renamed from: s */
    public void mo17099s(boolean z) {
        this.f16174a = z;
    }

    /* renamed from: t */
    public abstract void mo17084t(long j);

    /* renamed from: u */
    public abstract boolean mo17085u(long j);
}
