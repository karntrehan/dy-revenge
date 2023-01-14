package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.g.s */
final class C6986s implements Iterator {

    /* renamed from: f */
    private int f18857f = 0;

    /* renamed from: o */
    final /* synthetic */ C7018u f18858o;

    C6986s(C7018u uVar) {
        this.f18858o = uVar;
    }

    public final boolean hasNext() {
        return this.f18857f < this.f18858o.f18976f.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f18857f;
        if (i < this.f18858o.f18976f.length()) {
            this.f18857f = i + 1;
            return new C7018u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
