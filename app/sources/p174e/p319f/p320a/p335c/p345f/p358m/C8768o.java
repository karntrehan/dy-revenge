package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.o */
class C8768o extends C8742m implements List {

    /* renamed from: s */
    final /* synthetic */ C8781p f23957s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8768o(@NullableDecl C8781p pVar, Object obj, @NullableDecl List list, C8742m mVar) {
        super(pVar, obj, list, mVar);
        this.f23957s = pVar;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f23887o.isEmpty();
        ((List) this.f23887o).add(i, obj);
        C8781p.m29591i(this.f23957s);
        if (isEmpty) {
            mo22524b();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f23887o).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        C8781p.m29593k(this.f23957s, this.f23887o.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo22524b();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.f23887o).get(i);
    }

    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f23887o).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f23887o).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new C8755n(this);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new C8755n(this, i);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f23887o).remove(i);
        C8781p.m29592j(this.f23957s);
        mo22529g();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f23887o).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        C8781p pVar = this.f23957s;
        Object obj = this.f23886f;
        List subList = ((List) this.f23887o).subList(i, i2);
        C8742m mVar = this.f23888p;
        if (mVar == null) {
            mVar = this;
        }
        return pVar.mo22593n(obj, subList, mVar);
    }
}
