package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.g */
public enum C8221g implements C8235gd {
    RGBA(0),
    NV12(5),
    NV21(1),
    YV12(6),
    YV21(7),
    RGB(2),
    GRAY(3),
    GRAY16(4);
    

    /* renamed from: v */
    private static final C8254hd<C8221g> f22520v = null;

    /* renamed from: x */
    private final int f22522x;

    static {
        f22520v = new C8183e();
    }

    private C8221g(int i) {
        this.f22522x = i;
    }

    /* renamed from: e */
    public static C8221g m28519e(int i) {
        switch (i) {
            case 0:
                return RGBA;
            case 1:
                return NV21;
            case 2:
                return RGB;
            case 3:
                return GRAY;
            case 4:
                return GRAY16;
            case 5:
                return NV12;
            case 6:
                return YV12;
            case 7:
                return YV21;
            default:
                return null;
        }
    }

    /* renamed from: g */
    public static C8273id m28520g() {
        return C8202f.f22287a;
    }

    public final String toString() {
        return "<" + C8221g.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22522x + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f22522x;
    }
}
