package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.ob */
public final class C6934ob extends AbstractList implements RandomAccess, C6916n9 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6916n9 f18744f;

    public C6934ob(C6916n9 n9Var) {
        this.f18744f = n9Var;
    }

    /* renamed from: c */
    public final C6916n9 mo19953c() {
        return this;
    }

    /* renamed from: d */
    public final List mo19954d() {
        return this.f18744f.mo19954d();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C6900m9) this.f18744f).get(i);
    }

    /* renamed from: i */
    public final Object mo19957i(int i) {
        return this.f18744f.mo19957i(i);
    }

    public final Iterator iterator() {
        return new C6918nb(this);
    }

    public final ListIterator listIterator(int i) {
        return new C6902mb(this, i);
    }

    public final int size() {
        return this.f18744f.size();
    }

    /* renamed from: t */
    public final void mo19960t(C7106z7 z7Var) {
        throw new UnsupportedOperationException();
    }
}
