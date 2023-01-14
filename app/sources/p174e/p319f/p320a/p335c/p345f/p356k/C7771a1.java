package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* renamed from: e.f.a.c.f.k.a1 */
abstract class C7771a1<E> extends AbstractSet<E> {
    C7771a1() {
    }

    public boolean removeAll(Collection<?> collection) {
        return C7797c1.m27874a(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
