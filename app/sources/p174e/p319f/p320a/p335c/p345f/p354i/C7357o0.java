package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.o0 */
final class C7357o0 extends AbstractSet<Map.Entry> {

    /* renamed from: f */
    final /* synthetic */ C7427t0 f19779f;

    C7357o0(C7427t0 t0Var) {
        this.f19779f = t0Var;
    }

    public final void clear() {
        this.f19779f.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map j = this.f19779f.mo20924j();
        if (j != null) {
            return j.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int b = this.f19779f.m27487p(entry.getKey());
            return b != -1 && C7342n.m27360a(this.f19779f.f19966r[b], entry.getValue());
        }
    }

    public final Iterator<Map.Entry> iterator() {
        C7427t0 t0Var = this.f19779f;
        Map j = t0Var.mo20924j();
        return j != null ? j.entrySet().iterator() : new C7329m0(t0Var);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map j = this.f19779f.mo20924j();
        if (j != null) {
            return j.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f19779f.mo20929n()) {
            return false;
        }
        int c = this.f19779f.m27486o();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object i = this.f19779f.f19963o;
        C7427t0 t0Var = this.f19779f;
        int b = C7441u0.m27515b(key, value, c, i, t0Var.f19964p, t0Var.f19965q, t0Var.f19966r);
        if (b == -1) {
            return false;
        }
        this.f19779f.mo20928m(b, c);
        C7427t0.m27482d(this.f19779f);
        this.f19779f.mo20925k();
        return true;
    }

    public final int size() {
        return this.f19779f.size();
    }
}
