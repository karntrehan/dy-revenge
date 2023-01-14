package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.util.g */
public final class C3760g {

    /* renamed from: a */
    private static final String[] f10443a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m14510a(Context context, Throwable th) {
        try {
            C3705r.m14346k(context);
            C3705r.m14346k(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
