package p027c.p100v;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.v.k */
class C2170k implements C2166i {

    /* renamed from: f */
    private static Class<?> f6361f;

    /* renamed from: o */
    private static boolean f6362o;

    /* renamed from: p */
    private static Method f6363p;

    /* renamed from: q */
    private static boolean f6364q;

    /* renamed from: r */
    private static Method f6365r;

    /* renamed from: s */
    private static boolean f6366s;

    /* renamed from: t */
    private final View f6367t;

    private C2170k(View view) {
        this.f6367t = view;
    }

    /* renamed from: b */
    static C2166i m9218b(View view, ViewGroup viewGroup, Matrix matrix) {
        m9219c();
        Method method = f6363p;
        if (method != null) {
            try {
                return new C2170k((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m9219c() {
        if (!f6364q) {
            try {
                m9220d();
                Method declaredMethod = f6361f.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f6363p = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
            }
            f6364q = true;
        }
    }

    /* renamed from: d */
    private static void m9220d() {
        if (!f6362o) {
            try {
                f6361f = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            f6362o = true;
        }
    }

    /* renamed from: e */
    private static void m9221e() {
        if (!f6366s) {
            try {
                m9220d();
                Method declaredMethod = f6361f.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f6365r = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
            }
            f6366s = true;
        }
    }

    /* renamed from: f */
    static void m9222f(View view) {
        m9221e();
        Method method = f6365r;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo7278a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.f6367t.setVisibility(i);
    }
}
