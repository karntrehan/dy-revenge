package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.h */
public class C10971h extends C2944c<C10971h> {

    /* renamed from: h */
    private static final C1176g<C10971h> f28739h = new C1176g<>(5);

    /* renamed from: i */
    private WritableMap f28740i;

    private C10971h() {
    }

    /* renamed from: u */
    private void m37217u(int i, WritableMap writableMap) {
        super.mo9644p(i);
        this.f28740i = writableMap;
    }

    /* renamed from: v */
    public static C10971h m37218v(int i, WritableMap writableMap) {
        C10971h b = f28739h.mo3702b();
        if (b == null) {
            b = new C10971h();
        }
        b.m37217u(i, writableMap);
        return b;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), this.f28740i);
    }

    /* renamed from: g */
    public short mo9637g() {
        return (short) (this.f28740i.getMap("data").getString("uri").hashCode() % 32767);
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_PICTURE_SAVED.toString();
    }
}
