package androidx.camera.core;

import android.os.Build;
import android.util.Log;

/* renamed from: androidx.camera.core.o2 */
public final class C0949o2 {

    /* renamed from: a */
    private static int f2672a = 3;

    /* renamed from: a */
    public static void m3688a(String str, String str2) {
        String j = m3697j(str);
        if (m3694g(j, 3)) {
            Log.d(j, str2);
        }
    }

    /* renamed from: b */
    public static void m3689b(String str, String str2, Throwable th) {
        String j = m3697j(str);
        if (m3694g(j, 3)) {
            Log.d(j, str2, th);
        }
    }

    /* renamed from: c */
    public static void m3690c(String str, String str2) {
        String j = m3697j(str);
        if (m3694g(j, 6)) {
            Log.e(j, str2);
        }
    }

    /* renamed from: d */
    public static void m3691d(String str, String str2, Throwable th) {
        String j = m3697j(str);
        if (m3694g(j, 6)) {
            Log.e(j, str2, th);
        }
    }

    /* renamed from: e */
    public static void m3692e(String str, String str2) {
        String j = m3697j(str);
        if (m3694g(j, 4)) {
            Log.i(j, str2);
        }
    }

    /* renamed from: f */
    public static boolean m3693f(String str) {
        return m3694g(m3697j(str), 3);
    }

    /* renamed from: g */
    private static boolean m3694g(String str, int i) {
        return f2672a <= i || Log.isLoggable(str, i);
    }

    /* renamed from: h */
    static void m3695h() {
        f2672a = 3;
    }

    /* renamed from: i */
    static void m3696i(int i) {
        f2672a = i;
    }

    /* renamed from: j */
    private static String m3697j(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* renamed from: k */
    public static void m3698k(String str, String str2) {
        String j = m3697j(str);
        if (m3694g(j, 5)) {
            Log.w(j, str2);
        }
    }

    /* renamed from: l */
    public static void m3699l(String str, String str2, Throwable th) {
        String j = m3697j(str);
        if (m3694g(j, 5)) {
            Log.w(j, str2, th);
        }
    }
}
