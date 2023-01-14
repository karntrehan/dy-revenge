package p174e.p319f.p320a.p335c.p345f.p357l;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.sb */
final class C8454sb extends C8382ob<Boolean> implements RandomAccess, C8292jd, C8439re {

    /* renamed from: o */
    private static final C8454sb f23063o;

    /* renamed from: p */
    private boolean[] f23064p;

    /* renamed from: q */
    private int f23065q;

    static {
        C8454sb sbVar = new C8454sb(new boolean[0], 0);
        f23063o = sbVar;
        sbVar.zzb();
    }

    C8454sb() {
        this(new boolean[10], 0);
    }

    private C8454sb(boolean[] zArr, int i) {
        this.f23064p = zArr;
        this.f23065q = i;
    }

    /* renamed from: h */
    private final String m29027h(int i) {
        int i2 = this.f23065q;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: j */
    private final void m29028j(int i) {
        if (i < 0 || i >= this.f23065q) {
            throw new IndexOutOfBoundsException(m29027h(i));
        }
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo22053b();
        if (i < 0 || i > (i2 = this.f23065q)) {
            throw new IndexOutOfBoundsException(m29027h(i));
        }
        boolean[] zArr = this.f23064p;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f23064p, i, zArr2, i + 1, this.f23065q - i);
            this.f23064p = zArr2;
        }
        this.f23064p[i] = booleanValue;
        this.f23065q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo22138g(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo22053b();
        C8311kd.m28701e(collection);
        if (!(collection instanceof C8454sb)) {
            return super.addAll(collection);
        }
        C8454sb sbVar = (C8454sb) collection;
        int i = sbVar.f23065q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23065q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f23064p;
            if (i3 > zArr.length) {
                this.f23064p = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(sbVar.f23064p, 0, this.f23064p, this.f23065q, sbVar.f23065q);
            this.f23065q = i3;
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
        if (!(obj instanceof C8454sb)) {
            return super.equals(obj);
        }
        C8454sb sbVar = (C8454sb) obj;
        if (this.f23065q != sbVar.f23065q) {
            return false;
        }
        boolean[] zArr = sbVar.f23064p;
        for (int i = 0; i < this.f23065q; i++) {
            if (this.f23064p[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C8292jd mo21793f(int i) {
        if (i >= this.f23065q) {
            return new C8454sb(Arrays.copyOf(this.f23064p, i), this.f23065q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo22138g(boolean z) {
        mo22053b();
        int i = this.f23065q;
        boolean[] zArr = this.f23064p;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f23064p = zArr2;
        }
        boolean[] zArr3 = this.f23064p;
        int i2 = this.f23065q;
        this.f23065q = i2 + 1;
        zArr3[i2] = z;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m29028j(i);
        return Boolean.valueOf(this.f23064p[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23065q; i2++) {
            i = (i * 31) + C8311kd.m28697a(this.f23064p[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f23065q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23064p[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo22053b();
        m29028j(i);
        boolean[] zArr = this.f23064p;
        boolean z = zArr[i];
        int i2 = this.f23065q;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f23065q--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo22053b();
        if (i2 >= i) {
            boolean[] zArr = this.f23064p;
            System.arraycopy(zArr, i2, zArr, i, this.f23065q - i2);
            this.f23065q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo22053b();
        m29028j(i);
        boolean[] zArr = this.f23064p;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f23065q;
    }
}
