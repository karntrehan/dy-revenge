package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: androidx.core.util.d */
public class C1173d {
    /* renamed from: a */
    public static boolean m4572a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m4573b(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static String m4574c(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
