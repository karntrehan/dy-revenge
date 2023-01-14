package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.j0 */
public enum C8279j0 implements C8235gd {
    LANDMARK_TYPE_UNKNOWN(0),
    NO_LANDMARK(1),
    ALL_LANDMARKS(2),
    CONTOUR_LANDMARKS(3);
    

    /* renamed from: r */
    private static final C8254hd<C8279j0> f22645r = null;

    /* renamed from: t */
    private final int f22647t;

    static {
        f22645r = new C8241h0();
    }

    private C8279j0(int i) {
        this.f22647t = i;
    }

    /* renamed from: e */
    public static C8279j0 m28609e(int i) {
        if (i == 0) {
            return LANDMARK_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return NO_LANDMARK;
        }
        if (i == 2) {
            return ALL_LANDMARKS;
        }
        if (i != 3) {
            return null;
        }
        return CONTOUR_LANDMARKS;
    }

    /* renamed from: g */
    public static C8273id m28610g() {
        return C8260i0.f22605a;
    }

    public final String toString() {
        return "<" + C8279j0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22647t + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f22647t;
    }
}
