package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.r1 */
final class C8426r1<E> extends C8408q1<E> {

    /* renamed from: p */
    static final C8408q1<Object> f22968p = new C8426r1(new Object[0], 0);

    /* renamed from: q */
    final transient Object[] f22969q;

    /* renamed from: r */
    private final transient int f22970r;

    C8426r1(Object[] objArr, int i) {
        this.f22969q = objArr;
        this.f22970r = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo21987b(Object[] objArr, int i) {
        System.arraycopy(this.f22969q, 0, objArr, 0, this.f22970r);
        return this.f22970r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo21989g() {
        return this.f22970r;
    }

    public final E get(int i) {
        C8109a1.m28306a(i, this.f22970r, "index");
        E e = this.f22969q[i];
        e.getClass();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo21990h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo21991j() {
        return this.f22969q;
    }

    public final int size() {
        return this.f22970r;
    }
}
