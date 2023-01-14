package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.e.j3.s0.t */
public class C0469t implements C0817h2 {
    /* renamed from: a */
    static boolean m2008a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
