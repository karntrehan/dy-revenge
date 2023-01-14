package p174e.p319f.p320a.p335c.p345f.p354i;

/* renamed from: e.f.a.c.f.i.p1 */
final class C7372p1<E> extends C7214e1<E> {

    /* renamed from: p */
    static final C7214e1<Object> f19816p = new C7372p1(new Object[0], 0);

    /* renamed from: q */
    final transient Object[] f19817q;

    /* renamed from: r */
    private final transient int f19818r;

    C7372p1(Object[] objArr, int i) {
        this.f19817q = objArr;
        this.f19818r = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo20663b(Object[] objArr, int i) {
        System.arraycopy(this.f19817q, 0, objArr, i, this.f19818r);
        return i + this.f19818r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20634g() {
        return this.f19818r;
    }

    public final E get(int i) {
        C7398r.m27423a(i, this.f19818r, "index");
        E e = this.f19817q[i];
        e.getClass();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo20636h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object[] mo20637k() {
        return this.f19817q;
    }

    public final int size() {
        return this.f19818r;
    }
}
