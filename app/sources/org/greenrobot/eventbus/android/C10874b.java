package org.greenrobot.eventbus.android;

import java.lang.reflect.InvocationTargetException;

/* renamed from: org.greenrobot.eventbus.android.b */
public class C10874b {
    /* renamed from: a */
    public static boolean m36992a() {
        try {
            Class.forName("org.greenrobot.eventbus.android.AndroidComponentsImpl");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static C10873a m36993b() {
        try {
            return (C10873a) Class.forName("org.greenrobot.eventbus.android.AndroidComponentsImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m36994c() {
        try {
            return Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", new Class[0]).invoke((Object) null, new Object[0]) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
