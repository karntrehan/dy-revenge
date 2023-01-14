package p174e.p247e.p274h.p284e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: e.e.h.e.q */
public class C6205q {

    /* renamed from: e.e.h.e.q$a */
    public static abstract class C6206a implements C6207b {
        /* renamed from: a */
        public Matrix mo18439a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            int i3 = i;
            int i4 = i2;
            mo9993b(matrix, rect, i3, i4, f, f2, ((float) rect.width()) / ((float) i3), ((float) rect.height()) / ((float) i4));
            return matrix;
        }

        /* renamed from: b */
        public abstract void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* renamed from: e.e.h.e.q$b */
    public interface C6207b {

        /* renamed from: a */
        public static final C6207b f17199a = C6216k.f17218l;

        /* renamed from: b */
        public static final C6207b f17200b = C6215j.f17217l;

        /* renamed from: c */
        public static final C6207b f17201c = C6217l.f17219l;

        /* renamed from: d */
        public static final C6207b f17202d = C6214i.f17216l;

        /* renamed from: e */
        public static final C6207b f17203e = C6212g.f17214l;

        /* renamed from: f */
        public static final C6207b f17204f = C6213h.f17215l;

        /* renamed from: g */
        public static final C6207b f17205g = C6208c.f17210l;

        /* renamed from: h */
        public static final C6207b f17206h = C6210e.f17212l;

        /* renamed from: i */
        public static final C6207b f17207i = C6209d.f17211l;

        /* renamed from: j */
        public static final C6207b f17208j = C6218m.f17220l;

        /* renamed from: k */
        public static final C6207b f17209k = C6211f.f17213l;

        /* renamed from: a */
        Matrix mo18439a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: e.e.h.e.q$c */
    private static class C6208c extends C6206a {

        /* renamed from: l */
        public static final C6207b f17210l = new C6208c();

        private C6208c() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }

        public String toString() {
            return "center";
        }
    }

    /* renamed from: e.e.h.e.q$d */
    private static class C6209d extends C6206a {

        /* renamed from: l */
        public static final C6207b f17211l = new C6209d();

        private C6209d() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                f5 = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f6 = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
                f5 = (float) rect.left;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* renamed from: e.e.h.e.q$e */
    private static class C6210e extends C6206a {

        /* renamed from: l */
        public static final C6207b f17212l = new C6210e();

        private C6210e() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* renamed from: e.e.h.e.q$f */
    private static class C6211f extends C6206a {

        /* renamed from: l */
        public static final C6207b f17213l = new C6211f();

        private C6211f() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i2) * min)) + 0.5f)));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* renamed from: e.e.h.e.q$g */
    private static class C6212g extends C6206a {

        /* renamed from: l */
        public static final C6207b f17214l = new C6212g();

        private C6212g() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* renamed from: e.e.h.e.q$h */
    private static class C6213h extends C6206a {

        /* renamed from: l */
        public static final C6207b f17215l = new C6213h();

        private C6213h() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + (((float) rect.width()) - (((float) i) * min)) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i2) * min)) + 0.5f)));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* renamed from: e.e.h.e.q$i */
    private static class C6214i extends C6206a {

        /* renamed from: l */
        public static final C6207b f17216l = new C6214i();

        private C6214i() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* renamed from: e.e.h.e.q$j */
    private static class C6215j extends C6206a {

        /* renamed from: l */
        public static final C6207b f17217l = new C6215j();

        private C6215j() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f);
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_x";
        }
    }

    /* renamed from: e.e.h.e.q$k */
    private static class C6216k extends C6206a {

        /* renamed from: l */
        public static final C6207b f17218l = new C6216k();

        private C6216k() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* renamed from: e.e.h.e.q$l */
    private static class C6217l extends C6206a {

        /* renamed from: l */
        public static final C6207b f17219l = new C6217l();

        private C6217l() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f4, f4);
            matrix.postTranslate((float) ((int) (((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }

        public String toString() {
            return "fit_y";
        }
    }

    /* renamed from: e.e.h.e.q$m */
    private static class C6218m extends C6206a {

        /* renamed from: l */
        public static final C6207b f17220l = new C6218m();

        private C6218m() {
        }

        /* renamed from: b */
        public void mo9993b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float f7 = ((float) i) * f4;
                f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f7), 0.0f), ((float) rect.width()) - f7);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                float f8 = ((float) i2) * f3;
                f6 = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f2 * f8), 0.0f), ((float) rect.height()) - f8) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* renamed from: e.e.h.e.q$n */
    public interface C6219n {
        Object getState();
    }

    /* renamed from: a */
    public static C6204p m23514a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof C6204p) {
            return (C6204p) drawable;
        }
        if (drawable instanceof C6188c) {
            return m23514a(((C6188c) drawable).mo18363r());
        }
        if (drawable instanceof C6185a) {
            C6185a aVar = (C6185a) drawable;
            int e = aVar.mo18340e();
            for (int i = 0; i < e; i++) {
                C6204p a = m23514a(aVar.mo18336b(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
