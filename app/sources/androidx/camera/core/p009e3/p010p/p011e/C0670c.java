package androidx.camera.core.p009e3.p010p.p011e;

import android.os.Build;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0817h2;

/* renamed from: androidx.camera.core.e3.p.e.c */
public final class C0670c implements C0817h2 {
    /* renamed from: a */
    private static boolean m2798a() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: b */
    private static boolean m2799b() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    static boolean m2800d() {
        return m2799b() || m2798a();
    }

    /* renamed from: c */
    public boolean mo2715c(C0809g1.C0810a<?> aVar) {
        return aVar != C0788c1.f2357a;
    }
}
