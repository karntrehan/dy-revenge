package p027c.p064i.p071i;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: c.i.i.b */
public final class C1891b {

    /* renamed from: a */
    private static Method f5569a;

    /* renamed from: b */
    private static Method f5570b;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                f5569a = cls2.getMethod("getScript", new Class[]{cls});
                f5570b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
            } catch (Exception e) {
                f5569a = null;
                f5570b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f5570b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m7950a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f5570b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m7951b(String str) {
        try {
            Method method = f5569a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    /* renamed from: c */
    public static String m7952c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f5570b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            }
        } else {
            String a = m7950a(locale);
            if (a != null) {
                return m7951b(a);
            }
            return null;
        }
    }
}
