package com.facebook.react.uimanager;

/* renamed from: com.facebook.react.uimanager.c0 */
public class C2927c0 {

    /* renamed from: a */
    private static int f8207a = 1;

    /* renamed from: a */
    public static synchronized int m11510a() {
        int i;
        synchronized (C2927c0.class) {
            i = f8207a;
            f8207a = i + 10;
        }
        return i;
    }
}
