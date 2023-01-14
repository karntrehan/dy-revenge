package com.facebook.react.views.drawer.p125b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.drawer.b.d */
public class C3096d extends C2944c<C3096d> {

    /* renamed from: h */
    private final int f8599h;

    public C3096d(int i, int i2, int i3) {
        super(i, i2);
        this.f8599h = i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("drawerState", (double) mo9930u());
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topDrawerStateChanged";
    }

    /* renamed from: u */
    public int mo9930u() {
        return this.f8599h;
    }
}
