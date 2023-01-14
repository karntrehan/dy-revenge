package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.k.d0 */
final class C7809d0 extends AbstractCollection {

    /* renamed from: f */
    final /* synthetic */ C7822e0 f21290f;

    C7809d0(C7822e0 e0Var) {
        this.f21290f = e0Var;
    }

    public final void clear() {
        this.f21290f.clear();
    }

    public final Iterator iterator() {
        C7822e0 e0Var = this.f21290f;
        Map j = e0Var.mo21294j();
        return j != null ? j.values().iterator() : new C8068x(e0Var);
    }

    public final int size() {
        return this.f21290f.size();
    }
}
