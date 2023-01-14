package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.a0 */
final class C7770a0 extends AbstractSet {

    /* renamed from: f */
    final /* synthetic */ C7822e0 f21033f;

    C7770a0(C7822e0 e0Var) {
        this.f21033f = e0Var;
    }

    public final void clear() {
        this.f21033f.clear();
    }

    public final boolean contains(Object obj) {
        return this.f21033f.containsKey(obj);
    }

    public final Iterator iterator() {
        C7822e0 e0Var = this.f21033f;
        Map j = e0Var.mo21294j();
        return j != null ? j.keySet().iterator() : new C8042v(e0Var);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map j = this.f21033f.mo21294j();
        return j != null ? j.keySet().remove(obj) : this.f21033f.m27943r(obj) != C7822e0.f21327f;
    }

    public final int size() {
        return this.f21033f.size();
    }
}
