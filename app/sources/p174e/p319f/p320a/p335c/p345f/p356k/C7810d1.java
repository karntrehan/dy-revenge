package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: e.f.a.c.f.k.d1 */
abstract class C7810d1<F, T> implements Iterator<T> {

    /* renamed from: f */
    final Iterator<? extends F> f21291f;

    C7810d1(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f21291f = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo21254b(F f);

    public final boolean hasNext() {
        return this.f21291f.hasNext();
    }

    public final T next() {
        return mo21254b(this.f21291f.next());
    }

    public final void remove() {
        this.f21291f.remove();
    }
}
