package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import p174e.p247e.p274h.p284e.C6205q;

/* renamed from: com.facebook.react.views.image.i */
public class C3110i extends C6205q.C6206a {

    /* renamed from: l */
    public static final C6205q.C6207b f8647l = new C3110i();

    /* renamed from: b */
    public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(Math.min(f3, f4), 1.0f);
        matrix.setScale(min, min);
        matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
    }

    public String toString() {
        return "start_inside";
    }
}
