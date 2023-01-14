package p174e.p319f.p393c.p394a.p404z.p405a;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.z.a.n */
final class C9517n extends C9442c<Double> implements C9431b0.C9433b, RandomAccess, C9441b1 {

    /* renamed from: o */
    private static final C9517n f25450o;

    /* renamed from: p */
    private double[] f25451p;

    /* renamed from: q */
    private int f25452q;

    static {
        C9517n nVar = new C9517n(new double[0], 0);
        f25450o = nVar;
        nVar.mo23511l();
    }

    C9517n() {
        this(new double[10], 0);
    }

    private C9517n(double[] dArr, int i) {
        this.f25451p = dArr;
        this.f25452q = i;
    }

    /* renamed from: k */
    private void m32143k(int i, double d) {
        int i2;
        mo23514b();
        if (i < 0 || i > (i2 = this.f25452q)) {
            throw new IndexOutOfBoundsException(m32145v(i));
        }
        double[] dArr = this.f25451p;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f25451p, i, dArr2, i + 1, this.f25452q - i);
            this.f25451p = dArr2;
        }
        this.f25451p[i] = d;
        this.f25452q++;
        this.modCount++;
    }

    /* renamed from: o */
    private void m32144o(int i) {
        if (i < 0 || i >= this.f25452q) {
            throw new IndexOutOfBoundsException(m32145v(i));
        }
    }

    /* renamed from: v */
    private String m32145v(int i) {
        return "Index:" + i + ", Size:" + this.f25452q;
    }

    /* renamed from: A */
    public Double remove(int i) {
        mo23514b();
        m32144o(i);
        double[] dArr = this.f25451p;
        double d = dArr[i];
        int i2 = this.f25452q;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f25452q--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: B */
    public Double set(int i, Double d) {
        return Double.valueOf(mo23876C(i, d.doubleValue()));
    }

    /* renamed from: C */
    public double mo23876C(int i, double d) {
        mo23514b();
        m32144o(i);
        double[] dArr = this.f25451p;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo23514b();
        C9431b0.m31422a(collection);
        if (!(collection instanceof C9517n)) {
            return super.addAll(collection);
        }
        C9517n nVar = (C9517n) collection;
        int i = nVar.f25452q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25452q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f25451p;
            if (i3 > dArr.length) {
                this.f25451p = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(nVar.f25451p, 0, this.f25451p, this.f25452q, nVar.f25452q);
            this.f25452q = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9517n)) {
            return super.equals(obj);
        }
        C9517n nVar = (C9517n) obj;
        if (this.f25452q != nVar.f25452q) {
            return false;
        }
        double[] dArr = nVar.f25451p;
        for (int i = 0; i < this.f25452q; i++) {
            if (Double.doubleToLongBits(this.f25451p[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i, Double d) {
        m32143k(i, d.doubleValue());
    }

    /* renamed from: h */
    public boolean add(Double d) {
        mo23881j(d.doubleValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25452q; i2++) {
            i = (i * 31) + C9431b0.m31427f(Double.doubleToLongBits(this.f25451p[i2]));
        }
        return i;
    }

    /* renamed from: j */
    public void mo23881j(double d) {
        mo23514b();
        int i = this.f25452q;
        double[] dArr = this.f25451p;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f25451p = dArr2;
        }
        double[] dArr3 = this.f25451p;
        int i2 = this.f25452q;
        this.f25452q = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: p */
    public Double get(int i) {
        return Double.valueOf(mo23883r(i));
    }

    /* renamed from: r */
    public double mo23883r(int i) {
        m32144o(i);
        return this.f25451p[i];
    }

    public boolean remove(Object obj) {
        mo23514b();
        for (int i = 0; i < this.f25452q; i++) {
            if (obj.equals(Double.valueOf(this.f25451p[i]))) {
                double[] dArr = this.f25451p;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f25452q - i) - 1);
                this.f25452q--;
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
            double[] dArr = this.f25451p;
            System.arraycopy(dArr, i2, dArr, i, this.f25452q - i2);
            this.f25452q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f25452q;
    }

    /* renamed from: z */
    public C9431b0.C9433b mo23497n(int i) {
        if (i >= this.f25452q) {
            return new C9517n(Arrays.copyOf(this.f25451p, i), this.f25452q);
        }
        throw new IllegalArgumentException();
    }
}
