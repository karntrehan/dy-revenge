package p174e.p319f.p320a.p363d.p367m;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: e.f.a.d.m.a */
public class C9036a {
    /* renamed from: a */
    public static int m30150a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
