package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p174e.p446g.p448b.C10200h;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.gesturehandler.react.e */
public final class C9875e extends C2944c<C9875e> {

    /* renamed from: h */
    public static final C9876a f26424h = new C9876a((C10452g) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C1176g<C9875e> f26425i = new C1176g<>(7);

    /* renamed from: j */
    private WritableMap f26426j;

    /* renamed from: k */
    private short f26427k;

    /* renamed from: com.swmansion.gesturehandler.react.e$a */
    public static final class C9876a {
        private C9876a() {
        }

        public /* synthetic */ C9876a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T extends C10200h<T>> WritableMap mo24720a(T t, C9877f<T> fVar) {
            C10457l.m35320e(t, "handler");
            WritableMap createMap = Arguments.createMap();
            if (fVar != null) {
                C10457l.m35319d(createMap, "this");
                fVar.mo24688a(t, createMap);
            }
            createMap.putInt("handlerTag", t.mo25428O());
            createMap.putInt("state", t.mo25427N());
            C10457l.m35319d(createMap, "createMap().apply {\n        dataExtractor?.extractEventData(handler, this)\n        putInt(\"handlerTag\", handler.tag)\n        putInt(\"state\", handler.state)\n      }");
            return createMap;
        }

        /* renamed from: b */
        public final <T extends C10200h<T>> C9875e mo24721b(T t, C9877f<T> fVar) {
            C10457l.m35320e(t, "handler");
            C9875e eVar = (C9875e) C9875e.f26425i.mo3702b();
            if (eVar == null) {
                eVar = new C9875e((C10452g) null);
            }
            eVar.m33658w(t, fVar);
            return eVar;
        }
    }

    private C9875e() {
    }

    public /* synthetic */ C9875e(C10452g gVar) {
        this();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final <T extends C10200h<T>> void m33658w(T t, C9877f<T> fVar) {
        View R = t.mo25431R();
        C10457l.m35317b(R);
        super.mo9644p(R.getId());
        this.f26426j = f26424h.mo24720a(t, fVar);
        this.f26427k = t.mo25416F();
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return true;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35320e(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo9643o(), "onGestureHandlerEvent", this.f26426j);
    }

    /* renamed from: g */
    public short mo9637g() {
        return this.f26427k;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "onGestureHandlerEvent";
    }

    /* renamed from: t */
    public void mo9648t() {
        this.f26426j = null;
        f26425i.mo3701a(this);
    }
}
