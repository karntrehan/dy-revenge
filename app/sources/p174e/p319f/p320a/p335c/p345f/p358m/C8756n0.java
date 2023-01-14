package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.m.n0 */
public abstract class C8756n0<E> extends C8691i0<E> implements List<E>, RandomAccess {

    /* renamed from: o */
    private static final C8718k1<Object> f23929o = new C8730l0(C8640e1.f23673p, 0);

    C8756n0() {
    }

    /* renamed from: o */
    public static <E> C8717k0<E> m29569o() {
        return new C8717k0<>(4);
    }

    /* renamed from: p */
    static <E> C8756n0<E> m29570p(Object[] objArr, int i) {
        return i == 0 ? C8640e1.f23673p : new C8640e1(objArr, i);
    }

    /* renamed from: r */
    public static <E> C8756n0<E> m29571r(E e, E e2) {
        int i = 0;
        Object[] objArr = {e, e2};
        while (i < 2) {
            if (objArr[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return m29570p(objArr, 2);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo22384b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C8832sb.m29687a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C8832sb.m29687a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: k */
    public C8756n0<E> subList(int i, int i2) {
        C8599b.m29380c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C8640e1.f23673p : new C8743m0(this, i, i3);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public final C8718k1<E> listIterator(int i) {
        C8599b.m29379b(i, size(), "index");
        return isEmpty() ? f23929o : new C8730l0(this, i);
    }
}
