package com.google.android.gms.common.p133n;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C3765l;

/* renamed from: com.google.android.gms.common.n.b */
public class C3745b {

    /* renamed from: a */
    protected final Context f10435a;

    public C3745b(Context context) {
        this.f10435a = context;
    }

    /* renamed from: a */
    public int mo11716a(String str) {
        return this.f10435a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public ApplicationInfo mo11717b(String str, int i) {
        return this.f10435a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: c */
    public CharSequence mo11718c(String str) {
        return this.f10435a.getPackageManager().getApplicationLabel(this.f10435a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: d */
    public PackageInfo mo11719d(String str, int i) {
        return this.f10435a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: e */
    public boolean mo11720e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C3744a.m14486a(this.f10435a);
        }
        if (!C3765l.m14531i() || (nameForUid = this.f10435a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f10435a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: f */
    public final boolean mo11721f(int i, String str) {
        if (C3765l.m14527e()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f10435a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f10435a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
