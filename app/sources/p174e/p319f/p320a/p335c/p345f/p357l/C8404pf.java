package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.pf */
public final class C8404pf extends AbstractList<String> implements RandomAccess, C8456sd {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C8456sd f22910f;

    public C8404pf(C8456sd sdVar) {
        this.f22910f = sdVar;
    }

    /* renamed from: c */
    public final C8456sd mo22071c() {
        return this;
    }

    /* renamed from: d */
    public final List<?> mo22072d() {
        return this.f22910f.mo22072d();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C8438rd) this.f22910f).get(i);
    }

    /* renamed from: i */
    public final Object mo22074i(int i) {
        return this.f22910f.mo22074i(i);
    }

    public final Iterator<String> iterator() {
        return new C8368nf(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C8350mf(this, i);
    }

    public final int size() {
        return this.f22910f.size();
    }
}
