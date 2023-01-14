package p174e.p319f.p393c.p394a.p404z.p405a;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.z.a.g */
final class C9462g extends C9442c<Boolean> implements C9431b0.C9432a, RandomAccess, C9441b1 {

    /* renamed from: o */
    private static final C9462g f25361o;

    /* renamed from: p */
    private boolean[] f25362p;

    /* renamed from: q */
    private int f25363q;

    static {
        C9462g gVar = new C9462g(new boolean[0], 0);
        f25361o = gVar;
        gVar.mo23511l();
    }

    C9462g() {
        this(new boolean[10], 0);
    }

    private C9462g(boolean[] zArr, int i) {
        this.f25362p = zArr;
        this.f25363q = i;
    }

    /* renamed from: j */
    private void m31584j(int i, boolean z) {
        int i2;
        mo23514b();
        if (i < 0 || i > (i2 = this.f25363q)) {
            throw new IndexOutOfBoundsException(m31586v(i));
        }
        boolean[] zArr = this.f25362p;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f25362p, i, zArr2, i + 1, this.f25363q - i);
            this.f25362p = zArr2;
        }
        this.f25362p[i] = z;
        this.f25363q++;
        this.modCount++;
    }

    /* renamed from: o */
    private void m31585o(int i) {
        if (i < 0 || i >= this.f25363q) {
            throw new IndexOutOfBoundsException(m31586v(i));
        }
    }

    /* renamed from: v */
    private String m31586v(int i) {
        return "Index:" + i + ", Size:" + this.f25363q;
    }

    /* renamed from: A */
    public Boolean remove(int i) {
        mo23514b();
        m31585o(i);
        boolean[] zArr = this.f25362p;
        boolean z = zArr[i];
        int i2 = this.f25363q;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f25363q--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: B */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo23601C(i, bool.booleanValue()));
    }

    /* renamed from: C */
    public boolean mo23601C(int i, boolean z) {
        mo23514b();
        m31585o(i);
        boolean[] zArr = this.f25362p;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo23514b();
        C9431b0.m31422a(collection);
        if (!(collection instanceof C9462g)) {
            return super.addAll(collection);
        }
        C9462g gVar = (C9462g) collection;
        int i = gVar.f25363q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25363q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f25362p;
            if (i3 > zArr.length) {
                this.f25362p = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(gVar.f25362p, 0, this.f25362p, this.f25363q, gVar.f25363q);
            this.f25363q = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9462g)) {
            return super.equals(obj);
        }
        C9462g gVar = (C9462g) obj;
        if (this.f25363q != gVar.f25363q) {
            return false;
        }
        boolean[] zArr = gVar.f25362p;
        for (int i = 0; i < this.f25363q; i++) {
            if (this.f25362p[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i, Boolean bool) {
        m31584j(i, bool.booleanValue());
    }

    /* renamed from: h */
    public boolean add(Boolean bool) {
        mo23606k(bool.booleanValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25363q; i2++) {
            i = (i * 31) + C9431b0.m31424c(this.f25362p[i2]);
        }
        return i;
    }

    /* renamed from: k */
    public void mo23606k(boolean z) {
        mo23514b();
        int i = this.f25363q;
        boolean[] zArr = this.f25362p;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f25362p = zArr2;
        }
        boolean[] zArr3 = this.f25362p;
        int i2 = this.f25363q;
        this.f25363q = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: p */
    public Boolean get(int i) {
        return Boolean.valueOf(mo23608r(i));
    }

    /* renamed from: r */
    public boolean mo23608r(int i) {
        m31585o(i);
        return this.f25362p[i];
    }

    public boolean remove(Object obj) {
        mo23514b();
        for (int i = 0; i < this.f25363q; i++) {
            if (obj.equals(Boolean.valueOf(this.f25362p[i]))) {
                boolean[] zArr = this.f25362p;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f25363q - i) - 1);
                this.f25363q--;
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
            boolean[] zArr = this.f25362p;
            System.arraycopy(zArr, i2, zArr, i, this.f25363q - i2);
            this.f25363q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f25363q;
    }

    /* renamed from: z */
    public C9431b0.C9432a mo23497n(int i) {
        if (i >= this.f25363q) {
            return new C9462g(Arrays.copyOf(this.f25362p, i), this.f25363q);
        }
        throw new IllegalArgumentException();
    }
}
