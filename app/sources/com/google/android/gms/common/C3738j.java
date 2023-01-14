package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.j */
public class C3738j {

    /* renamed from: a */
    private static C3738j f10418a;

    /* renamed from: b */
    private final Context f10419b;

    /* renamed from: c */
    private volatile String f10420c;

    public C3738j(Context context) {
        this.f10419b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3738j m14462a(Context context) {
        C3705r.m14346k(context);
        synchronized (C3738j.class) {
            if (f10418a == null) {
                C3468a0.m13492d(context);
                f10418a = new C3738j(context);
            }
        }
        return f10418a;
    }

    /* renamed from: d */
    static final C3774w m14463d(PackageInfo packageInfo, C3774w... wVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C3775x xVar = new C3775x(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < wVarArr.length; i++) {
            if (wVarArr[i].equals(xVar)) {
                return wVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m14464e(PackageInfo packageInfo, boolean z) {
        C3774w wVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                wVar = m14463d(packageInfo, C3777z.f10462a);
            } else {
                wVar = m14463d(packageInfo, C3777z.f10462a[0]);
            }
            if (wVar != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    private final C3741k0 m14465f(String str, boolean z, boolean z2) {
        C3741k0 k0Var;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return C3741k0.m14470c(str2);
        }
        if (str.equals(this.f10420c)) {
            return C3741k0.m14469b();
        }
        if (C3468a0.m13493e()) {
            k0Var = C3468a0.m13490b(str, C3637i.m14128e(this.f10419b), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f10419b.getPackageManager().getPackageInfo(str, 64);
                boolean e = C3637i.m14128e(this.f10419b);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        C3775x xVar = new C3775x(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        C3741k0 a = C3468a0.m13489a(str3, xVar, e, false);
                        if (!a.f10423b || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C3468a0.m13489a(str3, xVar, false, true).f10423b) {
                            k0Var = a;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                k0Var = C3741k0.m14470c(str2);
            } catch (PackageManager.NameNotFoundException e2) {
                return C3741k0.m14471d(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e2);
            }
        }
        if (k0Var.f10423b) {
            this.f10420c = str;
        }
        return k0Var;
    }

    /* renamed from: b */
    public boolean mo11705b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m14464e(packageInfo, false)) {
            return true;
        }
        if (m14464e(packageInfo, true)) {
            if (C3637i.m14128e(this.f10419b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo11706c(int i) {
        C3741k0 k0Var;
        int length;
        String[] packagesForUid = this.f10419b.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            k0Var = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C3705r.m14346k(k0Var);
                    break;
                }
                k0Var = m14465f(packagesForUid[i2], false, false);
                if (k0Var.f10423b) {
                    break;
                }
                i2++;
            }
        } else {
            k0Var = C3741k0.m14470c("no pkgs");
        }
        k0Var.mo11708e();
        return k0Var.f10423b;
    }
}
