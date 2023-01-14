package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
class C4215e {
    /* renamed from: a */
    static String m16103a(long j) {
        return m16104b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m16104b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C4230o.m16152b(locale).format(new Date(j)) : C4230o.m16156f(locale).format(new Date(j));
    }

    /* renamed from: c */
    static String m16105c(long j) {
        return m16106d(j, Locale.getDefault());
    }

    /* renamed from: d */
    static String m16106d(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C4230o.m16163m(locale).format(new Date(j)) : C4230o.m16156f(locale).format(new Date(j));
    }
}
