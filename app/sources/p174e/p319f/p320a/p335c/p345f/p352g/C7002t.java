package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.g.t */
final class C7002t implements Iterator {

    /* renamed from: f */
    private int f18944f = 0;

    /* renamed from: o */
    final /* synthetic */ C7018u f18945o;

    C7002t(C7018u uVar) {
        this.f18945o = uVar;
    }

    public final boolean hasNext() {
        return this.f18944f < this.f18945o.f18976f.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f18944f;
        C7018u uVar = this.f18945o;
        if (i < uVar.f18976f.length()) {
            String k = uVar.f18976f;
            this.f18944f = i + 1;
            return new C7018u(String.valueOf(k.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
