package p508me.furtado.smsretriever;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.C3629e;

/* renamed from: me.furtado.smsretriever.a */
final class C10855a {
    /* renamed from: a */
    static boolean m36950a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode >= 10200000;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static boolean m36951b(Context context) {
        int i = C3629e.m14086q().mo11484i(context);
        return (i == 1 || i == 3 || i == 9) ? false : true;
    }
}
