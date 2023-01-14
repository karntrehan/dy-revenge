package com.facebook.react.views.drawer.p125b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.drawer.b.c */
public class C3095c extends C2944c<C3095c> {

    /* renamed from: h */
    private final float f8598h;

    public C3095c(int i, int i2, float f) {
        super(i, i2);
        this.f8598h = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("offset", (double) mo9929u());
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topDrawerSlide";
    }

    /* renamed from: u */
    public float mo9929u() {
        return this.f8598h;
    }
}
