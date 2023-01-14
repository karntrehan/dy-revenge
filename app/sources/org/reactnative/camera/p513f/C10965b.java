package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;
import p497j.p502b.p503a.C10677b;

/* renamed from: org.reactnative.camera.f.b */
public class C10965b extends C2944c<C10965b> {

    /* renamed from: h */
    private static final C1176g<C10965b> f28727h = new C1176g<>(3);

    /* renamed from: i */
    private C10677b f28728i;

    private C10965b() {
    }

    /* renamed from: u */
    private void m37182u(int i, C10677b bVar) {
        super.mo9644p(i);
        this.f28728i = bVar;
    }

    /* renamed from: v */
    public static C10965b m37183v(int i, C10677b bVar) {
        C10965b b = f28727h.mo3702b();
        if (b == null) {
            b = new C10965b();
        }
        b.m37182u(i, bVar);
        return b;
    }

    /* renamed from: w */
    private WritableMap m37184w() {
        WritableMap createMap = Arguments.createMap();
        C10677b bVar = this.f28728i;
        createMap.putBoolean("isOperational", bVar != null && bVar.mo26600c());
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37184w());
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_BARCODE_DETECTION_ERROR.toString();
    }
}
