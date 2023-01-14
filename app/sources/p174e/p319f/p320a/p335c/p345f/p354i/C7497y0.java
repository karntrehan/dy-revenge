package p174e.p319f.p320a.p335c.p345f.p354i;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: e.f.a.c.f.i.y0 */
public abstract class C7497y0<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f */
    private static final Object[] f20149f = new Object[0];

    C7497y0() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo20663b(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo20634g() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo20636h() {
        throw null;
    }

    /* renamed from: j */
    public abstract C7428t1<E> iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Object[] mo20637k() {
        throw null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f20149f);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] k = mo20637k();
            if (k != null) {
                return Arrays.copyOfRange(k, mo20636h(), mo20634g(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo20663b(tArr, 0);
        return tArr;
    }
}
