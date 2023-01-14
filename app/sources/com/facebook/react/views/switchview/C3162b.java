package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.switchview.b */
class C3162b extends C2944c<C3162b> {

    /* renamed from: h */
    private final boolean f8852h;

    public C3162b(int i, int i2, boolean z) {
        super(i, i2);
        this.f8852h = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo9643o());
        createMap.putBoolean("value", mo10288u());
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topChange";
    }

    /* renamed from: u */
    public boolean mo10288u() {
        return this.f8852h;
    }
}
