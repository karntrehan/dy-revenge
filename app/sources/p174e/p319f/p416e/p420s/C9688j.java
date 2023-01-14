package p174e.p319f.p416e.p420s;

import java.lang.reflect.Array;
import p174e.p319f.p416e.C9656b;
import p174e.p319f.p416e.C9662h;

/* renamed from: e.f.e.s.j */
public final class C9688j extends C9686h {

    /* renamed from: e */
    private C9680b f25949e;

    public C9688j(C9662h hVar) {
        super(hVar);
    }

    /* renamed from: i */
    private static int[][] m32967i(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = 8;
        int i8 = i4 - 8;
        int i9 = i3 - 8;
        int[] iArr = new int[2];
        iArr[1] = i5;
        iArr[0] = i6;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i10 = 0;
        while (i10 < i6) {
            int i11 = i10 << 3;
            if (i11 > i8) {
                i11 = i8;
            }
            int i12 = 0;
            while (i12 < i5) {
                int i13 = i12 << 3;
                if (i13 > i9) {
                    i13 = i9;
                }
                int i14 = (i11 * i3) + i13;
                byte b = 255;
                int i15 = 0;
                int i16 = 0;
                byte b2 = 0;
                while (i15 < i7) {
                    byte b3 = b2;
                    int i17 = 0;
                    while (i17 < i7) {
                        byte b4 = bArr[i14 + i17] & 255;
                        i16 += b4;
                        if (b4 < b) {
                            b = b4;
                        }
                        if (b4 > b3) {
                            b3 = b4;
                        }
                        i17++;
                        i7 = 8;
                    }
                    if (b3 - b <= 24) {
                        i15++;
                        i14 += i3;
                        b2 = b3;
                        i7 = 8;
                    }
                    while (true) {
                        i15++;
                        i14 += i3;
                        if (i15 >= 8) {
                            break;
                        }
                        int i18 = 0;
                        for (int i19 = 8; i18 < i19; i19 = 8) {
                            i16 += bArr[i14 + i18] & 255;
                            i18++;
                        }
                    }
                    i15++;
                    i14 += i3;
                    b2 = b3;
                    i7 = 8;
                }
                int i20 = i16 >> 6;
                if (b2 - b <= 24) {
                    i20 = b / 2;
                    if (i10 > 0 && i12 > 0) {
                        int i21 = i10 - 1;
                        int i22 = i12 - 1;
                        int i23 = ((iArr2[i21][i12] + (iArr2[i10][i22] * 2)) + iArr2[i21][i22]) / 4;
                        if (b < i23) {
                            i20 = i23;
                        }
                        iArr2[i10][i12] = i20;
                        i12++;
                        i7 = 8;
                    }
                }
                iArr2[i10][i12] = i20;
                i12++;
                i7 = 8;
            }
            i10++;
            i7 = 8;
        }
        return iArr2;
    }

    /* renamed from: j */
    private static void m32968j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C9680b bVar) {
        int i5 = i;
        int i6 = i2;
        int i7 = i4 - 8;
        int i8 = i3 - 8;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = i9 << 3;
            int i11 = i10 > i7 ? i7 : i10;
            int k = m32969k(i9, 2, i6 - 3);
            for (int i12 = 0; i12 < i5; i12++) {
                int i13 = i12 << 3;
                int i14 = i13 > i8 ? i8 : i13;
                int k2 = m32969k(i12, 2, i5 - 3);
                int i15 = 0;
                for (int i16 = -2; i16 <= 2; i16++) {
                    int[] iArr2 = iArr[k + i16];
                    i15 += iArr2[k2 - 2] + iArr2[k2 - 1] + iArr2[k2] + iArr2[k2 + 1] + iArr2[k2 + 2];
                }
                m32970l(bArr, i14, i11, i15 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: k */
    private static int m32969k(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: l */
    private static void m32970l(byte[] bArr, int i, int i2, int i3, int i4, C9680b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo24273p(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    public C9656b mo24195a(C9662h hVar) {
        return new C9688j(hVar);
    }

    /* renamed from: b */
    public C9680b mo24196b() {
        C9680b bVar;
        C9680b bVar2 = this.f25949e;
        if (bVar2 != null) {
            return bVar2;
        }
        C9662h e = mo24199e();
        int d = e.mo24213d();
        int a = e.mo24212a();
        if (d < 40 || a < 40) {
            bVar = super.mo24196b();
        } else {
            byte[] b = e.mo24208b();
            int i = d >> 3;
            if ((d & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] i5 = m32967i(b, i2, i4, d, a);
            bVar = new C9680b(d, a);
            m32968j(b, i2, i4, d, a, i5, bVar);
        }
        this.f25949e = bVar;
        return this.f25949e;
    }
}
