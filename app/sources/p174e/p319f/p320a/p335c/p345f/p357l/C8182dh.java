package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: e.f.a.c.f.l.dh */
public final class C8182dh {

    /* renamed from: a */
    static volatile C8515w0<Boolean> f22211a = C8515w0.m29203c();

    /* renamed from: b */
    private static final Object f22212b = new Object();

    /* renamed from: a */
    public static boolean m28435a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!f22211a.mo21673b()) {
            synchronized (f22212b) {
                if (f22211a.mo21673b()) {
                    boolean booleanValue = f22211a.mo21672a().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f22211a = C8515w0.m29204d(Boolean.valueOf(z));
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f22211a = C8515w0.m29204d(Boolean.valueOf(z));
            }
        }
        return f22211a.mo21672a().booleanValue();
    }
}
