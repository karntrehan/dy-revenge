package com.reactnativecommunity.picker;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.reactnativecommunity.picker.c */
public class C5272c extends C2944c<C5272c> {

    /* renamed from: h */
    private final int f14827h;

    public C5272c(int i, int i2) {
        super(i);
        this.f14827h = i2;
    }

    /* renamed from: u */
    private WritableMap m19658u() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f14827h);
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m19658u());
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topSelect";
    }
}
