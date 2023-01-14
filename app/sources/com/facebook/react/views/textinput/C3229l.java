package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.textinput.l */
class C3229l extends C2944c<C3229l> {

    /* renamed from: h */
    private int f9109h;

    /* renamed from: i */
    private int f9110i;

    public C3229l(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.f9109h = i3;
        this.f9110i = i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.f9110i);
        createMap2.putInt("start", this.f9109h);
        createMap.putMap("selection", createMap2);
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topSelectionChange";
    }
}
