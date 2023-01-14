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

/* renamed from: com.swmansion.gesturehandler.react.k */
public final class C9886k extends C2944c<C9886k> {

    /* renamed from: h */
    public static final C9887a f26445h = new C9887a((C10452g) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C1176g<C9886k> f26446i = new C1176g<>(7);

    /* renamed from: j */
    private WritableMap f26447j;

    /* renamed from: com.swmansion.gesturehandler.react.k$a */
    public static final class C9887a {
        private C9887a() {
        }

        public /* synthetic */ C9887a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T extends C10200h<T>> WritableMap mo24746a(T t, C9877f<T> fVar, int i, int i2) {
            C10457l.m35320e(t, "handler");
            WritableMap createMap = Arguments.createMap();
            if (fVar != null) {
                C10457l.m35319d(createMap, "this");
                fVar.mo24688a(t, createMap);
            }
            createMap.putInt("handlerTag", t.mo25428O());
            createMap.putInt("state", i);
            createMap.putInt("oldState", i2);
            C10457l.m35319d(createMap, "createMap().apply {\n        dataExtractor?.extractEventData(handler, this)\n        putInt(\"handlerTag\", handler.tag)\n        putInt(\"state\", newState)\n        putInt(\"oldState\", oldState)\n      }");
            return createMap;
        }

        /* renamed from: b */
        public final <T extends C10200h<T>> C9886k mo24747b(T t, int i, int i2, C9877f<T> fVar) {
            C10457l.m35320e(t, "handler");
            C9886k kVar = (C9886k) C9886k.f26446i.mo3702b();
            if (kVar == null) {
                kVar = new C9886k((C10452g) null);
            }
            kVar.m33704w(t, i, i2, fVar);
            return kVar;
        }
    }

    private C9886k() {
    }

    public /* synthetic */ C9886k(C10452g gVar) {
        this();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final <T extends C10200h<T>> void m33704w(T t, int i, int i2, C9877f<T> fVar) {
        View R = t.mo25431R();
        C10457l.m35317b(R);
        super.mo9644p(R.getId());
        this.f26447j = f26445h.mo24746a(t, fVar, i, i2);
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return false;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35320e(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo9643o(), "onGestureHandlerStateChange", this.f26447j);
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "onGestureHandlerStateChange";
    }

    /* renamed from: t */
    public void mo9648t() {
        this.f26447j = null;
        f26446i.mo3701a(this);
    }
}
