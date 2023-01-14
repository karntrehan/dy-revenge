package p174e.p319f.p416e.p417r.p418c;

import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.p417r.C9672a;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9683e;
import p174e.p319f.p416e.p420s.p422n.C9693a;
import p174e.p319f.p416e.p420s.p422n.C9695c;
import p174e.p319f.p416e.p420s.p422n.C9696d;

/* renamed from: e.f.e.r.c.a */
public final class C9674a {

    /* renamed from: a */
    private static final String[] f25869a = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: b */
    private static final String[] f25870b = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f25871c = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f25872d = {HttpUrl.FRAGMENT_ENCODE_SET, "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: e */
    private static final String[] f25873e = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: f */
    private C9672a f25874f;

    /* renamed from: e.f.e.r.c.a$a */
    static /* synthetic */ class C9675a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25875a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.f.e.r.c.a$b[] r0 = p174e.p319f.p416e.p417r.p418c.C9674a.C9676b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25875a = r0
                e.f.e.r.c.a$b r1 = p174e.p319f.p416e.p417r.p418c.C9674a.C9676b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25875a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.e.r.c.a$b r1 = p174e.p319f.p416e.p417r.p418c.C9674a.C9676b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25875a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.e.r.c.a$b r1 = p174e.p319f.p416e.p417r.p418c.C9674a.C9676b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25875a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.e.r.c.a$b r1 = p174e.p319f.p416e.p417r.p418c.C9674a.C9676b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25875a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.e.r.c.a$b r1 = p174e.p319f.p416e.p417r.p418c.C9674a.C9676b.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p417r.p418c.C9674a.C9675a.<clinit>():void");
        }
    }

    /* renamed from: e.f.e.r.c.a$b */
    private enum C9676b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m32879a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m32885h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m32880b(boolean[] zArr) {
        C9693a aVar;
        int i = 8;
        if (this.f25874f.mo24237d() <= 2) {
            i = 6;
            aVar = C9693a.f25970c;
        } else if (this.f25874f.mo24237d() <= 8) {
            aVar = C9693a.f25974g;
        } else if (this.f25874f.mo24237d() <= 22) {
            i = 10;
            aVar = C9693a.f25969b;
        } else {
            i = 12;
            aVar = C9693a.f25968a;
        }
        int c = this.f25874f.mo24236c();
        int length = zArr.length / i;
        if (length >= c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m32886i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C9695c(aVar).mo24322a(iArr, length - c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw C9660f.m32836a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[((c * i) - i4)];
                int i7 = 0;
                for (int i8 = 0; i8 < c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        Arrays.fill(zArr2, i7, (i7 + i) - 1, i9 > 1);
                        i7 += i - 1;
                    } else {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            zArr2[i7] = ((1 << i10) & i9) != 0;
                            i10--;
                            i7 = i11;
                        }
                    }
                }
                return zArr2;
            } catch (C9696d e) {
                throw C9660f.m32837b(e);
            }
        } else {
            throw C9660f.m32836a();
        }
    }

    /* renamed from: d */
    private boolean[] m32881d(C9680b bVar) {
        C9680b bVar2 = bVar;
        boolean e = this.f25874f.mo24238e();
        int d = this.f25874f.mo24237d();
        int i = (e ? 11 : 14) + (d << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m32887j(d, e)];
        int i2 = 2;
        if (e) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < d) {
            int i10 = ((d - i8) << i2) + (e ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = bVar2.mo24264f(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = bVar2.mo24264f(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = bVar2.mo24264f(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = bVar2.mo24264f(iArr[i20], iArr[i16]);
                    i15++;
                    d = d;
                    e = e;
                    i2 = 2;
                }
                boolean z = e;
                int i21 = d;
                i13++;
                i2 = 2;
            }
            boolean z2 = e;
            int i22 = d;
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    /* renamed from: e */
    private static String m32882e(C9676b bVar, int i) {
        int i2 = C9675a.f25875a[bVar.ordinal()];
        if (i2 == 1) {
            return f25869a[i];
        }
        if (i2 == 2) {
            return f25870b[i];
        }
        if (i2 == 3) {
            return f25871c[i];
        }
        if (i2 == 4) {
            return f25872d[i];
        }
        if (i2 == 5) {
            return f25873e[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: f */
    private static String m32883f(boolean[] zArr) {
        int length = zArr.length;
        C9676b bVar = C9676b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        C9676b bVar2 = bVar;
        int i = 0;
        while (i < length) {
            if (bVar == C9676b.BINARY) {
                if (length - i < 5) {
                    break;
                }
                int i2 = m32886i(zArr, i, 5);
                i += 5;
                if (i2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    i2 = m32886i(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    } else if (length - i < 8) {
                        i = length;
                        break;
                    } else {
                        sb.append((char) m32886i(zArr, i, 8));
                        i += 8;
                        i3++;
                    }
                }
            } else {
                int i4 = bVar == C9676b.DIGIT ? 4 : 5;
                if (length - i < i4) {
                    break;
                }
                int i5 = m32886i(zArr, i, i4);
                i += i4;
                String e = m32882e(bVar, i5);
                if (e.startsWith("CTRL_")) {
                    bVar2 = m32884g(e.charAt(5));
                    if (e.charAt(6) != 'L') {
                        C9676b bVar3 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar3;
                    }
                } else {
                    sb.append(e);
                }
            }
            bVar = bVar2;
        }
        return sb.toString();
    }

    /* renamed from: g */
    private static C9676b m32884g(char c) {
        return c != 'B' ? c != 'D' ? c != 'P' ? c != 'L' ? c != 'M' ? C9676b.UPPER : C9676b.MIXED : C9676b.LOWER : C9676b.PUNCT : C9676b.DIGIT : C9676b.BINARY;
    }

    /* renamed from: h */
    private static byte m32885h(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return (byte) (length >= 8 ? m32886i(zArr, i, 8) : m32886i(zArr, i, length) << (8 - length));
    }

    /* renamed from: i */
    private static int m32886i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: j */
    private static int m32887j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: c */
    public C9683e mo24239c(C9672a aVar) {
        this.f25874f = aVar;
        boolean[] b = m32880b(m32881d(aVar.mo24297a()));
        C9683e eVar = new C9683e(m32879a(b), m32883f(b), (List<byte[]>) null, (String) null);
        eVar.mo24293l(b.length);
        return eVar;
    }
}
