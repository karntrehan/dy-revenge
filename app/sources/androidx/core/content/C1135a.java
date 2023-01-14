package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.TypedValue;
import androidx.core.content.p022d.C1154f;
import java.io.File;
import java.util.concurrent.Executor;
import p027c.p064i.p069g.C1852d;

/* renamed from: androidx.core.content.a */
public class C1135a {

    /* renamed from: a */
    private static final Object f3197a = new Object();

    /* renamed from: b */
    private static final Object f3198b = new Object();

    /* renamed from: c */
    private static TypedValue f3199c;

    /* renamed from: androidx.core.content.a$a */
    static class C1136a {
        /* renamed from: a */
        static void m4424a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m4425b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    static class C1137b {
        /* renamed from: a */
        static File[] m4426a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m4427b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m4428c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    static class C1138c {
        /* renamed from: a */
        static File m4429a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m4430b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m4431c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    static class C1139d {
        /* renamed from: a */
        static int m4432a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static ColorStateList m4433b(Context context, int i) {
            return context.getColorStateList(i);
        }

        /* renamed from: c */
        static <T> T m4434c(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: d */
        static String m4435d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    static class C1140e {
        /* renamed from: a */
        static Context m4436a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m4437b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m4438c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: androidx.core.content.a$f */
    static class C1141f {
        /* renamed from: a */
        static Executor m4439a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: a */
    public static int m4415a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static Context m4416b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1140e.m4436a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m4417c(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? C1139d.m4432a(context, i) : context.getResources().getColor(i);
    }

    /* renamed from: d */
    public static ColorStateList m4418d(Context context, int i) {
        return C1154f.m4491d(context.getResources(), i, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m4419e(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return C1138c.m4430b(context, i);
        }
        if (i2 < 16) {
            synchronized (f3197a) {
                if (f3199c == null) {
                    f3199c = new TypedValue();
                }
                context.getResources().getValue(i, f3199c, true);
                i = f3199c.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: f */
    public static File[] m4420f(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1137b.m4426a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: g */
    public static File[] m4421g(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1137b.m4427b(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: h */
    public static Executor m4422h(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? C1141f.m4439a(context) : C1852d.m7866a(new Handler(context.getMainLooper()));
    }

    /* renamed from: i */
    public static boolean m4423i(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1136a.m4424a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }
}
