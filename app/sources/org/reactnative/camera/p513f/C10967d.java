package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.d */
public class C10967d extends C2944c<C10967d> {

    /* renamed from: h */
    private static final C1176g<C10967d> f28732h = new C1176g<>(3);

    /* renamed from: i */
    private String f28733i;

    private C10967d() {
    }

    /* renamed from: u */
    private void m37194u(int i, String str) {
        super.mo9644p(i);
        this.f28733i = str;
    }

    /* renamed from: v */
    public static C10967d m37195v(int i, String str) {
        C10967d b = f28732h.mo3702b();
        if (b == null) {
            b = new C10967d();
        }
        b.m37194u(i, str);
        return b;
    }

    /* renamed from: w */
    private WritableMap m37196w() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", this.f28733i);
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37196w());
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_MOUNT_ERROR.toString();
    }
}
