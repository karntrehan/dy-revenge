package p174e.p319f.p416e.p428v.p429r.p430g;

import java.util.List;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.r.g.a */
final class C9739a {
    /* renamed from: a */
    static C9679a m33191a(List<C9740b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).mo24380d() == null) {
            size--;
        }
        C9679a aVar = new C9679a(size * 12);
        int i = 0;
        int b = list.get(0).mo24380d().mo24366b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo24257n(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C9740b bVar = list.get(i3);
            int b2 = bVar.mo24379c().mo24366b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo24257n(i);
                }
                i++;
            }
            if (bVar.mo24380d() != null) {
                int b3 = bVar.mo24380d().mo24366b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo24257n(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
