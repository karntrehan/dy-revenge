package com.facebook.react.modules.systeminfo;

import android.os.Build;

/* renamed from: com.facebook.react.modules.systeminfo.a */
public class C2878a {
    /* renamed from: a */
    public static String m11356a() {
        if (m11357b()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    private static boolean m11357b() {
        return Build.FINGERPRINT.contains("vbox");
    }
}
