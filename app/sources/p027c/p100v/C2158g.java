package p027c.p100v;

import android.animation.TypeEvaluator;

/* renamed from: c.v.g */
class C2158g implements TypeEvaluator<float[]> {

    /* renamed from: a */
    private float[] f6340a;

    C2158g(float[] fArr) {
        this.f6340a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f6340a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
