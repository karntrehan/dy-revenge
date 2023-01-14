package com.reactnativecommunity.webview.p171e;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.reactnativecommunity.webview.e.c */
public final class C5320c extends C2944c<C5320c> {

    /* renamed from: h */
    public static final C5321a f14934h = new C5321a((C10452g) null);

    /* renamed from: i */
    private final WritableMap f14935i;

    /* renamed from: com.reactnativecommunity.webview.e.c$a */
    public static final class C5321a {
        private C5321a() {
        }

        public /* synthetic */ C5321a(C10452g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5320c(int i, WritableMap writableMap) {
        super(i);
        C10457l.m35321f(writableMap, "mEventData");
        this.f14935i = writableMap;
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return false;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35321f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), this.f14935i);
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topLoadingFinish";
    }
}
