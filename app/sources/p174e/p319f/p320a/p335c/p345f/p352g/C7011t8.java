package p174e.p319f.p320a.p335c.p345f.p352g;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.t8 */
final class C7011t8 extends C6850j7 implements RandomAccess, C6804g9, C6917na {

    /* renamed from: o */
    private static final C7011t8 f18952o;

    /* renamed from: p */
    private float[] f18953p;

    /* renamed from: q */
    private int f18954q;

    static {
        C7011t8 t8Var = new C7011t8(new float[0], 0);
        f18952o = t8Var;
        t8Var.zzb();
    }

    C7011t8() {
        this(new float[10], 0);
    }

    private C7011t8(float[] fArr, int i) {
        this.f18953p = fArr;
        this.f18954q = i;
    }

    /* renamed from: h */
    private final String m26543h(int i) {
        int i2 = this.f18954q;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m26544j(int i) {
        if (i < 0 || i >= this.f18954q) {
            throw new IndexOutOfBoundsException(m26543h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo19878b();
        if (i < 0 || i > (i2 = this.f18954q)) {
            throw new IndexOutOfBoundsException(m26543h(i));
        }
        float[] fArr = this.f18953p;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f18953p, i, fArr2, i + 1, this.f18954q - i);
            this.f18953p = fArr2;
        }
        this.f18953p[i] = floatValue;
        this.f18954q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo20188g(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19878b();
        C6820h9.m25836e(collection);
        if (!(collection instanceof C7011t8)) {
            return super.addAll(collection);
        }
        C7011t8 t8Var = (C7011t8) collection;
        int i = t8Var.f18954q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18954q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f18953p;
            if (i3 > fArr.length) {
                this.f18953p = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(t8Var.f18953p, 0, this.f18953p, this.f18954q, t8Var.f18954q);
            this.f18954q = i3;
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
        if (!(obj instanceof C7011t8)) {
            return super.equals(obj);
        }
        C7011t8 t8Var = (C7011t8) obj;
        if (this.f18954q != t8Var.f18954q) {
            return false;
        }
        float[] fArr = t8Var.f18953p;
        for (int i = 0; i < this.f18954q; i++) {
            if (Float.floatToIntBits(this.f18953p[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C6804g9 mo19570f(int i) {
        if (i >= this.f18954q) {
            return new C7011t8(Arrays.copyOf(this.f18953p, i), this.f18954q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo20188g(float f) {
        mo19878b();
        int i = this.f18954q;
        float[] fArr = this.f18953p;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f18953p = fArr2;
        }
        float[] fArr3 = this.f18953p;
        int i2 = this.f18954q;
        this.f18954q = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* synthetic */ Object get(int i) {
        m26544j(i);
        return Float.valueOf(this.f18953p[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18954q; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f18953p[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f18954q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18953p[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19878b();
        m26544j(i);
        float[] fArr = this.f18953p;
        float f = fArr[i];
        int i2 = this.f18954q;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f18954q--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo19878b();
        if (i2 >= i) {
            float[] fArr = this.f18953p;
            System.arraycopy(fArr, i2, fArr, i, this.f18954q - i2);
            this.f18954q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo19878b();
        m26544j(i);
        float[] fArr = this.f18953p;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f18954q;
    }
}
