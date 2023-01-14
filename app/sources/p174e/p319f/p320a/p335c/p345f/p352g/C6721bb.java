package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.bb */
final class C6721bb implements Iterator {

    /* renamed from: f */
    private int f18389f = -1;

    /* renamed from: o */
    private boolean f18390o;

    /* renamed from: p */
    private Iterator f18391p;

    /* renamed from: q */
    final /* synthetic */ C6789fb f18392q;

    /* synthetic */ C6721bb(C6789fb fbVar, C6704ab abVar) {
        this.f18392q = fbVar;
    }

    /* renamed from: b */
    private final Iterator m25468b() {
        if (this.f18391p == null) {
            this.f18391p = this.f18392q.f18483p.entrySet().iterator();
        }
        return this.f18391p;
    }

    public final boolean hasNext() {
        if (this.f18389f + 1 >= this.f18392q.f18482o.size()) {
            return !this.f18392q.f18483p.isEmpty() && m25468b().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f18390o = true;
        int i = this.f18389f + 1;
        this.f18389f = i;
        return (Map.Entry) (i < this.f18392q.f18482o.size() ? this.f18392q.f18482o.get(this.f18389f) : m25468b().next());
    }

    public final void remove() {
        if (this.f18390o) {
            this.f18390o = false;
            this.f18392q.m25709n();
            if (this.f18389f < this.f18392q.f18482o.size()) {
                C6789fb fbVar = this.f18392q;
                int i = this.f18389f;
                this.f18389f = i - 1;
                Object unused = fbVar.m25707l(i);
                return;
            }
            m25468b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
