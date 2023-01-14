package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.o1 */
abstract class C9522o1<T, B> {
    C9522o1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo23898a(B b, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo23899b(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo23900c(B b, int i, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo23901d(B b, int i, C9468i iVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo23902e(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo23903f(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo23904g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo23905h(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo23906i(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo23907j(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo23908k(T t, T t2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23909l(B r3, p174e.p319f.p393c.p394a.p404z.p405a.C9464g1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo23543B()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo23910m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9522o1.mo23909l(java.lang.Object, e.f.c.a.z.a.g1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo23910m(B b, C9464g1 g1Var) {
        int t = g1Var.mo23582t();
        int a = C9555u1.m32443a(t);
        int b2 = C9555u1.m32444b(t);
        if (b2 == 0) {
            mo23902e(b, a, g1Var.mo23555N());
            return true;
        } else if (b2 == 1) {
            mo23899b(b, a, g1Var.mo23562c());
            return true;
        } else if (b2 == 2) {
            mo23901d(b, a, g1Var.mo23546E());
            return true;
        } else if (b2 == 3) {
            Object n = mo23911n();
            int c = C9555u1.m32445c(a, 4);
            mo23909l(n, g1Var);
            if (c == g1Var.mo23582t()) {
                mo23900c(b, a, mo23915r(n));
                return true;
            }
            throw C9443c0.m31441a();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo23898a(b, a, g1Var.mo23568h());
                return true;
            }
            throw C9443c0.m31444d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract B mo23911n();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo23912o(Object obj, B b);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo23913p(Object obj, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo23914q(C9464g1 g1Var);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract T mo23915r(B b);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo23916s(T t, C9567v1 v1Var);

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo23917t(T t, C9567v1 v1Var);
}
