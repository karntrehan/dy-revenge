package p174e.p319f.p406d.p407a.p409c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3675i;
import com.google.android.gms.common.util.C3765l;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: e.f.d.a.c.c */
public class C9595c {

    /* renamed from: a */
    private static final C3675i f25685a = new C3675i("CommonUtils", HttpUrl.FRAGMENT_ENCODE_SET);

    @RecentlyNonNull
    /* renamed from: a */
    public static String m32696a(@RecentlyNonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            C3675i iVar = f25685a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 48);
            sb.append("Exception thrown when trying to get app version ");
            sb.append(valueOf);
            iVar.mo11610c("CommonUtils", sb.toString());
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: b */
    public static String m32697b(@RecentlyNonNull Locale locale) {
        if (C3765l.m14529g()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
