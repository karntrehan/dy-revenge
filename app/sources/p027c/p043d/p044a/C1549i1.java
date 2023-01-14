package p027c.p043d.p044a;

import androidx.core.util.C1177h;

/* renamed from: c.d.a.i1 */
public abstract class C1549i1 {

    /* renamed from: a */
    private final C1721v0 f4828a;

    /* renamed from: b */
    private final C1519c1 f4829b;

    /* renamed from: c.d.a.i1$a */
    public static final class C1550a extends C1549i1 {

        /* renamed from: c */
        private final C1723w0 f4830c;

        /* renamed from: d */
        private final int f4831d;

        /* renamed from: e */
        private final Throwable f4832e;

        C1550a(C1721v0 v0Var, C1519c1 c1Var, C1723w0 w0Var, int i, Throwable th) {
            super(v0Var, c1Var);
            this.f4830c = w0Var;
            this.f4831d = i;
            this.f4832e = th;
        }

        /* renamed from: i */
        public Throwable mo5693i() {
            return this.f4832e;
        }

        /* renamed from: j */
        public int mo5694j() {
            return this.f4831d;
        }

        /* renamed from: k */
        public C1723w0 mo5695k() {
            return this.f4830c;
        }

        /* renamed from: l */
        public boolean mo5696l() {
            return this.f4831d != 0;
        }
    }

    /* renamed from: c.d.a.i1$b */
    public static final class C1551b extends C1549i1 {
        C1551b(C1721v0 v0Var, C1519c1 c1Var) {
            super(v0Var, c1Var);
        }
    }

    /* renamed from: c.d.a.i1$c */
    public static final class C1552c extends C1549i1 {
        C1552c(C1721v0 v0Var, C1519c1 c1Var) {
            super(v0Var, c1Var);
        }
    }

    /* renamed from: c.d.a.i1$d */
    public static final class C1553d extends C1549i1 {
        C1553d(C1721v0 v0Var, C1519c1 c1Var) {
            super(v0Var, c1Var);
        }
    }

    /* renamed from: c.d.a.i1$e */
    public static final class C1554e extends C1549i1 {
        C1554e(C1721v0 v0Var, C1519c1 c1Var) {
            super(v0Var, c1Var);
        }
    }

    C1549i1(C1721v0 v0Var, C1519c1 c1Var) {
        this.f4828a = (C1721v0) C1177h.m4583e(v0Var);
        this.f4829b = (C1519c1) C1177h.m4583e(c1Var);
    }

    /* renamed from: a */
    static C1550a m6908a(C1721v0 v0Var, C1519c1 c1Var, C1723w0 w0Var) {
        return new C1550a(v0Var, c1Var, w0Var, 0, (Throwable) null);
    }

    /* renamed from: b */
    static C1550a m6909b(C1721v0 v0Var, C1519c1 c1Var, C1723w0 w0Var, int i, Throwable th) {
        C1177h.m4580b(i != 0, "An error type is required.");
        return new C1550a(v0Var, c1Var, w0Var, i, th);
    }

    /* renamed from: e */
    static C1551b m6910e(C1721v0 v0Var, C1519c1 c1Var) {
        return new C1551b(v0Var, c1Var);
    }

    /* renamed from: f */
    static C1552c m6911f(C1721v0 v0Var, C1519c1 c1Var) {
        return new C1552c(v0Var, c1Var);
    }

    /* renamed from: g */
    static C1553d m6912g(C1721v0 v0Var, C1519c1 c1Var) {
        return new C1553d(v0Var, c1Var);
    }

    /* renamed from: h */
    static C1554e m6913h(C1721v0 v0Var, C1519c1 c1Var) {
        return new C1554e(v0Var, c1Var);
    }

    /* renamed from: c */
    public C1721v0 mo5691c() {
        return this.f4828a;
    }

    /* renamed from: d */
    public C1519c1 mo5692d() {
        return this.f4829b;
    }
}
