package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.f */
class C2615f extends C2636s {

    /* renamed from: i */
    private final C2621l f7672i;

    /* renamed from: j */
    private final int f7673j;

    /* renamed from: k */
    private final double f7674k;

    /* renamed from: l */
    private final double f7675l;

    /* renamed from: m */
    private double f7676m = 0.0d;

    public C2615f(ReadableMap readableMap, C2621l lVar) {
        this.f7672i = lVar;
        this.f7673j = readableMap.getInt("input");
        this.f7674k = readableMap.getDouble("min");
        this.f7675l = readableMap.getDouble("max");
        this.f7758f = 0.0d;
    }

    /* renamed from: n */
    private double m10807n() {
        C2611b o = this.f7672i.mo8442o(this.f7673j);
        if (o != null && (o instanceof C2636s)) {
            return ((C2636s) o).mo8464k();
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
    }

    /* renamed from: d */
    public String mo8421d() {
        return "DiffClampAnimatedNode[" + this.f7660d + "]: InputNodeTag: " + this.f7673j + " min: " + this.f7674k + " max: " + this.f7675l + " lastValue: " + this.f7676m + " super: " + super.mo8421d();
    }

    /* renamed from: g */
    public void mo8422g() {
        double n = m10807n();
        double d = n - this.f7676m;
        this.f7676m = n;
        this.f7758f = Math.min(Math.max(this.f7758f + d, this.f7674k), this.f7675l);
    }
}
