package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.l.ef */
final class C8199ef extends AbstractSet<Map.Entry> {

    /* renamed from: f */
    final /* synthetic */ C8218ff f22285f;

    /* synthetic */ C8199ef(C8218ff ffVar, C8565ye yeVar) {
        this.f22285f = ffVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f22285f.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f22285f.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f22285f.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new C8180df(this.f22285f, (C8565ye) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f22285f.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f22285f.size();
    }
}
