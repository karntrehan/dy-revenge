package p174e.p319f.p393c.p394a.p404z.p405a;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.List;
import java.util.Map;
import p174e.p319f.p393c.p394a.p404z.p405a.C9508l0;

/* renamed from: e.f.c.a.z.a.k */
final class C9490k implements C9464g1 {

    /* renamed from: a */
    private final C9485j f25403a;

    /* renamed from: b */
    private int f25404b;

    /* renamed from: c */
    private int f25405c;

    /* renamed from: d */
    private int f25406d = 0;

    private C9490k(C9485j jVar) {
        C9485j jVar2 = (C9485j) C9431b0.m31423b(jVar, "input");
        this.f25403a = jVar2;
        jVar2.f25385d = this;
    }

    /* renamed from: Q */
    public static C9490k m31866Q(C9485j jVar) {
        C9490k kVar = jVar.f25385d;
        return kVar != null ? kVar : new C9490k(jVar);
    }

    /* renamed from: R */
    private <T> T m31867R(C9467h1<T> h1Var, C9526q qVar) {
        int i = this.f25405c;
        this.f25405c = C9555u1.m32445c(C9555u1.m32443a(this.f25404b), 4);
        try {
            T i2 = h1Var.mo23637i();
            h1Var.mo23634f(i2, this, qVar);
            h1Var.mo23630b(i2);
            if (this.f25404b == this.f25405c) {
                return i2;
            }
            throw C9443c0.m31447g();
        } finally {
            this.f25405c = i;
        }
    }

    /* renamed from: S */
    private <T> T m31868S(C9467h1<T> h1Var, C9526q qVar) {
        int A = this.f25403a.mo23674A();
        C9485j jVar = this.f25403a;
        if (jVar.f25382a < jVar.f25383b) {
            int j = jVar.mo23681j(A);
            T i = h1Var.mo23637i();
            this.f25403a.f25382a++;
            h1Var.mo23634f(i, this, qVar);
            h1Var.mo23630b(i);
            this.f25403a.mo23677a(0);
            C9485j jVar2 = this.f25403a;
            jVar2.f25382a--;
            jVar2.mo23680i(j);
            return i;
        }
        throw C9443c0.m31448h();
    }

    /* renamed from: U */
    private void m31869U(int i) {
        if (this.f25403a.mo23678d() != i) {
            throw C9443c0.m31449j();
        }
    }

    /* renamed from: V */
    private void m31870V(int i) {
        if (C9555u1.m32444b(this.f25404b) != i) {
            throw C9443c0.m31444d();
        }
    }

    /* renamed from: W */
    private void m31871W(int i) {
        if ((i & 3) != 0) {
            throw C9443c0.m31447g();
        }
    }

    /* renamed from: X */
    private void m31872X(int i) {
        if ((i & 7) != 0) {
            throw C9443c0.m31447g();
        }
    }

    /* renamed from: A */
    public <T> T mo23542A(Class<T> cls, C9526q qVar) {
        m31870V(2);
        return m31868S(C9448d1.m31455a().mo23522d(cls), qVar);
    }

    /* renamed from: B */
    public int mo23543B() {
        int i = this.f25406d;
        if (i != 0) {
            this.f25404b = i;
            this.f25406d = 0;
        } else {
            this.f25404b = this.f25403a.mo23697z();
        }
        int i2 = this.f25404b;
        return (i2 == 0 || i2 == this.f25405c) ? RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO : C9555u1.m32443a(i2);
    }

    /* renamed from: C */
    public void mo23544C(List<String> list) {
        mo23722T(list, false);
    }

    /* renamed from: D */
    public void mo23545D(List<String> list) {
        mo23722T(list, true);
    }

    /* renamed from: E */
    public C9468i mo23546E() {
        m31870V(2);
        return this.f25403a.mo23683l();
    }

