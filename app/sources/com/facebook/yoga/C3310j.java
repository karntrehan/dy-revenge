package com.facebook.yoga;

/* renamed from: com.facebook.yoga.j */
public enum C3310j {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    

    /* renamed from: x */
    private final int f9354x;

    private C3310j(int i) {
        this.f9354x = i;
    }

    /* renamed from: e */
    public static C3310j m12975e(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }

    /* renamed from: g */
    public int mo10824g() {
        return this.f9354x;
    }
}
