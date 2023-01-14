package p455g.p460t;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;
import p455g.p470y.p472d.C10451f;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.t.x */
public final class C10363x implements Set, Serializable, C10445a {

    /* renamed from: f */
    public static final C10363x f27563f = new C10363x();

    private C10363x() {
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo25746b(Void voidR) {
        C10457l.m35320e(voidR, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo25746b((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C10457l.m35320e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    /* renamed from: g */
    public int mo25751g() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C10360u.f27560f;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo25751g();
    }

    public Object[] toArray() {
        return C10451f.m35311a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C10457l.m35320e(tArr, "array");
        return C10451f.m35312b(this, tArr);
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
