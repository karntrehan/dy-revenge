package p455g.p460t;

import java.util.Collection;
import java.util.Iterator;
import p455g.p470y.p472d.C10444b;
import p455g.p470y.p472d.C10451f;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.t.c */
final class C10333c<T> implements Collection<T>, C10445a {

    /* renamed from: f */
    private final T[] f27556f;

    /* renamed from: o */
    private final boolean f27557o;

    public C10333c(T[] tArr, boolean z) {
        C10457l.m35320e(tArr, "values");
        this.f27556f = tArr;
        this.f27557o = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo25668b() {
        return this.f27556f.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C10343h.m35084o(this.f27556f, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C10457l.m35320e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f27556f.length == 0;
    }

    public Iterator<T> iterator() {
        return C10444b.m35304a(this.f27556f);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo25668b();
    }

    public final Object[] toArray() {
        return C10349k.m35132a(this.f27556f, this.f27557o);
    }

    public <T> T[] toArray(T[] tArr) {
        C10457l.m35320e(tArr, "array");
        return C10451f.m35312b(this, tArr);
    }
}
