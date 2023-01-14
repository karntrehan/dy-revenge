package com.google.firebase.crashlytics.p139h.p142j;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.firebase.crashlytics.p139h.C4539e;

/* renamed from: com.google.firebase.crashlytics.h.j.h */
public class C4567h {

    /* renamed from: a */
    public final String f12910a;

    /* renamed from: b */
    public final String f12911b;

    /* renamed from: c */
    public final String f12912c;

    /* renamed from: d */
    public final String f12913d;

    /* renamed from: e */
    public final String f12914e;

    /* renamed from: f */
    public final String f12915f;

    /* renamed from: g */
    public final C4539e f12916g;

    public C4567h(String str, String str2, String str3, String str4, String str5, String str6, C4539e eVar) {
        this.f12910a = str;
        this.f12911b = str2;
        this.f12912c = str3;
        this.f12913d = str4;
        this.f12914e = str5;
        this.f12915f = str6;
        this.f12916g = eVar;
    }

    /* renamed from: a */
    public static C4567h m17339a(Context context, C4554a0 a0Var, String str, String str2, C4539e eVar) {
        String packageName = context.getPackageName();
        String g = a0Var.mo14119g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C4567h(str, str2, g, packageName, num, str3, eVar);
    }
}
