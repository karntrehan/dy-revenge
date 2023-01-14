package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.o */
class C4230o {
    /* renamed from: a */
    static long m16151a(long j) {
        Calendar k = m16161k();
        k.setTimeInMillis(j);
        return m16154d(k).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    static DateFormat m16152b(Locale locale) {
        return m16153c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m16153c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m16160j());
        return instanceForSkeleton;
    }

    /* renamed from: d */
    static Calendar m16154d(Calendar calendar) {
        Calendar l = m16162l(calendar);
        Calendar k = m16161k();
        k.set(l.get(1), l.get(2), l.get(5));
        return k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m16155e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m16158h());
        return dateInstance;
    }

    /* renamed from: f */
    static java.text.DateFormat m16156f(Locale locale) {
        return m16155e(0, locale);
    }

    /* renamed from: g */
    private static SimpleDateFormat m16157g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m16158h());
        return simpleDateFormat;
    }

    /* renamed from: h */
    private static TimeZone m16158h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: i */
    static Calendar m16159i() {
        return m16154d(Calendar.getInstance());
    }

    @TargetApi(24)
    /* renamed from: j */
    private static android.icu.util.TimeZone m16160j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: k */
    static Calendar m16161k() {
        return m16162l((Calendar) null);
    }

    /* renamed from: l */
    static Calendar m16162l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m16158h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: m */
    static DateFormat m16163m(Locale locale) {
        return m16153c("yMMMEd", locale);
    }

    /* renamed from: n */
    static SimpleDateFormat m16164n() {
        return m16165o(Locale.getDefault());
    }

    /* renamed from: o */
    private static SimpleDateFormat m16165o(Locale locale) {
        return m16157g("MMMM, yyyy", locale);
    }
}
