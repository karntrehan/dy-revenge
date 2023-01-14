package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* renamed from: e.f.a.c.f.m.f1 */
abstract class C8653f1<E> extends AbstractSet<E> {
    C8653f1() {
    }

    public boolean removeAll(Collection<?> collection) {
        return C8666g1.m29470a(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
