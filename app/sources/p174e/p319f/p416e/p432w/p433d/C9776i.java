package p174e.p319f.p416e.p432w.p433d;

import java.lang.reflect.Array;
import p174e.p319f.p416e.p420s.p421m.C9691a;
import p174e.p319f.p416e.p432w.C9763a;

/* renamed from: e.f.e.w.d.i */
final class C9776i {

    /* renamed from: a */
    private static final float[][] f26198a;

    static {
        int i;
        int length = C9763a.f26147b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f26198a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C9763a.f26147b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f26198a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m33368a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m33369b(int[] iArr) {
        int d = C9691a.m32983d(iArr);
        float[] fArr = new float[8];
        if (d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = ((float) iArr[i]) / ((float) d);
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f26198a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C9763a.f26147b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m33370c(int[] iArr) {
        int a = m33368a(iArr);
        if (C9763a.m33283a(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    static int m33371d(int[] iArr) {
        int c = m33370c(m33372e(iArr));
        return c != -1 ? c : m33369b(iArr);
    }

    /* renamed from: e */
    private static int[] m33372e(int[] iArr) {
        float d = (float) C9691a.m32983d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (d / 34.0f) + ((((float) i3) * d) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
