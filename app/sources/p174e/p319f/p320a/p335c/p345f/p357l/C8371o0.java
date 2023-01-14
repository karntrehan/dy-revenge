package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.o0 */
public enum C8371o0 implements C8235gd {
    MODE_TYPE_UNKNOWN(0),
    FAST(1),
    ACCURATE(2),
    SELFIE(3);
    

    /* renamed from: r */
    private static final C8254hd<C8371o0> f22844r = null;

    /* renamed from: t */
    private final int f22846t;

    static {
        f22844r = new C8335m0();
    }

    private C8371o0(int i) {
        this.f22846t = i;
    }

    /* renamed from: e */
    public static C8371o0 m28893e(int i) {
        if (i == 0) {
            return MODE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return FAST;
        }
        if (i == 2) {
            return ACCURATE;
        }
        if (i != 3) {
            return null;
        }
        return SELFIE;
    }

    /* renamed from: g */
    public static C8273id m28894g() {
        return C8353n0.f22806a;
    }

    public final String toString() {
        return "<" + C8371o0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22846t + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f22846t;
    }
}
