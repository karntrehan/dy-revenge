package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.m */
class C8742m extends AbstractCollection {
    @NullableDecl

    /* renamed from: f */
    final Object f23886f;

    /* renamed from: o */
    Collection f23887o;
    @NullableDecl

    /* renamed from: p */
    final C8742m f23888p;
    @NullableDecl

    /* renamed from: q */
    final Collection f23889q;

    /* renamed from: r */
    final /* synthetic */ C8781p f23890r;

    C8742m(@NullableDecl C8781p pVar, Object obj, @NullableDecl Collection collection, C8742m mVar) {
        this.f23890r = pVar;
        this.f23886f = obj;
        this.f23887o = collection;
        this.f23888p = mVar;
        this.f23889q = mVar == null ? null : mVar.f23887o;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f23887o.isEmpty();
        boolean add = this.f23887o.add(obj);
        if (!add) {
            return add;
        }
        C8781p.m29591i(this.f23890r);
        if (!isEmpty) {
            return add;
        }
        mo22524b();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f23887o.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        C8781p.m29593k(this.f23890r, this.f23887o.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo22524b();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22524b() {
        C8742m mVar = this.f23888p;
        if (mVar != null) {
            mVar.mo22524b();
        } else {
            this.f23890r.f23986p.put(this.f23886f, this.f23887o);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f23887o.clear();
            C8781p.m29594l(this.f23890r, size);
            mo22529g();
        }
    }

    public final boolean contains(Object obj) {
        zzb();
        return this.f23887o.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        zzb();
        return this.f23887o.containsAll(collection);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f23887o.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo22529g() {
        C8742m mVar = this.f23888p;
        if (mVar != null) {
            mVar.mo22529g();
        } else if (this.f23887o.isEmpty()) {
            this.f23890r.f23986p.remove(this.f23886f);
        }
    }

    public final int hashCode() {
        zzb();
        return this.f23887o.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new C8729l(this);
    }

    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f23887o.remove(obj);
        if (remove) {
            C8781p.m29592j(this.f23890r);
            mo22529g();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f23887o.removeAll(collection);
        if (removeAll) {
            C8781p.m29593k(this.f23890r, this.f23887o.size() - size);
            mo22529g();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f23887o.retainAll(collection);
        if (retainAll) {
            C8781p.m29593k(this.f23890r, this.f23887o.size() - size);
            mo22529g();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.f23887o.size();
    }

    public final String toString() {
        zzb();
        return this.f23887o.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        C8742m mVar = this.f23888p;
        if (mVar != null) {
            mVar.zzb();
            if (this.f23888p.f23887o != this.f23889q) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f23887o.isEmpty() && (collection = (Collection) this.f23890r.f23986p.get(this.f23886f)) != null) {
            this.f23887o = collection;
        }
    }
}
