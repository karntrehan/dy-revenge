package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: e.f.a.c.f.i.s1 */
abstract class C7414s1<F, T> implements Iterator<T> {

    /* renamed from: f */
    final Iterator<? extends F> f19915f;

    C7414s1(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f19915f = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo20750b(F f);

    public final boolean hasNext() {
        return this.f19915f.hasNext();
    }

    public final T next() {
        return mo20750b(this.f19915f.next());
    }

    public final void remove() {
        this.f19915f.remove();
    }
}
