package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.c0 */
final class C7796c0 extends C7990r {
    @NullableDecl

    /* renamed from: f */
    private final Object f21256f;

    /* renamed from: o */
    private int f21257o;

    /* renamed from: p */
    final /* synthetic */ C7822e0 f21258p;

    C7796c0(C7822e0 e0Var, int i) {
        this.f21258p = e0Var;
        this.f21256f = e0Var.f21330q[i];
        this.f21257o = i;
    }

    /* renamed from: a */
    private final void m27873a() {
        int i = this.f21257o;
        if (i == -1 || i >= this.f21258p.size() || !C8080xb.m28291a(this.f21256f, this.f21258p.f21330q[this.f21257o])) {
            this.f21257o = this.f21258p.m27941p(this.f21256f);
        }
    }

    @NullableDecl
    public final Object getKey() {
        return this.f21256f;
    }

    @NullableDecl
    public final Object getValue() {
        Map j = this.f21258p.mo21294j();
        if (j != null) {
            return j.get(this.f21256f);
        }
        m27873a();
        int i = this.f21257o;
        if (i == -1) {
            return null;
        }
        return this.f21258p.f21331r[i];
    }

    public final Object setValue(Object obj) {
        Map j = this.f21258p.mo21294j();
        if (j != null) {
            return j.put(this.f21256f, obj);
        }
        m27873a();
        int i = this.f21257o;
        if (i == -1) {
            this.f21258p.put(this.f21256f, obj);
            return null;
        }
        Object[] objArr = this.f21258p.f21331r;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
