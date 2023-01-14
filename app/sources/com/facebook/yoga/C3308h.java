package com.facebook.yoga;

/* renamed from: com.facebook.yoga.h */
public enum C3308h {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: r */
    private final int f9339r;

    private C3308h(int i) {
        this.f9339r = i;
    }

    /* renamed from: e */
    public static C3308h m12972e(int i) {
        if (i == 0) {
            return INHERIT;
        }
        if (i == 1) {
            return LTR;
        }
        if (i == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    /* renamed from: g */
    public int mo10822g() {
        return this.f9339r;
    }
}
