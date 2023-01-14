package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.d0 */
class C7198d0 extends AbstractCollection {
    @NullableDecl

    /* renamed from: f */
    final Object f19224f;

    /* renamed from: o */
    Collection f19225o;
    @NullableDecl

    /* renamed from: p */
    final C7198d0 f19226p;
    @NullableDecl

    /* renamed from: q */
    final Collection f19227q;

    /* renamed from: r */
    final /* synthetic */ C7243g0 f19228r;

    C7198d0(@NullableDecl C7243g0 g0Var, Object obj, @NullableDecl Collection collection, C7198d0 d0Var) {
        this.f19228r = g0Var;
        this.f19224f = obj;
        this.f19225o = collection;
        this.f19226p = d0Var;
        this.f19227q = d0Var == null ? null : d0Var.f19225o;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f19225o.isEmpty();
        boolean add = this.f19225o.add(obj);
        if (!add) {
            return add;
        }
        C7243g0.m27274i(this.f19228r);
        if (!isEmpty) {
            return add;
        }
        mo20620b();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f19225o.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        C7243g0.m27276k(this.f19228r, this.f19225o.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo20620b();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20620b() {
        C7198d0 d0Var = this.f19226p;
        if (d0Var != null) {
            d0Var.mo20620b();
        } else {
            this.f19228r.f19307p.put(this.f19224f, this.f19225o);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f19225o.clear();
            C7243g0.m27277l(this.f19228r, size);
            mo20625g();
        }
    }

    public final boolean contains(Object obj) {
        zzb();
        return this.f19225o.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        zzb();
        return this.f19225o.containsAll(collection);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f19225o.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo20625g() {
        C7198d0 d0Var = this.f19226p;
        if (d0Var != null) {
            d0Var.mo20625g();
        } else if (this.f19225o.isEmpty()) {
            this.f19228r.f19307p.remove(this.f19224f);
        }
    }

    public final int hashCode() {
        zzb();
        return this.f19225o.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new C7183c0(this);
    }

    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f19225o.remove(obj);
        if (remove) {
            C7243g0.m27275j(this.f19228r);
            mo20625g();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f19225o.removeAll(collection);
        if (removeAll) {
            C7243g0.m27276k(this.f19228r, this.f19225o.size() - size);
            mo20625g();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f19225o.retainAll(collection);
        if (retainAll) {
            C7243g0.m27276k(this.f19228r, this.f19225o.size() - size);
            mo20625g();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.f19225o.size();
    }

    public final String toString() {
        zzb();
        return this.f19225o.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        C7198d0 d0Var = this.f19226p;
        if (d0Var != null) {
            d0Var.zzb();
            if (this.f19226p.f19225o != this.f19227q) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f19225o.isEmpty() && (collection = (Collection) this.f19228r.f19307p.get(this.f19224f)) != null) {
            this.f19225o = collection;
        }
    }
}
