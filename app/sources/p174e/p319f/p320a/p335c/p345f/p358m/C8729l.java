package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.m.l */
class C8729l implements Iterator {

    /* renamed from: f */
    final Iterator f23863f;

    /* renamed from: o */
    final Collection f23864o;

    /* renamed from: p */
    final /* synthetic */ C8742m f23865p;

    C8729l(C8742m mVar) {
        this.f23865p = mVar;
        Collection collection = mVar.f23887o;
        this.f23864o = collection;
        this.f23863f = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    C8729l(C8742m mVar, Iterator it) {
        this.f23865p = mVar;
        this.f23864o = mVar.f23887o;
        this.f23863f = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22511b() {
        this.f23865p.zzb();
        if (this.f23865p.f23887o != this.f23864o) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo22511b();
        return this.f23863f.hasNext();
    }

    public final Object next() {
        mo22511b();
        return this.f23863f.next();
    }

    public final void remove() {
        this.f23863f.remove();
        C8781p.m29592j(this.f23865p.f23890r);
        this.f23865p.mo22529g();
    }
}
