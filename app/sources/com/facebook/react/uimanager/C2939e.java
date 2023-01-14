package com.facebook.react.uimanager;

/* renamed from: com.facebook.react.uimanager.e */
public class C2939e {
    /* renamed from: a */
    public static boolean m11588a(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) && Float.isNaN(f2) : Math.abs(f2 - f) < 1.0E-5f;
    }
}
