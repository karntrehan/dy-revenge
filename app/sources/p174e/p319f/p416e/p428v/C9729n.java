package p174e.p319f.p416e.p428v;

import java.util.EnumMap;
import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9669o;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.n */
final class C9729n {

    /* renamed from: a */
    private static final int[] f26063a = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: b */
    private final int[] f26064b = new int[4];

    /* renamed from: c */
    private final StringBuilder f26065c = new StringBuilder();

    C9729n() {
    }

    /* renamed from: a */
    private int m33136a(C9679a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f26064b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo24254j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < j; i3++) {
            int j2 = C9731p.m33144j(aVar, iArr2, i, C9731p.f26073e);
            sb.append((char) ((j2 % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j2 >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.mo24253i(aVar.mo24251g(i));
            }
        }
        if (sb.length() == 5) {
            if (m33138d(sb.toString()) == m33137c(i2)) {
                return i;
            }
            throw C9664j.m32854a();
        }
        throw C9664j.m32854a();
    }

    /* renamed from: c */
    private static int m33137c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f26063a[i2]) {
                return i2;
            }
        }
        throw C9664j.m32854a();
    }

    /* renamed from: d */
    private static int m33138d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r5.equals("90000") == false) goto L_0x001d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m33139e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L_0x004d
            r2 = 53
            if (r1 == r2) goto L_0x004a
            r2 = 57
            if (r1 == r2) goto L_0x0015
            goto L_0x004f
        L_0x0015:
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 54118329: goto L_0x0035;
                case 54395376: goto L_0x002a;
                case 54395377: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = -1
            goto L_0x003e
        L_0x001f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 2
            goto L_0x003e
        L_0x002a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r0 = 1
            goto L_0x003e
        L_0x0035:
            java.lang.String r2 = "90000"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003e
            goto L_0x001d
        L_0x003e:
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x004f
        L_0x0042:
            java.lang.String r5 = "0.00"
            return r5
        L_0x0045:
            java.lang.String r5 = "Used"
            return r5
        L_0x0048:
            r5 = 0
            return r5
        L_0x004a:
            java.lang.String r3 = "$"
            goto L_0x004f
        L_0x004d:
            java.lang.String r3 = "£"
        L_0x004f:
            java.lang.String r5 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L_0x006e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "0"
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0072
        L_0x006e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x0072:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.C9729n.m33139e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static Map<C9669o, Object> m33140f(String str) {
        String e;
        if (str.length() != 5 || (e = m33139e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C9669o.class);
        enumMap.put(C9669o.SUGGESTED_PRICE, e);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9668n mo24355b(int i, C9679a aVar, int[] iArr) {
        StringBuilder sb = this.f26065c;
        sb.setLength(0);
        int a = m33136a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C9669o, Object> f = m33140f(sb2);
        float f2 = (float) i;
        C9668n nVar = new C9668n(sb2, (byte[]) null, new C9670p[]{new C9670p(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new C9670p((float) a, f2)}, C9655a.UPC_EAN_EXTENSION);
        if (f != null) {
            nVar.mo24227g(f);
        }
        return nVar;
    }
}
