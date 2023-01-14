package com.reactnativecommunity.checkbox;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.reactnativecommunity.checkbox.b */
class C5248b extends C2944c<C5248b> {

    /* renamed from: h */
    private final boolean f14777h;

    public C5248b(int i, boolean z) {
        super(i);
        this.f14777h = z;
    }

    /* renamed from: v */
    private WritableMap m19589v() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo9643o());
        createMap.putBoolean("value", mo15869u());
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m19589v());
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topChange";
    }

    /* renamed from: u */
    public boolean mo15869u() {
        return this.f14777h;
    }
}
