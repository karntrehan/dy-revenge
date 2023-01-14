package p027c.p100v;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: c.v.s0 */
class C2193s0 extends C2191r0 {

    /* renamed from: k */
    private static boolean f6403k = true;

    C2193s0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo7354h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo7354h(view, i);
        } else if (f6403k) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f6403k = false;
            }
        }
    }
}
