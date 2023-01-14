package p174e.p247e.p274h.p288i;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: e.e.h.i.a */
public class C6236a {

    /* renamed from: e.e.h.i.a$a */
    public static class C6237a {

        /* renamed from: a */
        public int f17270a;

        /* renamed from: b */
        public int f17271b;
    }

    /* renamed from: a */
    private static boolean m23641a(int i) {
        return i == 0 || i == -2;
    }

    /* renamed from: b */
    public static void m23642b(C6237a aVar, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f > 0.0f && layoutParams != null) {
            if (m23641a(layoutParams.height)) {
                aVar.f17271b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f17270a) - i)) / f) + ((float) i2)), aVar.f17271b), 1073741824);
            } else if (m23641a(layoutParams.width)) {
                aVar.f17270a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f17271b) - i2)) * f) + ((float) i)), aVar.f17270a), 1073741824);
            }
        }
    }
}
