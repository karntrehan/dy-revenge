package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.m */
public enum C8334m implements C8235gd {
    ROTATION_0(0),
    ROTATION_90(1),
    ROTATION_180(2),
    ROTATION_270(3);
    

    /* renamed from: r */
    private static final C8254hd<C8334m> f22774r = null;

    /* renamed from: t */
    private final int f22776t;

    static {
        f22774r = new C8297k();
    }

    private C8334m(int i) {
        this.f22776t = i;
    }

    /* renamed from: e */
    public static C8334m m28830e(int i) {
        if (i == 0) {
            return ROTATION_0;
        }
        if (i == 1) {
            return ROTATION_90;
        }
        if (i == 2) {
            return ROTATION_180;
        }
        if (i != 3) {
            return null;
        }
        return ROTATION_270;
    }

    /* renamed from: g */
    public static C8273id m28831g() {
        return C8316l.f22736a;
    }

    public final String toString() {
        return "<" + C8334m.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22776t + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f22776t;
    }
}
