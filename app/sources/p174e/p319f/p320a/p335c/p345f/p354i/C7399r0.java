package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.r0 */
final class C7399r0 extends C7258h0 {
    @NullableDecl

    /* renamed from: f */
    private final Object f19884f;

    /* renamed from: o */
    private int f19885o;

    /* renamed from: p */
    final /* synthetic */ C7427t0 f19886p;

    C7399r0(C7427t0 t0Var, int i) {
        this.f19886p = t0Var;
        this.f19884f = t0Var.f19965q[i];
        this.f19885o = i;
    }

    /* renamed from: a */
    private final void m27428a() {
        int i = this.f19885o;
        if (i == -1 || i >= this.f19886p.size() || !C7342n.m27360a(this.f19884f, this.f19886p.f19965q[this.f19885o])) {
            this.f19885o = this.f19886p.m27487p(this.f19884f);
        }
    }

    @NullableDecl
    public final Object getKey() {
        return this.f19884f;
    }

    @NullableDecl
    public final Object getValue() {
        Map j = this.f19886p.mo20924j();
        if (j != null) {
            return j.get(this.f19884f);
        }
        m27428a();
        int i = this.f19885o;
        if (i == -1) {
            return null;
        }
        return this.f19886p.f19966r[i];
    }

    public final Object setValue(Object obj) {
        Map j = this.f19886p.mo20924j();
        if (j != null) {
            return j.put(this.f19884f, obj);
        }
        m27428a();
        int i = this.f19885o;
        if (i == -1) {
            this.f19886p.put(this.f19884f, obj);
            return null;
        }
        Object[] objArr = this.f19886p.f19966r;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
