package p455g.p460t;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.t.b */
public abstract class C10327b<E> extends C10324a<E> implements List<E>, C10445a {

    /* renamed from: f */
    public static final C10328a f27549f = new C10328a((C10452g) null);

    /* renamed from: g.t.b$a */
    public static final class C10328a {
        private C10328a() {
        }

        public /* synthetic */ C10328a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo25650a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo25651b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void mo25652c(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: d */
        public final boolean mo25653d(Collection<?> collection, Collection<?> collection2) {
            C10457l.m35320e(collection, "c");
            C10457l.m35320e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object a : collection) {
                if (!C10457l.m35316a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int mo25654e(Collection<?> collection) {
            C10457l.m35320e(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }
    }

    /* renamed from: g.t.b$b */
    private class C10329b implements Iterator<E>, C10445a {

        /* renamed from: f */
        private int f27550f;

        public C10329b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo25655b() {
            return this.f27550f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo25656c(int i) {
            this.f27550f = i;
        }

        public boolean hasNext() {
            return this.f27550f < C10327b.this.size();
        }

        public E next() {
            if (hasNext()) {
                C10327b<E> bVar = C10327b.this;
                int i = this.f27550f;
                this.f27550f = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: g.t.b$c */
    private class C10330c extends C10327b<E>.b implements ListIterator<E>, C10445a {
        public C10330c(int i) {
            super();
            C10327b.f27549f.mo25651b(i, C10327b.this.size());
            mo25656c(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo25655b() > 0;
        }

        public int nextIndex() {
            return mo25655b();
        }

        public E previous() {
            if (hasPrevious()) {
                C10327b<E> bVar = C10327b.this;
                mo25656c(mo25655b() - 1);
                return bVar.get(mo25655b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo25655b() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: g.t.b$d */
    private static final class C10331d<E> extends C10327b<E> implements RandomAccess {

        /* renamed from: o */
        private final C10327b<E> f27553o;

        /* renamed from: p */
        private final int f27554p;

        /* renamed from: q */
        private int f27555q;

        public C10331d(C10327b<? extends E> bVar, int i, int i2) {
            C10457l.m35320e(bVar, "list");
            this.f27553o = bVar;
            this.f27554p = i;
            C10327b.f27549f.mo25652c(i, i2, bVar.size());
            this.f27555q = i2 - i;
        }

        /* renamed from: b */
        public int mo25624b() {
            return this.f27555q;
        }

        public E get(int i) {
            C10327b.f27549f.mo25650a(i, this.f27555q);
            return this.f27553o.get(this.f27554p + i);
        }
    }

    protected C10327b() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f27549f.mo25653d(this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f27549f.mo25654e(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object a : this) {
            if (C10457l.m35316a(a, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C10329b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C10457l.m35316a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C10330c(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new C10330c(i);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C10331d(this, i, i2);
    }
}
