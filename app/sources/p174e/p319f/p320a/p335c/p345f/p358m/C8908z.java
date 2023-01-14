package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.z */
final class C8908z extends AbstractSet {

    /* renamed from: f */
    final /* synthetic */ C8626d0 f24247f;

    C8908z(C8626d0 d0Var) {
        this.f24247f = d0Var;
    }

    public final void clear() {
        this.f24247f.clear();
    }

    public final boolean contains(Object obj) {
        return this.f24247f.containsKey(obj);
    }

    public final Iterator iterator() {
        C8626d0 d0Var = this.f24247f;
        Map j = d0Var.mo22357j();
        return j != null ? j.keySet().iterator() : new C8846u(d0Var);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map j = this.f24247f.mo22357j();
        return j != null ? j.keySet().remove(obj) : this.f24247f.m29426r(obj) != C8626d0.f23639f;
    }

    public final int size() {
        return this.f24247f.size();
    }
}
