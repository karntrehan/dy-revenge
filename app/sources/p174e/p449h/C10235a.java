package p174e.p449h;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.mrousavy.camera.frameprocessor.FrameProcessorPlugin;
import java.util.List;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8969o;
import p174e.p319f.p406d.p411b.p413b.C9631a;
import p174e.p319f.p406d.p411b.p414c.C9633a;
import p174e.p319f.p406d.p411b.p414c.C9634b;
import p174e.p319f.p406d.p411b.p414c.C9635c;
import p174e.p319f.p406d.p411b.p414c.C9636d;
import p174e.p319f.p406d.p411b.p414c.C9637e;

/* renamed from: e.h.a */
public class C10235a extends FrameProcessorPlugin {

    /* renamed from: a */
    C9637e f27476a;

    /* renamed from: b */
    C9636d f27477b;

    C10235a() {
        super("scanFaces");
        C9637e a = new C9637e.C9638a().mo24172g(2).mo24169d(2).mo24168c(2).mo24171f(0.15f).mo24166a();
        this.f27476a = a;
        this.f27477b = C9635c.m32778a(a);
    }

    /* renamed from: a */
    private WritableMap m34796a(Rect rect) {
        WritableMap createMap = Arguments.createMap();
        Double valueOf = Double.valueOf((((double) rect.exactCenterX()) - Math.ceil((double) rect.width())) / 2.0d);
        Double valueOf2 = Double.valueOf((((double) rect.exactCenterY()) - Math.ceil((double) rect.height())) / 2.0d);
        Double valueOf3 = Double.valueOf(((double) rect.right) + valueOf.doubleValue());
        Double valueOf4 = Double.valueOf(((double) rect.top) + valueOf2.doubleValue());
        createMap.putDouble("x", ((double) rect.centerX()) + (((double) rect.centerX()) - valueOf3.doubleValue()));
        createMap.putDouble("y", ((double) rect.centerY()) + (valueOf4.doubleValue() - ((double) rect.centerY())));
        createMap.putDouble("width", (double) rect.width());
        createMap.putDouble("height", (double) rect.height());
        createMap.putDouble("boundingCenterX", (double) rect.centerX());
        createMap.putDouble("boundingCenterY", (double) rect.centerY());
        createMap.putDouble("boundingExactCenterX", (double) rect.exactCenterX());
        createMap.putDouble("boundingExactCenterY", (double) rect.exactCenterY());
        return createMap;
    }

    /* renamed from: b */
    private WritableMap m34797b(C9633a aVar) {
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String[] strArr = {"FACE", "LEFT_EYEBROW_TOP", "LEFT_EYEBROW_BOTTOM", "RIGHT_EYEBROW_TOP", "RIGHT_EYEBROW_BOTTOM", "LEFT_EYE", "RIGHT_EYE", "UPPER_LIP_TOP", "UPPER_LIP_BOTTOM", "LOWER_LIP_TOP", "LOWER_LIP_BOTTOM", "NOSE_BRIDGE", "NOSE_BOTTOM", "LEFT_CHEEK", "RIGHT_CHEEK"};
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (int i = 0; i < 15; i++) {
            C9634b c = aVar.mo24139c(iArr[i]);
            List<PointF> b = c.mo24153b();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i2 = 0; i2 < b.size(); i2++) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putDouble("x", (double) b.get(i2).x);
                writableNativeMap2.putDouble("y", (double) b.get(i2).y);
                writableNativeArray.pushMap(writableNativeMap2);
            }
            writableNativeMap.putArray(strArr[c.mo24152a() - 1], writableNativeArray);
        }
        return writableNativeMap;
    }

    @SuppressLint({"NewApi"})
    public Object callback(ImageProxy imageProxy, Object[] objArr) {
        Image b0 = imageProxy.mo2538b0();
        if (b0 == null) {
            return null;
        }
        C8963l f = this.f27477b.mo14990f(C9631a.m32748c(b0, imageProxy.mo2537U().mo2695e()));
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        try {
            for (C9633a aVar : (List) C8969o.m29862a(f)) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rollAngle", (double) aVar.mo24142f());
                writableNativeMap.putDouble("pitchAngle", (double) aVar.mo24140d());
                writableNativeMap.putDouble("yawAngle", (double) aVar.mo24141e());
                writableNativeMap.putDouble("leftEyeOpenProbability", (double) aVar.mo24144h().floatValue());
                writableNativeMap.putDouble("rightEyeOpenProbability", (double) aVar.mo24145i().floatValue());
                writableNativeMap.putDouble("smilingProbability", (double) aVar.mo24146j().floatValue());
                WritableMap b = m34797b(aVar);
                writableNativeMap.putMap("bounds", m34796a(aVar.mo24138b()));
                writableNativeMap.putMap("contours", b);
                writableNativeArray.pushMap(writableNativeMap);
            }
            return writableNativeArray;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
