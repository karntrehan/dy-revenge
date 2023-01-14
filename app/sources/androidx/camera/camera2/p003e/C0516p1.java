package androidx.camera.camera2.p003e;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.C0371h3;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.C0938m1;
import androidx.core.util.C1177h;
import p027c.p061g.p062a.C1814b;

/* renamed from: androidx.camera.camera2.e.p1 */
final class C0516p1 implements C0371h3.C0373b {

    /* renamed from: a */
    private final C0402g0 f1660a;

    /* renamed from: b */
    private final Range<Float> f1661b;

    /* renamed from: c */
    private float f1662c = 1.0f;

    /* renamed from: d */
    private C1814b.C1815a<Void> f1663d;

    /* renamed from: e */
    private float f1664e = 1.0f;

    C0516p1(C0402g0 g0Var) {
        this.f1660a = g0Var;
        this.f1661b = (Range) g0Var.mo2119a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    /* renamed from: a */
    public void mo2051a(TotalCaptureResult totalCaptureResult) {
        if (this.f1663d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f != null) {
                if (this.f1664e == f.floatValue()) {
                    this.f1663d.mo6308c(null);
                    this.f1663d = null;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2052b(C0304b.C0305a aVar) {
        aVar.mo1889e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f1662c));
    }

    /* renamed from: c */
    public void mo2053c(float f, C1814b.C1815a<Void> aVar) {
        this.f1662c = f;
        C1814b.C1815a<Void> aVar2 = this.f1663d;
        if (aVar2 != null) {
            aVar2.mo6310f(new C0938m1.C0939a("There is a new zoomRatio being set"));
        }
        this.f1664e = this.f1662c;
        this.f1663d = aVar;
    }

    /* renamed from: d */
    public float mo2054d() {
        return this.f1661b.getUpper().floatValue();
    }

    /* renamed from: e */
    public float mo2055e() {
        return this.f1661b.getLower().floatValue();
    }

    /* renamed from: f */
    public Rect mo2056f() {
        return (Rect) C1177h.m4583e((Rect) this.f1660a.mo2119a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    /* renamed from: g */
    public void mo2057g() {
        this.f1662c = 1.0f;
        C1814b.C1815a<Void> aVar = this.f1663d;
        if (aVar != null) {
            aVar.mo6310f(new C0938m1.C0939a("Camera is not active."));
            this.f1663d = null;
        }
    }
}
