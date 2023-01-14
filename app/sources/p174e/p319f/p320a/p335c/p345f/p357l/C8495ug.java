package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.ug */
public enum C8495ug implements C8235gd {
    VISIBILITY_UNKNOWN(0),
    VISIBLE(1),
    OCCLUDED_SELF(2),
    OCCLUDED_OTHER(3);
    

    /* renamed from: r */
    private static final C8254hd<C8495ug> f23145r = null;

    /* renamed from: t */
    private final int f23147t;

    static {
        f23145r = new C8459sg();
    }

    private C8495ug(int i) {
        this.f23147t = i;
    }

    /* renamed from: e */
    public static C8273id m29121e() {
        return C8477tg.f23100a;
    }

    /* renamed from: g */
    public static C8495ug m29122g(int i) {
        if (i == 0) {
            return VISIBILITY_UNKNOWN;
        }
        if (i == 1) {
            return VISIBLE;
        }
        if (i == 2) {
            return OCCLUDED_SELF;
        }
        if (i != 3) {
            return null;
        }
        return OCCLUDED_OTHER;
    }

    public final String toString() {
        return "<" + C8495ug.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23147t + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f23147t;
    }
}
