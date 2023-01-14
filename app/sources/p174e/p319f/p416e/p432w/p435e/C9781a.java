package p174e.p319f.p416e.p432w.p435e;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p174e.p319f.p416e.C9657c;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.w.e.a */
public final class C9781a {

    /* renamed from: a */
    private static final int[] f26209a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f26210b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f26211c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f26212d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m33420a(C9670p[] pVarArr, C9670p[] pVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            pVarArr[iArr[i]] = pVarArr2[i];
        }
    }

    /* renamed from: b */
    public static C9782b m33421b(C9657c cVar, Map<C9659e, ?> map, boolean z) {
        C9680b a = cVar.mo24201a();
        List<C9670p[]> c = m33422c(z, a);
        if (c.isEmpty()) {
            a = a.clone();
            a.mo24272n();
            c = m33422c(z, a);
        }
        return new C9782b(a, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (p174e.p319f.p416e.C9670p[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5[1] == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].mo24231d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5[3] == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].mo24231d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<p174e.p319f.p416e.C9670p[]> m33422c(boolean r8, p174e.p319f.p416e.p420s.C9680b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r9.mo24268j()
            if (r3 >= r6) goto L_0x0078
            e.f.e.p[] r4 = m33425f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0052
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0052
            if (r5 == 0) goto L_0x0078
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            e.f.e.p[] r5 = (p174e.p319f.p416e.C9670p[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.mo24231d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003f:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0023
            r5 = r5[r6]
            float r5 = r5.mo24231d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004f:
            int r3 = r3 + 5
            goto L_0x0008
        L_0x0052:
            r0.add(r4)
            if (r8 == 0) goto L_0x0078
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0066
            r5 = r4[r3]
            float r5 = r5.mo24230c()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L_0x0070
        L_0x0066:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.mo24230c()
            int r5 = (int) r5
            r3 = r4[r3]
        L_0x0070:
            float r3 = r3.mo24231d()
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto L_0x000a
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p432w.p435e.C9781a.m33422c(boolean, e.f.e.s.b):java.util.List");
    }

    /* renamed from: d */
    private static int[] m33423d(C9680b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.mo24264f(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bVar.mo24264f(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (m33426g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m33426g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    private static C9670p[] m33424e(C9680b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        C9670p[] pVarArr = new C9670p[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i8) {
                z = false;
                break;
            }
            int[] d = m33423d(bVar, i4, i9, i2, false, iArr, iArr2);
            if (d != null) {
                int i10 = i9;
                int[] iArr3 = d;
                int i11 = i10;
                while (true) {
                    if (i11 <= 0) {
                        i7 = i11;
                        break;
                    }
                    int i12 = i11 - 1;
                    int[] d2 = m33423d(bVar, i4, i12, i2, false, iArr, iArr2);
                    if (d2 == null) {
                        i7 = i12 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i11 = i12;
                }
                float f = (float) i7;
                pVarArr[0] = new C9670p((float) iArr3[0], f);
                pVarArr[1] = new C9670p((float) iArr3[1], f);
                i9 = i7;
                z = true;
            } else {
                i9 += 5;
            }
        }
        int i13 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) pVarArr[0].mo24230c(), (int) pVarArr[1].mo24230c()};
            int i14 = i13;
            int i15 = 0;
            while (true) {
                if (i14 >= i8) {
                    i5 = i15;
                    i6 = i14;
                    break;
                }
                i5 = i15;
                i6 = i14;
                int[] d3 = m33423d(bVar, iArr4[0], i14, i2, false, iArr, iArr2);
                if (d3 == null || Math.abs(iArr4[0] - d3[0]) >= 5 || Math.abs(iArr4[1] - d3[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i15 = i5 + 1;
                } else {
                    iArr4 = d3;
                    i15 = 0;
                }
                i14 = i6 + 1;
            }
            i13 = i6 - (i5 + 1);
            float f2 = (float) i13;
            pVarArr[2] = new C9670p((float) iArr4[0], f2);
            pVarArr[3] = new C9670p((float) iArr4[1], f2);
        }
        if (i13 - i9 < 10) {
            Arrays.fill(pVarArr, (Object) null);
        }
        return pVarArr;
    }

    /* renamed from: f */
    private static C9670p[] m33425f(C9680b bVar, int i, int i2) {
        int j = bVar.mo24268j();
        int m = bVar.mo24271m();
        C9670p[] pVarArr = new C9670p[8];
        m33420a(pVarArr, m33424e(bVar, j, m, i, i2, f26211c), f26209a);
        if (pVarArr[4] != null) {
            i2 = (int) pVarArr[4].mo24230c();
            i = (int) pVarArr[4].mo24231d();
        }
        m33420a(pVarArr, m33424e(bVar, j, m, i, i2, f26212d), f26210b);
        return pVarArr;
    }

    /* renamed from: g */
    private static float m33426g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
