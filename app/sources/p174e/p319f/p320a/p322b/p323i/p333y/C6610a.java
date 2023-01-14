package p174e.p319f.p320a.p322b.p323i.p333y;

import android.os.Build;
import android.util.Log;

/* renamed from: e.f.a.b.i.y.a */
public final class C6610a {
    /* renamed from: a */
    private static String m25241a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m25242b(String str, String str2, Object obj) {
        String e = m25245e(str);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: c */
    public static void m25243c(String str, String str2, Object... objArr) {
        String e = m25245e(str);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m25244d(String str, String str2, Throwable th) {
        String e = m25245e(str);
        if (Log.isLoggable(e, 6)) {
            Log.e(e, str2, th);
        }
    }

    /* renamed from: e */
    private static String m25245e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m25241a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m25246f(String str, String str2, Object obj) {
        String e = m25245e(str);
        if (Log.isLoggable(e, 4)) {
            Log.i(e, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: g */
    public static void m25247g(String str, String str2, Object obj) {
        String e = m25245e(str);
        if (Log.isLoggable(e, 5)) {
            Log.w(e, String.format(str2, new Object[]{obj}));
        }
    }
}
