package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.slider.c */
public class C3155c extends C2944c<C3155c> {

    /* renamed from: h */
    private final double f8836h;

    public C3155c(int i, int i2, double d) {
        super(i, i2);
        this.f8836h = d;
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo9643o());
        createMap.putDouble("value", mo10256u());
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topSlidingComplete";
    }

    /* renamed from: u */
    public double mo10256u() {
        return this.f8836h;
    }
}
