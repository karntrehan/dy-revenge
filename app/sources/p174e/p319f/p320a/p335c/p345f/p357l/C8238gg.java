package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.gg */
public enum C8238gg implements C8235gd {
    TYPE_UNKNOWN(0),
    FREE_FORM(1),
    FEMALE(2),
    MALE(3),
    AGE(5),
    NON_HUMAN(6),
    GLASSES(7),
    DARK_GLASSES(8),
    HEADWEAR(9),
    EYES_VISIBLE(10),
    LEFT_EYELID_CLOSED(16),
    RIGHT_EYELID_CLOSED(17),
    MOUTH_OPEN(11),
    FACIAL_HAIR(12),
    LONG_HAIR(13),
    FRONTAL_GAZE(14),
    SMILING(15),
    UNDER_EXPOSED(18),
    BLURRED(19),
    LEFT_EYE_VISIBLE(20),
    RIGHT_EYE_VISIBLE(21),
    LEFT_EAR_VISIBLE(22),
    RIGHT_EAR_VISIBLE(23),
    NOSE_TIP_VISIBLE(24),
    MOUTH_CENTER_VISIBLE(25);
    

    /* renamed from: M */
    private static final C8254hd<C8238gg> f22569M = null;

    /* renamed from: O */
    private final int f22584O;

    static {
        f22569M = new C8200eg();
    }

    private C8238gg(int i) {
        this.f22584O = i;
    }

    /* renamed from: e */
    public static C8273id m28542e() {
        return C8219fg.f22510a;
    }

    /* renamed from: g */
    public static C8238gg m28543g(int i) {
        switch (i) {
            case 0:
                return TYPE_UNKNOWN;
            case 1:
                return FREE_FORM;
            case 2:
                return FEMALE;
            case 3:
                return MALE;
            case 5:
                return AGE;
            case 6:
                return NON_HUMAN;
            case 7:
                return GLASSES;
            case 8:
                return DARK_GLASSES;
            case 9:
                return HEADWEAR;
            case 10:
                return EYES_VISIBLE;
            case 11:
                return MOUTH_OPEN;
            case 12:
                return FACIAL_HAIR;
            case 13:
                return LONG_HAIR;
            case 14:
                return FRONTAL_GAZE;
            case 15:
                return SMILING;
            case 16:
                return LEFT_EYELID_CLOSED;
            case 17:
                return RIGHT_EYELID_CLOSED;
            case 18:
                return UNDER_EXPOSED;
            case 19:
                return BLURRED;
            case 20:
                return LEFT_EYE_VISIBLE;
            case 21:
                return RIGHT_EYE_VISIBLE;
            case 22:
                return LEFT_EAR_VISIBLE;
            case 23:
                return RIGHT_EAR_VISIBLE;
            case 24:
                return NOSE_TIP_VISIBLE;
            case 25:
                return MOUTH_CENTER_VISIBLE;
            default:
                return null;
        }
    }

    public final String toString() {
        return "<" + C8238gg.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22584O + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f22584O;
    }
}
