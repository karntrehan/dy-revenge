package p027c.p060f;

/* renamed from: c.f.d */
public class C1793d<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f5323f = new Object();

    /* renamed from: o */
    private boolean f5324o;

    /* renamed from: p */
    private long[] f5325p;

    /* renamed from: q */
    private Object[] f5326q;

    /* renamed from: r */
    private int f5327r;

    public C1793d() {
        this(10);
    }

    public C1793d(int i) {
        this.f5324o = false;
        if (i == 0) {
            this.f5325p = C1792c.f5321b;
            this.f5326q = C1792c.f5322c;
            return;
        }
        int f = C1792c.m7631f(i);
        this.f5325p = new long[f];
        this.f5326q = new Object[f];
    }

    /* renamed from: g */
    private void m7632g() {
        int i = this.f5327r;
        long[] jArr = this.f5325p;
        Object[] objArr = this.f5326q;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f5323f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f5324o = false;
        this.f5327r = i2;
    }

    /* renamed from: c */
    public void mo6160c(long j, E e) {
        int i = this.f5327r;
        if (i == 0 || j > this.f5325p[i - 1]) {
            if (this.f5324o && i >= this.f5325p.length) {
                m7632g();
            }
            int i2 = this.f5327r;
            if (i2 >= this.f5325p.length) {
                int f = C1792c.m7631f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f5325p;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f5326q;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f5325p = jArr;
                this.f5326q = objArr;
            }
            this.f5325p[i2] = j;
            this.f5326q[i2] = e;
            this.f5327r = i2 + 1;
            return;
        }
        mo6169m(j, e);
    }

    /* renamed from: d */
    public void mo6162d() {
        int i = this.f5327r;
        Object[] objArr = this.f5326q;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f5327r = 0;
        this.f5324o = false;
    }

    /* renamed from: e */
    public C1793d<E> clone() {
        try {
            C1793d<E> dVar = (C1793d) super.clone();
            dVar.f5325p = (long[]) this.f5325p.clone();
            dVar.f5326q = (Object[]) this.f5326q.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public boolean mo6164f(long j) {
        return mo6167k(j) >= 0;
    }

    /* renamed from: i */
    public E mo6165i(long j) {
        return mo6166j(j, (Object) null);
    }

    /* renamed from: j */
    public E mo6166j(long j, E e) {
        int b = C1792c.m7627b(this.f5325p, this.f5327r, j);
        if (b >= 0) {
            E[] eArr = this.f5326q;
            if (eArr[b] != f5323f) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: k */
    public int mo6167k(long j) {
        if (this.f5324o) {
            m7632g();
        }
        return C1792c.m7627b(this.f5325p, this.f5327r, j);
    }

    /* renamed from: l */
    public long mo6168l(int i) {
        if (this.f5324o) {
            m7632g();
        }
        return this.f5325p[i];
    }

    /* renamed from: m */
    public void mo6169m(long j, E e) {
        int b = C1792c.m7627b(this.f5325p, this.f5327r, j);
        if (b >= 0) {
            this.f5326q[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f5327r;
        if (i < i2) {
            Object[] objArr = this.f5326q;
            if (objArr[i] == f5323f) {
                this.f5325p[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f5324o && i2 >= this.f5325p.length) {
            m7632g();
            i = ~C1792c.m7627b(this.f5325p, this.f5327r, j);
        }
        int i3 = this.f5327r;
        if (i3 >= this.f5325p.length) {
            int f = C1792c.m7631f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f5325p;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5326q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5325p = jArr;
            this.f5326q = objArr2;
        }
        int i4 = this.f5327r;
        if (i4 - i != 0) {
            long[] jArr3 = this.f5325p;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f5326q;
            System.arraycopy(objArr4, i, objArr4, i5, this.f5327r - i);
        }
        this.f5325p[i] = j;
        this.f5326q[i] = e;
        this.f5327r++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f5326q;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6170n(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f5325p
            int r1 = r2.f5327r
            int r3 = p027c.p060f.C1792c.m7627b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f5326q
            r0 = r4[r3]
            java.lang.Object r1 = f5323f
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f5324o = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p060f.C1793d.mo6170n(long):void");
    }

    /* renamed from: p */
    public void mo6171p(int i) {
        Object[] objArr = this.f5326q;
        Object obj = objArr[i];
        Object obj2 = f5323f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f5324o = true;
        }
    }

    /* renamed from: q */
    public int mo6172q() {
        if (this.f5324o) {
            m7632g();
        }
        return this.f5327r;
    }

    /* renamed from: r */
    public E mo6173r(int i) {
        if (this.f5324o) {
            m7632g();
        }
        return this.f5326q[i];
    }

    public String toString() {
        if (mo6172q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5327r * 28);
        sb.append('{');
        for (int i = 0; i < this.f5327r; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo6168l(i));
            sb.append('=');
            Object r = mo6173r(i);
            if (r != this) {
                sb.append(r);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
