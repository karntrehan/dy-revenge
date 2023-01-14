package p174e.p319f.p416e.p428v;

import java.util.Arrays;
import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9658d;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9667m;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9669o;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.C9671q;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.p */
public abstract class C9731p extends C9726k {

    /* renamed from: a */
    static final int[] f26069a = {1, 1, 1};

    /* renamed from: b */
    static final int[] f26070b = {1, 1, 1, 1, 1};

    /* renamed from: c */
    static final int[] f26071c = {1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    static final int[][] f26072d;

    /* renamed from: e */
    static final int[][] f26073e;

    /* renamed from: f */
    private final StringBuilder f26074f = new StringBuilder(20);

    /* renamed from: g */
    private final C9730o f26075g = new C9730o();

    /* renamed from: h */
    private final C9722g f26076h = new C9722g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f26072d = iArr;
        int[][] iArr2 = new int[20][];
        f26073e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f26072d[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f26073e[i] = iArr4;
        }
    }

    protected C9731p() {
    }

    /* renamed from: i */
    static boolean m33143i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m33148r(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* renamed from: j */
    static int m33144j(C9679a aVar, int[] iArr, int i, int[][] iArr2) {
        C9726k.m33122f(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float e = C9726k.m33121e(iArr, iArr2[i3], 0.7f);
            if (e < f) {
                i2 = i3;
                f = e;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: n */
    static int[] m33145n(C9679a aVar, int i, boolean z, int[] iArr) {
        return m33146o(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: o */
    private static int[] m33146o(C9679a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int j = aVar.mo24254j();
        int i2 = z ? aVar.mo24253i(i) : aVar.mo24251g(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = i2;
        while (i2 < j) {
            if (aVar.mo24248e(i2) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (C9726k.m33121e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i4, i2};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: p */
    static int[] m33147p(C9679a aVar) {
        int[] iArr = new int[f26069a.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f26069a;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m33146o(aVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo24255k(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: r */
    static int m33148r(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C9660f.m32836a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C9660f.m32836a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        return mo24353m(i, aVar, m33147p(aVar), map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo24357h(String str) {
        return m33143i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo24358k(C9679a aVar, int i) {
        return m33145n(aVar, i, false, f26069a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo24350l(C9679a aVar, int[] iArr, StringBuilder sb);

    /* renamed from: m */
    public C9668n mo24353m(int i, C9679a aVar, int[] iArr, Map<C9659e, ?> map) {
        int i2;
        String c;
        int[] iArr2 = null;
        C9671q qVar = map == null ? null : (C9671q) map.get(C9659e.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (qVar != null) {
            qVar.mo24235a(new C9670p(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f26074f;
        sb.setLength(0);
        int l = mo24350l(aVar, iArr, sb);
        if (qVar != null) {
            qVar.mo24235a(new C9670p((float) l, (float) i));
        }
        int[] k = mo24358k(aVar, l);
        if (qVar != null) {
            qVar.mo24235a(new C9670p(((float) (k[0] + k[1])) / 2.0f, (float) i));
        }
        int i3 = k[1];
        int i4 = (i3 - k[0]) + i3;
        if (i4 >= aVar.mo24254j() || !aVar.mo24255k(i3, i4, false)) {
            throw C9664j.m32854a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C9660f.m32836a();
        } else if (mo24357h(sb2)) {
            C9655a q = mo24351q();
            float f = (float) i;
            C9668n nVar = new C9668n(sb2, (byte[]) null, new C9670p[]{new C9670p(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C9670p(((float) (k[1] + k[0])) / 2.0f, f)}, q);
            try {
                C9668n a = this.f26075g.mo24356a(i, aVar, k[1]);
                nVar.mo24228h(C9669o.UPC_EAN_EXTENSION, a.mo24226f());
                nVar.mo24227g(a.mo24224d());
                nVar.mo24221a(a.mo24225e());
                i2 = a.mo24226f().length();
            } catch (C9667m unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(C9659e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw C9664j.m32854a();
                }
            }
            if ((q == C9655a.EAN_13 || q == C9655a.UPC_A) && (c = this.f26076h.mo24352c(sb2)) != null) {
                nVar.mo24228h(C9669o.POSSIBLE_COUNTRY, c);
            }
            return nVar;
        } else {
            throw C9658d.m32835a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract C9655a mo24351q();
}
