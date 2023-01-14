package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p027c.p028a.C1444j;
import p027c.p064i.p065d.C1827a;

/* renamed from: androidx.appcompat.widget.s0 */
public class C0271s0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1186a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1187b = {-16842910};

    /* renamed from: c */
    static final int[] f1188c = {16842908};

    /* renamed from: d */
    static final int[] f1189d = {16843518};

    /* renamed from: e */
    static final int[] f1190e = {16842919};

    /* renamed from: f */
    static final int[] f1191f = {16842912};

    /* renamed from: g */
    static final int[] f1192g = {16842913};

    /* renamed from: h */
    static final int[] f1193h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1194i = new int[0];

    /* renamed from: j */
    private static final int[] f1195j = new int[1];

    /* renamed from: a */
    public static void m1349a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1444j.f4455z0);
        try {
            if (!obtainStyledAttributes.hasValue(C1444j.f4221E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1350b(Context context, int i) {
        ColorStateList e = m1353e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1187b, e.getDefaultColor());
        }
        TypedValue f = m1354f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m1352d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m1351c(Context context, int i) {
        int[] iArr = f1195j;
        iArr[0] = i;
        C0292x0 u = C0292x0.m1406u(context, (AttributeSet) null, iArr);
        try {
            return u.mo1785b(0, 0);
        } finally {
            u.mo1803w();
        }
    }

    /* renamed from: d */
    static int m1352d(Context context, int i, float f) {
        int c = m1351c(context, i);
        return C1827a.m7759h(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m1353e(Context context, int i) {
        int[] iArr = f1195j;
        iArr[0] = i;
        C0292x0 u = C0292x0.m1406u(context, (AttributeSet) null, iArr);
        try {
            return u.mo1786c(0);
        } finally {
            u.mo1803w();
        }
    }

    /* renamed from: f */
    private static TypedValue m1354f() {
        ThreadLocal<TypedValue> threadLocal = f1186a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
