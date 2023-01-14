package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.p */
class C7964p extends C7938n implements List {

    /* renamed from: s */
    final /* synthetic */ C7977q f21664s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7964p(@NullableDecl C7977q qVar, Object obj, @NullableDecl List list, C7938n nVar) {
        super(qVar, obj, list, nVar);
        this.f21664s = qVar;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f21616o.isEmpty();
        ((List) this.f21616o).add(i, obj);
        C7977q.m28142i(this.f21664s);
        if (isEmpty) {
            mo21465b();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f21616o).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        C7977q.m28144k(this.f21664s, this.f21616o.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo21465b();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.f21616o).get(i);
    }

    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f21616o).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f21616o).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new C7951o(this);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new C7951o(this, i);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f21616o).remove(i);
        C7977q.m28143j(this.f21664s);
        mo21470g();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f21616o).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        C7977q qVar = this.f21664s;
        Object obj = this.f21615f;
        List subList = ((List) this.f21616o).subList(i, i2);
        C7938n nVar = this.f21617p;
        if (nVar == null) {
            nVar = this;
        }
        return qVar.mo21541n(obj, subList, nVar);
    }
}
