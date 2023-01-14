package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.n */
class C7938n extends AbstractCollection {
    @NullableDecl

    /* renamed from: f */
    final Object f21615f;

    /* renamed from: o */
    Collection f21616o;
    @NullableDecl

    /* renamed from: p */
    final C7938n f21617p;
    @NullableDecl

    /* renamed from: q */
    final Collection f21618q;

    /* renamed from: r */
    final /* synthetic */ C7977q f21619r;

    C7938n(@NullableDecl C7977q qVar, Object obj, @NullableDecl Collection collection, C7938n nVar) {
        this.f21619r = qVar;
        this.f21615f = obj;
        this.f21616o = collection;
        this.f21617p = nVar;
        this.f21618q = nVar == null ? null : nVar.f21616o;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f21616o.isEmpty();
        boolean add = this.f21616o.add(obj);
        if (!add) {
            return add;
        }
        C7977q.m28142i(this.f21619r);
        if (!isEmpty) {
            return add;
        }
        mo21465b();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f21616o.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        C7977q.m28144k(this.f21619r, this.f21616o.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo21465b();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo21465b() {
        C7938n nVar = this.f21617p;
        if (nVar != null) {
            nVar.mo21465b();
        } else {
            this.f21619r.f21704p.put(this.f21615f, this.f21616o);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f21616o.clear();
            C7977q.m28145l(this.f21619r, size);
            mo21470g();
        }
    }

    public final boolean contains(Object obj) {
        zzb();
        return this.f21616o.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        zzb();
        return this.f21616o.containsAll(collection);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f21616o.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo21470g() {
        C7938n nVar = this.f21617p;
        if (nVar != null) {
            nVar.mo21470g();
        } else if (this.f21616o.isEmpty()) {
            this.f21619r.f21704p.remove(this.f21615f);
        }
    }

    public final int hashCode() {
        zzb();
        return this.f21616o.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new C7925m(this);
    }

    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f21616o.remove(obj);
        if (remove) {
            C7977q.m28143j(this.f21619r);
            mo21470g();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f21616o.removeAll(collection);
        if (removeAll) {
            C7977q.m28144k(this.f21619r, this.f21616o.size() - size);
            mo21470g();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f21616o.retainAll(collection);
        if (retainAll) {
            C7977q.m28144k(this.f21619r, this.f21616o.size() - size);
            mo21470g();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.f21616o.size();
    }

    public final String toString() {
        zzb();
        return this.f21616o.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        C7938n nVar = this.f21617p;
        if (nVar != null) {
            nVar.zzb();
            if (this.f21617p.f21616o != this.f21618q) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f21616o.isEmpty() && (collection = (Collection) this.f21619r.f21704p.get(this.f21615f)) != null) {
            this.f21616o = collection;
        }
    }
}
