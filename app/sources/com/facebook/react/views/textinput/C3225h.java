package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.textinput.h */
public class C3225h extends C2944c<C3225h> {

    /* renamed from: h */
    private String f9097h;

    /* renamed from: i */
    private String f9098i;

    /* renamed from: j */
    private int f9099j;

    /* renamed from: k */
    private int f9100k;

    public C3225h(int i, int i2, String str, String str2, int i3, int i4) {
        super(i, i2);
        this.f9097h = str;
        this.f9098i = str2;
        this.f9099j = i3;
        this.f9100k = i4;
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("start", (double) this.f9099j);
        createMap2.putDouble("end", (double) this.f9100k);
        createMap.putString("text", this.f9097h);
        createMap.putString("previousText", this.f9098i);
        createMap.putMap("range", createMap2);
        createMap.putInt("target", mo9643o());
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topTextInput";
    }
}
