package p174e.p319f.p320a.p335c.p345f.p357l;

import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.f.a.c.f.l.rg */
public enum C8441rg implements C8235gd {
    LEFT_EYE(0),
    RIGHT_EYE(1),
    LEFT_OF_LEFT_EYEBROW(2),
    RIGHT_OF_LEFT_EYEBROW(3),
    LEFT_OF_RIGHT_EYEBROW(4),
    RIGHT_OF_RIGHT_EYEBROW(5),
    MIDPOINT_BETWEEN_EYES(6),
    NOSE_TIP(9),
    UPPER_LIP(10),
    LOWER_LIP(11),
    MOUTH_LEFT(12),
    MOUTH_RIGHT(13),
    MOUTH_CENTER(45),
    NOSE_BOTTOM_RIGHT(43),
    NOSE_BOTTOM_LEFT(44),
    NOSE_BOTTOM_CENTER(200),
    LEFT_EYE_TOP_BOUNDARY(220),
    LEFT_EYE_RIGHT_CORNER(221),
    LEFT_EYE_BOTTOM_BOUNDARY(222),
    LEFT_EYE_LEFT_CORNER(223),
    RIGHT_EYE_TOP_BOUNDARY(224),
    RIGHT_EYE_RIGHT_CORNER(225),
    RIGHT_EYE_BOTTOM_BOUNDARY(226),
    RIGHT_EYE_LEFT_CORNER(227),
    LEFT_EYEBROW_UPPER_MIDPOINT(300),
    RIGHT_EYEBROW_UPPER_MIDPOINT(302),
    LEFT_EAR_TRAGION(240),
    RIGHT_EAR_TRAGION(241),
    LEFT_EYE_PUPIL(304),
    RIGHT_EYE_PUPIL(305),
    FOREHEAD_GLABELLA(312),
    CHIN_GNATHION(314),
    CHIN_LEFT_GONION(315),
    CHIN_RIGHT_GONION(316),
    LEFT_CHEEK_CENTER(238),
    RIGHT_CHEEK_CENTER(239),
    LEFT_EAR_TOP(242),
    RIGHT_EAR_TOP(243),
    LANDMARK_UNKNOWN(15000);
    

    /* renamed from: a0 */
    private static final C8254hd<C8441rg> f23021a0 = null;

    /* renamed from: c0 */
    private final int f23036c0;

    static {
        f23021a0 = new C8387og();
    }

    private C8441rg(int i) {
        this.f23036c0 = i;
    }

    /* renamed from: e */
    public static C8273id m29017e() {
        return C8423qg.f22965a;
    }

    /* renamed from: g */
    public static C8441rg m29018g(int i) {
        if (i == 200) {
            return NOSE_BOTTOM_CENTER;
        }
        if (i == 300) {
            return LEFT_EYEBROW_UPPER_MIDPOINT;
        }
        if (i == 302) {
            return RIGHT_EYEBROW_UPPER_MIDPOINT;
        }
        if (i == 312) {
            return FOREHEAD_GLABELLA;
        }
        if (i == 15000) {
            return LANDMARK_UNKNOWN;
        }
        if (i == 304) {
            return LEFT_EYE_PUPIL;
        }
        if (i == 305) {
            return RIGHT_EYE_PUPIL;
        }
        switch (i) {
            case 0:
                return LEFT_EYE;
            case 1:
                return RIGHT_EYE;
            case 2:
                return LEFT_OF_LEFT_EYEBROW;
            case 3:
                return RIGHT_OF_LEFT_EYEBROW;
            case 4:
                return LEFT_OF_RIGHT_EYEBROW;
            case 5:
                return RIGHT_OF_RIGHT_EYEBROW;
            case 6:
                return MIDPOINT_BETWEEN_EYES;
            default:
                switch (i) {
                    case 9:
                        return NOSE_TIP;
                    case 10:
                        return UPPER_LIP;
                    case 11:
                        return LOWER_LIP;
                    case 12:
                        return MOUTH_LEFT;
                    case 13:
                        return MOUTH_RIGHT;
                    default:
                        switch (i) {
                            case 43:
                                return NOSE_BOTTOM_RIGHT;
                            case 44:
                                return NOSE_BOTTOM_LEFT;
                            case C9024k.f24746n4 /*45*/:
                                return MOUTH_CENTER;
                            default:
                                switch (i) {
                                    case 220:
                                        return LEFT_EYE_TOP_BOUNDARY;
                                    case 221:
                                        return LEFT_EYE_RIGHT_CORNER;
                                    case 222:
                                        return LEFT_EYE_BOTTOM_BOUNDARY;
                                    case 223:
                                        return LEFT_EYE_LEFT_CORNER;
                                    case 224:
                                        return RIGHT_EYE_TOP_BOUNDARY;
                                    case 225:
                                        return RIGHT_EYE_RIGHT_CORNER;
                                    case 226:
                                        return RIGHT_EYE_BOTTOM_BOUNDARY;
                                    case 227:
                                        return RIGHT_EYE_LEFT_CORNER;
                                    default:
                                        switch (i) {
                                            case 238:
                                                return LEFT_CHEEK_CENTER;
                                            case 239:
                                                return RIGHT_CHEEK_CENTER;
                                            case 240:
                                                return LEFT_EAR_TRAGION;
                                            case 241:
                                                return RIGHT_EAR_TRAGION;
                                            case 242:
                                                return LEFT_EAR_TOP;
                                            case 243:
                                                return RIGHT_EAR_TOP;
                                            default:
                                                switch (i) {
                                                    case 314:
                                                        return CHIN_GNATHION;
                                                    case 315:
                                                        return CHIN_LEFT_GONION;
                                                    case 316:
                                                        return CHIN_RIGHT_GONION;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final String toString() {
        return "<" + C8441rg.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23036c0 + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f23036c0;
    }
}
