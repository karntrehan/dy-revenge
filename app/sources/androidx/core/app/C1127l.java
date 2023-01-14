package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.core.app.l */
public final class C1127l {

    /* renamed from: a */
    private static final Object f3178a = new Object();

    /* renamed from: b */
    private static Set<String> f3179b = new HashSet();

    /* renamed from: c */
    private static final Object f3180c = new Object();

    /* renamed from: d */
    private final Context f3181d;

    /* renamed from: e */
    private final NotificationManager f3182e;

    private C1127l(Context context) {
        this.f3181d = context;
        this.f3182e = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public static C1127l m4384b(Context context) {
        return new C1127l(context);
    }

    /* renamed from: a */
    public boolean mo3595a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f3182e.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f3181d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f3181d.getApplicationInfo();
        String packageName = this.f3181d.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
