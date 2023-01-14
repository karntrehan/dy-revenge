package com.facebook.yoga;

/* renamed from: com.facebook.yoga.u */
public enum C3322u {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    

    /* renamed from: s */
    private final int f9389s;

    private C3322u(int i) {
        this.f9389s = i;
    }

    /* renamed from: e */
    public static C3322u m13047e(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return POINT;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    /* renamed from: g */
    public int mo10832g() {
        return this.f9389s;
    }
}
