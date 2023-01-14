package p174e.p319f.p393c.p394a.p404z.p405a;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.z.a.a0 */
final class C9428a0 extends C9442c<Integer> implements C9431b0.C9438g, RandomAccess, C9441b1 {

    /* renamed from: o */
    private static final C9428a0 f25301o;

    /* renamed from: p */
    private int[] f25302p;

    /* renamed from: q */
    private int f25303q;

    static {
        C9428a0 a0Var = new C9428a0(new int[0], 0);
        f25301o = a0Var;
        a0Var.mo23511l();
    }

    C9428a0() {
        this(new int[10], 0);
    }

    private C9428a0(int[] iArr, int i) {
        this.f25302p = iArr;
        this.f25303q = i;
    }

    /* renamed from: k */
    private void m31402k(int i, int i2) {
        int i3;
        mo23514b();
        if (i < 0 || i > (i3 = this.f25303q)) {
            throw new IndexOutOfBoundsException(m31404v(i));
        }
        int[] iArr = this.f25302p;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f25302p, i, iArr2, i + 1, this.f25303q - i);
            this.f25302p = iArr2;
        }
        this.f25302p[i] = i2;
        this.f25303q++;
        this.modCount++;
    }

    /* renamed from: o */
    private void m31403o(int i) {
        if (i < 0 || i >= this.f25303q) {
            throw new IndexOutOfBoundsException(m31404v(i));
        }
    }

    /* renamed from: v */
    private String m31404v(int i) {
        return "Index:" + i + ", Size:" + this.f25303q;
    }

    /* renamed from: A */
    public Integer remove(int i) {
        mo23514b();
        m31403o(i);
        int[] iArr = this.f25302p;
        int i2 = iArr[i];
        int i3 = this.f25303q;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f25303q--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: B */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo23487C(i, num.intValue()));
    }

    /* renamed from: C */
    public int mo23487C(int i, int i2) {
        mo23514b();
        m31403o(i);
        int[] iArr = this.f25302p;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo23514b();
        C9431b0.m31422a(collection);
        if (!(collection instanceof C9428a0)) {
            return super.addAll(collection);
        }
        C9428a0 a0Var = (C9428a0) collection;
        int i = a0Var.f25303q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25303q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f25302p;
            if (i3 > iArr.length) {
                this.f25302p = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(a0Var.f25302p, 0, this.f25302p, this.f25303q, a0Var.f25303q);
            this.f25303q = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9428a0)) {
            return super.equals(obj);
        }
        C9428a0 a0Var = (C9428a0) obj;
        if (this.f25303q != a0Var.f25303q) {
            return false;
        }
        int[] iArr = a0Var.f25302p;
        for (int i = 0; i < this.f25303q; i++) {
            if (this.f25302p[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i, Integer num) {
        m31402k(i, num.intValue());
    }

    /* renamed from: h */
    public boolean add(Integer num) {
        mo23496j(num.intValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25303q; i2++) {
            i = (i * 31) + this.f25302p[i2];
        }
        return i;
    }

    /* renamed from: j */
    public void mo23496j(int i) {
        mo23514b();
        int i2 = this.f25303q;
        int[] iArr = this.f25302p;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f25302p = iArr2;
        }
        int[] iArr3 = this.f25302p;
        int i3 = this.f25303q;
        this.f25303q = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: p */
    public Integer get(int i) {
        return Integer.valueOf(mo23499r(i));
    }

    /* renamed from: r */
    public int mo23499r(int i) {
        m31403o(i);
        return this.f25302p[i];
    }

    public boolean remove(Object obj) {
        mo23514b();
        for (int i = 0; i < this.f25303q; i++) {
            if (obj.equals(Integer.valueOf(this.f25302p[i]))) {
                int[] iArr = this.f25302p;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f25303q - i) - 1);
                this.f25303q--;
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
            int[] iArr = this.f25302p;
            System.arraycopy(iArr, i2, iArr, i, this.f25303q - i2);
            this.f25303q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f25303q;
    }

    /* renamed from: z */
    public C9431b0.C9438g mo23497n(int i) {
        if (i >= this.f25303q) {
            return new C9428a0(Arrays.copyOf(this.f25302p, i), this.f25303q);
        }
        throw new IllegalArgumentException();
    }
}
