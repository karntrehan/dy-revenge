package org.reactnative.camera.p513f;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.m */
public class C10976m extends C2944c<C10976m> {

    /* renamed from: h */
    private static final C1176g<C10976m> f28747h = new C1176g<>(3);

    /* renamed from: i */
    private int f28748i;

    /* renamed from: j */
    private int f28749j;

    /* renamed from: k */
    private boolean f28750k;

    private C10976m() {
    }

    /* renamed from: u */
    private void m37241u(int i, boolean z, int i2, int i3) {
        super.mo9644p(i);
        this.f28748i = i2;
        this.f28749j = i3;
        this.f28750k = z;
    }

    /* renamed from: v */
    public static C10976m m37242v(int i, boolean z, int i2, int i3) {
        C10976m b = f28747h.mo3702b();
        if (b == null) {
            b = new C10976m();
        }
        b.m37241u(i, z, i2, i3);
        return b;
    }

    /* renamed from: w */
    private WritableMap m37243w() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo9643o());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("x", this.f28748i);
        createMap2.putInt("y", this.f28749j);
        createMap.putBoolean("isDoubleTap", this.f28750k);
        createMap.putMap("touchOrigin", createMap2);
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37243w());
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_TOUCH.toString();
    }
}
