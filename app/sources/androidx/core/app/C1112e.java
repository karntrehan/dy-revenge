package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.e */
public final class C1112e {

    /* renamed from: androidx.core.app.e$a */
    static class C1113a {

        /* renamed from: a */
        private static Method f3095a;

        /* renamed from: b */
        private static boolean f3096b;

        /* renamed from: c */
        private static Method f3097c;

        /* renamed from: d */
        private static boolean f3098d;

        /* renamed from: a */
        public static IBinder m4320a(Bundle bundle, String str) {
            if (!f3096b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f3095a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f3096b = true;
            }
            Method method2 = f3095a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f3095a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m4321b(Bundle bundle, String str, IBinder iBinder) {
            if (!f3098d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f3097c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f3098d = true;
            }
            Method method2 = f3097c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f3097c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m4318a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C1113a.m4320a(bundle, str);
    }

    /* renamed from: b */
    public static void m4319b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C1113a.m4321b(bundle, str, iBinder);
        }
    }
}
