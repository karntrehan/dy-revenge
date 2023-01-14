package p027c.p100v;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: c.v.m */
class C2177m {
    /* renamed from: a */
    static C2166i m9245a(View view, ViewGroup viewGroup, Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? C2170k.m9218b(view, viewGroup, matrix) : C2173l.m9226b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    static void m9246b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C2170k.m9222f(view);
        } else {
            C2173l.m9230f(view);
        }
    }
}
