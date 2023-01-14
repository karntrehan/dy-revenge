package p174e.p319f.p416e.p428v;

import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.q */
public final class C9732q extends C9731p {

    /* renamed from: i */
    private static final int[] f26077i = {1, 1, 1, 1, 1, 1};

    /* renamed from: j */
    static final int[][] f26078j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: k */
    private final int[] f26079k = new int[4];

    /* renamed from: s */
    public static String m33155s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case C9024k.f24764q4:
            case C9024k.f24770r4:
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    /* renamed from: t */
    private static void m33156t(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f26078j[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C9664j.m32854a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo24357h(String str) {
        return super.mo24357h(m33155s(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int[] mo24358k(C9679a aVar, int i) {
        return C9731p.m33145n(aVar, i, true, f26077i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo24350l(C9679a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f26079k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo24254j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < j; i3++) {
            int j2 = C9731p.m33144j(aVar, iArr2, i, C9731p.f26073e);
            sb.append((char) ((j2 % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j2 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m33156t(sb, i2);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C9655a mo24351q() {
        return C9655a.UPC_E;
    }
}
