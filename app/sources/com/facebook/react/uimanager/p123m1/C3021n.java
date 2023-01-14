package com.facebook.react.uimanager.p123m1;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.facebook.react.uimanager.m1.n */
class C3021n implements Interpolator {

    /* renamed from: a */
    private final float f8390a;

    public C3021n(float f) {
        this.f8390a = f;
    }

    /* renamed from: a */
    public static float m11923a(ReadableMap readableMap) {
        if (readableMap.getType("springDamping").equals(ReadableType.Number)) {
            return (float) readableMap.getDouble("springDamping");
        }
        return 0.5f;
    }

    public float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.f8390a;
        return (float) ((pow * Math.sin(((((double) (f - (f2 / 4.0f))) * 3.141592653589793d) * 2.0d) / ((double) f2))) + 1.0d);
    }
}
