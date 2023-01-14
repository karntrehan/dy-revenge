package p027c.p043d.p053b.p054a0.p055a.p056a;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;

/* renamed from: c.d.b.a0.a.a.d */
public class C1736d implements C0817h2 {
    /* renamed from: a */
    private static boolean m7397a() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: b */
    private static boolean m7398b() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m7399c() {
        return m7398b() || m7397a();
    }
}
