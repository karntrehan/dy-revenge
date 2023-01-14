package p174e.p319f.p320a.p335c.p345f.p358m;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: e.f.a.c.f.m.i0 */
public abstract class C8691i0<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f */
    private static final Object[] f23773f = new Object[0];

    C8691i0() {
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
    public abstract int mo22384b(Object[] objArr, int i);

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract int mo22385g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo22387h();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract Object[] mo22388j();

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
        return toArray(f23773f);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] j = mo22388j();
            if (j != null) {
                return Arrays.copyOfRange(j, mo22387h(), mo22385g(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo22384b(tArr, 0);
        return tArr;
    }
}
