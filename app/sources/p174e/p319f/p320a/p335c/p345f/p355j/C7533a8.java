package p174e.p319f.p320a.p335c.p345f.p355j;

/* renamed from: e.f.a.c.f.j.a8 */
final class C7533a8<E> extends C7768z7<E> {

    /* renamed from: p */
    static final C7768z7<Object> f20271p = new C7533a8(new Object[0], 0);

    /* renamed from: q */
    final transient Object[] f20272q;

    /* renamed from: r */
    private final transient int f20273r;

    C7533a8(Object[] objArr, int i) {
        this.f20272q = objArr;
        this.f20273r = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo21044b(Object[] objArr, int i) {
        System.arraycopy(this.f20272q, 0, objArr, 0, this.f20273r);
        return this.f20273r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo21045g() {
        return this.f20273r;
    }

    public final E get(int i) {
        C7579f4.m27633a(i, this.f20273r, "index");
        E e = this.f20272q[i];
        e.getClass();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo21047h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo21048j() {
        return this.f20272q;
    }

    public final int size() {
        return this.f20273r;
    }
}
