package androidx.camera.core.p009e3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0608a3;
import androidx.camera.core.p009e3.p013q.C0677a;
import androidx.core.util.C1177h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.e3.n */
public class C0661n {
    /* renamed from: a */
    public static Map<C0608a3, Rect> m2771a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map<C0608a3, Size> map) {
        C1177h.m4580b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry next : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, (float) ((Size) next.getValue()).getWidth(), (float) ((Size) next.getValue()).getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put((C0608a3) next.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF g = m2777g(rectF2, C0677a.m2811c(i, rational), i2, z, i3, i);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry : hashMap.entrySet()) {
            ((Matrix) entry.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, g);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((C0608a3) entry.getKey(), rect2);
        }
        return hashMap2;
    }

    /* renamed from: b */
    private static RectF m2772b(boolean z, int i, RectF rectF, RectF rectF2) {
        boolean z2 = true;
        boolean z3 = i == 0 && !z;
        boolean z4 = i == 90 && z;
        if (z3 || z4) {
            return rectF2;
        }
        boolean z5 = i == 0 && z;
        boolean z6 = i == 270 && !z;
        if (z5 || z6) {
            return m2773c(rectF2, rectF.centerX());
        }
        boolean z7 = i == 90 && !z;
        boolean z8 = i == 180 && z;
        if (z7 || z8) {
            return m2774d(rectF2, rectF.centerY());
        }
        boolean z9 = i == 180 && !z;
        if (i != 270 || !z) {
            z2 = false;
        }
        if (z9 || z2) {
            return m2773c(m2774d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i);
    }

    /* renamed from: c */
    private static RectF m2773c(RectF rectF, float f) {
        return new RectF(m2775e(rectF.right, f), rectF.top, m2775e(rectF.left, f), rectF.bottom);
    }

    /* renamed from: d */
    private static RectF m2774d(RectF rectF, float f) {
        return new RectF(rectF.left, m2776f(rectF.bottom, f), rectF.right, m2776f(rectF.top, f));
    }

    /* renamed from: e */
    private static float m2775e(float f, float f2) {
        return (f2 + f2) - f;
    }

    /* renamed from: f */
    private static float m2776f(float f, float f2) {
        return (f2 + f2) - f;
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: g */
    public static RectF m2777g(RectF rectF, Rational rational, int i, boolean z, int i2, int i3) {
        Matrix.ScaleToFit scaleToFit;
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) rational.getNumerator(), (float) rational.getDenominator());
        if (i == 0) {
            scaleToFit = Matrix.ScaleToFit.START;
        } else if (i == 1) {
            scaleToFit = Matrix.ScaleToFit.CENTER;
        } else if (i == 2) {
            scaleToFit = Matrix.ScaleToFit.END;
        } else {
            throw new IllegalStateException("Unexpected scale type: " + i);
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return m2772b(m2778h(z, i2), i3, rectF, rectF3);
    }

    /* renamed from: h */
    private static boolean m2778h(boolean z, int i) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        return z ^ z2;
    }
}
