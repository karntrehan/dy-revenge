package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.List;

/* renamed from: e.f.a.c.f.l.p1 */
final class C8390p1 extends C8408q1 {

    /* renamed from: p */
    final transient int f22888p;

    /* renamed from: q */
    final transient int f22889q;

    /* renamed from: r */
    final /* synthetic */ C8408q1 f22890r;

    C8390p1(C8408q1 q1Var, int i, int i2) {
        this.f22890r = q1Var;
        this.f22888p = i;
        this.f22889q = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo21989g() {
        return this.f22890r.mo21990h() + this.f22888p + this.f22889q;
    }

    public final Object get(int i) {
        C8109a1.m28306a(i, this.f22889q, "index");
        return this.f22890r.get(i + this.f22888p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo21990h() {
        return this.f22890r.mo21990h() + this.f22888p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo21991j() {
        return this.f22890r.mo21991j();
    }

    /* renamed from: k */
    public final C8408q1 mo22063k(int i, int i2) {
        C8109a1.m28308c(i, i2, this.f22889q);
        C8408q1 q1Var = this.f22890r;
        int i3 = this.f22888p;
        return q1Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f22889q;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
