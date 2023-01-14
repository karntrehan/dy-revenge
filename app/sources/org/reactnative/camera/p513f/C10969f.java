package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;
import org.reactnative.facedetector.C10997b;

/* renamed from: org.reactnative.camera.f.f */
public class C10969f extends C2944c<C10969f> {

    /* renamed from: h */
    private static final C1176g<C10969f> f28735h = new C1176g<>(3);

    /* renamed from: i */
    private C10997b f28736i;

    private C10969f() {
    }

    /* renamed from: u */
    private void m37205u(int i, C10997b bVar) {
        super.mo9644p(i);
        this.f28736i = bVar;
    }

    /* renamed from: v */
    public static C10969f m37206v(int i, C10997b bVar) {
        C10969f b = f28735h.mo3702b();
        if (b == null) {
            b = new C10969f();
        }
        b.m37205u(i, bVar);
        return b;
    }

    /* renamed from: w */
    private WritableMap m37207w() {
        WritableMap createMap = Arguments.createMap();
        C10997b bVar = this.f28736i;
        createMap.putBoolean("isOperational", bVar != null && bVar.mo29007c());
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37207w());
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_FACE_DETECTION_ERROR.toString();
    }
}
