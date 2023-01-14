package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.q0 */
final class C7385q0 extends AbstractSet {

    /* renamed from: f */
    final /* synthetic */ C7427t0 f19851f;

    C7385q0(C7427t0 t0Var) {
        this.f19851f = t0Var;
    }

    public final void clear() {
        this.f19851f.clear();
    }

    public final boolean contains(Object obj) {
        return this.f19851f.containsKey(obj);
    }

    public final Iterator iterator() {
        C7427t0 t0Var = this.f19851f;
        Map j = t0Var.mo20924j();
        return j != null ? j.keySet().iterator() : new C7315l0(t0Var);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map j = this.f19851f.mo20924j();
        return j != null ? j.keySet().remove(obj) : this.f19851f.m27489r(obj) != C7427t0.f19962f;
    }

    public final int size() {
        return this.f19851f.size();
    }
}
