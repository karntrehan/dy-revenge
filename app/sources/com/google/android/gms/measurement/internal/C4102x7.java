package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
public final class C4102x7 {
    /* renamed from: a */
    public static String m15386a(String str, String[] strArr, String[] strArr2) {
        C3705r.m14346k(strArr);
        C3705r.m14346k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m15387b(Context context, String str, String str2) {
        C3705r.m14346k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C3851d5.m14684a(context);
        }
        return C3851d5.m14685b("google_app_id", resources, str2);
    }
}
