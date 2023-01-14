package com.facebook.yoga;

/* renamed from: com.facebook.yoga.n */
public enum C3314n {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    

    /* renamed from: r */
    private final int f9373r;

    private C3314n(int i) {
        this.f9373r = i;
    }

    /* renamed from: e */
    public static C3314n m12980e(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
