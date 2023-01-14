package androidx.camera.camera2.p003e;

import androidx.camera.core.C0640d3;

/* renamed from: androidx.camera.camera2.e.i3 */
class C0380i3 implements C0640d3 {

    /* renamed from: a */
    private float f1471a;

    /* renamed from: b */
    private final float f1472b;

    /* renamed from: c */
    private final float f1473c;

    /* renamed from: d */
    private float f1474d;

    C0380i3(float f, float f2) {
        this.f1472b = f;
        this.f1473c = f2;
    }

    /* renamed from: e */
    private float m1780e(float f) {
        float f2 = this.f1472b;
        float f3 = this.f1473c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    /* renamed from: a */
    public float mo2068a() {
        return this.f1472b;
    }

    /* renamed from: b */
    public float mo2069b() {
        return this.f1473c;
    }

    /* renamed from: c */
    public float mo2070c() {
        return this.f1471a;
    }

    /* renamed from: d */
    public float mo2071d() {
        return this.f1474d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2072f(float f) {
        if (f > this.f1472b || f < this.f1473c) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f1473c + " , " + this.f1472b + "]");
        }
        this.f1471a = f;
        this.f1474d = m1780e(f);
    }
}
