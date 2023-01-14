package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: com.facebook.react.uimanager.r */
public class C3038r {
    /* renamed from: a */
    public static float m12004a(float f) {
        return f / C2926c.m11505d().density;
    }

    /* renamed from: b */
    public static float m12005b(double d) {
        return m12006c((float) d);
    }

    /* renamed from: c */
    public static float m12006c(float f) {
        return TypedValue.applyDimension(1, f, C2926c.m11505d());
    }

    /* renamed from: d */
    public static float m12007d(double d) {
        return m12008e((float) d);
    }

    /* renamed from: e */
    public static float m12008e(float f) {
        return m12009f(f, Float.NaN);
    }

    /* renamed from: f */
    public static float m12009f(float f, float f2) {
        DisplayMetrics d = C2926c.m11505d();
        float f3 = d.scaledDensity;
        float f4 = d.density;
        float f5 = f3 / f4;
        if (f2 >= 1.0f && f2 < f5) {
            f3 = f4 * f2;
        }
        return f * f3;
    }
}
