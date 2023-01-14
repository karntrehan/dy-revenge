package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.List;
import java.util.ListIterator;

/* renamed from: e.f.a.c.f.i.e0 */
final class C7213e0 extends C7183c0 implements ListIterator {

    /* renamed from: q */
    final /* synthetic */ C7228f0 f19253q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7213e0(C7228f0 f0Var) {
        super(f0Var);
        this.f19253q = f0Var;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7213e0(C7228f0 f0Var, int i) {
        super(f0Var, ((List) f0Var.f19225o).listIterator(i));
        this.f19253q = f0Var;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f19253q.isEmpty();
        mo20592b();
        ((ListIterator) this.f19193f).add(obj);
        C7243g0.m27274i(this.f19253q.f19271s);
        if (isEmpty) {
            this.f19253q.mo20620b();
        }
    }

    public final boolean hasPrevious() {
        mo20592b();
        return ((ListIterator) this.f19193f).hasPrevious();
    }

    public final int nextIndex() {
        mo20592b();
        return ((ListIterator) this.f19193f).nextIndex();
    }

    public final Object previous() {
        mo20592b();
        return ((ListIterator) this.f19193f).previous();
    }

    public final int previousIndex() {
        mo20592b();
        return ((ListIterator) this.f19193f).previousIndex();
    }

    public final void set(Object obj) {
        mo20592b();
        ((ListIterator) this.f19193f).set(obj);
    }
}
