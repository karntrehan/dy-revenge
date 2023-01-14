package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.l.de */
final class C8179de {
    C8179de() {
    }

    /* renamed from: a */
    public static final int m28432a(int i, Object obj, Object obj2) {
        C8160ce ceVar = (C8160ce) obj;
        C8141be beVar = (C8141be) obj2;
        if (ceVar.isEmpty()) {
            return 0;
        }
        Iterator it = ceVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m28433b(Object obj, Object obj2) {
        C8160ce ceVar = (C8160ce) obj;
        C8160ce ceVar2 = (C8160ce) obj2;
        if (!ceVar2.isEmpty()) {
            if (!ceVar.mo21724g()) {
                ceVar = ceVar.mo21719d();
            }
            ceVar.mo21723f(ceVar2);
        }
        return ceVar;
    }
}
