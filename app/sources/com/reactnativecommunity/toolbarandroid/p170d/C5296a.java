package com.reactnativecommunity.toolbarandroid.p170d;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.reactnativecommunity.toolbarandroid.d.a */
public class C5296a extends C2944c<C5296a> {

    /* renamed from: h */
    private final int f14866h;

    public C5296a(int i, int i2) {
        super(i);
        this.f14866h = i2;
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return false;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("position", mo15983u());
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), writableNativeMap);
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topSelect";
    }

    /* renamed from: u */
    public int mo15983u() {
        return this.f14866h;
    }
}
