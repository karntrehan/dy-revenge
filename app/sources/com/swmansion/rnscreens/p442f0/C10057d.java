package com.swmansion.rnscreens.p442f0;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.f0.d */
public final class C10057d extends C2944c<C10057d> {

    /* renamed from: h */
    public static final C10058a f26803h = new C10058a((C10452g) null);

    /* renamed from: com.swmansion.rnscreens.f0.d$a */
    public static final class C10058a {
        private C10058a() {
        }

        public /* synthetic */ C10058a(C10452g gVar) {
            this();
        }
    }

    public C10057d(int i) {
        super(i);
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35320e(rCTEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("dismissCount", 1);
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), createMap);
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topDismissed";
    }
}
