package p174e.p319f.p320a.p335c.p345f.p353h;

/* renamed from: e.f.a.c.f.h.j */
final class C7132j<E> extends C7128h<E> {

    /* renamed from: p */
    static final C7128h<Object> f19108p = new C7132j(new Object[0], 0);

    /* renamed from: q */
    final transient Object[] f19109q;

    /* renamed from: r */
    private final transient int f19110r;

    C7132j(Object[] objArr, int i) {
        this.f19109q = objArr;
        this.f19110r = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo20498b(Object[] objArr, int i) {
        System.arraycopy(this.f19109q, 0, objArr, 0, this.f19110r);
        return this.f19110r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20500g() {
        return this.f19110r;
    }

    public final E get(int i) {
        C7137l0.m27130a(i, this.f19110r, "index");
        return this.f19109q[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo20501h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo20502j() {
        return this.f19109q;
    }

    public final int size() {
        return this.f19110r;
    }
}
