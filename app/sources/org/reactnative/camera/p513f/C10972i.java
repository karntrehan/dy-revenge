package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.i */
public class C10972i extends C2944c<C10972i> {

    /* renamed from: h */
    private static final C1176g<C10972i> f28741h = new C1176g<>(3);

    private C10972i() {
    }

    /* renamed from: u */
    public static C10972i m37222u(int i) {
        C10972i b = f28741h.mo3702b();
        if (b == null) {
            b = new C10972i();
        }
        b.mo9644p(i);
        return b;
    }

    /* renamed from: v */
    private WritableMap m37223v() {
        return Arguments.createMap();
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37223v());
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_PICTURE_TAKEN.toString();
    }
}
