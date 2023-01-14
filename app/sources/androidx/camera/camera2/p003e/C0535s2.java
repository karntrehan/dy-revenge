package androidx.camera.camera2.p003e;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.C0371h3;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.C0938m1;
import androidx.core.util.C1177h;
import p027c.p061g.p062a.C1814b;

/* renamed from: androidx.camera.camera2.e.s2 */
final class C0535s2 implements C0371h3.C0373b {

    /* renamed from: a */
    private final C0402g0 f1721a;

    /* renamed from: b */
    private Rect f1722b = null;

    /* renamed from: c */
    private C1814b.C1815a<Void> f1723c;

    /* renamed from: d */
    private Rect f1724d = null;

    C0535s2(C0402g0 g0Var) {
        this.f1721a = g0Var;
    }

    /* renamed from: h */
    private static Rect m2116h(Rect rect, float f) {
        float width = ((float) rect.width()) / f;
        float height = ((float) rect.height()) / f;
        float width2 = (((float) rect.width()) - width) / 2.0f;
        float height2 = (((float) rect.height()) - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    /* renamed from: i */
    private Rect m2117i() {
        return (Rect) C1177h.m4583e((Rect) this.f1721a.mo2119a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    /* renamed from: a */
    public void mo2051a(TotalCaptureResult totalCaptureResult) {
        if (this.f1723c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f1724d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f1723c.mo6308c(null);
                this.f1723c = null;
                this.f1724d = null;
            }
        }
    }

    /* renamed from: b */
    public void mo2052b(C0304b.C0305a aVar) {
        Rect rect = this.f1722b;
        if (rect != null) {
            aVar.mo1889e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    /* renamed from: c */
    public void mo2053c(float f, C1814b.C1815a<Void> aVar) {
        this.f1722b = m2116h(m2117i(), f);
        C1814b.C1815a<Void> aVar2 = this.f1723c;
        if (aVar2 != null) {
            aVar2.mo6310f(new C0938m1.C0939a("There is a new zoomRatio being set"));
        }
        this.f1724d = this.f1722b;
        this.f1723c = aVar;
    }

    /* renamed from: d */
    public float mo2054d() {
        Float f = (Float) this.f1721a.mo2119a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue() < mo2055e() ? mo2055e() : f.floatValue();
    }

    /* renamed from: e */
    public float mo2055e() {
        return 1.0f;
    }

    /* renamed from: f */
    public Rect mo2056f() {
        Rect rect = this.f1722b;
        return rect != null ? rect : m2117i();
    }

    /* renamed from: g */
    public void mo2057g() {
        this.f1724d = null;
        this.f1722b = null;
        C1814b.C1815a<Void> aVar = this.f1723c;
        if (aVar != null) {
            aVar.mo6310f(new C0938m1.C0939a("Camera is not active."));
            this.f1723c = null;
        }
    }
}
