package p027c.p100v;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.v.j0 */
class C2169j0 {

    /* renamed from: a */
    private static boolean f6358a = true;

    /* renamed from: b */
    private static Method f6359b;

    /* renamed from: c */
    private static boolean f6360c;

    /* renamed from: a */
    static int m9214a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f6360c) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f6359b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f6360c = true;
        }
        Method method = f6359b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    static C2167i0 m9215b(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C2165h0(viewGroup) : C2159g0.m9171g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private static void m9216c(ViewGroup viewGroup, boolean z) {
        if (f6358a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f6358a = false;
            }
        }
    }

    /* renamed from: d */
    static void m9217d(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m9216c(viewGroup, z);
        } else {
            C2171k0.m9225b(viewGroup, z);
        }
    }
}
