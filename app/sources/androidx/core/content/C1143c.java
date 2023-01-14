package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C1111d;

/* renamed from: androidx.core.content.c */
public final class C1143c {
    /* renamed from: a */
    public static int m4440a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String b = C1111d.m4317b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C1111d.m4316a(context, b, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m4441b(Context context, String str) {
        return m4440a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
