package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.y */
final class C8081y extends AbstractSet<Map.Entry> {

    /* renamed from: f */
    final /* synthetic */ C7822e0 f21976f;

    C8081y(C7822e0 e0Var) {
        this.f21976f = e0Var;
    }

    public final void clear() {
        this.f21976f.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map j = this.f21976f.mo21294j();
        if (j != null) {
            return j.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int b = this.f21976f.m27941p(entry.getKey());
            return b != -1 && C8080xb.m28291a(this.f21976f.f21331r[b], entry.getValue());
        }
    }

    public final Iterator<Map.Entry> iterator() {
        C7822e0 e0Var = this.f21976f;
        Map j = e0Var.mo21294j();
        return j != null ? j.entrySet().iterator() : new C8055w(e0Var);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map j = this.f21976f.mo21294j();
        if (j != null) {
            return j.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f21976f.mo21299n()) {
            return false;
        }
        int c = this.f21976f.m27940o();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object i = this.f21976f.f21328o;
        C7822e0 e0Var = this.f21976f;
        int b = C7835f0.m27986b(key, value, c, i, e0Var.f21329p, e0Var.f21330q, e0Var.f21331r);
        if (b == -1) {
            return false;
        }
        this.f21976f.mo21298m(b, c);
        C7822e0.m27936d(this.f21976f);
        this.f21976f.mo21295k();
        return true;
    }

    public final int size() {
        return this.f21976f.size();
    }
}
