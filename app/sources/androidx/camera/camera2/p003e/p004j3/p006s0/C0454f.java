package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.e.j3.s0.f */
public class C0454f implements C0470u {

    /* renamed from: a */
    public static final List<String> f1591a = Arrays.asList(new String[]{"SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN"});

    /* renamed from: a */
    static boolean m1977a(C0402g0 g0Var) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f1591a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) g0Var.mo2119a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
