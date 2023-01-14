package p174e.p319f.p393c.p394a.p404z.p405a;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.z.a.j0 */
final class C9488j0 extends C9442c<Long> implements C9431b0.C9439h, RandomAccess, C9441b1 {

    /* renamed from: o */
    private static final C9488j0 f25396o;

    /* renamed from: p */
    private long[] f25397p;

    /* renamed from: q */
    private int f25398q;

    static {
        C9488j0 j0Var = new C9488j0(new long[0], 0);
        f25396o = j0Var;
        j0Var.mo23511l();
    }

    C9488j0() {
        this(new long[10], 0);
    }

    private C9488j0(long[] jArr, int i) {
        this.f25397p = jArr;
        this.f25398q = i;
    }

    /* renamed from: j */
    private void m31796j(int i, long j) {
        int i2;
        mo23514b();
        if (i < 0 || i > (i2 = this.f25398q)) {
            throw new IndexOutOfBoundsException(m31798v(i));
        }
        long[] jArr = this.f25397p;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f25397p, i, jArr2, i + 1, this.f25398q - i);
            this.f25397p = jArr2;
        }
        this.f25397p[i] = j;
        this.f25398q++;
        this.modCount++;
    }

    /* renamed from: o */
    private void m31797o(int i) {
        if (i < 0 || i >= this.f25398q) {
            throw new IndexOutOfBoundsException(m31798v(i));
        }
    }

    /* renamed from: v */
    private String m31798v(int i) {
        return "Index:" + i + ", Size:" + this.f25398q;
    }

    /* renamed from: A */
    public Long remove(int i) {
        mo23514b();
        m31797o(i);
        long[] jArr = this.f25397p;
        long j = jArr[i];
        int i2 = this.f25398q;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f25398q--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: B */
    public Long set(int i, Long l) {
        return Long.valueOf(mo23709C(i, l.longValue()));
    }

    /* renamed from: C */
    public long mo23709C(int i, long j) {
        mo23514b();
        m31797o(i);
        long[] jArr = this.f25397p;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo23514b();
        C9431b0.m31422a(collection);
        if (!(collection instanceof C9488j0)) {
            return super.addAll(collection);
        }
        C9488j0 j0Var = (C9488j0) collection;
        int i = j0Var.f25398q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25398q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f25397p;
            if (i3 > jArr.length) {
                this.f25397p = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(j0Var.f25397p, 0, this.f25397p, this.f25398q, j0Var.f25398q);
            this.f25398q = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9488j0)) {
            return super.equals(obj);
        }
        C9488j0 j0Var = (C9488j0) obj;
        if (this.f25398q != j0Var.f25398q) {
            return false;
        }
        long[] jArr = j0Var.f25397p;
        for (int i = 0; i < this.f25398q; i++) {
            if (this.f25397p[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i, Long l) {
        m31796j(i, l.longValue());
    }

    /* renamed from: h */
    public boolean add(Long l) {
        mo23714k(l.longValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25398q; i2++) {
            i = (i * 31) + C9431b0.m31427f(this.f25397p[i2]);
        }
        return i;
    }

    /* renamed from: k */
    public void mo23714k(long j) {
        mo23514b();
        int i = this.f25398q;
        long[] jArr = this.f25397p;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f25397p = jArr2;
        }
        long[] jArr3 = this.f25397p;
        int i2 = this.f25398q;
        this.f25398q = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: p */
    public Long get(int i) {
        return Long.valueOf(mo23716r(i));
    }

    /* renamed from: r */
    public long mo23716r(int i) {
        m31797o(i);
        return this.f25397p[i];
    }

    public boolean remove(Object obj) {
        mo23514b();
        for (int i = 0; i < this.f25398q; i++) {
            if (obj.equals(Long.valueOf(this.f25397p[i]))) {
                long[] jArr = this.f25397p;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f25398q - i) - 1);
                this.f25398q--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo23514b();
        if (i2 >= i) {
            long[] jArr = this.f25397p;
            System.arraycopy(jArr, i2, jArr, i, this.f25398q - i2);
            this.f25398q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f25398q;
    }

    /* renamed from: z */
    public C9431b0.C9439h mo23497n(int i) {
        if (i >= this.f25398q) {
            return new C9488j0(Arrays.copyOf(this.f25397p, i), this.f25398q);
        }
        throw new IllegalArgumentException();
    }
}
