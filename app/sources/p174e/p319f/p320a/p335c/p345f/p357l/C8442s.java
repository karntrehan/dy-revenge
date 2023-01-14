package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.s */
public enum C8442s implements C8235gd {
    CLASSIFICATION_TYPE_UNKNOWN(0),
    NO_CLASSIFICATION(1),
    ALL_CLASSIFICATIONS(2);
    

    /* renamed from: q */
    private static final C8254hd<C8442s> f23040q = null;

    /* renamed from: s */
    private final int f23042s;

    static {
        f23040q = new C8406q();
    }

    private C8442s(int i) {
        this.f23042s = i;
    }

    /* renamed from: e */
    public static C8442s m29019e(int i) {
        if (i == 0) {
            return CLASSIFICATION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return NO_CLASSIFICATION;
        }
        if (i != 2) {
            return null;
        }
        return ALL_CLASSIFICATIONS;
    }

    /* renamed from: g */
    public static C8273id m29020g() {
        return C8424r.f22966a;
    }

    public final String toString() {
        return "<" + C8442s.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23042s + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f23042s;
    }
}
