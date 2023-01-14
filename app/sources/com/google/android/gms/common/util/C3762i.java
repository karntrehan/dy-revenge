package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.C3637i;

/* renamed from: com.google.android.gms.common.util.i */
public final class C3762i {

    /* renamed from: a */
    private static Boolean f10445a;

    /* renamed from: b */
    private static Boolean f10446b;

    /* renamed from: c */
    private static Boolean f10447c;

    /* renamed from: d */
    private static Boolean f10448d;

    /* renamed from: a */
    public static boolean m14514a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f10448d == null) {
            boolean z = false;
            if (C3765l.m14531i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f10448d = Boolean.valueOf(z);
        }
        return f10448d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m14515b() {
        int i = C3637i.f10216a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m14516c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f10445a == null) {
            boolean z = false;
            if (C3765l.m14528f() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f10445a = Boolean.valueOf(z);
        }
        return f10445a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m14517d(Context context) {
        if (m14516c(context)) {
            if (C3765l.m14530h()) {
                return m14518e(context) && !C3765l.m14531i();
            }
            return true;
        }
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m14518e(Context context) {
        if (f10446b == null) {
            boolean z = false;
            if (C3765l.m14529g() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f10446b = Boolean.valueOf(z);
        }
        return f10446b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m14519f(Context context) {
        if (f10447c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f10447c = Boolean.valueOf(z);
        }
        return f10447c.booleanValue();
    }
}
