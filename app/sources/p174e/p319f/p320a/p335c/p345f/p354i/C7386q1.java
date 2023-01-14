package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* renamed from: e.f.a.c.f.i.q1 */
abstract class C7386q1<E> extends AbstractSet<E> {
    C7386q1() {
    }

    public boolean removeAll(Collection<?> collection) {
        return C7400r1.m27429a(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
