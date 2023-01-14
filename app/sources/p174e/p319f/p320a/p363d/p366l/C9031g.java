package p174e.p319f.p320a.p363d.p366l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: e.f.a.d.l.g */
public class C9031g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f24829a = new float[9];

    /* renamed from: b */
    private final float[] f24830b = new float[9];

    /* renamed from: c */
    private final Matrix f24831c = new Matrix();

    /* renamed from: a */
    public Matrix mo13405a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f24829a);
        matrix2.getValues(this.f24830b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f24830b;
            float f2 = fArr[i];
            float[] fArr2 = this.f24829a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f24831c.setValues(this.f24830b);
        return this.f24831c;
    }
}
