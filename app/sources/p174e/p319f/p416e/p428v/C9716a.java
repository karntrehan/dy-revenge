package p174e.p319f.p416e.p428v;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.a */
public final class C9716a extends C9726k {

    /* renamed from: a */
    static final char[] f26031a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b */
    static final int[] f26032b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c */
    private static final char[] f26033c = {'A', 'B', 'C', 'D'};

    /* renamed from: d */
    private final StringBuilder f26034d = new StringBuilder(20);

    /* renamed from: e */
    private int[] f26035e = new int[80];

    /* renamed from: f */
    private int f26036f = 0;

    /* renamed from: h */
    static boolean m33078h(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m33079i(int i) {
        int[] iArr = this.f26035e;
        int i2 = this.f26036f;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f26036f = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f26035e = iArr2;
        }
    }

    /* renamed from: j */
    private int m33080j() {
        for (int i = 1; i < this.f26036f; i += 2) {
            int l = m33082l(i);
            if (l != -1 && m33078h(f26033c, f26031a[l])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f26035e[i3];
                }
                if (i == 1 || this.f26035e[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw C9664j.m32854a();
    }

    /* renamed from: k */
    private void m33081k(C9679a aVar) {
        int i = 0;
        this.f26036f = 0;
        int i2 = aVar.mo24253i(0);
        int j = aVar.mo24254j();
        if (i2 < j) {
            boolean z = true;
            while (i2 < j) {
                if (aVar.mo24248e(i2) != z) {
                    i++;
                } else {
                    m33079i(i);
                    z = !z;
                    i = 1;
                }
                i2++;
            }
            m33079i(i);
            return;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: l */
    private int m33082l(int i) {
        int i2 = i + 7;
        if (i2 >= this.f26036f) {
            return -1;
        }
        int[] iArr = this.f26035e;
        int i3 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i4 = 0;
        int i5 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f26032b;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    /* renamed from: m */
    private void m33083m(int i) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f26034d.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f26032b[this.f26034d.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f26035e[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((((float) iArr[i8]) / ((float) iArr2[i8])) + (((float) iArr[i9]) / ((float) iArr2[i9]))) / 2.0f;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((((float) iArr[i9]) * 2.0f) + 1.5f) / ((float) iArr2[i9]);
        }
        loop3:
        while (true) {
            int i10 = f26032b[this.f26034d.charAt(i2)];
            int i11 = 6;
            while (i11 >= 0) {
                int i12 = (i11 & 1) + ((i10 & 1) << 1);
                float f = (float) this.f26035e[i + i11];
                if (f >= fArr2[i12] && f <= fArr[i12]) {
                    i10 >>= 1;
                    i11--;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw C9664j.m32854a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p174e.p319f.p416e.C9668n mo24349c(int r11, p174e.p319f.p416e.p420s.C9679a r12, java.util.Map<p174e.p319f.p416e.C9659e, ?> r13) {
        /*
            r10 = this;
            int[] r0 = r10.f26035e
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.m33081k(r12)
            int r12 = r10.m33080j()
            java.lang.StringBuilder r0 = r10.f26034d
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.m33082l(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0101
            java.lang.StringBuilder r4 = r10.f26034d
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f26034d
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f26033c
            char[] r6 = f26031a
            char r2 = r6[r2]
            boolean r2 = m33078h(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f26036f
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f26035e
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = 0
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f26035e
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f26036f
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x005d:
            r10.m33083m(r12)
            r0 = 0
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f26034d
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f26034d
            char[] r3 = f26031a
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f26034d
            char r0 = r0.charAt(r1)
            char[] r2 = f26033c
            boolean r0 = m33078h(r2, r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.StringBuilder r0 = r10.f26034d
            int r3 = r0.length()
            int r3 = r3 - r5
            char r0 = r0.charAt(r3)
            boolean r0 = m33078h(r2, r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.StringBuilder r0 = r10.f26034d
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f2
            if (r13 == 0) goto L_0x00ab
            e.f.e.e r0 = p174e.p319f.p416e.C9659e.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00ba
        L_0x00ab:
            java.lang.StringBuilder r13 = r10.f26034d
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f26034d
            r13.deleteCharAt(r1)
        L_0x00ba:
            r13 = 0
            r0 = 0
        L_0x00bc:
            if (r13 >= r12) goto L_0x00c6
            int[] r2 = r10.f26035e
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x00c6:
            float r13 = (float) r0
        L_0x00c7:
            if (r12 >= r4) goto L_0x00d1
            int[] r2 = r10.f26035e
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00d1:
            float r12 = (float) r0
            e.f.e.n r0 = new e.f.e.n
            java.lang.StringBuilder r2 = r10.f26034d
            java.lang.String r2 = r2.toString()
            r3 = 0
            e.f.e.p[] r4 = new p174e.p319f.p416e.C9670p[r6]
            e.f.e.p r6 = new e.f.e.p
            float r11 = (float) r11
            r6.<init>(r13, r11)
            r4[r1] = r6
            e.f.e.p r13 = new e.f.e.p
            r13.<init>(r12, r11)
            r4[r5] = r13
            e.f.e.a r11 = p174e.p319f.p416e.C9655a.CODABAR
            r0.<init>(r2, r3, r4, r11)
            return r0
        L_0x00f2:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x00f7:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x00fc:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x0101:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.C9716a.mo24349c(int, e.f.e.s.a, java.util.Map):e.f.e.n");
    }
}
