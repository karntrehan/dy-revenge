package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.List;
import java.util.ListIterator;

/* renamed from: e.f.a.c.f.k.o */
final class C7951o extends C7925m implements ListIterator {

    /* renamed from: q */
    final /* synthetic */ C7964p f21646q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7951o(C7964p pVar) {
        super(pVar);
        this.f21646q = pVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7951o(C7964p pVar, int i) {
        super(pVar, ((List) pVar.f21616o).listIterator(i));
        this.f21646q = pVar;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f21646q.isEmpty();
        mo21449b();
        ((ListIterator) this.f21584f).add(obj);
        C7977q.m28142i(this.f21646q.f21664s);
        if (isEmpty) {
            this.f21646q.mo21465b();
        }
    }

    public final boolean hasPrevious() {
        mo21449b();
        return ((ListIterator) this.f21584f).hasPrevious();
    }

    public final int nextIndex() {
        mo21449b();
        return ((ListIterator) this.f21584f).nextIndex();
    }

    public final Object previous() {
        mo21449b();
        return ((ListIterator) this.f21584f).previous();
    }

    public final int previousIndex() {
        mo21449b();
        return ((ListIterator) this.f21584f).previousIndex();
    }

    public final void set(Object obj) {
        mo21449b();
        ((ListIterator) this.f21584f).set(obj);
    }
}
