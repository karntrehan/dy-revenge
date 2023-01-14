package p027c.p043d.p044a.p046l1.p047m.p048f;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import p027c.p043d.p044a.C1727y0;

/* renamed from: c.d.a.l1.m.f.i */
public class C1602i implements C0817h2 {
    /* renamed from: a */
    private static boolean m7066a() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: b */
    private static boolean m7067b() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    static boolean m7068d() {
        return m7066a() || m7067b();
    }

    /* renamed from: c */
    public boolean mo5769c(C1727y0 y0Var) {
        return y0Var == C1727y0.f5143d;
    }
}
