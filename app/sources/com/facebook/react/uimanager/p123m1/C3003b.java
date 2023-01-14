package com.facebook.react.uimanager.p123m1;

/* renamed from: com.facebook.react.uimanager.m1.b */
enum C3003b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;

    /* renamed from: e */
    public static C3003b m11901e(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 0;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 1;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 2;
                    break;
                }
                break;
            case 1910893003:
                if (str.equals("scaleXY")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return OPACITY;
            case 1:
                return SCALE_X;
            case 2:
                return SCALE_Y;
            case 3:
                return SCALE_XY;
            default:
                throw new IllegalArgumentException("Unsupported animated property: " + str);
        }
    }
}
