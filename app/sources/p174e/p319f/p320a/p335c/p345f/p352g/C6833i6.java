package p174e.p319f.p320a.p335c.p345f.p352g;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: e.f.a.c.f.g.i6 */
public final class C6833i6 {

    /* renamed from: a */
    static volatile C6700a7 f18533a = C6700a7.m25407c();

    /* renamed from: b */
    private static final Object f18534b = new Object();

    /* renamed from: a */
    public static boolean m25866a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (!f18533a.mo19514b()) {
            synchronized (f18534b) {
                if (f18533a.mo19514b()) {
                    boolean booleanValue = ((Boolean) f18533a.mo19513a()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f18533a = C6700a7.m25408d(Boolean.valueOf(z));
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f18533a = C6700a7.m25408d(Boolean.valueOf(z));
            }
        }
        return ((Boolean) f18533a.mo19513a()).booleanValue();
    }
}
