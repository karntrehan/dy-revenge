package com.facebook.react.uimanager.events;

/* renamed from: com.facebook.react.uimanager.events.k */
public enum C2958k {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");
    

    /* renamed from: s */
    private final String f8285s;

    private C2958k(String str) {
        this.f8285s = str;
    }

    /* renamed from: e */
    public static String m11792e(C2958k kVar) {
        return kVar.mo9671g();
    }

    /* renamed from: g */
    public String mo9671g() {
        return this.f8285s;
    }
}
