package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.textinput.b */
public class C3216b extends C2944c<C3222e> {

    /* renamed from: h */
    private float f9052h;

    /* renamed from: i */
    private float f9053i;

    public C3216b(int i, int i2, float f, float f2) {
        super(i, i2);
        this.f9052h = f;
        this.f9053i = f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", (double) this.f9052h);
        createMap2.putDouble("height", (double) this.f9053i);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", mo9643o());
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topContentSizeChange";
    }
}
