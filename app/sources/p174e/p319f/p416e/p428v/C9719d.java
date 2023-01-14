package p174e.p319f.p416e.p428v;

import java.util.Arrays;
import java.util.Map;
import okhttp3.internal.http.StatusLine;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9658d;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.d */
public final class C9719d extends C9726k {

    /* renamed from: a */
    private static final char[] f26043a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: b */
    static final int[] f26044b;

    /* renamed from: c */
    private static final int f26045c;

    /* renamed from: d */
    private final StringBuilder f26046d = new StringBuilder(20);

    /* renamed from: e */
    private final int[] f26047e = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, StatusLine.HTTP_PERM_REDIRECT, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f26044b = iArr;
        f26045c = iArr[47];
    }

    /* renamed from: h */
    private static void m33093h(CharSequence charSequence) {
        int length = charSequence.length();
        m33094i(charSequence, length - 2, 20);
        m33094i(charSequence, length - 1, 15);
    }

    /* renamed from: i */
    private static void m33094i(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f26043a[i3 % 47]) {
            throw C9658d.m32835a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m33095j(java.lang.CharSequence r9) {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x009b
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x0094
            r5 = 100
            if (r4 > r5) goto L_0x0094
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x008f
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0082;
                case 98: goto L_0x004c;
                case 99: goto L_0x003b;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x0094
        L_0x002f:
            if (r5 < r8) goto L_0x0036
            if (r5 > r7) goto L_0x0036
            int r5 = r5 + 32
            goto L_0x0088
        L_0x0036:
            e.f.e.f r9 = p174e.p319f.p416e.C9660f.m32836a()
            throw r9
        L_0x003b:
            if (r5 < r8) goto L_0x0042
            if (r5 > r6) goto L_0x0042
            int r5 = r5 + -32
            goto L_0x0088
        L_0x0042:
            if (r5 != r7) goto L_0x0047
            r4 = 58
            goto L_0x0094
        L_0x0047:
            e.f.e.f r9 = p174e.p319f.p416e.C9660f.m32836a()
            throw r9
        L_0x004c:
            if (r5 < r8) goto L_0x0055
            r4 = 69
            if (r5 > r4) goto L_0x0055
            int r5 = r5 + -38
            goto L_0x0088
        L_0x0055:
            r4 = 70
            if (r5 < r4) goto L_0x0060
            r4 = 74
            if (r5 > r4) goto L_0x0060
            int r5 = r5 + -11
            goto L_0x0088
        L_0x0060:
            r4 = 75
            if (r5 < r4) goto L_0x0069
            if (r5 > r6) goto L_0x0069
            int r5 = r5 + 16
            goto L_0x0088
        L_0x0069:
            r4 = 80
            if (r5 < r4) goto L_0x0074
            r4 = 83
            if (r5 > r4) goto L_0x0074
            int r5 = r5 + 43
            goto L_0x0088
        L_0x0074:
            r4 = 84
            if (r5 < r4) goto L_0x007d
            if (r5 > r7) goto L_0x007d
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x0094
        L_0x007d:
            e.f.e.f r9 = p174e.p319f.p416e.C9660f.m32836a()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x0094
        L_0x008a:
            e.f.e.f r9 = p174e.p319f.p416e.C9660f.m32836a()
            throw r9
        L_0x008f:
            e.f.e.f r9 = p174e.p319f.p416e.C9660f.m32836a()
            throw r9
        L_0x0094:
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009b:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.C9719d.m33095j(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: k */
    private int[] m33096k(C9679a aVar) {
        int j = aVar.mo24254j();
        int g = aVar.mo24251g(0);
        Arrays.fill(this.f26047e, 0);
        int[] iArr = this.f26047e;
        int length = iArr.length;
        int i = g;
        boolean z = false;
        int i2 = 0;
        while (g < j) {
            if (aVar.mo24248e(g) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else if (m33098m(iArr) == f26045c) {
                    return new int[]{i, g};
                } else {
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            g++;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: l */
    private static char m33097l(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f26044b;
            if (i2 >= iArr.length) {
                throw C9664j.m32854a();
            } else if (iArr[i2] == i) {
                return f26043a[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: m */
    private static int m33098m(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        int[] k = m33096k(aVar);
        int g = aVar.mo24251g(k[1]);
        int j = aVar.mo24254j();
        int[] iArr = this.f26047e;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f26046d;
        sb.setLength(0);
        while (true) {
            C9726k.m33122f(aVar, g, iArr);
            int m = m33098m(iArr);
            if (m >= 0) {
                char l = m33097l(m);
                sb.append(l);
                int i2 = g;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int g2 = aVar.mo24251g(i2);
                if (l == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (g2 == j || !aVar.mo24248e(g2)) {
                        throw C9664j.m32854a();
                    } else if (sb.length() >= 2) {
                        m33093h(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C9668n(m33095j(sb), (byte[]) null, new C9670p[]{new C9670p(((float) (k[1] + k[0])) / 2.0f, f), new C9670p(((float) g) + (((float) i4) / 2.0f), f)}, C9655a.CODE_93);
                    } else {
                        throw C9664j.m32854a();
                    }
                } else {
                    g = g2;
                }
            } else {
                throw C9664j.m32854a();
            }
        }
    }
}
