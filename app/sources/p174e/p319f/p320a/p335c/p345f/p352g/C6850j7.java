package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.j7 */
abstract class C6850j7 extends AbstractList implements C6804g9 {

    /* renamed from: f */
    private boolean f18549f = true;

    C6850j7() {
    }

    /* renamed from: a */
    public final boolean mo19801a() {
        return this.f18549f;
    }

    public boolean add(Object obj) {
        mo19878b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo19878b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        mo19878b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo19878b() {
        if (!this.f18549f) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo19878b();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        mo19878b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo19878b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo19878b();
        return super.retainAll(collection);
    }

    public final void zzb() {
        this.f18549f = false;
    }
}
