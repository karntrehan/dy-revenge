package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.vf */
final class C8512vf {
    /* renamed from: a */
    static /* synthetic */ void m29193a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m29197e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m29197e(b3) || m29197e(b4)) {
            throw C8366nd.m28886c();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* synthetic */ void m29194b(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m29197e(b2)) {
            throw C8366nd.m28886c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: c */
    static /* synthetic */ void m29195c(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m29197e(b2)) {
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
            if (!m29197e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw C8366nd.m28886c();
    }

    /* renamed from: d */
    static /* synthetic */ boolean m29196d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m29197e(byte b) {
        return b > -65;
    }
}
