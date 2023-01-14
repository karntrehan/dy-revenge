package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.i.s0 */
final class C7413s0 extends AbstractCollection {

    /* renamed from: f */
    final /* synthetic */ C7427t0 f19914f;

    C7413s0(C7427t0 t0Var) {
        this.f19914f = t0Var;
    }

    public final void clear() {
        this.f19914f.clear();
    }

    public final Iterator iterator() {
        C7427t0 t0Var = this.f19914f;
        Map j = t0Var.mo20924j();
        return j != null ? j.values().iterator() : new C7343n0(t0Var);
    }

    public final int size() {
        return this.f19914f.size();
    }
}
