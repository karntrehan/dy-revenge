package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.impl.C0817h2;

/* renamed from: androidx.camera.camera2.e.j3.s0.b */
public class C0450b implements C0817h2 {
    /* renamed from: a */
    static boolean m1972a(C0402g0 g0Var) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && ((Integer) g0Var.mo2119a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
