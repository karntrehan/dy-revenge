package p493i;

import p455g.p470y.p472d.C10457l;
import p493i.p494g0.C10610b;

/* renamed from: i.c */
public final class C10591c {
    /* renamed from: a */
    public static final boolean m35965a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C10457l.m35320e(bArr, "a");
        C10457l.m35320e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m35966b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m35967c(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: d */
    public static final short m35968d(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: e */
    public static final String m35969e(byte b) {
        return new String(new char[]{C10610b.m36077h()[(b >> 4) & 15], C10610b.m36077h()[b & 15]});
    }

    /* renamed from: f */
    public static final String m35970f(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C10610b.m36077h()[(i >> 28) & 15], C10610b.m36077h()[(i >> 24) & 15], C10610b.m36077h()[(i >> 20) & 15], C10610b.m36077h()[(i >> 16) & 15], C10610b.m36077h()[(i >> 12) & 15], C10610b.m36077h()[(i >> 8) & 15], C10610b.m36077h()[(i >> 4) & 15], C10610b.m36077h()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }
}
