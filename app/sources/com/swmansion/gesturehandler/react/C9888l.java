package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p174e.p446g.p448b.C10200h;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.gesturehandler.react.l */
public final class C9888l extends C2944c<C9888l> {

    /* renamed from: h */
    public static final C9889a f26448h = new C9889a((C10452g) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C1176g<C9888l> f26449i = new C1176g<>(7);

    /* renamed from: j */
    private WritableMap f26450j;

    /* renamed from: k */
    private short f26451k;

    /* renamed from: com.swmansion.gesturehandler.react.l$a */
    public static final class C9889a {
        private C9889a() {
        }

        public /* synthetic */ C9889a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T extends C10200h<T>> WritableMap mo24748a(T t) {
            C10457l.m35320e(t, "handler");
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("handlerTag", t.mo25428O());
            createMap.putInt("state", t.mo25427N());
            createMap.putInt("numberOfTouches", t.mo25430Q());
            createMap.putInt("eventType", t.mo25429P());
            WritableArray r = t.mo25453r();
            if (r != null) {
                createMap.putArray("changedTouches", r);
            }
            WritableArray q = t.mo25451q();
            if (q != null) {
                createMap.putArray("allTouches", q);
            }
            if (t.mo25435W() && t.mo25427N() == 4) {
                createMap.putInt("state", 2);
            }
            C10457l.m35319d(createMap, "createMap().apply {\n      putInt(\"handlerTag\", handler.tag)\n      putInt(\"state\", handler.state)\n      putInt(\"numberOfTouches\", handler.trackedPointersCount)\n      putInt(\"eventType\", handler.touchEventType)\n\n      handler.consumeChangedTouchesPayload()?.let {\n        putArray(\"changedTouches\", it)\n      }\n\n      handler.consumeAllTouchesPayload()?.let {\n        putArray(\"allTouches\", it)\n      }\n\n      if (handler.isAwaiting && handler.state == GestureHandler.STATE_ACTIVE) {\n        putInt(\"state\", GestureHandler.STATE_BEGAN)\n      }\n    }");
            return createMap;
        }

        /* renamed from: b */
        public final <T extends C10200h<T>> C9888l mo24749b(T t) {
            C10457l.m35320e(t, "handler");
            C9888l lVar = (C9888l) C9888l.f26449i.mo3702b();
            if (lVar == null) {
                lVar = new C9888l((C10452g) null);
            }
            lVar.m33714w(t);
            return lVar;
        }
    }

    private C9888l() {
    }

    public /* synthetic */ C9888l(C10452g gVar) {
        this();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final <T extends C10200h<T>> void m33714w(T t) {
        View R = t.mo25431R();
        C10457l.m35317b(R);
        super.mo9644p(R.getId());
        this.f26450j = f26448h.mo24748a(t);
        this.f26451k = t.mo25416F();
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return true;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        C10457l.m35320e(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo9643o(), "onGestureHandlerEvent", this.f26450j);
    }

    /* renamed from: g */
    public short mo9637g() {
        return this.f26451k;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "onGestureHandlerEvent";
    }

    /* renamed from: t */
    public void mo9648t() {
        this.f26450j = null;
        f26449i.mo3701a(this);
    }
}
