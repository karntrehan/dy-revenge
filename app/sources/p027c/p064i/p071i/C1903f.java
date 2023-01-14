package p027c.p064i.p071i;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: c.i.i.f */
public final class C1903f {

    /* renamed from: a */
    private static final Locale f5596a = new Locale(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: a */
    private static int m7975a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m7976b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f5596a)) {
            return 0;
        }
        String c = C1891b.m7952c(locale);
        return c == null ? m7975a(locale) : (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
