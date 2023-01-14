package p174e.p319f.p416e.p426u;

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
import p174e.p319f.p416e.p426u.p427b.C9715c;

/* renamed from: e.f.e.u.a */
public final class C9712a implements C9666l {

    /* renamed from: a */
    private static final C9670p[] f26025a = new C9670p[0];

    /* renamed from: b */
    private final C9715c f26026b = new C9715c();

    /* renamed from: c */
    private static C9680b m33063c(C9680b bVar) {
        int[] i = bVar.mo24267i();
        if (i != null) {
            int i2 = i[0];
            int i3 = i[1];
            int i4 = i[2];
            int i5 = i[3];
            C9680b bVar2 = new C9680b(30, 33);
            for (int i6 = 0; i6 < 33; i6++) {
                int i7 = (((i6 * i5) + (i5 / 2)) / 33) + i3;
                for (int i8 = 0; i8 < 30; i8++) {
                    if (bVar.mo24264f(((((i8 * i4) + (i4 / 2)) + (((i6 & 1) * i4) / 2)) / 30) + i2, i7)) {
                        bVar2.mo24273p(i8, i6);
                    }
                }
            }
            return bVar2;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: a */
    public void mo24216a() {
    }

    /* renamed from: b */
    public C9668n mo24217b(C9657c cVar, Map<C9659e, ?> map) {
        if (map == null || !map.containsKey(C9659e.PURE_BARCODE)) {
            throw C9664j.m32854a();
        }
        C9683e b = this.f26026b.mo24348b(m33063c(cVar.mo24201a()), map);
        C9668n nVar = new C9668n(b.mo24289h(), b.mo24286e(), f26025a, C9655a.MAXICODE);
        String b2 = b.mo24283b();
        if (b2 != null) {
            nVar.mo24228h(C9669o.ERROR_CORRECTION_LEVEL, b2);
        }
        return nVar;
    }
}
