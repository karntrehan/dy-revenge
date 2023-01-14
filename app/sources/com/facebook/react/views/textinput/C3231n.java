package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.textinput.n */
class C3231n extends C2944c<C3231n> {

    /* renamed from: h */
    private String f9118h;

    public C3231n(int i, int i2, String str) {
        super(i, i2);
        this.f9118h = str;
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
        createMap.putString("text", this.f9118h);
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topSubmitEditing";
    }
}
