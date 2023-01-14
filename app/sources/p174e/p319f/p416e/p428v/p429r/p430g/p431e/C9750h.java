package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.r.g.e.h */
abstract class C9750h extends C9752j {
    C9750h(C9679a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static void m33232e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo24397f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo24398g(sb, i, length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo24398g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo24400b().mo24424f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m33232e(sb, i2);
    }
}
