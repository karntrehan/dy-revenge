package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.ub */
final class C7030ub {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m26741a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m26745e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m26745e(b3) || m26745e(b4)) {
            throw C6852j9.m25977c();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m26742b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m26745e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m26745e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw C6852j9.m25977c();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m26743c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m26745e(b2)) {
            throw C6852j9.m25977c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m26744d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m26745e(byte b) {
        return b > -65;
    }
}
