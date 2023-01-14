package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.g */
public class C10970g extends C2944c<C10970g> {

    /* renamed from: h */
    private static final C1176g<C10970g> f28737h = new C1176g<>(3);

    /* renamed from: i */
    private WritableArray f28738i;

    private C10970g() {
    }

    /* renamed from: u */
    private void m37211u(int i, WritableArray writableArray) {
        super.mo9644p(i);
        this.f28738i = writableArray;
    }

    /* renamed from: v */
    public static C10970g m37212v(int i, WritableArray writableArray) {
        C10970g b = f28737h.mo3702b();
        if (b == null) {
            b = new C10970g();
        }
        b.m37211u(i, writableArray);
        return b;
    }

    /* renamed from: w */
    private WritableMap m37213w() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "face");
        createMap.putArray("faces", this.f28738i);
        createMap.putInt("target", mo9643o());
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37213w());
    }

    /* renamed from: g */
    public short mo9637g() {
        if (this.f28738i.size() > 32767) {
            return Short.MAX_VALUE;
        }
        return (short) this.f28738i.size();
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_FACES_DETECTED.toString();
    }
}
