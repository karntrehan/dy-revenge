package p174e.p319f.p320a.p335c.p345f.p352g;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.v9 */
final class C7044v9 extends C6850j7 implements RandomAccess, C6787f9, C6917na {

    /* renamed from: o */
    private static final C7044v9 f19024o;

    /* renamed from: p */
    private long[] f19025p;

    /* renamed from: q */
    private int f19026q;

    static {
        C7044v9 v9Var = new C7044v9(new long[0], 0);
        f19024o = v9Var;
        v9Var.zzb();
    }

    C7044v9() {
        this(new long[10], 0);
    }

    private C7044v9(long[] jArr, int i) {
        this.f19025p = jArr;
        this.f19026q = i;
    }

    /* renamed from: g */
    public static C7044v9 m26933g() {
        return f19024o;
    }

    /* renamed from: j */
    private final String m26934j(int i) {
        int i2 = this.f19026q;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: k */
    private final void m26935k(int i) {
        if (i < 0 || i >= this.f19026q) {
            throw new IndexOutOfBoundsException(m26934j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo19878b();
        if (i < 0 || i > (i2 = this.f19026q)) {
            throw new IndexOutOfBoundsException(m26934j(i));
        }
        long[] jArr = this.f19025p;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f19025p, i, jArr2, i + 1, this.f19026q - i);
            this.f19025p = jArr2;
        }
        this.f19025p[i] = longValue;
        this.f19026q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo20388h(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19878b();
        C6820h9.m25836e(collection);
        if (!(collection instanceof C7044v9)) {
            return super.addAll(collection);
        }
        C7044v9 v9Var = (C7044v9) collection;
        int i = v9Var.f19026q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f19026q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f19025p;
            if (i3 > jArr.length) {
                this.f19025p = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(v9Var.f19025p, 0, this.f19025p, this.f19026q, v9Var.f19026q);
            this.f19026q = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final long mo19763e(int i) {
        m26935k(i);
        return this.f19025p[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7044v9)) {
            return super.equals(obj);
        }
        C7044v9 v9Var = (C7044v9) obj;
        if (this.f19026q != v9Var.f19026q) {
            return false;
        }
        long[] jArr = v9Var.f19025p;
        for (int i = 0; i < this.f19026q; i++) {
            if (this.f19025p[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m26935k(i);
        return Long.valueOf(this.f19025p[i]);
    }

    /* renamed from: h */
    public final void mo20388h(long j) {
        mo19878b();
        int i = this.f19026q;
        long[] jArr = this.f19025p;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f19025p = jArr2;
        }
        long[] jArr3 = this.f19025p;
        int i2 = this.f19026q;
        this.f19026q = i2 + 1;
        jArr3[i2] = j;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19026q; i2++) {
            i = (i * 31) + C6820h9.m25834c(this.f19025p[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f19026q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f19025p[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final C6787f9 mo19570f(int i) {
        if (i >= this.f19026q) {
            return new C7044v9(Arrays.copyOf(this.f19025p, i), this.f19026q);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19878b();
        m26935k(i);
        long[] jArr = this.f19025p;
        long j = jArr[i];
        int i2 = this.f19026q;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f19026q--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo19878b();
        if (i2 >= i) {
            long[] jArr = this.f19025p;
            System.arraycopy(jArr, i2, jArr, i, this.f19026q - i2);
            this.f19026q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo19878b();
        m26935k(i);
        long[] jArr = this.f19025p;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f19026q;
    }
}
