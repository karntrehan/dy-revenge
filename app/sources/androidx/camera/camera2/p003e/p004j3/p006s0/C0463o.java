package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.e.j3.s0.o */
public class C0463o implements C0470u {

    /* renamed from: a */
    public static final List<String> f1599a = Arrays.asList(new String[]{"SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P"});

    /* renamed from: a */
    static boolean m2000a(C0402g0 g0Var) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f1599a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) g0Var.mo2119a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
