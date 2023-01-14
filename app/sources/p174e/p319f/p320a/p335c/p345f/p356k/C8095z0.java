package p174e.p319f.p320a.p335c.p345f.p356k;

/* renamed from: e.f.a.c.f.k.z0 */
final class C8095z0<E> extends C7952o0<E> {

    /* renamed from: p */
    static final C7952o0<Object> f22010p = new C8095z0(new Object[0], 0);

    /* renamed from: q */
    final transient Object[] f22011q;

    /* renamed from: r */
    private final transient int f22012r;

    C8095z0(Object[] objArr, int i) {
        this.f22011q = objArr;
        this.f22012r = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo21407b(Object[] objArr, int i) {
        System.arraycopy(this.f22011q, 0, objArr, 0, this.f22012r);
        return this.f22012r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo21409g() {
        return this.f22012r;
    }

    public final E get(int i) {
        C7795c.m27868a(i, this.f22012r, "index");
        E e = this.f22011q[i];
        e.getClass();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo21410h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo21411j() {
        return this.f22011q;
    }

    public final int size() {
        return this.f22012r;
    }
}
