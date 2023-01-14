package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.f */
public final class C10108f extends C2944c<C10108f> {

    /* renamed from: h */
    public static final C10109a f26942h = new C10109a((C10452g) null);

    /* renamed from: i */
    private final C10107e f26943i;

    /* renamed from: j */
    private final C10110g f26944j;

    /* renamed from: com.th3rdwave.safeareacontext.f$a */
    public static final class C10109a {
        private C10109a() {
        }

        public /* synthetic */ C10109a(C10452g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10108f(int i, int i2, C10107e eVar, C10110g gVar) {
        super(i2);
        C10457l.m35320e(eVar, "mInsets");
        C10457l.m35320e(gVar, "mFrame");
        this.f26943i = eVar;
        this.f26944j = gVar;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35320e(rCTEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", C10120q.m34236b(this.f26943i));
        createMap.putMap("frame", C10120q.m34238d(this.f26944j));
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), createMap);
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topInsetsChange";
    }
}
