package p027c.p100v;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.v.o0 */
class C2183o0 {

    /* renamed from: a */
    private static final C2197u0 f6389a;

    /* renamed from: b */
    static final Property<View, Float> f6390b = new C2184a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property<View, Rect> f6391c = new C2185b(Rect.class, "clipBounds");

    /* renamed from: c.v.o0$a */
    static class C2184a extends Property<View, Float> {
        C2184a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C2183o0.m9255c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C2183o0.m9260h(view, f.floatValue());
        }
    }

    /* renamed from: c.v.o0$b */
    static class C2185b extends Property<View, Rect> {
        C2185b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C1988t.m8403r(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C1988t.m8406s0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f6389a = i >= 29 ? new C2195t0() : i >= 23 ? new C2193s0() : i >= 22 ? new C2191r0() : i >= 21 ? new C2189q0() : i >= 19 ? new C2187p0() : new C2197u0();
    }

    /* renamed from: a */
    static void m9253a(View view) {
        f6389a.mo7342a(view);
    }

    /* renamed from: b */
    static C2181n0 m9254b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C2178m0(view) : C2175l0.m9234e(view);
    }

    /* renamed from: c */
    static float m9255c(View view) {
        return f6389a.mo7343c(view);
    }

    /* renamed from: d */
    static C2227z0 m9256d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C2223y0(view) : new C2221x0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m9257e(View view) {
        f6389a.mo7344d(view);
    }

    /* renamed from: f */
    static void m9258f(View view, Matrix matrix) {
        f6389a.mo7350e(view, matrix);
    }

    /* renamed from: g */
    static void m9259g(View view, int i, int i2, int i3, int i4) {
        f6389a.mo7353f(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    static void m9260h(View view, float f) {
        f6389a.mo7345g(view, f);
    }

    /* renamed from: i */
    static void m9261i(View view, int i) {
        f6389a.mo7354h(view, i);
    }

    /* renamed from: j */
    static void m9262j(View view, Matrix matrix) {
        f6389a.mo7351i(view, matrix);
    }

    /* renamed from: k */
    static void m9263k(View view, Matrix matrix) {
        f6389a.mo7352j(view, matrix);
    }
}
