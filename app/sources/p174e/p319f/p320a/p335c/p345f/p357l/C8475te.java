package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.te */
final class C8475te<E> extends C8382ob<E> implements RandomAccess {

    /* renamed from: o */
    private static final C8475te<Object> f23096o;

    /* renamed from: p */
    private E[] f23097p;

    /* renamed from: q */
    private int f23098q;

    static {
        C8475te<Object> teVar = new C8475te<>(new Object[0], 0);
        f23096o = teVar;
        teVar.zzb();
    }

    private C8475te(E[] eArr, int i) {
        this.f23097p = eArr;
        this.f23098q = i;
    }

    /* renamed from: g */
    public static <E> C8475te<E> m29057g() {
        return f23096o;
    }

    /* renamed from: h */
    private final String m29058h(int i) {
        int i2 = this.f23098q;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: j */
    private final void m29059j(int i) {
        if (i < 0 || i >= this.f23098q) {
            throw new IndexOutOfBoundsException(m29058h(i));
        }
    }

    public final void add(int i, E e) {
        int i2;
        mo22053b();
        if (i < 0 || i > (i2 = this.f23098q)) {
            throw new IndexOutOfBoundsException(m29058h(i));
        }
        E[] eArr = this.f23097p;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f23097p, i, eArr2, i + 1, this.f23098q - i);
            this.f23097p = eArr2;
        }
        this.f23097p[i] = e;
        this.f23098q++;
        this.modCount++;
    }

    public final boolean add(E e) {
        mo22053b();
        int i = this.f23098q;
        E[] eArr = this.f23097p;
        if (i == eArr.length) {
            this.f23097p = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f23097p;
        int i2 = this.f23098q;
        this.f23098q = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C8292jd mo21793f(int i) {
        if (i >= this.f23098q) {
            return new C8475te(Arrays.copyOf(this.f23097p, i), this.f23098q);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        m29059j(i);
        return this.f23097p[i];
    }

    public final E remove(int i) {
        mo22053b();
        m29059j(i);
        E[] eArr = this.f23097p;
        E e = eArr[i];
        int i2 = this.f23098q;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f23098q--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo22053b();
        m29059j(i);
        E[] eArr = this.f23097p;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f23098q;
    }
}
