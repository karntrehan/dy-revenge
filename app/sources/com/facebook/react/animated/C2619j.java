package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.j */
class C2619j extends C2636s {

    /* renamed from: i */
    private final C2621l f7697i;

    /* renamed from: j */
    private final int f7698j;

    /* renamed from: k */
    private final double f7699k;

    public C2619j(ReadableMap readableMap, C2621l lVar) {
        this.f7697i = lVar;
        this.f7698j = readableMap.getInt("input");
        this.f7699k = readableMap.getDouble("modulus");
    }

    /* renamed from: d */
    public String mo8421d() {
        return "NativeAnimatedNodesManager[" + this.f7660d + "] inputNode: " + this.f7698j + " modulus: " + this.f7699k + " super: " + super.mo8421d();
    }

    /* renamed from: g */
    public void mo8422g() {
        C2611b o = this.f7697i.mo8442o(this.f7698j);
        if (o == null || !(o instanceof C2636s)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double k = ((C2636s) o).mo8464k();
        double d = this.f7699k;
        this.f7758f = ((k % d) + d) % d;
    }
}
