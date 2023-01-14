package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: e.f.a.c.f.m.h1 */
abstract class C8679h1<F, T> implements Iterator<T> {

    /* renamed from: f */
    final Iterator<? extends F> f23752f;

    C8679h1(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f23752f = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo22440b(F f);

    public final boolean hasNext() {
        return this.f23752f.hasNext();
    }

    public final T next() {
        return mo22440b(this.f23752f.next());
    }

    public final void remove() {
        this.f23752f.remove();
    }
}
