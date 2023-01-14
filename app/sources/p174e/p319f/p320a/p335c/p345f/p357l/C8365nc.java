package p174e.p319f.p320a.p335c.p345f.p357l;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.nc */
final class C8365nc extends C8382ob<Double> implements RandomAccess, C8292jd, C8439re {

    /* renamed from: o */
    private static final C8365nc f22834o;

    /* renamed from: p */
    private double[] f22835p;

    /* renamed from: q */
    private int f22836q;

    static {
        C8365nc ncVar = new C8365nc(new double[0], 0);
        f22834o = ncVar;
        ncVar.zzb();
    }

    C8365nc() {
        this(new double[10], 0);
    }

    private C8365nc(double[] dArr, int i) {
        this.f22835p = dArr;
        this.f22836q = i;
    }

    /* renamed from: h */
    private final String m28880h(int i) {
        int i2 = this.f22836q;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: j */
    private final void m28881j(int i) {
        if (i < 0 || i >= this.f22836q) {
            throw new IndexOutOfBoundsException(m28880h(i));
        }
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo22053b();
        if (i < 0 || i > (i2 = this.f22836q)) {
            throw new IndexOutOfBoundsException(m28880h(i));
        }
        double[] dArr = this.f22835p;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f22835p, i, dArr2, i + 1, this.f22836q - i);
            this.f22835p = dArr2;
        }
        this.f22835p[i] = doubleValue;
        this.f22836q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo22027g(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo22053b();
        C8311kd.m28701e(collection);
        if (!(collection instanceof C8365nc)) {
            return super.addAll(collection);
        }
        C8365nc ncVar = (C8365nc) collection;
        int i = ncVar.f22836q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22836q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f22835p;
            if (i3 > dArr.length) {
                this.f22835p = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(ncVar.f22835p, 0, this.f22835p, this.f22836q, ncVar.f22836q);
            this.f22836q = i3;
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
        if (!(obj instanceof C8365nc)) {
            return super.equals(obj);
        }
        C8365nc ncVar = (C8365nc) obj;
        if (this.f22836q != ncVar.f22836q) {
            return false;
        }
        double[] dArr = ncVar.f22835p;
        for (int i = 0; i < this.f22836q; i++) {
            if (Double.doubleToLongBits(this.f22835p[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C8292jd mo21793f(int i) {
        if (i >= this.f22836q) {
            return new C8365nc(Arrays.copyOf(this.f22835p, i), this.f22836q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo22027g(double d) {
        mo22053b();
        int i = this.f22836q;
        double[] dArr = this.f22835p;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f22835p = dArr2;
        }
        double[] dArr3 = this.f22835p;
        int i2 = this.f22836q;
        this.f22836q = i2 + 1;
        dArr3[i2] = d;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m28881j(i);
        return Double.valueOf(this.f22835p[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22836q; i2++) {
            i = (i * 31) + C8311kd.m28699c(Double.doubleToLongBits(this.f22835p[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f22836q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22835p[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo22053b();
        m28881j(i);
        double[] dArr = this.f22835p;
        double d = dArr[i];
        int i2 = this.f22836q;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f22836q--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo22053b();
        if (i2 >= i) {
            double[] dArr = this.f22835p;
            System.arraycopy(dArr, i2, dArr, i, this.f22836q - i2);
            this.f22836q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo22053b();
        m28881j(i);
        double[] dArr = this.f22835p;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f22836q;
    }
}
