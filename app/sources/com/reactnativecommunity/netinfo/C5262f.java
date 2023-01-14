package com.reactnativecommunity.netinfo;

import android.content.Context;
import androidx.core.content.C1135a;

/* renamed from: com.reactnativecommunity.netinfo.f */
public class C5262f {
    /* renamed from: a */
    public static boolean m19629a(Context context) {
        return C1135a.m4415a(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    /* renamed from: b */
    public static void m19630b(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b;
        }
    }
}
