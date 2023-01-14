package com.reactnativecommunity.webview.p171e;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.reactnativecommunity.webview.e.h */
public final class C5330h extends C2944c<C5330h> {

    /* renamed from: h */
    public static final C5331a f14944h = new C5331a((C10452g) null);

    /* renamed from: i */
    private final WritableMap f14945i;

    /* renamed from: com.reactnativecommunity.webview.e.h$a */
    public static final class C5331a {
        private C5331a() {
        }

        public /* synthetic */ C5331a(C10452g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5330h(int i, WritableMap writableMap) {
        super(i);
        C10457l.m35321f(writableMap, "mData");
        this.f14945i = writableMap;
        writableMap.putString("navigationType", "other");
        writableMap.putBoolean("isTopFrame", true);
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return false;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35321f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo9643o(), "topShouldStartLoadWithRequest", this.f14945i);
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topShouldStartLoadWithRequest";
    }
}
