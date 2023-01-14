package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.textinput.i */
class C3226i extends C2944c<C3226i> {
    public C3226i(int i, int i2) {
        super(i, i2);
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
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topFocus";
    }
}
