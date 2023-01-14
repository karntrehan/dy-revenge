package p174e.p199d.p217b;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import p174e.p199d.p218c.C5737g;

/* renamed from: e.d.b.k */
public abstract class C5710k {

    /* renamed from: a */
    private boolean f16164a = true;

    /* renamed from: a */
    public boolean mo17039a(int i) {
        int i2 = i / 8;
        mo17020x(i2, 1);
        return ((mo17017b(i2) >> (i % 8)) & 1) == 1;
    }

    /* renamed from: b */
    public abstract byte mo17017b(int i);

    /* renamed from: c */
    public abstract byte[] mo17018c(int i, int i2);

    /* renamed from: d */
    public double mo17040d(int i) {
        return Double.longBitsToDouble(mo17045i(i));
    }

    /* renamed from: e */
    public float mo17041e(int i) {
        return Float.intBitsToFloat(mo17044h(i));
    }

    /* renamed from: f */
    public short mo17042f(int i) {
        short b;
        mo17020x(i, 2);
        if (this.f16164a) {
            b = (((short) mo17017b(i)) << 8) & -256;
            i++;
        } else {
            b = (((short) mo17017b(i + 1)) << 8) & -256;
        }
        return (short) ((((short) mo17017b(i)) & 255) | b);
    }

    /* renamed from: g */
    public int mo17043g(int i) {
        byte b;
        mo17020x(i, 3);
        if (this.f16164a) {
            b = ((mo17017b(i) << 16) & 16711680) | (65280 & (mo17017b(i + 1) << 8));
            i += 2;
        } else {
            b = ((mo17017b(i + 2) << 16) & 16711680) | (65280 & (mo17017b(i + 1) << 8));
        }
        return (mo17017b(i) & 255) | b;
    }

    /* renamed from: h */
    public int mo17044h(int i) {
        byte b;
        mo17020x(i, 4);
        if (this.f16164a) {
            b = ((mo17017b(i) << 24) & -16777216) | (16711680 & (mo17017b(i + 1) << 16)) | (65280 & (mo17017b(i + 2) << 8));
            i += 3;
        } else {
            b = ((mo17017b(i + 3) << 24) & -16777216) | (16711680 & (mo17017b(i + 2) << 16)) | (65280 & (mo17017b(i + 1) << 8));
        }
        return (mo17017b(i) & 255) | b;
    }

    /* renamed from: i */
    public long mo17045i(int i) {
        long b;
        byte b2;
        int i2 = i;
        mo17020x(i2, 8);
        if (this.f16164a) {
            b = ((((long) mo17017b(i)) << 56) & -72057594037927936L) | ((((long) mo17017b(i2 + 1)) << 48) & 71776119061217280L) | ((((long) mo17017b(i2 + 2)) << 40) & 280375465082880L) | ((((long) mo17017b(i2 + 3)) << 32) & 1095216660480L) | ((((long) mo17017b(i2 + 4)) << 24) & 4278190080L) | ((((long) mo17017b(i2 + 5)) << 16) & 16711680) | ((((long) mo17017b(i2 + 6)) << 8) & 65280);
            b2 = mo17017b(i2 + 7);
        } else {
            b = ((((long) mo17017b(i2 + 7)) << 56) & -72057594037927936L) | ((((long) mo17017b(i2 + 6)) << 48) & 71776119061217280L) | ((((long) mo17017b(i2 + 5)) << 40) & 280375465082880L) | ((((long) mo17017b(i2 + 4)) << 32) & 1095216660480L) | ((((long) mo17017b(i2 + 3)) << 24) & 4278190080L) | ((((long) mo17017b(i2 + 2)) << 16) & 16711680) | ((((long) mo17017b(i2 + 1)) << 8) & 65280);
            b2 = mo17017b(i);
        }
        return b | (((long) b2) & 255);
    }

    /* renamed from: j */
    public byte mo17046j(int i) {
        mo17020x(i, 1);
        return mo17017b(i);
    }

    /* renamed from: k */
    public abstract long mo17019k();

    /* renamed from: l */
    public byte[] mo17047l(int i, int i2) {
        byte[] c = mo17018c(i, i2);
        int i3 = 0;
        while (i3 < c.length && c[i3] != 0) {
            i3++;
        }
        if (i3 == i2) {
            return c;
        }
        byte[] bArr = new byte[i3];
        if (i3 > 0) {
            System.arraycopy(c, 0, bArr, 0, i3);
        }
        return bArr;
    }

    /* renamed from: m */
    public String mo17048m(int i, int i2, Charset charset) {
        return new String(mo17047l(i, i2), charset.name());
    }

    /* renamed from: n */
    public C5737g mo17049n(int i, int i2, Charset charset) {
        return new C5737g(mo17047l(i, i2), charset);
    }

    /* renamed from: o */
    public float mo17050o(int i) {
        float b;
        int b2;
        mo17020x(i, 4);
        if (this.f16164a) {
            b = (float) (((mo17017b(i) & 255) << 8) | (mo17017b(i + 1) & 255));
            b2 = (mo17017b(i + 2) & 255) << 8;
            i += 3;
        } else {
            b = (float) (((mo17017b(i + 3) & 255) << 8) | (mo17017b(i + 2) & 255));
            b2 = (mo17017b(i + 1) & 255) << 8;
        }
        return (float) (((double) b) + (((double) ((mo17017b(i) & 255) | b2)) / 65536.0d));
    }

    /* renamed from: p */
    public String mo17051p(int i, int i2, String str) {
        byte[] c = mo17018c(i, i2);
        try {
            return new String(c, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(c);
        }
    }

    /* renamed from: q */
    public String mo17052q(int i, int i2, Charset charset) {
        return new String(mo17018c(i, i2), charset.name());
    }

    /* renamed from: r */
    public C5737g mo17053r(int i, int i2, Charset charset) {
        return new C5737g(mo17018c(i, i2), charset);
    }

    /* renamed from: s */
    public int mo17054s(int i) {
        byte b;
        mo17020x(i, 2);
        if (this.f16164a) {
            b = (mo17017b(i) << 8) & 65280;
            i++;
        } else {
            b = (mo17017b(i + 1) << 8) & 65280;
        }
        return (mo17017b(i) & 255) | b;
    }

    /* renamed from: t */
    public long mo17055t(int i) {
        long b;
        mo17020x(i, 4);
        if (this.f16164a) {
            long b2 = 4278190080L & (((long) mo17017b(i)) << 24);
            b = (65280 & (((long) mo17017b(i + 2)) << 8)) | (16711680 & (((long) mo17017b(i + 1)) << 16)) | b2;
            i += 3;
        } else {
            long b3 = 4278190080L & (((long) mo17017b(i + 3)) << 24);
            b = (65280 & (((long) mo17017b(i + 1)) << 8)) | (16711680 & (((long) mo17017b(i + 2)) << 16)) | b3;
        }
        return (((long) mo17017b(i)) & 255) | b;
    }

    /* renamed from: u */
    public short mo17056u(int i) {
        mo17020x(i, 1);
        return (short) (mo17017b(i) & 255);
    }

    /* renamed from: v */
    public boolean mo17057v() {
        return this.f16164a;
    }

    /* renamed from: w */
    public void mo17058w(boolean z) {
        this.f16164a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract void mo17020x(int i, int i2);
}
