package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.p133n.C3746c;
import com.google.android.gms.common.util.C3762i;
import com.google.android.gms.common.util.C3765l;
import com.google.android.gms.common.util.C3768o;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.i */
public class C3637i {
    @Deprecated

    /* renamed from: a */
    public static final int f10216a = 12451000;

    /* renamed from: b */
    static final AtomicBoolean f10217b = new AtomicBoolean();

    /* renamed from: c */
    private static boolean f10218c = false;

    /* renamed from: d */
    static boolean f10219d = false;

    /* renamed from: e */
    private static final AtomicBoolean f10220e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m14124a(Context context) {
        if (!f10217b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static int m14125b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static String m14126c(int i) {
        return C3623b.m14075H(i);
    }

    /* renamed from: d */
    public static Resources m14127d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m14128e(Context context) {
        if (!f10219d) {
            try {
                PackageInfo d = C3746c.m14493a(context).mo11719d("com.google.android.gms", 64);
                C3738j.m14462a(context);
                if (d == null || C3738j.m14464e(d, false) || !C3738j.m14464e(d, true)) {
                    f10218c = false;
                } else {
                    f10218c = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } catch (Throwable th) {
                f10219d = true;
                throw th;
            }
            f10219d = true;
        }
        return f10218c || !C3762i.m14515b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    @java.lang.Deprecated
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14129f(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = com.google.android.gms.common.C3740k.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f10220e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = com.google.android.gms.common.internal.C3662d1.m14243a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f10216a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = com.google.android.gms.common.util.C3762i.m14517d(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = com.google.android.gms.common.util.C3762i.m14519f(r10)
            if (r1 != 0) goto L_0x004d
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            com.google.android.gms.common.internal.C3705r.m14336a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007d
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
        L_0x0071:
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            r3 = 9
            goto L_0x0128
        L_0x007c:
            r8 = 0
        L_0x007d:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x011b }
            com.google.android.gms.common.C3738j.m14462a(r10)
            boolean r10 = com.google.android.gms.common.C3738j.m14464e(r9, r3)
            if (r10 != 0) goto L_0x0093
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            goto L_0x0071
        L_0x0093:
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.common.internal.C3705r.m14346k(r8)
            boolean r10 = com.google.android.gms.common.C3738j.m14464e(r8, r3)
            if (r10 != 0) goto L_0x00a5
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            goto L_0x0071
        L_0x00a5:
            if (r1 == 0) goto L_0x00be
            if (r8 == 0) goto L_0x00be
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00be
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x0071
        L_0x00be:
            int r10 = r9.versionCode
            int r10 = com.google.android.gms.common.util.C3771q.m14538a(r10)
            int r1 = com.google.android.gms.common.util.C3771q.m14538a(r11)
            if (r10 >= r1) goto L_0x00fc
            int r10 = r9.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 82
            r2.<init>(r1)
            java.lang.String r1 = "Google Play services out of date for "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ".  Requires "
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = " but found "
            r2.append(r11)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0128
        L_0x00fc:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x0114
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0105 }
            goto L_0x0114
        L_0x0105:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0128
        L_0x0114:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x011a
            r3 = 3
            goto L_0x0128
        L_0x011a:
            return r4
        L_0x011b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0128:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C3637i.m14129f(android.content.Context, int):int");
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m14130g(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m14134k(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: h */
    public static boolean m14131h(Context context) {
        if (!C3765l.m14526d()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C3705r.m14346k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m14132i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: j */
    public static boolean m14133j(Context context, int i, String str) {
        return C3768o.m14537b(context, i, str);
    }

    @TargetApi(21)
    /* renamed from: k */
    static boolean m14134k(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C3765l.m14529g()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !m14131h(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
