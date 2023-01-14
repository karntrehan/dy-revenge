package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.x */
final class C8884x extends AbstractSet<Map.Entry> {

    /* renamed from: f */
    final /* synthetic */ C8626d0 f24196f;

    C8884x(C8626d0 d0Var) {
        this.f24196f = d0Var;
    }

    public final void clear() {
        this.f24196f.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map j = this.f24196f.mo22357j();
        if (j != null) {
            return j.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int b = this.f24196f.m29424p(entry.getKey());
            return b != -1 && C8832sb.m29687a(this.f24196f.f23643r[b], entry.getValue());
        }
    }

    public final Iterator<Map.Entry> iterator() {
        C8626d0 d0Var = this.f24196f;
        Map j = d0Var.mo22357j();
        return j != null ? j.entrySet().iterator() : new C8859v(d0Var);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map j = this.f24196f.mo22357j();
        if (j != null) {
            return j.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f24196f.mo22362n()) {
            return false;
        }
        int c = this.f24196f.m29423o();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object i = this.f24196f.f23640o;
        C8626d0 d0Var = this.f24196f;
        int b = C8639e0.m29446b(key, value, c, i, d0Var.f23641p, d0Var.f23642q, d0Var.f23643r);
        if (b == -1) {
            return false;
        }
        this.f24196f.mo22361m(b, c);
        C8626d0.m29419d(this.f24196f);
        this.f24196f.mo22358k();
        return true;
    }

    public final int size() {
        return this.f24196f.size();
    }
}
