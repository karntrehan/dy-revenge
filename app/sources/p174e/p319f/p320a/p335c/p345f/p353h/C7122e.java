package p174e.p319f.p320a.p335c.p345f.p353h;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.h.e */
public abstract class C7122e<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f */
    private static final Object[] f19095f = new Object[0];

    C7122e() {
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
    public abstract int mo20498b(Object[] objArr, int i);

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract int mo20500g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo20501h();

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: j */
    public abstract Object[] mo20502j();

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
        return toArray(f19095f);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] j = mo20502j();
            if (j != null) {
                return Arrays.copyOfRange(j, mo20501h(), mo20500g(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo20498b(tArr, 0);
        return tArr;
    }
}
