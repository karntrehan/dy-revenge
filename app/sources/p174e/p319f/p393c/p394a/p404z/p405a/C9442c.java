package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.z.a.c */
abstract class C9442c<E> extends AbstractList<E> implements C9431b0.C9440i<E> {

    /* renamed from: f */
    private boolean f25310f = true;

    C9442c() {
    }

    public boolean add(E e) {
        mo23514b();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo23514b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo23514b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23514b() {
        if (!this.f25310f) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo23514b();
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

    /* renamed from: l */
    public final void mo23511l() {
        this.f25310f = false;
    }

    public boolean remove(Object obj) {
        mo23514b();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo23514b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo23514b();
        return super.retainAll(collection);
    }

    /* renamed from: y */
    public boolean mo23512y() {
        return this.f25310f;
    }
}
