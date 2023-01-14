package p027c.p100v;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: c.v.t0 */
class C2195t0 extends C2193s0 {
    C2195t0() {
    }

    /* renamed from: c */
    public float mo7343c(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo7350e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: f */
    public void mo7353f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: g */
    public void mo7345g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: h */
    public void mo7354h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: i */
    public void mo7351i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: j */
    public void mo7352j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
