package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.p009e3.p010p.p011e.C0671d;

/* renamed from: androidx.camera.camera2.e.j3.s0.v */
public final class C0471v implements C0671d {
    /* renamed from: a */
    private static boolean m2009a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: b */
    private static boolean m2010b() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: c */
    private static boolean m2011c() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    static boolean m2012d(C0402g0 g0Var) {
        return m2009a() || m2010b() || m2011c();
    }
}
