package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.List;

/* renamed from: e.f.a.c.f.i.d1 */
final class C7199d1 extends C7214e1 {

    /* renamed from: p */
    final transient int f19229p;

    /* renamed from: q */
    final transient int f19230q;

    /* renamed from: r */
    final /* synthetic */ C7214e1 f19231r;

    C7199d1(C7214e1 e1Var, int i, int i2) {
        this.f19231r = e1Var;
        this.f19229p = i;
        this.f19230q = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20634g() {
        return this.f19231r.mo20636h() + this.f19229p + this.f19230q;
    }

    public final Object get(int i) {
        C7398r.m27423a(i, this.f19230q, "index");
        return this.f19231r.get(i + this.f19229p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo20636h() {
        return this.f19231r.mo20636h() + this.f19229p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo20637k() {
        return this.f19231r.mo20637k();
    }

    /* renamed from: o */
    public final C7214e1 mo20638o(int i, int i2) {
        C7398r.m27425c(i, i2, this.f19230q);
        C7214e1 e1Var = this.f19231r;
        int i3 = this.f19229p;
        return e1Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f19230q;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
