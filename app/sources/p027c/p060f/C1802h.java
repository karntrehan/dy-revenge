package p027c.p060f;

/* renamed from: c.f.h */
public class C1802h<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f5358f = new Object();

    /* renamed from: o */
    private boolean f5359o;

    /* renamed from: p */
    private int[] f5360p;

    /* renamed from: q */
    private Object[] f5361q;

    /* renamed from: r */
    private int f5362r;

    public C1802h() {
        this(10);
    }

    public C1802h(int i) {
        this.f5359o = false;
        if (i == 0) {
            this.f5360p = C1792c.f5320a;
            this.f5361q = C1792c.f5322c;
            return;
        }
        int e = C1792c.m7630e(i);
        this.f5360p = new int[e];
        this.f5361q = new Object[e];
    }

    /* renamed from: f */
    private void m7688f() {
        int i = this.f5362r;
        int[] iArr = this.f5360p;
        Object[] objArr = this.f5361q;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f5358f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f5359o = false;
        this.f5362r = i2;
    }

    /* renamed from: c */
    public void mo6272c(int i, E e) {
        int i2 = this.f5362r;
        if (i2 == 0 || i > this.f5360p[i2 - 1]) {
            if (this.f5359o && i2 >= this.f5360p.length) {
                m7688f();
            }
            int i3 = this.f5362r;
            if (i3 >= this.f5360p.length) {
                int e2 = C1792c.m7630e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f5360p;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f5361q;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f5360p = iArr;
                this.f5361q = objArr;
            }
            this.f5360p[i3] = i;
            this.f5361q[i3] = e;
            this.f5362r = i3 + 1;
            return;
        }
        mo6281m(i, e);
    }

    /* renamed from: d */
    public void mo6274d() {
        int i = this.f5362r;
        Object[] objArr = this.f5361q;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f5362r = 0;
        this.f5359o = false;
    }

    /* renamed from: e */
    public C1802h<E> clone() {
        try {
            C1802h<E> hVar = (C1802h) super.clone();
            hVar.f5360p = (int[]) this.f5360p.clone();
            hVar.f5361q = (Object[]) this.f5361q.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public E mo6276g(int i) {
        return mo6277i(i, (Object) null);
    }

    /* renamed from: i */
    public E mo6277i(int i, E e) {
        int a = C1792c.m7626a(this.f5360p, this.f5362r, i);
        if (a >= 0) {
            E[] eArr = this.f5361q;
            if (eArr[a] != f5358f) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: j */
    public int mo6278j(int i) {
        if (this.f5359o) {
            m7688f();
        }
        return C1792c.m7626a(this.f5360p, this.f5362r, i);
    }

    /* renamed from: k */
    public int mo6279k(E e) {
        if (this.f5359o) {
            m7688f();
        }
        for (int i = 0; i < this.f5362r; i++) {
            if (this.f5361q[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public int mo6280l(int i) {
        if (this.f5359o) {
            m7688f();
        }
        return this.f5360p[i];
    }

    /* renamed from: m */
    public void mo6281m(int i, E e) {
        int a = C1792c.m7626a(this.f5360p, this.f5362r, i);
        if (a >= 0) {
            this.f5361q[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f5362r;
        if (i2 < i3) {
            Object[] objArr = this.f5361q;
            if (objArr[i2] == f5358f) {
                this.f5360p[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f5359o && i3 >= this.f5360p.length) {
            m7688f();
            i2 = ~C1792c.m7626a(this.f5360p, this.f5362r, i);
        }
        int i4 = this.f5362r;
        if (i4 >= this.f5360p.length) {
            int e2 = C1792c.m7630e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f5360p;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5361q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5360p = iArr;
            this.f5361q = objArr2;
        }
        int i5 = this.f5362r;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f5360p;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f5361q;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f5362r - i2);
        }
        this.f5360p[i2] = i;
        this.f5361q[i2] = e;
        this.f5362r++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f5361q;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6282n(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f5360p
            int r1 = r3.f5362r
            int r4 = p027c.p060f.C1792c.m7626a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f5361q
            r1 = r0[r4]
            java.lang.Object r2 = f5358f
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f5359o = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p060f.C1802h.mo6282n(int):void");
    }

    /* renamed from: p */
    public int mo6283p() {
        if (this.f5359o) {
            m7688f();
        }
        return this.f5362r;
    }

    /* renamed from: q */
    public E mo6284q(int i) {
        if (this.f5359o) {
            m7688f();
        }
        return this.f5361q[i];
    }

    public String toString() {
        if (mo6283p() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5362r * 28);
        sb.append('{');
        for (int i = 0; i < this.f5362r; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo6280l(i));
            sb.append('=');
            Object q = mo6284q(i);
            if (q != this) {
                sb.append(q);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
