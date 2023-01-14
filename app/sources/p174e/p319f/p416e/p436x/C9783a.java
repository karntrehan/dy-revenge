package p174e.p319f.p416e.p436x;

import java.util.List;
import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9657c;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9666l;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9669o;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9683e;
import p174e.p319f.p416e.p420s.C9685g;
import p174e.p319f.p416e.p436x.p437b.C9797e;
import p174e.p319f.p416e.p436x.p437b.C9801i;
import p174e.p319f.p416e.p436x.p438c.C9807c;

/* renamed from: e.f.e.x.a */
public class C9783a implements C9666l {

    /* renamed from: a */
    private static final C9670p[] f26215a = new C9670p[0];

    /* renamed from: b */
    private final C9797e f26216b = new C9797e();

    /* renamed from: c */
    private static C9680b m33429c(C9680b bVar) {
        int[] l = bVar.mo24270l();
        int[] g = bVar.mo24265g();
        if (l == null || g == null) {
            throw C9664j.m32854a();
        }
        float d = m33430d(l, bVar);
        int i = l[1];
        int i2 = g[1];
        int i3 = l[0];
        int i4 = g[0];
        if (i3 >= i4 || i >= i2) {
            throw C9664j.m32854a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < bVar.mo24271m()) {
            int round = Math.round(((float) ((i4 - i3) + 1)) / d);
            int round2 = Math.round(((float) (i5 + 1)) / d);
            if (round <= 0 || round2 <= 0) {
                throw C9664j.m32854a();
            } else if (round2 == round) {
                int i6 = (int) (d / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) (((float) (round - 1)) * d)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw C9664j.m32854a();
                    }
                }
                int i10 = (((int) (((float) (round2 - 1)) * d)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw C9664j.m32854a();
                    }
                }
                C9680b bVar2 = new C9680b(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (((float) i11) * d)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (bVar.mo24264f(((int) (((float) i13) * d)) + i8, i12)) {
                            bVar2.mo24273p(i13, i11);
                        }
                    }
                }
                return bVar2;
            } else {
                throw C9664j.m32854a();
            }
        } else {
            throw C9664j.m32854a();
        }
    }

    /* renamed from: d */
    private static float m33430d(int[] iArr, C9680b bVar) {
        int j = bVar.mo24268j();
        int m = bVar.mo24271m();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < m && i2 < j) {
            if (z != bVar.mo24264f(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != m && i2 != j) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: a */
    public void mo24216a() {
    }

    /* renamed from: b */
    public final C9668n mo24217b(C9657c cVar, Map<C9659e, ?> map) {
        C9670p[] pVarArr;
        C9683e eVar;
        if (map == null || !map.containsKey(C9659e.PURE_BARCODE)) {
            C9685g e = new C9807c(cVar.mo24201a()).mo24540e(map);
            C9683e b = this.f26216b.mo24518b(e.mo24297a(), map);
            pVarArr = e.mo24298b();
            eVar = b;
        } else {
            eVar = this.f26216b.mo24518b(m33429c(cVar.mo24201a()), map);
            pVarArr = f26215a;
        }
        if (eVar.mo24285d() instanceof C9801i) {
            ((C9801i) eVar.mo24285d()).mo24524a(pVarArr);
        }
        C9668n nVar = new C9668n(eVar.mo24289h(), eVar.mo24286e(), pVarArr, C9655a.QR_CODE);
        List<byte[]> a = eVar.mo24282a();
        if (a != null) {
            nVar.mo24228h(C9669o.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo24283b();
        if (b2 != null) {
            nVar.mo24228h(C9669o.ERROR_CORRECTION_LEVEL, b2);
        }
        if (eVar.mo24290i()) {
            nVar.mo24228h(C9669o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.mo24288g()));
            nVar.mo24228h(C9669o.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.mo24287f()));
        }
        return nVar;
    }
}
