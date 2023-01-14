package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: e.f.c.a.z.a.e1 */
final class C9456e1<E> extends C9442c<E> implements RandomAccess {

    /* renamed from: o */
    private static final C9456e1<Object> f25342o;

    /* renamed from: p */
    private E[] f25343p;

    /* renamed from: q */
    private int f25344q;

    static {
        C9456e1<Object> e1Var = new C9456e1<>(new Object[0], 0);
        f25342o = e1Var;
        e1Var.mo23511l();
    }

    private C9456e1(E[] eArr, int i) {
        this.f25343p = eArr;
        this.f25344q = i;
    }

    /* renamed from: g */
    private static <E> E[] m31503g(int i) {
        return new Object[i];
    }

    /* renamed from: h */
    public static <E> C9456e1<E> m31504h() {
        return f25342o;
    }

    /* renamed from: j */
    private void m31505j(int i) {
        if (i < 0 || i >= this.f25344q) {
            throw new IndexOutOfBoundsException(m31506k(i));
        }
    }

    /* renamed from: k */
    private String m31506k(int i) {
        return "Index:" + i + ", Size:" + this.f25344q;
    }

    public void add(int i, E e) {
        int i2;
        mo23514b();
        if (i < 0 || i > (i2 = this.f25344q)) {
            throw new IndexOutOfBoundsException(m31506k(i));
        }
        E[] eArr = this.f25343p;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] g = m31503g(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f25343p, 0, g, 0, i);
            System.arraycopy(this.f25343p, i, g, i + 1, this.f25344q - i);
            this.f25343p = g;
        }
        this.f25343p[i] = e;
        this.f25344q++;
        this.modCount++;
    }

    public boolean add(E e) {
        mo23514b();
        int i = this.f25344q;
        E[] eArr = this.f25343p;
        if (i == eArr.length) {
            this.f25343p = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f25343p;
        int i2 = this.f25344q;
        this.f25344q = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        m31505j(i);
        return this.f25343p[i];
    }

    /* renamed from: o */
    public C9456e1<E> mo23497n(int i) {
        if (i >= this.f25344q) {
            return new C9456e1<>(Arrays.copyOf(this.f25343p, i), this.f25344q);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo23514b();
        m31505j(i);
        E[] eArr = this.f25343p;
        E e = eArr[i];
        int i2 = this.f25344q;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f25344q--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo23514b();
        m31505j(i);
        E[] eArr = this.f25343p;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f25344q;
    }
}
