package p455g.p460t;

import java.util.Collection;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.q */
class C10355q extends C10354p {
    /* renamed from: r */
    public static <T> boolean m35149r(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C10457l.m35320e(collection, "<this>");
        C10457l.m35320e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public static <T> boolean m35150s(Collection<? super T> collection, T[] tArr) {
        C10457l.m35320e(collection, "<this>");
        C10457l.m35320e(tArr, "elements");
        return collection.addAll(C10341g.m35066b(tArr));
    }
}
