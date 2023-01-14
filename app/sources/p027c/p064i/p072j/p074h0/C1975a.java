package p027c.p064i.p072j.p074h0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: c.i.j.h0.a */
class C1975a implements Interpolator {

    /* renamed from: a */
    private final float[] f5739a;

    /* renamed from: b */
    private final float[] f5740b;

    C1975a(float f, float f2, float f3, float f4) {
        this(m8297a(f, f2, f3, f4));
    }

    C1975a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f5739a = new float[i];
        this.f5740b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, (float[]) null);
            this.f5739a[i2] = fArr[0];
            this.f5740b[i2] = fArr[1];
        }
    }

    /* renamed from: a */
    private static Path m8297a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f5739a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f5739a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f5739a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f5740b[i];
        }
        float[] fArr2 = this.f5740b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
