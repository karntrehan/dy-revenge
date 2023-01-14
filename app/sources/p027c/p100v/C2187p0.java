package p027c.p100v;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: c.v.p0 */
class C2187p0 extends C2197u0 {

    /* renamed from: f */
    private static boolean f6392f = true;

    C2187p0() {
    }

    /* renamed from: a */
    public void mo7342a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo7343c(View view) {
        if (f6392f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6392f = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo7344d(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo7345g(View view, float f) {
        if (f6392f) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f6392f = false;
            }
        }
        view.setAlpha(f);
    }
}
