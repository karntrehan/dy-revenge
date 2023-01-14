package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;

/* renamed from: androidx.camera.core.r2 */
public abstract class C0962r2 {

    /* renamed from: a */
    private Rational f2699a;

    public C0962r2() {
        this((Rational) null);
    }

    public C0962r2(Rational rational) {
        this.f2699a = rational;
    }

    /* renamed from: d */
    public static float m3735d() {
        return 0.15f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract PointF mo3207a(float f, float f2);

    /* renamed from: b */
    public final C0958q2 mo3208b(float f, float f2) {
        return mo3209c(f, f2, m3735d());
    }

    /* renamed from: c */
    public final C0958q2 mo3209c(float f, float f2, float f3) {
        PointF a = mo3207a(f, f2);
        return new C0958q2(a.x, a.y, f3, this.f2699a);
    }
}
