package p174e.p319f.p320a.p335c.p345f.p357l;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: e.f.a.c.f.l.m1 */
public abstract class C8336m1<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f */
    private static final Object[] f22777f = new Object[0];

    C8336m1() {
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
    public abstract int mo21987b(Object[] objArr, int i);

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract int mo21989g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo21990h();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract Object[] mo21991j();

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
        return toArray(f22777f);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] j = mo21991j();
            if (j != null) {
                return Arrays.copyOfRange(j, mo21990h(), mo21989g(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo21987b(tArr, 0);
        return tArr;
    }
}
