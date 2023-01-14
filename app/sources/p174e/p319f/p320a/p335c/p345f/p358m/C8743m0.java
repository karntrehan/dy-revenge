package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.List;

/* renamed from: e.f.a.c.f.m.m0 */
final class C8743m0 extends C8756n0 {

    /* renamed from: p */
    final transient int f23891p;

    /* renamed from: q */
    final transient int f23892q;

    /* renamed from: r */
    final /* synthetic */ C8756n0 f23893r;

    C8743m0(C8756n0 n0Var, int i, int i2) {
        this.f23893r = n0Var;
        this.f23891p = i;
        this.f23892q = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo22385g() {
        return this.f23893r.mo22387h() + this.f23891p + this.f23892q;
    }

    public final Object get(int i) {
        C8599b.m29378a(i, this.f23892q, "index");
        return this.f23893r.get(i + this.f23891p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo22387h() {
        return this.f23893r.mo22387h() + this.f23891p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo22388j() {
        return this.f23893r.mo22388j();
    }

    /* renamed from: k */
    public final C8756n0 mo22539k(int i, int i2) {
        C8599b.m29380c(i, i2, this.f23892q);
        C8756n0 n0Var = this.f23893r;
        int i3 = this.f23891p;
        return n0Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f23892q;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
