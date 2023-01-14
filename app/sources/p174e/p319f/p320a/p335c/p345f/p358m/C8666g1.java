package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: e.f.a.c.f.m.g1 */
public final class C8666g1 {
    /* renamed from: a */
    static boolean m29470a(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof C8627d1) {
            collection = ((C8627d1) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m29471b(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    static boolean m29471b(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
