package p174e.p319f.p416e.p428v;

import java.util.EnumMap;
import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9669o;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.m */
final class C9728m {

    /* renamed from: a */
    private final int[] f26061a = new int[4];

    /* renamed from: b */
    private final StringBuilder f26062b = new StringBuilder();

    C9728m() {
    }

    /* renamed from: a */
    private int m33133a(C9679a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f26061a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo24254j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < j; i3++) {
            int j2 = C9731p.m33144j(aVar, iArr2, i, C9731p.f26073e);
            sb.append((char) ((j2 % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j2 >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.mo24253i(aVar.mo24251g(i));
            }
        }
        if (sb.length() != 2) {
            throw C9664j.m32854a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw C9664j.m32854a();
        }
    }

    /* renamed from: c */
    private static Map<C9669o, Object> m33134c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C9669o.class);
        enumMap.put(C9669o.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9668n mo24354b(int i, C9679a aVar, int[] iArr) {
        StringBuilder sb = this.f26062b;
        sb.setLength(0);
        int a = m33133a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C9669o, Object> c = m33134c(sb2);
        float f = (float) i;
        C9668n nVar = new C9668n(sb2, (byte[]) null, new C9670p[]{new C9670p(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C9670p((float) a, f)}, C9655a.UPC_EAN_EXTENSION);
        if (c != null) {
            nVar.mo24227g(c);
        }
        return nVar;
    }
}
