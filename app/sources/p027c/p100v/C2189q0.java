package p027c.p100v;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: c.v.q0 */
class C2189q0 extends C2187p0 {

    /* renamed from: g */
    private static boolean f6399g = true;

    /* renamed from: h */
    private static boolean f6400h = true;

    /* renamed from: i */
    private static boolean f6401i = true;

    C2189q0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo7350e(View view, Matrix matrix) {
        if (f6399g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f6399g = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo7351i(View view, Matrix matrix) {
        if (f6400h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6400h = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public void mo7352j(View view, Matrix matrix) {
        if (f6401i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6401i = false;
            }
        }
    }
}
