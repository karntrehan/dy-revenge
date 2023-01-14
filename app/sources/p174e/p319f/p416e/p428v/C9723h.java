package p174e.p319f.p416e.p428v;

import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.h */
public final class C9723h extends C9726k {

    /* renamed from: a */
    private static final int[] f26053a = {6, 8, 10, 12, 14};

    /* renamed from: b */
    private static final int[] f26054b = {1, 1, 1, 1};

    /* renamed from: c */
    private static final int[][] f26055c = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: d */
    private static final int[][] f26056d = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: e */
    private int f26057e = -1;

    /* renamed from: h */
    private static int m33108h(int[] iArr) {
        int length = f26056d.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float e = C9726k.m33121e(iArr, f26056d[i2], 0.5f);
            if (e < f) {
                i = i2;
                f = e;
            } else if (e == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw C9664j.m32854a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = m33112l(r7, r0, f26055c[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m33109i(p174e.p319f.p416e.p420s.C9679a r7) {
        /*
            r6 = this;
            r7.mo24256m()
            int r0 = m33113m(r7)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            int[][] r3 = f26055c     // Catch:{ j -> 0x0012 }
            r3 = r3[r2]     // Catch:{ j -> 0x0012 }
            int[] r0 = m33112l(r7, r0, r3)     // Catch:{ j -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            int[][] r3 = f26055c     // Catch:{ all -> 0x0035 }
            r3 = r3[r1]     // Catch:{ all -> 0x0035 }
            int[] r0 = m33112l(r7, r0, r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            r6.m33114n(r7, r3)     // Catch:{ all -> 0x0035 }
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            int r4 = r7.mo24254j()     // Catch:{ all -> 0x0035 }
            r5 = r0[r1]     // Catch:{ all -> 0x0035 }
            int r4 = r4 - r5
            r0[r2] = r4     // Catch:{ all -> 0x0035 }
            int r2 = r7.mo24254j()     // Catch:{ all -> 0x0035 }
            int r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x0035 }
            r7.mo24256m()
            return r0
        L_0x0035:
            r0 = move-exception
            r7.mo24256m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.C9723h.m33109i(e.f.e.s.a):int[]");
    }

    /* renamed from: j */
    private static void m33110j(C9679a aVar, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C9726k.m33122f(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m33108h(iArr2) + 48));
            sb.append((char) (m33108h(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: k */
    private int[] m33111k(C9679a aVar) {
        int[] l = m33112l(aVar, m33113m(aVar), f26054b);
        this.f26057e = (l[1] - l[0]) / 4;
        m33114n(aVar, l[0]);
        return l;
    }

    /* renamed from: l */
    private static int[] m33112l(C9679a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int j = aVar.mo24254j();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < j) {
            if (aVar.mo24248e(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (C9726k.m33121e(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: m */
    private static int m33113m(C9679a aVar) {
        int j = aVar.mo24254j();
        int g = aVar.mo24251g(0);
        if (g != j) {
            return g;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: n */
    private void m33114n(C9679a aVar, int i) {
        int i2 = this.f26057e * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo24248e(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw C9664j.m32854a();
        }
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        boolean z;
        int[] k = m33111k(aVar);
        int[] i2 = m33109i(aVar);
        StringBuilder sb = new StringBuilder(20);
        m33110j(aVar, k[1], i2[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(C9659e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f26053a;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length2) {
                z = false;
                break;
            }
            int i5 = iArr[i3];
            if (length == i5) {
                z = true;
                break;
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i3++;
        }
        if (!z && length > i4) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C9668n(sb2, (byte[]) null, new C9670p[]{new C9670p((float) k[1], f), new C9670p((float) i2[0], f)}, C9655a.ITF);
        }
        throw C9660f.m32836a();
    }
}
