package com.yalantis.ucrop.p445m;

/* renamed from: com.yalantis.ucrop.m.b */
public final class C10159b {
    /* renamed from: a */
    public static float m34384a(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f / (f4 / 2.0f);
        float f7 = f3 / 2.0f;
        if (f6 < 1.0f) {
            f5 = f7 * f6 * f6 * f6;
        } else {
            float f8 = f6 - 2.0f;
            f5 = f7 * ((f8 * f8 * f8) + 2.0f);
        }
        return f5 + f2;
    }

    /* renamed from: b */
    public static float m34385b(float f, float f2, float f3, float f4) {
        float f5 = (f / f4) - 1.0f;
        return (f3 * ((f5 * f5 * f5) + 1.0f)) + f2;
    }
}
