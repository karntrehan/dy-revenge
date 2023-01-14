package com.reactnativecommunity.webview.p171e;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.reactnativecommunity.webview.e.g */
public final class C5328g extends C2944c<C5328g> {

    /* renamed from: h */
    public static final C5329a f14942h = new C5329a((C10452g) null);

    /* renamed from: i */
    private final WritableMap f14943i;

    /* renamed from: com.reactnativecommunity.webview.e.g$a */
    public static final class C5329a {
        private C5329a() {
        }

        public /* synthetic */ C5329a(C10452g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5328g(int i, WritableMap writableMap) {
        super(i);
        C10457l.m35321f(writableMap, "mEventData");
        this.f14943i = writableMap;
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return false;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35321f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), this.f14943i);
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topRenderProcessGone";
    }
}
