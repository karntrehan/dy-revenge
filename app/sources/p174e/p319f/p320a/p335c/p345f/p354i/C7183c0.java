package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.i.c0 */
class C7183c0 implements Iterator {

    /* renamed from: f */
    final Iterator f19193f;

    /* renamed from: o */
    final Collection f19194o;

    /* renamed from: p */
    final /* synthetic */ C7198d0 f19195p;

    C7183c0(C7198d0 d0Var) {
        this.f19195p = d0Var;
        Collection collection = d0Var.f19225o;
        this.f19194o = collection;
        this.f19193f = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    C7183c0(C7198d0 d0Var, Iterator it) {
        this.f19195p = d0Var;
        this.f19194o = d0Var.f19225o;
        this.f19193f = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20592b() {
        this.f19195p.zzb();
        if (this.f19195p.f19225o != this.f19194o) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo20592b();
        return this.f19193f.hasNext();
    }

    public final Object next() {
        mo20592b();
        return this.f19193f.next();
    }

    public final void remove() {
        this.f19193f.remove();
        C7243g0.m27275j(this.f19195p.f19228r);
        this.f19195p.mo20625g();
    }
}
