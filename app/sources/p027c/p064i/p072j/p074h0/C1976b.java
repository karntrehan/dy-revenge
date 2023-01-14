package p027c.p064i.p072j.p074h0;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: c.i.j.h0.b */
public final class C1976b {
    /* renamed from: a */
    public static Interpolator m8298a(float f, float f2, float f3, float f4) {
        return Build.VERSION.SDK_INT >= 21 ? new PathInterpolator(f, f2, f3, f4) : new C1975a(f, f2, f3, f4);
    }
}
