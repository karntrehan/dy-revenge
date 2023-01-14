package p174e.p319f.p416e.p423t;

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
import p174e.p319f.p416e.p423t.p424b.C9703d;
import p174e.p319f.p416e.p423t.p425c.C9708a;

/* renamed from: e.f.e.t.a */
public final class C9697a implements C9666l {

    /* renamed from: a */
    private static final C9670p[] f25986a = new C9670p[0];

    /* renamed from: b */
    private final C9703d f25987b = new C9703d();

    /* renamed from: c */
    private static C9680b m33010c(C9680b bVar) {
        int[] l = bVar.mo24270l();
        int[] g = bVar.mo24265g();
        if (l == null || g == null) {
            throw C9664j.m32854a();
        }
        int d = m33011d(l, bVar);
        int i = l[1];
        int i2 = g[1];
        int i3 = l[0];
        int i4 = ((g[0] - i3) + 1) / d;
        int i5 = ((i2 - i) + 1) / d;
        if (i4 <= 0 || i5 <= 0) {
            throw C9664j.m32854a();
        }
        int i6 = d / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C9680b bVar2 = new C9680b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * d) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (bVar.mo24264f((i11 * d) + i8, i10)) {
                    bVar2.mo24273p(i11, i9);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: d */
    private static int m33011d(int[] iArr, C9680b bVar) {
        int m = bVar.mo24271m();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < m && bVar.mo24264f(i, i2)) {
            i++;
        }
        if (i != m) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C9664j.m32854a();
        }
        throw C9664j.m32854a();
    }

    /* renamed from: a */
    public void mo24216a() {
    }

    /* renamed from: b */
    public C9668n mo24217b(C9657c cVar, Map<C9659e, ?> map) {
        C9670p[] pVarArr;
        C9683e eVar;
        if (map == null || !map.containsKey(C9659e.PURE_BARCODE)) {
            C9685g c = new C9708a(cVar.mo24201a()).mo24340c();
            C9683e b = this.f25987b.mo24327b(c.mo24297a());
            pVarArr = c.mo24298b();
            eVar = b;
        } else {
            eVar = this.f25987b.mo24327b(m33010c(cVar.mo24201a()));
            pVarArr = f25986a;
        }
        C9668n nVar = new C9668n(eVar.mo24289h(), eVar.mo24286e(), pVarArr, C9655a.DATA_MATRIX);
        List<byte[]> a = eVar.mo24282a();
        if (a != null) {
            nVar.mo24228h(C9669o.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo24283b();
        if (b2 != null) {
            nVar.mo24228h(C9669o.ERROR_CORRECTION_LEVEL, b2);
        }
        return nVar;
    }
}
