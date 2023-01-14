package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.a0 */
final class C8587a0 extends C8794q {
    @NullableDecl

    /* renamed from: f */
    private final Object f23368f;

    /* renamed from: o */
    private int f23369o;

    /* renamed from: p */
    final /* synthetic */ C8626d0 f23370p;

    C8587a0(C8626d0 d0Var, int i) {
        this.f23370p = d0Var;
        this.f23368f = d0Var.f23642q[i];
        this.f23369o = i;
    }

    /* renamed from: a */
    private final void m29362a() {
        int i = this.f23369o;
        if (i == -1 || i >= this.f23370p.size() || !C8832sb.m29687a(this.f23368f, this.f23370p.f23642q[this.f23369o])) {
            this.f23369o = this.f23370p.m29424p(this.f23368f);
        }
    }

    @NullableDecl
    public final Object getKey() {
        return this.f23368f;
    }

    @NullableDecl
    public final Object getValue() {
        Map j = this.f23370p.mo22357j();
        if (j != null) {
            return j.get(this.f23368f);
        }
        m29362a();
        int i = this.f23369o;
        if (i == -1) {
            return null;
        }
        return this.f23370p.f23643r[i];
    }

    public final Object setValue(Object obj) {
        Map j = this.f23370p.mo22357j();
        if (j != null) {
            return j.put(this.f23368f, obj);
        }
        m29362a();
        int i = this.f23369o;
        if (i == -1) {
            this.f23370p.put(this.f23368f, obj);
            return null;
        }
        Object[] objArr = this.f23370p.f23643r;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
