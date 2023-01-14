package p174e.p319f.p320a.p335c.p345f.p355j;

import java.util.List;

/* renamed from: e.f.a.c.f.j.y7 */
final class C7759y7 extends C7768z7 {

    /* renamed from: p */
    final transient int f21009p;

    /* renamed from: q */
    final transient int f21010q;

    /* renamed from: r */
    final /* synthetic */ C7768z7 f21011r;

    C7759y7(C7768z7 z7Var, int i, int i2) {
        this.f21011r = z7Var;
        this.f21009p = i;
        this.f21010q = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo21045g() {
        return this.f21011r.mo21047h() + this.f21009p + this.f21010q;
    }

    public final Object get(int i) {
        C7579f4.m27633a(i, this.f21010q, "index");
        return this.f21011r.get(i + this.f21009p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo21047h() {
        return this.f21011r.mo21047h() + this.f21009p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo21048j() {
        return this.f21011r.mo21048j();
    }

    /* renamed from: k */
    public final C7768z7 mo21196k(int i, int i2) {
        C7579f4.m27635c(i, i2, this.f21010q);
        C7768z7 z7Var = this.f21011r;
        int i3 = this.f21009p;
        return z7Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f21010q;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
