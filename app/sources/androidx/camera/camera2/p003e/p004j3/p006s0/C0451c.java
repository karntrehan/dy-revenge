package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.impl.C0817h2;

/* renamed from: androidx.camera.camera2.e.j3.s0.c */
public class C0451c implements C0817h2 {
    /* renamed from: b */
    static boolean m1973b(C0402g0 g0Var) {
        Integer num = (Integer) g0Var.mo2119a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2 && Build.VERSION.SDK_INT == 21;
    }

    /* renamed from: a */
    public int mo2209a() {
        return 2;
    }
}
