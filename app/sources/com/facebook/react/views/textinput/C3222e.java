package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.textinput.e */
public class C3222e extends C2944c<C3222e> {

    /* renamed from: h */
    private String f9094h;

    /* renamed from: i */
    private int f9095i;

    public C3222e(int i, int i2, String str, int i3) {
        super(i, i2);
        this.f9094h = str;
        this.f9095i = i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f9094h);
        createMap.putInt("eventCount", this.f9095i);
        createMap.putInt("target", mo9643o());
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topChange";
    }
}
