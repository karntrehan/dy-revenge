package p027c.p043d.p044a.p046l1.p047m.p048f;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import p027c.p043d.p044a.C1727y0;

/* renamed from: c.d.a.l1.m.f.a */
public class C1594a implements C0817h2 {
    /* renamed from: a */
    private static boolean m7047a() {
        return "lge".equalsIgnoreCase(Build.BRAND) && "lg-k430".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: c */
    private static boolean m7048c() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "redmi note 4".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    static boolean m7049d() {
        return m7048c() || m7047a();
    }

    /* renamed from: b */
    public boolean mo5767b(C1727y0 y0Var) {
        return (m7048c() || m7047a()) && y0Var == C1727y0.f5142c;
    }
}
