package p174e.p199d.p200a.p206k;

import java.util.HashSet;
import p174e.p199d.p217b.C5714o;

/* renamed from: e.d.a.k.e */
public class C5670e {
    /* renamed from: a */
    public static C5668c m21108a(C5714o oVar, Iterable<C5671f> iterable) {
        int p = oVar.mo17096p();
        if (p == 65496) {
            HashSet hashSet = null;
            if (iterable != null) {
                hashSet = new HashSet();
                for (C5671f fVar : iterable) {
                    hashSet.add(Byte.valueOf(fVar.f16074c0));
                }
            }
            HashSet hashSet2 = hashSet;
            C5668c cVar = new C5668c();
            while (true) {
                byte h = oVar.mo17089h();
                byte h2 = oVar.mo17089h();
                while (true) {
                    if (h == -1 && h2 != -1 && h2 != 0) {
                        break;
                    }
                    byte b = h2;
                    h2 = oVar.mo17089h();
                    h = b;
                }
                if (h2 == -38 || h2 == -39) {
                    return cVar;
                }
                int p2 = oVar.mo17096p() - 2;
                if (p2 < 0) {
                    throw new C5667b("JPEG segment size would be less than zero");
                } else if (hashSet2 == null || hashSet2.contains(Byte.valueOf(h2))) {
                    cVar.mo16938a(h2, oVar.mo17082d(p2));
                } else if (!oVar.mo17085u((long) p2)) {
                    return cVar;
                }
            }
        } else {
            throw new C5667b("JPEG data is expected to begin with 0xFFD8 (ÿØ) not 0x" + Integer.toHexString(p));
        }
    }
}
