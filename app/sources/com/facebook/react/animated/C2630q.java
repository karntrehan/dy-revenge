package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.q */
class C2630q extends C2611b {

    /* renamed from: e */
    private final C2621l f7744e;

    /* renamed from: f */
    private final int f7745f;

    /* renamed from: g */
    private final int f7746g;

    /* renamed from: h */
    private final int f7747h;

    /* renamed from: i */
    private final JavaOnlyMap f7748i;

    C2630q(ReadableMap readableMap, C2621l lVar) {
        this.f7744e = lVar;
        this.f7745f = readableMap.getInt("animationId");
        this.f7746g = readableMap.getInt("toValue");
        this.f7747h = readableMap.getInt("value");
        this.f7748i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    /* renamed from: d */
    public String mo8421d() {
        return "TrackingAnimatedNode[" + this.f7660d + "]: animationID: " + this.f7745f + " toValueNode: " + this.f7746g + " valueNode: " + this.f7747h + " animationConfig: " + this.f7748i;
    }

    /* renamed from: g */
    public void mo8422g() {
        this.f7748i.putDouble("toValue", ((C2636s) this.f7744e.mo8442o(this.f7746g)).mo8464k());
        this.f7744e.mo8451y(this.f7745f, this.f7747h, this.f7748i, (Callback) null);
    }
}
