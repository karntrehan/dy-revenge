package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.g.d */
final class C6743d implements Iterator {

    /* renamed from: f */
    final /* synthetic */ Iterator f18426f;

    /* renamed from: o */
    final /* synthetic */ Iterator f18427o;

    C6743d(C6777f fVar, Iterator it, Iterator it2) {
        this.f18426f = it;
        this.f18427o = it2;
    }

    public final boolean hasNext() {
        if (this.f18426f.hasNext()) {
            return true;
        }
        return this.f18427o.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f18426f.hasNext()) {
            return new C7018u(((Integer) this.f18426f.next()).toString());
        }
        if (this.f18427o.hasNext()) {
            return new C7018u((String) this.f18427o.next());
        }
        throw new NoSuchElementException();
    }
}
