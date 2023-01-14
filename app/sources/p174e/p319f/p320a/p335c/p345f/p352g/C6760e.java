package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.g.e */
final class C6760e implements Iterator {

    /* renamed from: f */
    private int f18455f = 0;

    /* renamed from: o */
    final /* synthetic */ C6777f f18456o;

    C6760e(C6777f fVar) {
        this.f18456o = fVar;
    }

    public final boolean hasNext() {
        return this.f18455f < this.f18456o.mo19752z();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f18455f < this.f18456o.mo19752z()) {
            C6777f fVar = this.f18456o;
            int i = this.f18455f;
            this.f18455f = i + 1;
            return fVar.mo19729A(i);
        }
        int i2 = this.f18455f;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
