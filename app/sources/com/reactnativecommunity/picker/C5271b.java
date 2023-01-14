package com.reactnativecommunity.picker;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.reactnativecommunity.picker.b */
public class C5271b extends C2944c<C5271b> {
    public C5271b(int i) {
        super(i);
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), mo9629i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo9643o());
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topFocus";
    }
}
