package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.db */
final class C6755db extends AbstractSet {

    /* renamed from: f */
    final /* synthetic */ C6789fb f18437f;

    /* synthetic */ C6755db(C6789fb fbVar, C6738cb cbVar) {
        this.f18437f = fbVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f18437f.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f18437f.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f18437f.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new C6721bb(this.f18437f, (C6704ab) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f18437f.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f18437f.size();
    }
}
