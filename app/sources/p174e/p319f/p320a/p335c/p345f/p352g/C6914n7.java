package p174e.p319f.p320a.p335c.p345f.p352g;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.n7 */
final class C6914n7 extends C6850j7 implements RandomAccess, C6804g9, C6917na {

    /* renamed from: o */
    private static final C6914n7 f18717o;

    /* renamed from: p */
    private boolean[] f18718p;

    /* renamed from: q */
    private int f18719q;

    static {
        C6914n7 n7Var = new C6914n7(new boolean[0], 0);
        f18717o = n7Var;
        n7Var.zzb();
    }

    C6914n7() {
        this(new boolean[10], 0);
    }

    private C6914n7(boolean[] zArr, int i) {
        this.f18718p = zArr;
        this.f18719q = i;
    }

    /* renamed from: h */
    private final String m26215h(int i) {
        int i2 = this.f18719q;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m26216j(int i) {
        if (i < 0 || i >= this.f18719q) {
            throw new IndexOutOfBoundsException(m26215h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo19878b();
        if (i < 0 || i > (i2 = this.f18719q)) {
            throw new IndexOutOfBoundsException(m26215h(i));
        }
        boolean[] zArr = this.f18718p;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f18718p, i, zArr2, i + 1, this.f18719q - i);
            this.f18718p = zArr2;
        }
        this.f18718p[i] = booleanValue;
        this.f18719q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo19992g(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19878b();
        C6820h9.m25836e(collection);
        if (!(collection instanceof C6914n7)) {
            return super.addAll(collection);
        }
        C6914n7 n7Var = (C6914n7) collection;
        int i = n7Var.f18719q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18719q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f18718p;
            if (i3 > zArr.length) {
                this.f18718p = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(n7Var.f18718p, 0, this.f18718p, this.f18719q, n7Var.f18719q);
            this.f18719q = i3;
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
        if (!(obj instanceof C6914n7)) {
            return super.equals(obj);
        }
        C6914n7 n7Var = (C6914n7) obj;
        if (this.f18719q != n7Var.f18719q) {
            return false;
        }
        boolean[] zArr = n7Var.f18718p;
        for (int i = 0; i < this.f18719q; i++) {
            if (this.f18718p[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C6804g9 mo19570f(int i) {
        if (i >= this.f18719q) {
            return new C6914n7(Arrays.copyOf(this.f18718p, i), this.f18719q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo19992g(boolean z) {
        mo19878b();
        int i = this.f18719q;
        boolean[] zArr = this.f18718p;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f18718p = zArr2;
        }
        boolean[] zArr3 = this.f18718p;
        int i2 = this.f18719q;
        this.f18719q = i2 + 1;
        zArr3[i2] = z;
    }

    public final /* synthetic */ Object get(int i) {
        m26216j(i);
        return Boolean.valueOf(this.f18718p[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18719q; i2++) {
            i = (i * 31) + C6820h9.m25832a(this.f18718p[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f18719q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18718p[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19878b();
        m26216j(i);
        boolean[] zArr = this.f18718p;
        boolean z = zArr[i];
        int i2 = this.f18719q;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f18719q--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo19878b();
        if (i2 >= i) {
            boolean[] zArr = this.f18718p;
            System.arraycopy(zArr, i2, zArr, i, this.f18719q - i2);
            this.f18719q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo19878b();
        m26216j(i);
        boolean[] zArr = this.f18718p;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f18719q;
    }
}
