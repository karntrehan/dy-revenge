package androidx.camera.core.impl.p014a3;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: androidx.camera.core.impl.a3.e */
public final class C0722e {

    /* renamed from: androidx.camera.core.impl.a3.e$a */
    private static class C0723a {
        /* renamed from: a */
        static Context m2981a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* renamed from: b */
        static String m2982b(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = androidx.camera.core.impl.p014a3.C0722e.C0723a.m2982b(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Context m2978a(android.content.Context r3) {
        /*
            android.content.Context r0 = r3.getApplicationContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L_0x0015
            java.lang.String r3 = androidx.camera.core.impl.p014a3.C0722e.C0723a.m2982b(r3)
            if (r3 == 0) goto L_0x0015
            android.content.Context r3 = androidx.camera.core.impl.p014a3.C0722e.C0723a.m2981a(r0, r3)
            return r3
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p014a3.C0722e.m2978a(android.content.Context):android.content.Context");
    }

    /* renamed from: b */
    public static Application m2979b(Context context) {
        for (Context a = m2978a(context); a instanceof ContextWrapper; a = m2980c((ContextWrapper) a)) {
            if (a instanceof Application) {
                return (Application) a;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = androidx.camera.core.impl.p014a3.C0722e.C0723a.m2982b(r3);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Context m2980c(android.content.ContextWrapper r3) {
        /*
            android.content.Context r0 = r3.getBaseContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L_0x0015
            java.lang.String r3 = androidx.camera.core.impl.p014a3.C0722e.C0723a.m2982b(r3)
            if (r3 == 0) goto L_0x0015
            android.content.Context r3 = androidx.camera.core.impl.p014a3.C0722e.C0723a.m2981a(r0, r3)
            return r3
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p014a3.C0722e.m2980c(android.content.ContextWrapper):android.content.Context");
    }
}
