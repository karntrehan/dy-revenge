package p455g.p460t;

import java.util.Collection;
import java.util.Iterator;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10451f;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.t.a */
public abstract class C10324a<E> implements Collection<E>, C10445a {

    /* renamed from: g.t.a$a */
    static final class C10325a extends C10458m implements C10430l<E, CharSequence> {

        /* renamed from: f */
        final /* synthetic */ C10324a<E> f27548f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10325a(C10324a<? extends E> aVar) {
            super(1);
            this.f27548f = aVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(E e) {
            return e == this.f27548f ? "(this Collection)" : String.valueOf(e);
        }
    }

    protected C10324a() {
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int mo25624b();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C10457l.m35316a(a, e)) {
                return true;
            }
        }
        return false;
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
        return size() == 0;
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
        return mo25624b();
    }

    public Object[] toArray() {
        return C10451f.m35311a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C10457l.m35320e(tArr, "array");
        T[] b = C10451f.m35312b(this, tArr);
        C10457l.m35318c(b, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return b;
    }

    public String toString() {
        return C10358t.m35161H(this, ", ", "[", "]", 0, (CharSequence) null, new C10325a(this), 24, (Object) null);
    }
}
