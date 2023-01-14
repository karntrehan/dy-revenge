package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: e.f.a.c.f.i.r1 */
public final class C7400r1 {
    /* renamed from: a */
    static boolean m27429a(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof C7358o1) {
            collection = ((C7358o1) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m27430b(set, collection.iterator());
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
    static boolean m27430b(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
