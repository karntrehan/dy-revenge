package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.ob */
abstract class C8382ob<E> extends AbstractList<E> implements C8292jd<E> {

    /* renamed from: f */
    private boolean f22870f = true;

    C8382ob() {
    }

    /* renamed from: a */
    public final boolean mo21893a() {
        return this.f22870f;
    }

    public boolean add(E e) {
        mo22053b();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo22053b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo22053b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22053b() {
        if (!this.f22870f) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo22053b();
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

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo22053b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo22053b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo22053b();
        return super.retainAll(collection);
    }

    public final void zzb() {
        this.f22870f = false;
    }
}
