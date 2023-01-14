package p455g.p460t;

import java.util.Iterator;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.t.y */
public abstract class C10364y implements Iterator<Integer>, C10445a {
    /* renamed from: b */
    public abstract int mo25557b();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo25557b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
