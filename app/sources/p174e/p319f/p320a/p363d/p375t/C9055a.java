package p174e.p319f.p320a.p363d.p375t;

import android.content.Context;
import android.graphics.Color;
import p027c.p064i.p065d.C1827a;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.p372q.C9052a;
import p174e.p319f.p320a.p363d.p379x.C9061b;

/* renamed from: e.f.a.d.t.a */
public class C9055a {

    /* renamed from: a */
    private final boolean f24870a;

    /* renamed from: b */
    private final int f24871b;

    /* renamed from: c */
    private final int f24872c;

    /* renamed from: d */
    private final float f24873d;

    public C9055a(Context context) {
        this.f24870a = C9061b.m30194b(context, C9013b.elevationOverlayEnabled, false);
        this.f24871b = C9052a.m30170a(context, C9013b.elevationOverlayColor, 0);
        this.f24872c = C9052a.m30170a(context, C9013b.colorSurface, 0);
        this.f24873d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m30178e(int i) {
        return C1827a.m7759h(i, 255) == this.f24872c;
    }

    /* renamed from: a */
    public float mo23005a(float f) {
        float f2 = this.f24873d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo23006b(int i, float f) {
        float a = mo23005a(f);
        return C1827a.m7759h(C9052a.m30175f(C1827a.m7759h(i, 255), this.f24871b, a), Color.alpha(i));
    }

    /* renamed from: c */
    public int mo23007c(int i, float f) {
        return (!this.f24870a || !m30178e(i)) ? i : mo23006b(i, f);
    }

    /* renamed from: d */
    public boolean mo23008d() {
        return this.f24870a;
    }
}
