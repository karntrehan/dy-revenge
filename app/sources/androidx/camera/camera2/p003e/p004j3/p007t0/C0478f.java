package androidx.camera.camera2.p003e.p004j3.p007t0;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0457i;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0462n;

/* renamed from: androidx.camera.camera2.e.j3.t0.f */
public class C0478f {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo2222a(int i, C0304b.C0305a aVar) {
        CaptureRequest.Key key;
        Boolean bool;
        if (((C0462n) C0457i.m1980a(C0462n.class)) != null) {
            if (i == 0) {
                key = CaptureRequest.CONTROL_ENABLE_ZSL;
                bool = Boolean.TRUE;
            } else if (i == 1) {
                key = CaptureRequest.CONTROL_ENABLE_ZSL;
                bool = Boolean.FALSE;
            } else {
                return;
            }
            aVar.mo1889e(key, bool);
        }
    }
}
