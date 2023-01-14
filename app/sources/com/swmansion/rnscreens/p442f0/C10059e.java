package com.swmansion.rnscreens.p442f0;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.f0.e */
public final class C10059e extends C2944c<C10053b> {

    /* renamed from: h */
    public static final C10060a f26804h = new C10060a((C10452g) null);

    /* renamed from: i */
    private final float f26805i;

    /* renamed from: j */
    private final boolean f26806j;

    /* renamed from: k */
    private final boolean f26807k;

    /* renamed from: l */
    private final short f26808l;

    /* renamed from: com.swmansion.rnscreens.f0.e$a */
    public static final class C10060a {
        private C10060a() {
        }

        public /* synthetic */ C10060a(C10452g gVar) {
            this();
        }
    }

    public C10059e(int i, float f, boolean z, boolean z2, short s) {
        super(i);
        this.f26805i = f;
        this.f26806j = z;
        this.f26807k = z2;
        this.f26808l = s;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35320e(rCTEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("progress", (double) this.f26805i);
        createMap.putInt("closing", this.f26806j ? 1 : 0);
        createMap.putInt("goingForward", this.f26807k ? 1 : 0);
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), createMap);
    }

    /* renamed from: g */
    public short mo9637g() {
        return this.f26808l;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topTransitionProgress";
    }
}
