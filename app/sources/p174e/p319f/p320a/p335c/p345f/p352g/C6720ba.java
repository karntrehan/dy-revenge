package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.ba */
final class C6720ba {
    C6720ba() {
    }

    /* renamed from: a */
    public static final int m25466a(int i, Object obj, Object obj2) {
        C6703aa aaVar = (C6703aa) obj;
        C7108z9 z9Var = (C7108z9) obj2;
        if (aaVar.isEmpty()) {
            return 0;
        }
        Iterator it = aaVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m25467b(Object obj, Object obj2) {
        C6703aa aaVar = (C6703aa) obj;
        C6703aa aaVar2 = (C6703aa) obj2;
        if (!aaVar2.isEmpty()) {
            if (!aaVar.mo19533g()) {
                aaVar = aaVar.mo19528d();
            }
            aaVar.mo19532f(aaVar2);
        }
        return aaVar;
    }
}
