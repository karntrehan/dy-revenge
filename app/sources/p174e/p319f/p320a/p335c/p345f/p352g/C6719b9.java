package p174e.p319f.p320a.p335c.p345f.p352g;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.b9 */
final class C6719b9 extends C6850j7 implements RandomAccess, C6770e9, C6917na {

    /* renamed from: o */
    private static final C6719b9 f18386o;

    /* renamed from: p */
    private int[] f18387p;

    /* renamed from: q */
    private int f18388q;

    static {
        C6719b9 b9Var = new C6719b9(new int[0], 0);
        f18386o = b9Var;
        b9Var.zzb();
    }

    C6719b9() {
        this(new int[10], 0);
    }

    private C6719b9(int[] iArr, int i) {
        this.f18387p = iArr;
        this.f18388q = i;
    }

    /* renamed from: h */
    public static C6719b9 m25459h() {
        return f18386o;
    }

    /* renamed from: k */
    private final String m25460k(int i) {
        int i2 = this.f18388q;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: o */
    private final void m25461o(int i) {
        if (i < 0 || i >= this.f18388q) {
            throw new IndexOutOfBoundsException(m25460k(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo19878b();
        if (i < 0 || i > (i2 = this.f18388q)) {
            throw new IndexOutOfBoundsException(m25460k(i));
        }
        int[] iArr = this.f18387p;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f18387p, i, iArr2, i + 1, this.f18388q - i);
            this.f18387p = iArr2;
        }
        this.f18387p[i] = intValue;
        this.f18388q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo19575j(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19878b();
        C6820h9.m25836e(collection);
        if (!(collection instanceof C6719b9)) {
            return super.addAll(collection);
        }
        C6719b9 b9Var = (C6719b9) collection;
        int i = b9Var.f18388q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18388q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f18387p;
            if (i3 > iArr.length) {
                this.f18387p = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(b9Var.f18387p, 0, this.f18387p, this.f18388q, b9Var.f18388q);
            this.f18388q = i3;
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
        if (!(obj instanceof C6719b9)) {
            return super.equals(obj);
        }
        C6719b9 b9Var = (C6719b9) obj;
        if (this.f18388q != b9Var.f18388q) {
            return false;
        }
        int[] iArr = b9Var.f18387p;
        for (int i = 0; i < this.f18388q; i++) {
            if (this.f18387p[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final int mo19571g(int i) {
        m25461o(i);
        return this.f18387p[i];
    }

    public final /* synthetic */ Object get(int i) {
        m25461o(i);
        return Integer.valueOf(this.f18387p[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18388q; i2++) {
            i = (i * 31) + this.f18387p[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f18388q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18387p[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo19575j(int i) {
        mo19878b();
        int i2 = this.f18388q;
        int[] iArr = this.f18387p;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f18387p = iArr2;
        }
        int[] iArr3 = this.f18387p;
        int i3 = this.f18388q;
        this.f18388q = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19878b();
        m25461o(i);
        int[] iArr = this.f18387p;
        int i2 = iArr[i];
        int i3 = this.f18388q;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f18388q--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo19878b();
        if (i2 >= i) {
            int[] iArr = this.f18387p;
            System.arraycopy(iArr, i2, iArr, i, this.f18388q - i2);
            this.f18388q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo19878b();
        m25461o(i);
        int[] iArr = this.f18387p;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f18388q;
    }

    /* renamed from: w */
    public final C6770e9 mo19570f(int i) {
        if (i >= this.f18388q) {
            return new C6719b9(Arrays.copyOf(this.f18387p, i), this.f18388q);
        }
        throw new IllegalArgumentException();
    }
}
