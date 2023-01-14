package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
final class C1106c {

    /* renamed from: a */
    protected static final Class<?> f3076a;

    /* renamed from: b */
    protected static final Field f3077b = m4308b();

    /* renamed from: c */
    protected static final Field f3078c = m4312f();

    /* renamed from: d */
    protected static final Method f3079d;

    /* renamed from: e */
    protected static final Method f3080e;

    /* renamed from: f */
    protected static final Method f3081f;

    /* renamed from: g */
    private static final Handler f3082g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    class C1107a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1110d f3083f;

        /* renamed from: o */
        final /* synthetic */ Object f3084o;

        C1107a(C1110d dVar, Object obj) {
            this.f3083f = dVar;
            this.f3084o = obj;
        }

        public void run() {
            this.f3083f.f3089f = this.f3084o;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    class C1108b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Application f3085f;

        /* renamed from: o */
        final /* synthetic */ C1110d f3086o;

        C1108b(Application application, C1110d dVar) {
            this.f3085f = application;
            this.f3086o = dVar;
        }

        public void run() {
            this.f3085f.unregisterActivityLifecycleCallbacks(this.f3086o);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    class C1109c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f3087f;

        /* renamed from: o */
        final /* synthetic */ Object f3088o;

        C1109c(Object obj, Object obj2) {
            this.f3087f = obj;
            this.f3088o = obj2;
        }

        public void run() {
            try {
                Method method = C1106c.f3079d;
                if (method != null) {
                    method.invoke(this.f3087f, new Object[]{this.f3088o, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C1106c.f3080e.invoke(this.f3087f, new Object[]{this.f3088o, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    private static final class C1110d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: f */
        Object f3089f;

        /* renamed from: o */
        private Activity f3090o;

        /* renamed from: p */
        private final int f3091p;

        /* renamed from: q */
        private boolean f3092q = false;

        /* renamed from: r */
        private boolean f3093r = false;

        /* renamed from: s */
        private boolean f3094s = false;

        C1110d(Activity activity) {
            this.f3090o = activity;
            this.f3091p = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f3090o == activity) {
                this.f3090o = null;
                this.f3093r = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f3093r && !this.f3094s && !this.f3092q && C1106c.m4314h(this.f3089f, this.f3091p, activity)) {
                this.f3094s = true;
                this.f3089f = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f3090o == activity) {
                this.f3092q = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m4307a();
        f3076a = a;
        f3079d = m4310d(a);
        f3080e = m4309c(a);
        f3081f = m4311e(a);
    }

    /* renamed from: a */
    private static Class<?> m4307a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m4308b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m4309c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m4310d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m4311e(Class<?> cls) {
        if (m4313g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m4312f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m4313g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m4314h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f3078c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f3082g.postAtFrontOfQueue(new C1109c(f3077b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m4315i(Activity activity) {
        Object obj;
        Application application;
        C1110d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m4313g() && f3081f == null) {
            return false;
        } else {
            if (f3080e == null && f3079d == null) {
                return false;
            }
            try {
                Object obj2 = f3078c.get(activity);
                if (obj2 == null || (obj = f3077b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C1110d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f3082g;
                handler.post(new C1107a(dVar, obj2));
                if (m4313g()) {
                    Method method = f3081f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C1108b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
