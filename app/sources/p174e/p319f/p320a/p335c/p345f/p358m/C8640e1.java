package p174e.p319f.p320a.p335c.p345f.p358m;

/* renamed from: e.f.a.c.f.m.e1 */
final class C8640e1<E> extends C8756n0<E> {

    /* renamed from: p */
    static final C8756n0<Object> f23673p = new C8640e1(new Object[0], 0);

    /* renamed from: q */
    final transient Object[] f23674q;

    /* renamed from: r */
    private final transient int f23675r;

    C8640e1(Object[] objArr, int i) {
        this.f23674q = objArr;
        this.f23675r = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo22384b(Object[] objArr, int i) {
        System.arraycopy(this.f23674q, 0, objArr, 0, this.f23675r);
        return this.f23675r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo22385g() {
        return this.f23675r;
    }

    public final E get(int i) {
        C8599b.m29378a(i, this.f23675r, "index");
        E e = this.f23674q[i];
        e.getClass();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo22387h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object[] mo22388j() {
        return this.f23674q;
    }

    public final int size() {
        return this.f23675r;
    }
}
