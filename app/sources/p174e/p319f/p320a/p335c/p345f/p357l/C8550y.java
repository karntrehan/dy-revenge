package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.y */
public enum C8550y implements C8235gd {
    CONTOUR_UNKNOWN(0),
    FACE_OVAL(1),
    LEFT_EYEBROW_TOP(2),
    LEFT_EYEBROW_BOTTOM(3),
    RIGHT_EYEBROW_TOP(4),
    RIGHT_EYEBROW_BOTTOM(5),
    LEFT_EYE(6),
    RIGHT_EYE(7),
    UPPER_LIP_TOP(8),
    UPPER_LIP_BOTTOM(9),
    LOWER_LIP_TOP(10),
    LOWER_LIP_BOTTOM(11),
    NOSE_BRIDGE(12),
    NOSE_BOTTOM(13),
    LEFT_CHEEK_CENTER(14),
    RIGHT_CHEEK_CENTER(15);
    

    /* renamed from: D */
    private static final C8254hd<C8550y> f23301D = null;

    /* renamed from: F */
    private final int f23316F;

    static {
        f23301D = new C8514w();
    }

    private C8550y(int i) {
        this.f23316F = i;
    }

    /* renamed from: e */
    public static C8550y m29308e(int i) {
        switch (i) {
            case 0:
                return CONTOUR_UNKNOWN;
            case 1:
                return FACE_OVAL;
            case 2:
                return LEFT_EYEBROW_TOP;
            case 3:
                return LEFT_EYEBROW_BOTTOM;
            case 4:
                return RIGHT_EYEBROW_TOP;
            case 5:
                return RIGHT_EYEBROW_BOTTOM;
            case 6:
                return LEFT_EYE;
            case 7:
                return RIGHT_EYE;
            case 8:
                return UPPER_LIP_TOP;
            case 9:
                return UPPER_LIP_BOTTOM;
            case 10:
                return LOWER_LIP_TOP;
            case 11:
                return LOWER_LIP_BOTTOM;
            case 12:
                return NOSE_BRIDGE;
            case 13:
                return NOSE_BOTTOM;
            case 14:
                return LEFT_CHEEK_CENTER;
            case 15:
                return RIGHT_CHEEK_CENTER;
            default:
                return null;
        }
    }

    /* renamed from: g */
    public static C8273id m29309g() {
        return C8532x.f23275a;
    }

    public final String toString() {
        return "<" + C8550y.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23316F + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f23316F;
    }
}