    /* renamed from: F */
    public void mo23547F(List<Float> list) {
        int z;
        int z2;
        if (list instanceof C9573x) {
            C9573x xVar = (C9573x) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 2) {
                int A = this.f25403a.mo23674A();
                m31871W(A);
                int d = this.f25403a.mo23678d() + A;
                do {
                    xVar.mo24043j(this.f25403a.mo23688q());
                } while (this.f25403a.mo23678d() < d);
            } else if (b == 5) {
                do {
                    xVar.mo24043j(this.f25403a.mo23688q());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 2) {
                int A2 = this.f25403a.mo23674A();
                m31871W(A2);
                int d2 = this.f25403a.mo23678d() + A2;
                do {
                    list.add(Float.valueOf(this.f25403a.mo23688q()));
                } while (this.f25403a.mo23678d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f25403a.mo23688q()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
            } else {
                throw C9443c0.m31444d();
            }
        }
    }

    /* renamed from: G */
    public int mo23548G() {
        m31870V(0);
        return this.f25403a.mo23689r();
    }

    /* renamed from: H */
    public boolean mo23549H() {
        int i;
        if (this.f25403a.mo23679e() || (i = this.f25404b) == this.f25405c) {
            return false;
        }
        return this.f25403a.mo23676C(i);
    }

    /* renamed from: I */
    public int mo23550I() {
        m31870V(5);
        return this.f25403a.mo23691t();
    }

    /* renamed from: J */
    public void mo23551J(List<C9468i> list) {
        int z;
        if (C9555u1.m32444b(this.f25404b) == 2) {
            do {
                list.add(mo23546E());
                if (!this.f25403a.mo23679e()) {
                    z = this.f25403a.mo23697z();
                } else {
                    return;
                }
            } while (z == this.f25404b);
            this.f25406d = z;
            return;
        }
        throw C9443c0.m31444d();
    }

    /* renamed from: K */
    public <K, V> void mo23552K(Map<K, V> map, C9508l0.C9509a<K, V> aVar, C9526q qVar) {
        m31870V(2);
        this.f25403a.mo23681j(this.f25403a.mo23674A());
        throw null;
    }

    /* renamed from: L */
    public void mo23553L(List<Double> list) {
        int z;
        int z2;
        if (list instanceof C9517n) {
            C9517n nVar = (C9517n) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 1) {
                do {
                    nVar.mo23881j(this.f25403a.mo23684m());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
            } else if (b == 2) {
                int A = this.f25403a.mo23674A();
                m31872X(A);
                int d = this.f25403a.mo23678d() + A;
                do {
                    nVar.mo23881j(this.f25403a.mo23684m());
                } while (this.f25403a.mo23678d() < d);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f25403a.mo23684m()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
            } else if (b2 == 2) {
                int A2 = this.f25403a.mo23674A();
                m31872X(A2);
                int d2 = this.f25403a.mo23678d() + A2;
                do {
                    list.add(Double.valueOf(this.f25403a.mo23684m()));
                } while (this.f25403a.mo23678d() < d2);
            } else {
                throw C9443c0.m31444d();
            }
        }
    }

    /* renamed from: M */
    public <T> void mo23554M(List<T> list, C9467h1<T> h1Var, C9526q qVar) {
        int z;
        if (C9555u1.m32444b(this.f25404b) == 3) {
            int i = this.f25404b;
            do {
                list.add(m31867R(h1Var, qVar));
                if (!this.f25403a.mo23679e() && this.f25406d == 0) {
                    z = this.f25403a.mo23697z();
                } else {
                    return;
                }
            } while (z == i);
            this.f25406d = z;
            return;
        }
        throw C9443c0.m31444d();
    }

    /* renamed from: N */
    public long mo23555N() {
        m31870V(0);
        return this.f25403a.mo23690s();
    }

    /* renamed from: O */
    public String mo23556O() {
        m31870V(2);
        return this.f25403a.mo23696y();
    }

    /* renamed from: P */
    public void mo23557P(List<Long> list) {
        int z;
        int z2;
        if (list instanceof C9488j0) {
            C9488j0 j0Var = (C9488j0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 1) {
                do {
                    j0Var.mo23714k(this.f25403a.mo23687p());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
            } else if (b == 2) {
                int A = this.f25403a.mo23674A();
                m31872X(A);
                int d = this.f25403a.mo23678d() + A;
                do {
                    j0Var.mo23714k(this.f25403a.mo23687p());
                } while (this.f25403a.mo23678d() < d);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f25403a.mo23687p()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
            } else if (b2 == 2) {
                int A2 = this.f25403a.mo23674A();
                m31872X(A2);
                int d2 = this.f25403a.mo23678d() + A2;
                do {
                    list.add(Long.valueOf(this.f25403a.mo23687p()));
                } while (this.f25403a.mo23678d() < d2);
            } else {
                throw C9443c0.m31444d();
            }
        }
    }

    /* renamed from: T */
    public void mo23722T(List<String> list, boolean z) {
        int z2;
        int z3;
        if (C9555u1.m32444b(this.f25404b) != 2) {
            throw C9443c0.m31444d();
        } else if (!(list instanceof C9466h0) || z) {
            do {
                list.add(z ? mo23556O() : mo23588z());
                if (!this.f25403a.mo23679e()) {
                    z2 = this.f25403a.mo23697z();
                } else {
                    return;
                }
            } while (z2 == this.f25404b);
            this.f25406d = z2;
        } else {
            C9466h0 h0Var = (C9466h0) list;
            do {
                h0Var.mo23623s(mo23546E());
                if (!this.f25403a.mo23679e()) {
                    z3 = this.f25403a.mo23697z();
                } else {
                    return;
                }
            } while (z3 == this.f25404b);
            this.f25406d = z3;
        }
    }

    /* renamed from: a */
    public void mo23559a(List<Integer> list) {
        int i;
        int z;
        int z2;
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 0) {
                do {
                    a0Var.mo23496j(this.f25403a.mo23693v());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
                return;
            } else if (b == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    a0Var.mo23496j(this.f25403a.mo23693v());
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23693v()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
                return;
            } else if (b2 == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23693v()));
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        }
        m31869U(i);
    }

