package org.reactnative.camera.p513f;

import android.util.Base64;
import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: org.reactnative.camera.f.c */
public class C10966c extends C2944c<C10966c> {

    /* renamed from: h */
    private static final C1176g<C10966c> f28729h = new C1176g<>(3);

    /* renamed from: i */
    private WritableArray f28730i;

    /* renamed from: j */
    private byte[] f28731j;

    private C10966c() {
    }

    /* renamed from: u */
    private void m37188u(int i, WritableArray writableArray, byte[] bArr) {
        super.mo9644p(i);
        this.f28730i = writableArray;
        this.f28731j = bArr;
    }

    /* renamed from: v */
    public static C10966c m37189v(int i, WritableArray writableArray, byte[] bArr) {
        C10966c b = f28729h.mo3702b();
        if (b == null) {
            b = new C10966c();
        }
        b.m37188u(i, writableArray, bArr);
        return b;
    }

    /* renamed from: w */
    private WritableMap m37190w() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "barcode");
        createMap.putArray("barcodes", this.f28730i);
        createMap.putInt("target", mo9643o());
        byte[] bArr = this.f28731j;
        if (bArr != null) {
            createMap.putString("image", Base64.encodeToString(bArr, 2));
        }
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37190w());
    }

    /* renamed from: g */
    public short mo9637g() {
        if (this.f28730i.size() > 32767) {
            return Short.MAX_VALUE;
        }
        return (short) this.f28730i.size();
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_BARCODES_DETECTED.toString();
    }
}
