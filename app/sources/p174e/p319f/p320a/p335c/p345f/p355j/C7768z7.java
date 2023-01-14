package p174e.p319f.p320a.p335c.p345f.p355j;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.j.z7 */
public abstract class C7768z7<E> extends C7732v7<E> implements List<E>, RandomAccess {

    /* renamed from: o */
    private static final C7553c8<Object> f21030o = new C7750x7(C7533a8.f20271p, 0);

    C7768z7() {
    }

    /* renamed from: o */
    static <E> C7768z7<E> m27840o(Object[] objArr, int i) {
        return i == 0 ? C7533a8.f20271p : new C7533a8(objArr, i);
    }

    /* renamed from: p */
    public static <E> C7768z7<E> m27841p(E e) {
        int i = 0;
        Object[] objArr = {e};
        while (i <= 0) {
            if (objArr[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return m27840o(objArr, 1);
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
    public int mo21044b(Object[] objArr, int i) {
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
                        if (C7535b0.m27602a(get(i), list.get(i))) {
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
                            if (!C7535b0.m27602a(it.next(), it2.next())) {
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
    public C7768z7<E> subList(int i, int i2) {
        C7579f4.m27635c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C7533a8.f20271p : new C7759y7(this, i, i3);
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

    /* renamed from: r */
    public final C7553c8<E> listIterator(int i) {
        C7579f4.m27634b(i, size(), "index");
        return isEmpty() ? f21030o : new C7750x7(this, i);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
