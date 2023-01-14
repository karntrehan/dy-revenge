package p174e.p319f.p320a.p335c.p345f.p353h;

import java.util.List;

/* renamed from: e.f.a.c.f.h.g */
final class C7126g extends C7128h {

    /* renamed from: p */
    final transient int f19098p;

    /* renamed from: q */
    final transient int f19099q;

    /* renamed from: r */
    final /* synthetic */ C7128h f19100r;

    C7126g(C7128h hVar, int i, int i2) {
        this.f19100r = hVar;
        this.f19098p = i;
        this.f19099q = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20500g() {
        return this.f19100r.mo20501h() + this.f19098p + this.f19099q;
    }

    public final Object get(int i) {
        C7137l0.m27130a(i, this.f19099q, "index");
        return this.f19100r.get(i + this.f19098p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo20501h() {
        return this.f19100r.mo20501h() + this.f19098p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo20502j() {
        return this.f19100r.mo20502j();
    }

    /* renamed from: k */
    public final C7128h mo20509k(int i, int i2) {
        C7137l0.m27132c(i, i2, this.f19099q);
        C7128h hVar = this.f19100r;
        int i3 = this.f19098p;
        return hVar.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f19099q;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
