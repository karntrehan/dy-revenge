package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.l */
public class C10975l extends C2944c<C10975l> {

    /* renamed from: h */
    private static final C1176g<C10975l> f28745h = new C1176g<>(3);

    /* renamed from: i */
    private WritableArray f28746i;

    private C10975l() {
    }

    /* renamed from: u */
    private WritableMap m37236u() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "textBlock");
        createMap.putArray("textBlocks", this.f28746i);
        createMap.putInt("target", mo9643o());
        return createMap;
    }

    /* renamed from: v */
    private void m37237v(int i, WritableArray writableArray) {
        super.mo9644p(i);
        this.f28746i = writableArray;
    }

    /* renamed from: w */
    public static C10975l m37238w(int i, WritableArray writableArray) {
        C10975l b = f28745h.mo3702b();
        if (b == null) {
            b = new C10975l();
        }
        b.m37237v(i, writableArray);
        return b;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37236u());
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_TEXT_RECOGNIZED.toString();
    }
}
