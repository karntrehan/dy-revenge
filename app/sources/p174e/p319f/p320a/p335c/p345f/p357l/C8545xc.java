package p174e.p319f.p320a.p335c.p345f.p357l;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.xc */
final class C8545xc extends C8382ob<Float> implements RandomAccess, C8292jd, C8439re {

    /* renamed from: o */
    private static final C8545xc f23288o;

    /* renamed from: p */
    private float[] f23289p;

    /* renamed from: q */
    private int f23290q;

    static {
        C8545xc xcVar = new C8545xc(new float[0], 0);
        f23288o = xcVar;
        xcVar.zzb();
    }

    C8545xc() {
        this(new float[10], 0);
    }

    private C8545xc(float[] fArr, int i) {
        this.f23289p = fArr;
        this.f23290q = i;
    }

    /* renamed from: h */
    private final String m29244h(int i) {
        int i2 = this.f23290q;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: j */
    private final void m29245j(int i) {
        if (i < 0 || i >= this.f23290q) {
            throw new IndexOutOfBoundsException(m29244h(i));
        }
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo22053b();
        if (i < 0 || i > (i2 = this.f23290q)) {
            throw new IndexOutOfBoundsException(m29244h(i));
        }
        float[] fArr = this.f23289p;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f23289p, i, fArr2, i + 1, this.f23290q - i);
            this.f23289p = fArr2;
        }
        this.f23289p[i] = floatValue;
        this.f23290q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo22258g(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo22053b();
        C8311kd.m28701e(collection);
        if (!(collection instanceof C8545xc)) {
            return super.addAll(collection);
        }
        C8545xc xcVar = (C8545xc) collection;
        int i = xcVar.f23290q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23290q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f23289p;
            if (i3 > fArr.length) {
                this.f23289p = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(xcVar.f23289p, 0, this.f23289p, this.f23290q, xcVar.f23290q);
            this.f23290q = i3;
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
        if (!(obj instanceof C8545xc)) {
            return super.equals(obj);
        }
        C8545xc xcVar = (C8545xc) obj;
        if (this.f23290q != xcVar.f23290q) {
            return false;
        }
        float[] fArr = xcVar.f23289p;
        for (int i = 0; i < this.f23290q; i++) {
            if (Float.floatToIntBits(this.f23289p[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C8292jd mo21793f(int i) {
        if (i >= this.f23290q) {
            return new C8545xc(Arrays.copyOf(this.f23289p, i), this.f23290q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo22258g(float f) {
        mo22053b();
        int i = this.f23290q;
        float[] fArr = this.f23289p;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f23289p = fArr2;
        }
        float[] fArr3 = this.f23289p;
        int i2 = this.f23290q;
        this.f23290q = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m29245j(i);
        return Float.valueOf(this.f23289p[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23290q; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f23289p[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f23290q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23289p[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo22053b();
        m29245j(i);
        float[] fArr = this.f23289p;
        float f = fArr[i];
        int i2 = this.f23290q;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f23290q--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo22053b();
        if (i2 >= i) {
            float[] fArr = this.f23289p;
            System.arraycopy(fArr, i2, fArr, i, this.f23290q - i2);
            this.f23290q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo22053b();
        m29245j(i);
        float[] fArr = this.f23289p;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f23290q;
    }
}
