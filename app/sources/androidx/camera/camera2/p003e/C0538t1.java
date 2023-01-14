package androidx.camera.camera2.p003e;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0799e0;
import androidx.camera.core.impl.C0804f0;
import androidx.camera.core.impl.C0808g0;
import androidx.camera.core.impl.C0815h0;
import androidx.camera.core.impl.C0819i0;
import androidx.camera.core.impl.C0825j0;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.C0891u2;
import androidx.camera.core.impl.p014a3.C0731h;

/* renamed from: androidx.camera.camera2.e.t1 */
public class C0538t1 implements C0830k0 {

    /* renamed from: a */
    private final C0891u2 f1730a;

    /* renamed from: b */
    private final CaptureResult f1731b;

    public C0538t1(CaptureResult captureResult) {
        this(C0891u2.m3514a(), captureResult);
    }

    public C0538t1(C0891u2 u2Var, CaptureResult captureResult) {
        this.f1730a = u2Var;
        this.f1731b = captureResult;
    }

    /* renamed from: a */
    public C0819i0 mo2294a() {
        Integer num = (Integer) this.f1731b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return C0819i0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return C0819i0.NONE;
        }
        if (intValue == 2) {
            return C0819i0.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return C0819i0.FIRED;
        }
        C0949o2.m3690c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return C0819i0.UNKNOWN;
    }

    /* renamed from: b */
    public long mo2295b() {
        Long l = (Long) this.f1731b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    /* renamed from: c */
    public C0891u2 mo2296c() {
        return this.f1730a;
    }

    /* renamed from: d */
    public void mo2297d(C0731h.C0733b bVar) {
        Integer num;
        C0825j0.m3238a(this, bVar);
        Rect rect = (Rect) this.f1731b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.mo2858j(rect.width()).mo2857i(rect.height());
        }
        Integer num2 = (Integer) this.f1731b.get(CaptureResult.JPEG_ORIENTATION);
        if (num2 != null) {
            bVar.mo2861m(num2.intValue());
        }
        Long l = (Long) this.f1731b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            bVar.mo2854f(l.longValue());
        }
        Float f = (Float) this.f1731b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bVar.mo2860l(f.floatValue());
        }
        Integer num3 = (Integer) this.f1731b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f1731b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (((float) num.intValue()) / 100.0f)));
            }
            bVar.mo2859k(num3.intValue());
        }
        Float f2 = (Float) this.f1731b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bVar.mo2856h(f2.floatValue());
        }
        Integer num4 = (Integer) this.f1731b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            C0731h.C0737c cVar = C0731h.C0737c.AUTO;
            if (num4.intValue() == 0) {
                cVar = C0731h.C0737c.MANUAL;
            }
            bVar.mo2862n(cVar);
        }
    }

    /* renamed from: e */
    public C0799e0 mo2298e() {
        Integer num = (Integer) this.f1731b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return C0799e0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return C0799e0.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return C0799e0.CONVERGED;
            }
            if (intValue == 3) {
                return C0799e0.LOCKED;
            }
            if (intValue == 4) {
                return C0799e0.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                C0949o2.m3690c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return C0799e0.UNKNOWN;
            }
        }
        return C0799e0.SEARCHING;
    }

    /* renamed from: f */
    public C0804f0 mo2299f() {
        Integer num = (Integer) this.f1731b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return C0804f0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return C0804f0.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return C0804f0.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C0949o2.m3690c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return C0804f0.UNKNOWN;
            }
        }
        return C0804f0.OFF;
    }

    /* renamed from: g */
    public C0808g0 mo2300g() {
        Integer num = (Integer) this.f1731b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return C0808g0.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return C0808g0.INACTIVE;
            case 1:
            case 3:
                return C0808g0.SCANNING;
            case 2:
                return C0808g0.PASSIVE_FOCUSED;
            case 4:
                return C0808g0.LOCKED_FOCUSED;
            case 5:
                return C0808g0.LOCKED_NOT_FOCUSED;
            case 6:
                return C0808g0.PASSIVE_NOT_FOCUSED;
            default:
                C0949o2.m3690c("C2CameraCaptureResult", "Undefined af state: " + num);
                return C0808g0.UNKNOWN;
        }
    }

    /* renamed from: h */
    public C0815h0 mo2301h() {
        Integer num = (Integer) this.f1731b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return C0815h0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return C0815h0.INACTIVE;
        }
        if (intValue == 1) {
            return C0815h0.METERING;
        }
        if (intValue == 2) {
            return C0815h0.CONVERGED;
        }
        if (intValue == 3) {
            return C0815h0.LOCKED;
        }
        C0949o2.m3690c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return C0815h0.UNKNOWN;
    }

    /* renamed from: i */
    public CaptureResult mo2302i() {
        return this.f1731b;
    }
}
