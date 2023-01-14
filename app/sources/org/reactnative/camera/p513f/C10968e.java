package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.e */
public class C10968e extends C2944c<C10968e> {

    /* renamed from: h */
    private static final C1176g<C10968e> f28734h = new C1176g<>(3);

    private C10968e() {
    }

    /* renamed from: u */
    public static C10968e m37200u(int i) {
        C10968e b = f28734h.mo3702b();
        if (b == null) {
            b = new C10968e();
        }
        b.mo9644p(i);
        return b;
    }

    /* renamed from: v */
    private WritableMap m37201v() {
        return Arguments.createMap();
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37201v());
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_CAMERA_READY.toString();
    }
}
