package p174e.p319f.p416e.p428v;

import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.e */
public final class C9720e extends C9731p {

    /* renamed from: i */
    static final int[] f26048i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: j */
    private final int[] f26049j = new int[4];

    /* renamed from: s */
    private static void m33100s(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f26048i[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C9664j.m32854a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo24350l(C9679a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f26049j;
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
        m33100s(sb, i2);
        int i5 = C9731p.m33145n(aVar, i, true, C9731p.f26070b)[1];
        for (int i6 = 0; i6 < 6 && i5 < j; i6++) {
            sb.append((char) (C9731p.m33144j(aVar, iArr2, i5, C9731p.f26072d) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C9655a mo24351q() {
        return C9655a.EAN_13;
    }
}
