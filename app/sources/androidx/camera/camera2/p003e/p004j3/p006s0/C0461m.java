package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.e.j3.s0.m */
public class C0461m implements C0470u {

    /* renamed from: a */
    private static final List<String> f1597a = Arrays.asList(new String[]{"PIXEL 3A", "PIXEL 3A XL"});

    /* renamed from: a */
    static boolean m1998a(C0402g0 g0Var) {
        return f1597a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) g0Var.mo2119a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
