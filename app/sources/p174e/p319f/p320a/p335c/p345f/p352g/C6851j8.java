package p174e.p319f.p320a.p335c.p345f.p352g;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.j8 */
final class C6851j8 extends C6850j7 implements RandomAccess, C6804g9, C6917na {

    /* renamed from: o */
    private static final C6851j8 f18550o;

    /* renamed from: p */
    private double[] f18551p;

    /* renamed from: q */
    private int f18552q;

    static {
        C6851j8 j8Var = new C6851j8(new double[0], 0);
        f18550o = j8Var;
        j8Var.zzb();
    }

    C6851j8() {
        this(new double[10], 0);
    }

    private C6851j8(double[] dArr, int i) {
        this.f18551p = dArr;
        this.f18552q = i;
    }

    /* renamed from: h */
    private final String m25971h(int i) {
        int i2 = this.f18552q;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m25972j(int i) {
        if (i < 0 || i >= this.f18552q) {
            throw new IndexOutOfBoundsException(m25971h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo19878b();
        if (i < 0 || i > (i2 = this.f18552q)) {
            throw new IndexOutOfBoundsException(m25971h(i));
        }
        double[] dArr = this.f18551p;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f18551p, i, dArr2, i + 1, this.f18552q - i);
            this.f18551p = dArr2;
        }
        this.f18551p[i] = doubleValue;
        this.f18552q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo19885g(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19878b();
        C6820h9.m25836e(collection);
        if (!(collection instanceof C6851j8)) {
            return super.addAll(collection);
        }
        C6851j8 j8Var = (C6851j8) collection;
        int i = j8Var.f18552q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18552q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f18551p;
            if (i3 > dArr.length) {
                this.f18551p = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(j8Var.f18551p, 0, this.f18551p, this.f18552q, j8Var.f18552q);
            this.f18552q = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6851j8)) {
            return super.equals(obj);
        }
        C6851j8 j8Var = (C6851j8) obj;
        if (this.f18552q != j8Var.f18552q) {
            return false;
        }
        double[] dArr = j8Var.f18551p;
        for (int i = 0; i < this.f18552q; i++) {
            if (Double.doubleToLongBits(this.f18551p[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C6804g9 mo19570f(int i) {
        if (i >= this.f18552q) {
            return new C6851j8(Arrays.copyOf(this.f18551p, i), this.f18552q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo19885g(double d) {
        mo19878b();
        int i = this.f18552q;
        double[] dArr = this.f18551p;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f18551p = dArr2;
        }
        double[] dArr3 = this.f18551p;
        int i2 = this.f18552q;
        this.f18552q = i2 + 1;
        dArr3[i2] = d;
    }

    public final /* synthetic */ Object get(int i) {
        m25972j(i);
        return Double.valueOf(this.f18551p[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18552q; i2++) {
            i = (i * 31) + C6820h9.m25834c(Double.doubleToLongBits(this.f18551p[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f18552q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18551p[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19878b();
        m25972j(i);
        double[] dArr = this.f18551p;
        double d = dArr[i];
        int i2 = this.f18552q;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f18552q--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo19878b();
        if (i2 >= i) {
            double[] dArr = this.f18551p;
            System.arraycopy(dArr, i2, dArr, i, this.f18552q - i2);
            this.f18552q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo19878b();
        m25972j(i);
        double[] dArr = this.f18551p;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f18552q;
    }
}
