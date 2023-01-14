package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.m.c0 */
final class C8613c0 extends AbstractCollection {

    /* renamed from: f */
    final /* synthetic */ C8626d0 f23598f;

    C8613c0(C8626d0 d0Var) {
        this.f23598f = d0Var;
    }

    public final void clear() {
        this.f23598f.clear();
    }

    public final Iterator iterator() {
        C8626d0 d0Var = this.f23598f;
        Map j = d0Var.mo22357j();
        return j != null ? j.values().iterator() : new C8872w(d0Var);
    }

    public final int size() {
        return this.f23598f.size();
    }
}
