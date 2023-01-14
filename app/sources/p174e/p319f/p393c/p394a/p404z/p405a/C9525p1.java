package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Arrays;
import p174e.p319f.p393c.p394a.p404z.p405a.C9567v1;

/* renamed from: e.f.c.a.z.a.p1 */
public final class C9525p1 {

    /* renamed from: a */
    private static final C9525p1 f25457a = new C9525p1(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f25458b;

    /* renamed from: c */
    private int[] f25459c;

    /* renamed from: d */
    private Object[] f25460d;

    /* renamed from: e */
    private int f25461e;

    /* renamed from: f */
    private boolean f25462f;

    private C9525p1() {
        this(0, new int[8], new Object[8], true);
    }

    private C9525p1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f25461e = -1;
        this.f25458b = i;
        this.f25459c = iArr;
        this.f25460d = objArr;
        this.f25462f = z;
    }

    /* renamed from: b */
    private void m32201b() {
        int i = this.f25458b;
        int[] iArr = this.f25459c;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f25459c = Arrays.copyOf(iArr, i2);
            this.f25460d = Arrays.copyOf(this.f25460d, i2);
        }
    }

    /* renamed from: c */
    private static boolean m32202c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m32203d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C9525p1 m32204e() {
        return f25457a;
    }

    /* renamed from: h */
    private static int m32205h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    private static int m32206i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: k */
    static C9525p1 m32207k(C9525p1 p1Var, C9525p1 p1Var2) {
        int i = p1Var.f25458b + p1Var2.f25458b;
        int[] copyOf = Arrays.copyOf(p1Var.f25459c, i);
        System.arraycopy(p1Var2.f25459c, 0, copyOf, p1Var.f25458b, p1Var2.f25458b);
        Object[] copyOf2 = Arrays.copyOf(p1Var.f25460d, i);
        System.arraycopy(p1Var2.f25460d, 0, copyOf2, p1Var.f25458b, p1Var2.f25458b);
        return new C9525p1(i, copyOf, copyOf2, true);
    }

    /* renamed from: l */
    static C9525p1 m32208l() {
        return new C9525p1();
    }

    /* renamed from: p */
    private static void m32209p(int i, Object obj, C9567v1 v1Var) {
        int a = C9555u1.m32443a(i);
        int b = C9555u1.m32444b(i);
        if (b == 0) {
            v1Var.mo23852r(a, ((Long) obj).longValue());
        } else if (b == 1) {
            v1Var.mo23844j(a, ((Long) obj).longValue());
        } else if (b == 2) {
            v1Var.mo23822C(a, (C9468i) obj);
        } else if (b != 3) {
            if (b == 5) {
                v1Var.mo23838d(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C9443c0.m31444d());
        } else if (v1Var.mo23845k() == C9567v1.C9568a.ASCENDING) {
            v1Var.mo23856v(a);
            ((C9525p1) obj).mo23927q(v1Var);
            v1Var.mo23827H(a);
        } else {
            v1Var.mo23827H(a);
            ((C9525p1) obj).mo23927q(v1Var);
            v1Var.mo23856v(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo23918a() {
        if (!this.f25462f) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9525p1)) {
            return false;
        }
        C9525p1 p1Var = (C9525p1) obj;
        int i = this.f25458b;
        return i == p1Var.f25458b && m32202c(this.f25459c, p1Var.f25459c, i) && m32203d(this.f25460d, p1Var.f25460d, this.f25458b);
    }

    /* renamed from: f */
    public int mo23920f() {
        int i;
        int i2 = this.f25461e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25458b; i4++) {
            int i5 = this.f25459c[i4];
            int a = C9555u1.m32443a(i5);
            int b = C9555u1.m32444b(i5);
            if (b == 0) {
                i = C9504l.m31978X(a, ((Long) this.f25460d[i4]).longValue());
            } else if (b == 1) {
                i = C9504l.m31996o(a, ((Long) this.f25460d[i4]).longValue());
            } else if (b == 2) {
                i = C9504l.m31988g(a, (C9468i) this.f25460d[i4]);
            } else if (b == 3) {
                i = (C9504l.m31975U(a) * 2) + ((C9525p1) this.f25460d[i4]).mo23920f();
            } else if (b == 5) {
                i = C9504l.m31994m(a, ((Integer) this.f25460d[i4]).intValue());
            } else {
                throw new IllegalStateException(C9443c0.m31444d());
            }
            i3 += i;
        }
        this.f25461e = i3;
        return i3;
    }

    /* renamed from: g */
    public int mo23921g() {
        int i = this.f25461e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f25458b; i3++) {
            i2 += C9504l.m31963I(C9555u1.m32443a(this.f25459c[i3]), (C9468i) this.f25460d[i3]);
        }
        this.f25461e = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.f25458b;
        return ((((527 + i) * 31) + m32205h(this.f25459c, i)) * 31) + m32206i(this.f25460d, this.f25458b);
    }

    /* renamed from: j */
    public void mo23923j() {
        this.f25462f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo23924m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f25458b; i2++) {
            C9554u0.m32440c(sb, i, String.valueOf(C9555u1.m32443a(this.f25459c[i2])), this.f25460d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo23925n(int i, Object obj) {
        mo23918a();
        m32201b();
        int[] iArr = this.f25459c;
        int i2 = this.f25458b;
        iArr[i2] = i;
        this.f25460d[i2] = obj;
        this.f25458b = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo23926o(C9567v1 v1Var) {
        if (v1Var.mo23845k() == C9567v1.C9568a.DESCENDING) {
            for (int i = this.f25458b - 1; i >= 0; i--) {
                v1Var.mo23837c(C9555u1.m32443a(this.f25459c[i]), this.f25460d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f25458b; i2++) {
            v1Var.mo23837c(C9555u1.m32443a(this.f25459c[i2]), this.f25460d[i2]);
        }
    }

    /* renamed from: q */
    public void mo23927q(C9567v1 v1Var) {
        if (this.f25458b != 0) {
            if (v1Var.mo23845k() == C9567v1.C9568a.ASCENDING) {
                for (int i = 0; i < this.f25458b; i++) {
                    m32209p(this.f25459c[i], this.f25460d[i], v1Var);
                }
                return;
            }
            for (int i2 = this.f25458b - 1; i2 >= 0; i2--) {
                m32209p(this.f25459c[i2], this.f25460d[i2], v1Var);
            }
        }
    }
}
