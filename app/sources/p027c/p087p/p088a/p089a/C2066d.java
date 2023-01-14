package p027c.p087p.p088a.p089a;

import android.view.animation.Interpolator;

/* renamed from: c.p.a.a.d */
abstract class C2066d implements Interpolator {

    /* renamed from: a */
    private final float[] f6023a;

    /* renamed from: b */
    private final float f6024b;

    protected C2066d(float[] fArr) {
        this.f6023a = fArr;
        this.f6024b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f6023a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f6024b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f6023a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
