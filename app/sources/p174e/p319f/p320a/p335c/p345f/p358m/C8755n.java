package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.List;
import java.util.ListIterator;

/* renamed from: e.f.a.c.f.m.n */
final class C8755n extends C8729l implements ListIterator {

    /* renamed from: q */
    final /* synthetic */ C8768o f23928q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8755n(C8768o oVar) {
        super(oVar);
        this.f23928q = oVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8755n(C8768o oVar, int i) {
        super(oVar, ((List) oVar.f23887o).listIterator(i));
        this.f23928q = oVar;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f23928q.isEmpty();
        mo22511b();
        ((ListIterator) this.f23863f).add(obj);
        C8781p.m29591i(this.f23928q.f23957s);
        if (isEmpty) {
            this.f23928q.mo22524b();
        }
    }

    public final boolean hasPrevious() {
        mo22511b();
        return ((ListIterator) this.f23863f).hasPrevious();
    }

    public final int nextIndex() {
        mo22511b();
        return ((ListIterator) this.f23863f).nextIndex();
    }

    public final Object previous() {
        mo22511b();
        return ((ListIterator) this.f23863f).previous();
    }

    public final int previousIndex() {
        mo22511b();
        return ((ListIterator) this.f23863f).previousIndex();
    }

    public final void set(Object obj) {
        mo22511b();
        ((ListIterator) this.f23863f).set(obj);
    }
}
