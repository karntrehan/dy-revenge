package p174e.p319f.p320a.p363d.p366l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p027c.p087p.p088a.p089a.C2063a;
import p027c.p087p.p088a.p089a.C2064b;
import p027c.p087p.p088a.p089a.C2065c;

/* renamed from: e.f.a.d.l.a */
public class C9025a {

    /* renamed from: a */
    public static final TimeInterpolator f24819a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f24820b = new C2064b();

    /* renamed from: c */
    public static final TimeInterpolator f24821c = new C2063a();

    /* renamed from: d */
    public static final TimeInterpolator f24822d = new C2065c();

    /* renamed from: e */
    public static final TimeInterpolator f24823e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m30120a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
