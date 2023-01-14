package p477h.p478a.p479a.p480b.p482i;

/* renamed from: h.a.a.b.i.b */
public class C10496b {

    /* renamed from: a */
    private static final int[] f27706a = new int[256];

    /* renamed from: b */
    private final int[] f27707b = new int[3];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 == 1) {
                    i2 ^= -306674912;
                }
            }
            f27706a[i] = i2;
        }
    }

    /* renamed from: a */
    private int m35422a(int i, byte b) {
        return f27706a[(i ^ b) & 255] ^ (i >>> 8);
    }

    /* renamed from: b */
    public byte mo25895b() {
        int i = this.f27707b[2] | 2;
        return (byte) ((i * (i ^ 1)) >>> 8);
    }

    /* renamed from: c */
    public void mo25896c(char[] cArr) {
        int[] iArr = this.f27707b;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (char c : cArr) {
            mo25897d((byte) (c & 255));
        }
    }

    /* renamed from: d */
    public void mo25897d(byte b) {
        int[] iArr = this.f27707b;
        iArr[0] = m35422a(iArr[0], b);
        int[] iArr2 = this.f27707b;
        iArr2[1] = iArr2[1] + (iArr2[0] & 255);
        iArr2[1] = (iArr2[1] * 134775813) + 1;
        iArr2[2] = m35422a(iArr2[2], (byte) (iArr2[1] >> 24));
    }
}
