package androidx.camera.extensions.p017f.p018q.p019a;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;

/* renamed from: androidx.camera.extensions.f.q.a.c */
public class C1055c implements C0817h2 {
    /* renamed from: a */
    private static boolean m4074a() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: b */
    static boolean m4075b() {
        return m4074a();
    }

    /* renamed from: c */
    public boolean mo3348c(boolean z) {
        return !z && m4074a();
    }
}
