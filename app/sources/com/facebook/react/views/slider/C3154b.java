package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.slider.b */
public class C3154b extends C2944c<C3154b> {

    /* renamed from: h */
    private final double f8834h;

    /* renamed from: i */
    private final boolean f8835i;

    public C3154b(int i, double d, boolean z) {
        super(i);
        this.f8834h = d;
        this.f8835i = z;
    }

    /* renamed from: w */
    private WritableMap m12396w() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo9643o());
        createMap.putDouble("value", mo10254u());
        createMap.putBoolean("fromUser", mo10255v());
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m12396w());
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topChange";
    }

    /* renamed from: u */
    public double mo10254u() {
        return this.f8834h;
    }

    /* renamed from: v */
    public boolean mo10255v() {
        return this.f8835i;
    }
}
