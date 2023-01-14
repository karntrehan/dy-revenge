package p027c.p043d.p053b;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* renamed from: c.d.b.z */
public class C1776z {

    /* renamed from: a */
    public static final RectF f5266a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static Matrix m7510a(Rect rect) {
        return m7511b(new RectF(rect));
    }

    /* renamed from: b */
    private static Matrix m7511b(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f5266a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: c */
    public static Matrix m7512c(RectF rectF, RectF rectF2, int i) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f5266a, Matrix.ScaleToFit.FILL);
        matrix.postRotate((float) i);
        matrix.postConcat(m7511b(rectF2));
        return matrix;
    }

    /* renamed from: d */
    public static boolean m7513d(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i);
    }

    /* renamed from: e */
    public static boolean m7514e(Size size, boolean z, Size size2, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (z) {
            f = ((float) size.getWidth()) / ((float) size.getHeight());
            f2 = f;
        } else {
            f = (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f);
            f2 = (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
        }
        if (z2) {
            f3 = ((float) size2.getWidth()) / ((float) size2.getHeight());
            f4 = f3;
        } else {
            float width = (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f);
            f3 = (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f);
            f4 = width;
        }
        return f >= f3 && f4 >= f2;
    }

    /* renamed from: f */
    public static int m7515f(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalStateException("Unexpected rotation value " + i);
    }
}
