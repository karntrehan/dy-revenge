package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0787c0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.o2 */
final class C0513o2 {
    /* renamed from: a */
    static CameraCaptureSession.CaptureCallback m2049a(C0783b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m2050b(b0Var, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : C0574y1.m2390a(arrayList);
    }

    /* renamed from: b */
    static void m2050b(C0783b0 b0Var, List<CameraCaptureSession.CaptureCallback> list) {
        if (b0Var instanceof C0787c0) {
            for (C0783b0 b : ((C0787c0) b0Var).mo2950d()) {
                m2050b(b, list);
            }
        } else if (b0Var instanceof C0509n2) {
            list.add(((C0509n2) b0Var).mo2241e());
        } else {
            list.add(new C0505m2(b0Var));
        }
    }
}
