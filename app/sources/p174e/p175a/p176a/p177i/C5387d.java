package p174e.p175a.p176a.p177i;

import java.io.UnsupportedEncodingException;

/* renamed from: e.a.a.i.d */
public class C5387d {
    /* renamed from: a */
    public static C5384a m19916a(C5384a aVar) {
        if (!"UTF-8".equals(aVar.mo16219g())) {
            return aVar;
        }
        byte[] bArr = new byte[8];
        C5384a aVar2 = new C5384a((aVar.mo16220h() * 4) / 3);
        int i = 0;
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < aVar.mo16220h()) {
            int d = aVar.mo16217d(i);
            if (c == 11) {
                if (i2 <= 0 || (d & 192) != 128) {
                    aVar2.mo16215b(m19917b(bArr[0]));
                    i -= i3;
                } else {
                    int i4 = i3 + 1;
                    bArr[i3] = (byte) d;
                    i2--;
                    if (i2 == 0) {
                        aVar2.mo16216c(bArr, 0, i4);
                    } else {
                        i3 = i4;
                    }
                }
                c = 0;
                i3 = 0;
            } else if (d < 127) {
                aVar2.mo16214a((byte) d);
            } else if (d >= 192) {
                int i5 = d;
                i2 = -1;
                while (i2 < 8 && (i5 & 128) == 128) {
                    i2++;
                    i5 <<= 1;
                }
                bArr[i3] = (byte) d;
                i3++;
                c = 11;
            } else {
                aVar2.mo16215b(m19917b((byte) d));
            }
            i++;
        }
        if (c == 11) {
            for (int i6 = 0; i6 < i3; i6++) {
                aVar2.mo16215b(m19917b(bArr[i6]));
            }
        }
        return aVar2;
    }

    /* renamed from: b */
    private static byte[] m19917b(byte b) {
        byte b2 = b & 255;
        if (b2 >= 128) {
            if (b2 == 129 || b2 == 141 || b2 == 143 || b2 == 144 || b2 == 157) {
                return new byte[]{32};
            }
            try {
                return new String(new byte[]{b}, "cp1252").getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b};
    }
}
