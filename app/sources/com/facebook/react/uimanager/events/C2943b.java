package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3038r;

/* renamed from: com.facebook.react.uimanager.events.b */
public class C2943b extends C2944c<C2943b> {

    /* renamed from: h */
    private final int f8239h;

    /* renamed from: i */
    private final int f8240i;

    @Deprecated
    public C2943b(int i, int i2, int i3) {
        this(-1, i, i2, i3);
    }

    public C2943b(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.f8239h = i3;
        this.f8240i = i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", (double) C3038r.m12004a((float) this.f8239h));
        createMap.putDouble("height", (double) C3038r.m12004a((float) this.f8240i));
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topContentSizeChange";
    }
}
