package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.textinput.j */
public class C3227j extends C2944c<C3225h> {

    /* renamed from: h */
    private String f9101h;

    C3227j(int i, int i2, String str) {
        super(i, i2);
        this.f9101h = str;
    }

    @Deprecated
    C3227j(int i, String str) {
        this(-1, i, str);
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("key", this.f9101h);
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topKeyPress";
    }
}
