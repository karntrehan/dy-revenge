package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.pa */
final class C6949pa extends C6850j7 implements RandomAccess {

    /* renamed from: o */
    private static final C6949pa f18798o;

    /* renamed from: p */
    private Object[] f18799p;

    /* renamed from: q */
    private int f18800q;

    static {
        C6949pa paVar = new C6949pa(new Object[0], 0);
        f18798o = paVar;
        paVar.zzb();
    }

    private C6949pa(Object[] objArr, int i) {
        this.f18799p = objArr;
        this.f18800q = i;
    }

    /* renamed from: g */
    public static C6949pa m26368g() {
        return f18798o;
    }

    /* renamed from: h */
    private final String m26369h(int i) {
        int i2 = this.f18800q;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m26370j(int i) {
        if (i < 0 || i >= this.f18800q) {
            throw new IndexOutOfBoundsException(m26369h(i));
        }
    }

    public final void add(int i, Object obj) {
        int i2;
        mo19878b();
        if (i < 0 || i > (i2 = this.f18800q)) {
            throw new IndexOutOfBoundsException(m26369h(i));
        }
        Object[] objArr = this.f18799p;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f18799p, i, objArr2, i + 1, this.f18800q - i);
            this.f18799p = objArr2;
        }
        this.f18799p[i] = obj;
        this.f18800q++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        mo19878b();
        int i = this.f18800q;
        Object[] objArr = this.f18799p;
        if (i == objArr.length) {
            this.f18799p = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18799p;
        int i2 = this.f18800q;
        this.f18800q = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C6804g9 mo19570f(int i) {
        if (i >= this.f18800q) {
            return new C6949pa(Arrays.copyOf(this.f18799p, i), this.f18800q);
        }
        throw new IllegalArgumentException();
    }

    public final Object get(int i) {
        m26370j(i);
        return this.f18799p[i];
    }

    public final Object remove(int i) {
        mo19878b();
        m26370j(i);
        Object[] objArr = this.f18799p;
        Object obj = objArr[i];
        int i2 = this.f18800q;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f18800q--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo19878b();
        m26370j(i);
        Object[] objArr = this.f18799p;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f18800q;
    }
}
