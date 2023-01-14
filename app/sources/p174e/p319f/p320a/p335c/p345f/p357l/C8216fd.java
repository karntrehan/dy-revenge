package p174e.p319f.p320a.p335c.p345f.p357l;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.fd */
final class C8216fd extends C8382ob<Integer> implements RandomAccess, C8292jd, C8439re {

    /* renamed from: o */
    private static final C8216fd f22501o;

    /* renamed from: p */
    private int[] f22502p;

    /* renamed from: q */
    private int f22503q;

    static {
        C8216fd fdVar = new C8216fd(new int[0], 0);
        f22501o = fdVar;
        fdVar.zzb();
    }

    C8216fd() {
        this(new int[10], 0);
    }

    private C8216fd(int[] iArr, int i) {
        this.f22502p = iArr;
        this.f22503q = i;
    }

    /* renamed from: j */
    private final String m28498j(int i) {
        int i2 = this.f22503q;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m28499k(int i) {
        if (i < 0 || i >= this.f22503q) {
            throw new IndexOutOfBoundsException(m28498j(i));
        }
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo22053b();
        if (i < 0 || i > (i2 = this.f22503q)) {
            throw new IndexOutOfBoundsException(m28498j(i));
        }
        int[] iArr = this.f22502p;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f22502p, i, iArr2, i + 1, this.f22503q - i);
            this.f22502p = iArr2;
        }
        this.f22502p[i] = intValue;
        this.f22503q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo21796h(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo22053b();
        C8311kd.m28701e(collection);
        if (!(collection instanceof C8216fd)) {
            return super.addAll(collection);
        }
        C8216fd fdVar = (C8216fd) collection;
        int i = fdVar.f22503q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22503q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f22502p;
            if (i3 > iArr.length) {
                this.f22502p = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(fdVar.f22502p, 0, this.f22502p, this.f22503q, fdVar.f22503q);
            this.f22503q = i3;
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
        if (!(obj instanceof C8216fd)) {
            return super.equals(obj);
        }
        C8216fd fdVar = (C8216fd) obj;
        if (this.f22503q != fdVar.f22503q) {
            return false;
        }
        int[] iArr = fdVar.f22502p;
        for (int i = 0; i < this.f22503q; i++) {
            if (this.f22502p[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C8292jd mo21793f(int i) {
        if (i >= this.f22503q) {
            return new C8216fd(Arrays.copyOf(this.f22502p, i), this.f22503q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final int mo21794g(int i) {
        m28499k(i);
        return this.f22502p[i];
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m28499k(i);
        return Integer.valueOf(this.f22502p[i]);
    }

    /* renamed from: h */
    public final void mo21796h(int i) {
        mo22053b();
        int i2 = this.f22503q;
        int[] iArr = this.f22502p;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f22502p = iArr2;
        }
        int[] iArr3 = this.f22502p;
        int i3 = this.f22503q;
        this.f22503q = i3 + 1;
        iArr3[i3] = i;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22503q; i2++) {
            i = (i * 31) + this.f22502p[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f22503q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22502p[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo22053b();
        m28499k(i);
        int[] iArr = this.f22502p;
        int i2 = iArr[i];
        int i3 = this.f22503q;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f22503q--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo22053b();
        if (i2 >= i) {
            int[] iArr = this.f22502p;
            System.arraycopy(iArr, i2, iArr, i, this.f22503q - i2);
            this.f22503q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo22053b();
        m28499k(i);
        int[] iArr = this.f22502p;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f22503q;
    }
}
