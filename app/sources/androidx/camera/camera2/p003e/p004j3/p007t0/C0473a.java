package androidx.camera.camera2.p003e.p004j3.p007t0;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0449a;
import androidx.camera.core.impl.C0823i2;

/* renamed from: androidx.camera.camera2.e.j3.t0.a */
public class C0473a {

    /* renamed from: a */
    private final Range<Integer> f1607a;

    public C0473a(C0823i2 i2Var) {
        C0449a aVar = (C0449a) i2Var.mo3015b(C0449a.class);
        this.f1607a = aVar == null ? null : aVar.mo2208b();
    }

    /* renamed from: a */
    public void mo2216a(C0304b.C0305a aVar) {
        Range<Integer> range = this.f1607a;
        if (range != null) {
            aVar.mo1889e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
