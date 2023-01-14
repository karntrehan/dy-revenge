package org.reactnative.camera.p513f;

import android.util.Base64;
import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Formatter;
import org.reactnative.camera.CameraViewManager;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9670p;

/* renamed from: org.reactnative.camera.f.a */
public class C10964a extends C2944c<C10964a> {

    /* renamed from: h */
    private static final C1176g<C10964a> f28722h = new C1176g<>(3);

    /* renamed from: i */
    private C9668n f28723i;

    /* renamed from: j */
    private int f28724j;

    /* renamed from: k */
    private int f28725k;

    /* renamed from: l */
    private byte[] f28726l;

    private C10964a() {
    }

    /* renamed from: u */
    private void m37176u(int i, C9668n nVar, int i2, int i3, byte[] bArr) {
        super.mo9644p(i);
        this.f28723i = nVar;
        this.f28724j = i2;
        this.f28725k = i3;
        this.f28726l = bArr;
    }

    /* renamed from: v */
    public static C10964a m37177v(int i, C9668n nVar, int i2, int i3, byte[] bArr) {
        C10964a b = f28722h.mo3702b();
        if (b == null) {
            b = new C10964a();
        }
        b.m37176u(i, nVar, i2, i3, bArr);
        return b;
    }

    /* renamed from: w */
    private WritableMap m37178w() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("target", mo9643o());
        createMap.putString("data", this.f28723i.mo24226f());
        byte[] c = this.f28723i.mo24223c();
        if (c != null && c.length > 0) {
            Formatter formatter = new Formatter();
            int length = c.length;
            for (int i = 0; i < length; i++) {
                formatter.format("%02x", new Object[]{Byte.valueOf(c[i])});
            }
            createMap.putString("rawData", formatter.toString());
            formatter.close();
        }
        createMap.putString("type", this.f28723i.mo24222b().toString());
        WritableArray createArray = Arguments.createArray();
        for (C9670p pVar : this.f28723i.mo24225e()) {
            if (pVar != null) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString("x", String.valueOf(pVar.mo24230c()));
                createMap3.putString("y", String.valueOf(pVar.mo24231d()));
                createArray.pushMap(createMap3);
            }
        }
        createMap2.putArray("origin", createArray);
        createMap2.putInt("height", this.f28725k);
        createMap2.putInt("width", this.f28724j);
        createMap.putMap("bounds", createMap2);
        byte[] bArr = this.f28726l;
        if (bArr != null) {
            createMap.putString("image", Base64.encodeToString(bArr, 2));
        }
        return createMap;
    }

    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), m37178w());
    }

    /* renamed from: g */
    public short mo9637g() {
        return (short) (this.f28723i.mo24226f().hashCode() % 32767);
    }

    /* renamed from: j */
    public String mo9630j() {
        return CameraViewManager.C10938a.EVENT_ON_BAR_CODE_READ.toString();
    }
}
