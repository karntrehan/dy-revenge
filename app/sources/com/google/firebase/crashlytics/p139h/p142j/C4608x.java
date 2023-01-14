package com.google.firebase.crashlytics.p139h.p142j;

/* renamed from: com.google.firebase.crashlytics.h.j.x */
public enum C4608x {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: s */
    private final int f13050s;

    private C4608x(int i) {
        this.f13050s = i;
    }

    /* renamed from: e */
    public static C4608x m17545e(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: g */
    public int mo14233g() {
        return this.f13050s;
    }

    public String toString() {
        return Integer.toString(this.f13050s);
    }
}
