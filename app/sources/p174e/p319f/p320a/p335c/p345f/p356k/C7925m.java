package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.k.m */
class C7925m implements Iterator {

    /* renamed from: f */
    final Iterator f21584f;

    /* renamed from: o */
    final Collection f21585o;

    /* renamed from: p */
    final /* synthetic */ C7938n f21586p;

    C7925m(C7938n nVar) {
        this.f21586p = nVar;
        Collection collection = nVar.f21616o;
        this.f21585o = collection;
        this.f21584f = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    C7925m(C7938n nVar, Iterator it) {
        this.f21586p = nVar;
        this.f21585o = nVar.f21616o;
        this.f21584f = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo21449b() {
        this.f21586p.zzb();
        if (this.f21586p.f21616o != this.f21585o) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo21449b();
        return this.f21584f.hasNext();
    }

    public final Object next() {
        mo21449b();
        return this.f21584f.next();
    }

    public final void remove() {
        this.f21584f.remove();
        C7977q.m28143j(this.f21586p.f21619r);
        this.f21586p.mo21470g();
    }
}