    /* renamed from: b */
    public long mo23561b() {
        m31870V(0);
        return this.f25403a.mo23675B();
    }

    /* renamed from: c */
    public long mo23562c() {
        m31870V(1);
        return this.f25403a.mo23687p();
    }

    /* renamed from: d */
    public void mo23564d(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 2) {
                int A = this.f25403a.mo23674A();
                m31871W(A);
                int d = this.f25403a.mo23678d() + A;
                do {
                    a0Var.mo23496j(this.f25403a.mo23691t());
                } while (this.f25403a.mo23678d() < d);
            } else if (b == 5) {
                do {
                    a0Var.mo23496j(this.f25403a.mo23691t());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 2) {
                int A2 = this.f25403a.mo23674A();
                m31871W(A2);
                int d2 = this.f25403a.mo23678d() + A2;
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23691t()));
                } while (this.f25403a.mo23678d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23691t()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
            } else {
                throw C9443c0.m31444d();
            }
        }
    }

    /* renamed from: e */
    public void mo23565e(List<Long> list) {
        int i;
        int z;
        int z2;
        if (list instanceof C9488j0) {
            C9488j0 j0Var = (C9488j0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 0) {
                do {
                    j0Var.mo23714k(this.f25403a.mo23694w());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
                return;
            } else if (b == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    j0Var.mo23714k(this.f25403a.mo23694w());
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25403a.mo23694w()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
                return;
            } else if (b2 == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    list.add(Long.valueOf(this.f25403a.mo23694w()));
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        }
        m31869U(i);
    }

    /* renamed from: f */
    public void mo23566f(List<Integer> list) {
        int i;
        int z;
        int z2;
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 0) {
                do {
                    a0Var.mo23496j(this.f25403a.mo23674A());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
                return;
            } else if (b == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    a0Var.mo23496j(this.f25403a.mo23674A());
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23674A()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
                return;
            } else if (b2 == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23674A()));
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        }
        m31869U(i);
    }

    /* renamed from: g */
    public <T> void mo23567g(List<T> list, C9467h1<T> h1Var, C9526q qVar) {
        int z;
        if (C9555u1.m32444b(this.f25404b) == 2) {
            int i = this.f25404b;
            do {
                list.add(m31868S(h1Var, qVar));
                if (!this.f25403a.mo23679e() && this.f25406d == 0) {
                    z = this.f25403a.mo23697z();
                } else {
                    return;
                }
            } while (z == i);
            this.f25406d = z;
            return;
        }
        throw C9443c0.m31444d();
    }

    /* renamed from: h */
    public int mo23568h() {
        m31870V(5);
        return this.f25403a.mo23686o();
    }

    /* renamed from: i */
    public boolean mo23569i() {
        m31870V(0);
        return this.f25403a.mo23682k();
    }

    /* renamed from: j */
    public long mo23570j() {
        m31870V(1);
        return this.f25403a.mo23692u();
    }

    /* renamed from: k */
    public void mo23571k(List<Long> list) {
        int i;
        int z;
        int z2;
        if (list instanceof C9488j0) {
            C9488j0 j0Var = (C9488j0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 0) {
                do {
                    j0Var.mo23714k(this.f25403a.mo23675B());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
                return;
            } else if (b == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    j0Var.mo23714k(this.f25403a.mo23675B());
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25403a.mo23675B()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
                return;
            } else if (b2 == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    list.add(Long.valueOf(this.f25403a.mo23675B()));
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        }
        m31869U(i);
    }

    /* renamed from: l */
    public int mo23572l() {
        m31870V(0);
        return this.f25403a.mo23674A();
    }

    /* renamed from: m */
    public void mo23573m(List<Long> list) {
        int i;
        int z;
        int z2;
        if (list instanceof C9488j0) {
            C9488j0 j0Var = (C9488j0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 0) {
                do {
                    j0Var.mo23714k(this.f25403a.mo23690s());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
                return;
            } else if (b == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    j0Var.mo23714k(this.f25403a.mo23690s());
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25403a.mo23690s()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
                return;
            } else if (b2 == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    list.add(Long.valueOf(this.f25403a.mo23690s()));
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        }
        m31869U(i);
    }

    /* renamed from: n */
    public void mo23574n(List<Long> list) {
        int z;
        int z2;
        if (list instanceof C9488j0) {
            C9488j0 j0Var = (C9488j0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 1) {
                do {
                    j0Var.mo23714k(this.f25403a.mo23692u());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
            } else if (b == 2) {
                int A = this.f25403a.mo23674A();
                m31872X(A);
                int d = this.f25403a.mo23678d() + A;
                do {
                    j0Var.mo23714k(this.f25403a.mo23692u());
                } while (this.f25403a.mo23678d() < d);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f25403a.mo23692u()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
            } else if (b2 == 2) {
                int A2 = this.f25403a.mo23674A();
                m31872X(A2);
                int d2 = this.f25403a.mo23678d() + A2;
                do {
                    list.add(Long.valueOf(this.f25403a.mo23692u()));
                } while (this.f25403a.mo23678d() < d2);
            } else {
                throw C9443c0.m31444d();
            }
        }
    }

    /* renamed from: o */
    public void mo23575o(List<Integer> list) {
        int i;
        int z;
        int z2;
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 0) {
                do {
                    a0Var.mo23496j(this.f25403a.mo23689r());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
                return;
            } else if (b == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    a0Var.mo23496j(this.f25403a.mo23689r());
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23689r()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
                return;
            } else if (b2 == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23689r()));
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        }
        m31869U(i);
    }

    /* renamed from: p */
    public void mo23576p(List<Integer> list) {
        int i;
        int z;
        int z2;
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 0) {
                do {
                    a0Var.mo23496j(this.f25403a.mo23685n());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
                return;
            } else if (b == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    a0Var.mo23496j(this.f25403a.mo23685n());
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23685n()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
                return;
            } else if (b2 == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23685n()));
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        }
        m31869U(i);
    }

    /* renamed from: q */
    public <T> T mo23577q(C9467h1<T> h1Var, C9526q qVar) {
        m31870V(3);
        return m31867R(h1Var, qVar);
    }

    /* renamed from: r */
    public int mo23578r() {
        m31870V(0);
        return this.f25403a.mo23685n();
    }

    public double readDouble() {
        m31870V(1);
        return this.f25403a.mo23684m();
    }

    public float readFloat() {
        m31870V(5);
        return this.f25403a.mo23688q();
    }

    /* renamed from: s */
    public <T> T mo23581s(C9467h1<T> h1Var, C9526q qVar) {
        m31870V(2);
        return m31868S(h1Var, qVar);
    }

    /* renamed from: t */
    public int mo23582t() {
        return this.f25404b;
    }

    /* renamed from: u */
    public void mo23583u(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 2) {
                int A = this.f25403a.mo23674A();
                m31871W(A);
                int d = this.f25403a.mo23678d() + A;
                do {
                    a0Var.mo23496j(this.f25403a.mo23686o());
                } while (this.f25403a.mo23678d() < d);
            } else if (b == 5) {
                do {
                    a0Var.mo23496j(this.f25403a.mo23686o());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 2) {
                int A2 = this.f25403a.mo23674A();
                m31871W(A2);
                int d2 = this.f25403a.mo23678d() + A2;
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23686o()));
                } while (this.f25403a.mo23678d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f25403a.mo23686o()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
            } else {
                throw C9443c0.m31444d();
            }
        }
    }

    /* renamed from: v */
    public int mo23584v() {
        m31870V(0);
        return this.f25403a.mo23693v();
    }

    /* renamed from: w */
    public long mo23585w() {
        m31870V(0);
        return this.f25403a.mo23694w();
    }

    /* renamed from: x */
    public <T> T mo23586x(Class<T> cls, C9526q qVar) {
        m31870V(3);
        return m31867R(C9448d1.m31455a().mo23522d(cls), qVar);
    }

    /* renamed from: y */
    public void mo23587y(List<Boolean> list) {
        int i;
        int z;
        int z2;
        if (list instanceof C9462g) {
            C9462g gVar = (C9462g) list;
            int b = C9555u1.m32444b(this.f25404b);
            if (b == 0) {
                do {
                    gVar.mo23606k(this.f25403a.mo23682k());
                    if (!this.f25403a.mo23679e()) {
                        z2 = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z2 == this.f25404b);
                this.f25406d = z2;
                return;
            } else if (b == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    gVar.mo23606k(this.f25403a.mo23682k());
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        } else {
            int b2 = C9555u1.m32444b(this.f25404b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f25403a.mo23682k()));
                    if (!this.f25403a.mo23679e()) {
                        z = this.f25403a.mo23697z();
                    } else {
                        return;
                    }
                } while (z == this.f25404b);
                this.f25406d = z;
                return;
            } else if (b2 == 2) {
                i = this.f25403a.mo23678d() + this.f25403a.mo23674A();
                do {
                    list.add(Boolean.valueOf(this.f25403a.mo23682k()));
                } while (this.f25403a.mo23678d() < i);
            } else {
                throw C9443c0.m31444d();
            }
        }
        m31869U(i);
    }

    /* renamed from: z */
    public String mo23588z() {
        m31870V(2);
        return this.f25403a.mo23695x();
    }
}
