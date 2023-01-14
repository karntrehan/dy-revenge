package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.l.df */
final class C8180df implements Iterator<Map.Entry> {

    /* renamed from: f */
    private int f22207f = -1;

    /* renamed from: o */
    private boolean f22208o;

    /* renamed from: p */
    private Iterator<Map.Entry> f22209p;

    /* renamed from: q */
    final /* synthetic */ C8218ff f22210q;

    /* synthetic */ C8180df(C8218ff ffVar, C8565ye yeVar) {
        this.f22210q = ffVar;
    }

    /* renamed from: b */
    private final Iterator<Map.Entry> m28434b() {
        if (this.f22209p == null) {
            this.f22209p = this.f22210q.f22506p.entrySet().iterator();
        }
        return this.f22209p;
    }

    public final boolean hasNext() {
        if (this.f22207f + 1 >= this.f22210q.f22505o.size()) {
            return !this.f22210q.f22506p.isEmpty() && m28434b().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f22208o = true;
        int i = this.f22207f + 1;
        this.f22207f = i;
        return (Map.Entry) (i < this.f22210q.f22505o.size() ? this.f22210q.f22505o.get(this.f22207f) : m28434b().next());
    }

    public final void remove() {
        if (this.f22208o) {
            this.f22208o = false;
            this.f22210q.m28511n();
            if (this.f22207f < this.f22210q.f22505o.size()) {
                C8218ff ffVar = this.f22210q;
                int i = this.f22207f;
                this.f22207f = i - 1;
                Object unused = ffVar.m28509l(i);
                return;
            }
            m28434b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
