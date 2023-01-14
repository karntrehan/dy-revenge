package p174e.p319f.p416e.p428v;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9658d;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.c */
public final class C9718c extends C9726k {

    /* renamed from: a */
    static final int[] f26038a = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: b */
    private final boolean f26039b;

    /* renamed from: c */
    private final boolean f26040c;

    /* renamed from: d */
    private final StringBuilder f26041d;

    /* renamed from: e */
    private final int[] f26042e;

    public C9718c() {
        this(false);
    }

    public C9718c(boolean z) {
        this(z, false);
    }

    public C9718c(boolean z, boolean z2) {
        this.f26039b = z;
        this.f26040c = z2;
        this.f26041d = new StringBuilder(20);
        this.f26042e = new int[9];
    }

    /* renamed from: h */
    private static String m33088h(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    charAt = ':';
                                } else {
                                    throw C9660f.m32836a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw C9660f.m32836a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            charAt = '@';
                        } else if (charAt2 == 'W') {
                            charAt = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            charAt = 127;
                        } else {
                            throw C9660f.m32836a();
                        }
                    }
                    charAt = 0;
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw C9660f.m32836a();
                } else {
                    i = charAt2 - '@';
                }
                charAt = (char) i;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: i */
    private static int[] m33089i(C9679a aVar, int[] iArr) {
        int j = aVar.mo24254j();
        int g = aVar.mo24251g(0);
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
                } else if (m33091k(iArr) != 148 || !aVar.mo24255k(Math.max(0, i - ((g - i) / 2)), i, false)) {
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                } else {
                    return new int[]{i, g};
                }
                iArr[i2] = 1;
                z = !z;
            }
            g++;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: j */
    private static char m33090j(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f26038a;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw C9664j.m32854a();
            }
        }
    }

    /* renamed from: k */
    private static int m33091k(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        int[] iArr = this.f26042e;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f26041d;
        sb.setLength(0);
        int[] i2 = m33089i(aVar, iArr);
        int g = aVar.mo24251g(i2[1]);
        int j = aVar.mo24254j();
        while (true) {
            C9726k.m33122f(aVar, g, iArr);
            int k = m33091k(iArr);
            if (k >= 0) {
                char j2 = m33090j(k);
                sb.append(j2);
                int i3 = g;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int g2 = aVar.mo24251g(i3);
                if (j2 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (g2 - g) - i5;
                    if (g2 == j || (i7 << 1) >= i5) {
                        if (this.f26039b) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f26041d.charAt(i9));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw C9658d.m32835a();
                            }
                        }
                        if (sb.length() != 0) {
                            float f = (float) i;
                            return new C9668n(this.f26040c ? m33088h(sb) : sb.toString(), (byte[]) null, new C9670p[]{new C9670p(((float) (i2[1] + i2[0])) / 2.0f, f), new C9670p(((float) g) + (((float) i5) / 2.0f), f)}, C9655a.CODE_39);
                        }
                        throw C9664j.m32854a();
                    }
                    throw C9664j.m32854a();
                }
                g = g2;
            } else {
                throw C9664j.m32854a();
            }
        }
    }
}
