package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C3738j;
import com.google.android.gms.common.p133n.C3746c;

/* renamed from: com.google.android.gms.common.util.o */
public final class C3768o {
    /* renamed from: a */
    public static boolean m14536a(Context context, int i) {
        if (!m14537b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C3738j.m14462a(context).mo11705b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m14537b(Context context, int i, String str) {
        return C3746c.m14493a(context).mo11721f(i, str);
    }
}
