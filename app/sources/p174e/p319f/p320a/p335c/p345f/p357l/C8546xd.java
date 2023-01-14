package p174e.p319f.p320a.p335c.p345f.p357l;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.xd */
final class C8546xd extends C8382ob<Long> implements RandomAccess, C8292jd, C8439re {

    /* renamed from: o */
    private static final C8546xd f23291o;

    /* renamed from: p */
    private long[] f23292p;

    /* renamed from: q */
    private int f23293q;

    static {
        C8546xd xdVar = new C8546xd(new long[0], 0);
        f23291o = xdVar;
        xdVar.zzb();
    }

    C8546xd() {
        this(new long[10], 0);
    }

    private C8546xd(long[] jArr, int i) {
        this.f23292p = jArr;
        this.f23293q = i;
    }

    /* renamed from: j */
    private final String m29248j(int i) {
        int i2 = this.f23293q;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m29249k(int i) {
        if (i < 0 || i >= this.f23293q) {
            throw new IndexOutOfBoundsException(m29248j(i));
        }
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo22053b();
        if (i < 0 || i > (i2 = this.f23293q)) {
            throw new IndexOutOfBoundsException(m29248j(i));
        }
        long[] jArr = this.f23292p;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f23292p, i, jArr2, i + 1, this.f23293q - i);
            this.f23292p = jArr2;
        }
        this.f23292p[i] = longValue;
        this.f23293q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo22268h(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo22053b();
        C8311kd.m28701e(collection);
        if (!(collection instanceof C8546xd)) {
            return super.addAll(collection);
        }
        C8546xd xdVar = (C8546xd) collection;
        int i = xdVar.f23293q;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23293q;
        if (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f23292p;
            if (i3 > jArr.length) {
                this.f23292p = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(xdVar.f23292p, 0, this.f23292p, this.f23293q, xdVar.f23293q);
            this.f23293q = i3;
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
        if (!(obj instanceof C8546xd)) {
            return super.equals(obj);
        }
        C8546xd xdVar = (C8546xd) obj;
        if (this.f23293q != xdVar.f23293q) {
            return false;
        }
        long[] jArr = xdVar.f23292p;
        for (int i = 0; i < this.f23293q; i++) {
            if (this.f23292p[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C8292jd mo21793f(int i) {
        if (i >= this.f23293q) {
            return new C8546xd(Arrays.copyOf(this.f23292p, i), this.f23293q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final long mo22266g(int i) {
        m29249k(i);
        return this.f23292p[i];
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m29249k(i);
        return Long.valueOf(this.f23292p[i]);
    }

    /* renamed from: h */
    public final void mo22268h(long j) {
        mo22053b();
        int i = this.f23293q;
        long[] jArr = this.f23292p;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f23292p = jArr2;
        }
        long[] jArr3 = this.f23292p;
        int i2 = this.f23293q;
        this.f23293q = i2 + 1;
        jArr3[i2] = j;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23293q; i2++) {
            i = (i * 31) + C8311kd.m28699c(this.f23292p[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f23293q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23292p[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo22053b();
        m29249k(i);
        long[] jArr = this.f23292p;
        long j = jArr[i];
        int i2 = this.f23293q;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f23293q--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo22053b();
        if (i2 >= i) {
            long[] jArr = this.f23292p;
            System.arraycopy(jArr, i2, jArr, i, this.f23293q - i2);
            this.f23293q -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo22053b();
        m29249k(i);
        long[] jArr = this.f23292p;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f23293q;
    }
}
