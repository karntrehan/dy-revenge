package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.facebook.react.views.view.a */
public class C3236a {

    /* renamed from: a */
    private static Method f9122a = null;

    /* renamed from: b */
    private static Method f9123b = null;

    /* renamed from: c */
    private static boolean f9124c = false;

    @SuppressLint({"SoonBlockedPrivateApi", "PrivateApi"})
    /* renamed from: a */
    public static void m12658a(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 29) {
                m12659b();
                if (z) {
                    try {
                        Method method2 = f9122a;
                        if (method2 != null) {
                            method2.invoke(canvas, new Object[0]);
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                        return;
                    }
                }
                if (!z && (method = f9123b) != null) {
                    method.invoke(canvas, new Object[0]);
                }
            } else if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        }
    }

    /* renamed from: b */
    private static void m12659b() {
        Method declaredMethod;
        if (!f9124c) {
            try {
                if (Build.VERSION.SDK_INT == 28) {
                    Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Class[].class});
                    f9122a = (Method) declaredMethod2.invoke(Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});
                    declaredMethod = (Method) declaredMethod2.invoke(Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});
                } else {
                    f9122a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    declaredMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                f9123b = declaredMethod;
                Method method = f9122a;
                if (method == null) {
                    return;
                }
                if (f9123b != null) {
                    method.setAccessible(true);
                    f9123b.setAccessible(true);
                    f9124c = true;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }
}
