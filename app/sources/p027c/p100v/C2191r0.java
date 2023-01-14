package p027c.p100v;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: c.v.r0 */
class C2191r0 extends C2189q0 {

    /* renamed from: j */
    private static boolean f6402j = true;

    C2191r0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo7353f(View view, int i, int i2, int i3, int i4) {
        if (f6402j) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f6402j = false;
            }
        }
    }
}
