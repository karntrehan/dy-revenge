package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.f0 */
class C7228f0 extends C7198d0 implements List {

    /* renamed from: s */
    final /* synthetic */ C7243g0 f19271s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7228f0(@NullableDecl C7243g0 g0Var, Object obj, @NullableDecl List list, C7198d0 d0Var) {
        super(g0Var, obj, list, d0Var);
        this.f19271s = g0Var;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f19225o.isEmpty();
        ((List) this.f19225o).add(i, obj);
        C7243g0.m27274i(this.f19271s);
        if (isEmpty) {
            mo20620b();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f19225o).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        C7243g0.m27276k(this.f19271s, this.f19225o.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo20620b();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.f19225o).get(i);
    }

    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f19225o).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f19225o).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new C7213e0(this);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new C7213e0(this, i);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f19225o).remove(i);
        C7243g0.m27275j(this.f19271s);
        mo20625g();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f19225o).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        C7243g0 g0Var = this.f19271s;
        Object obj = this.f19224f;
        List subList = ((List) this.f19225o).subList(i, i2);
        C7198d0 d0Var = this.f19226p;
        if (d0Var == null) {
            d0Var = this;
        }
        return g0Var.mo20726n(obj, subList, d0Var);
    }
}
