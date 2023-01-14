package p174e.p319f.p416e.p428v;

import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.f */
public final class C9721f extends C9731p {

    /* renamed from: i */
    private final int[] f26050i = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo24350l(C9679a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f26050i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo24254j();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < j; i2++) {
            sb.append((char) (C9731p.m33144j(aVar, iArr2, i, C9731p.f26072d) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = C9731p.m33145n(aVar, i, true, C9731p.f26070b)[1];
        for (int i5 = 0; i5 < 4 && i4 < j; i5++) {
            sb.append((char) (C9731p.m33144j(aVar, iArr2, i4, C9731p.f26072d) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C9655a mo24351q() {
        return C9655a.EAN_8;
    }
}
