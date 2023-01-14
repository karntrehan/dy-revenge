package p174e.p319f.p393c.p394a.p404z.p405a;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.z.a.x */
final class C9573x extends C9442c<Float> implements C9431b0.C9437f, RandomAccess, C9441b1 {

    /* renamed from: o */
    private static final C9573x f25639o;

    /* renamed from: p */
    private float[] f25640p;

    /* renamed from: q */
    private int f25641q;

    static {
        C9573x xVar = new C9573x(new float[0], 0);
        f25639o = xVar;
        xVar.mo23511l();
    }

    C9573x() {
        this(new float[10], 0);
    }

    private C9573x(float[] fArr, int i) {
        this.f25640p = fArr;
        this.f25641q = i;
    }

    /* renamed from: k */
    private void m32610k(int i, float f) {
        int i2;
        mo23514b();
        if (i < 0 || i > (i2 = this.f25641q)) {
            throw new IndexOutOfBoundsException(m32612v(i));
        }
        float[] fArr = this.f25640p;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f25640p, i, fArr2, i + 1, this.f25641q - i);
            this.f25640p = fArr2;
        }
        this.f25640p[i] = f;
        this.f25641q++;
        this.modCount++;
    }

    /* renamed from: o */
    private void m32611o(int i) {
        if (i < 0 || i >= this.f25641q) {
            throw new IndexOutOfBoundsException(m32612v(i));
        }
    }

    /* renamed from: v */
    private String m32612v(int i) {
        return "Index:" + i + ", Size:" + this.f25641q;
    }

    /* renamed from: A */
    public Float remove(int i) {
        mo23514b();
        m32611o(i);
        float[] fArr = this.f25640p;
        float f = fArr[i];
        int i2 = this.f25641q;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f25641q--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: B */
    public Float set(int i, Float f) {
        return Float.valueOf(mo24038C(i, f.floatValue()));
    }

    /* renamed from: C */
    public float mo24038C(int i, float f) {
        mo23514b();
        m32611o(i);
        float[] fArr = this.f25640p;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo23514b();
        C9431b0.m31422a(collection);
        if (!(collection instanceof C9573x)) {
            return super.addAll(collection);
        }
        C9573x xVar = (C9573x) collection;
        int i = xVar.f25641q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25641q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f25640p;
            if (i3 > fArr.length) {
                this.f25640p = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(xVar.f25640p, 0, this.f25640p, this.f25641q, xVar.f25641q);
            this.f25641q = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9573x)) {
            return super.equals(obj);
        }
        C9573x xVar = (C9573x) obj;
        if (this.f25641q != xVar.f25641q) {
            return false;
        }
        float[] fArr = xVar.f25640p;
        for (int i = 0; i < this.f25641q; i++) {
            if (Float.floatToIntBits(this.f25640p[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i, Float f) {
        m32610k(i, f.floatValue());
    }

    /* renamed from: h */
    public boolean add(Float f) {
        mo24043j(f.floatValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25641q; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f25640p[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public void mo24043j(float f) {
        mo23514b();
        int i = this.f25641q;
        float[] fArr = this.f25640p;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f25640p = fArr2;
        }
        float[] fArr3 = this.f25640p;
        int i2 = this.f25641q;
        this.f25641q = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: p */
    public Float get(int i) {
        return Float.valueOf(mo24045r(i));
    }

    /* renamed from: r */
    public float mo24045r(int i) {
        m32611o(i);
        return this.f25640p[i];
    }

    public boolean remove(Object obj) {
        mo23514b();
        for (int i = 0; i < this.f25641q; i++) {
            if (obj.equals(Float.valueOf(this.f25640p[i]))) {
                float[] fArr = this.f25640p;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f25641q - i) - 1);
                this.f25641q--;
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
            float[] fArr = this.f25640p;
            System.arraycopy(fArr, i2, fArr, i, this.f25641q - i2);
            this.f25641q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f25641q;
    }

    /* renamed from: z */
    public C9431b0.C9437f mo23497n(int i) {
        if (i >= this.f25641q) {
            return new C9573x(Arrays.copyOf(this.f25640p, i), this.f25641q);
        }
        throw new IllegalArgumentException();
    }
}
