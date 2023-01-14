package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.k */
public class C10974k extends C2944c<C10974k> {

    /* renamed from: h */
    private static final C1176g<C10974k> f28743h = new C1176g<>(3);

    /* renamed from: i */
    private WritableMap f28744i;

    private C10974k() {
    }

    /* renamed from: u */
    private void m37232u(int i, WritableMap writableMap) {
        super.mo9644p(i);
        this.f28744i = writableMap;
    }

    /* renamed from: v */
    public static C10974k m37233v(int i, WritableMap writableMap) {
        C10974k b = f28743h.mo3702b();
        if (b == null) {
            b = new C10974k();
        }
        b.m37232u(i, writableMap);
        return b;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), this.f28744i);
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_RECORDING_START.toString();
    }
}
