package p174e.p319f.p320a.p363d.p372q;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p027c.p064i.p065d.C1827a;
import p174e.p319f.p320a.p363d.p379x.C9061b;

/* renamed from: e.f.a.d.q.a */
public class C9052a {
    /* renamed from: a */
    public static int m30170a(Context context, int i, int i2) {
        TypedValue a = C9061b.m30193a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: b */
    public static int m30171b(Context context, int i, String str) {
        return C9061b.m30195c(context, i, str);
    }

    /* renamed from: c */
    public static int m30172c(View view, int i) {
        return C9061b.m30196d(view, i);
    }

    /* renamed from: d */
    public static int m30173d(View view, int i, int i2) {
        return m30170a(view.getContext(), i, i2);
    }

    /* renamed from: e */
    public static int m30174e(int i, int i2) {
        return C1827a.m7756e(i2, i);
    }

    /* renamed from: f */
    public static int m30175f(int i, int i2, float f) {
        return m30174e(i, C1827a.m7759h(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: g */
    public static int m30176g(View view, int i, int i2, float f) {
        return m30175f(m30172c(view, i), m30172c(view, i2), f);
    }
}
