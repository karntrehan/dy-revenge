package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.List;

/* renamed from: e.f.a.c.f.k.n0 */
final class C7939n0 extends C7952o0 {

    /* renamed from: p */
    final transient int f21620p;

    /* renamed from: q */
    final transient int f21621q;

    /* renamed from: r */
    final /* synthetic */ C7952o0 f21622r;

    C7939n0(C7952o0 o0Var, int i, int i2) {
        this.f21622r = o0Var;
        this.f21620p = i;
        this.f21621q = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo21409g() {
        return this.f21622r.mo21410h() + this.f21620p + this.f21621q;
    }

    public final Object get(int i) {
        C7795c.m27868a(i, this.f21621q, "index");
        return this.f21622r.get(i + this.f21620p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo21410h() {
        return this.f21622r.mo21410h() + this.f21620p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo21411j() {
        return this.f21622r.mo21411j();
    }

    /* renamed from: k */
    public final C7952o0 mo21480k(int i, int i2) {
        C7795c.m27870c(i, i2, this.f21621q);
        C7952o0 o0Var = this.f21622r;
        int i3 = this.f21620p;
        return o0Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f21621q;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
