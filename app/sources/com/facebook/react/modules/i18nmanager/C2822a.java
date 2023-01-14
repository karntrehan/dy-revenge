package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import p027c.p064i.p071i.C1903f;

/* renamed from: com.facebook.react.modules.i18nmanager.a */
public class C2822a {

    /* renamed from: a */
    private static C2822a f7974a;

    private C2822a() {
    }

    /* renamed from: d */
    public static C2822a m11246d() {
        if (f7974a == null) {
            f7974a = new C2822a();
        }
        return f7974a;
    }

    /* renamed from: e */
    private boolean m11247e() {
        return C1903f.m7976b(Locale.getDefault()) == 1;
    }

    /* renamed from: f */
    private boolean m11248f(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    /* renamed from: h */
    private boolean m11249h(Context context) {
        return m11248f(context, "RCTI18nUtil_allowRTL", true);
    }

    /* renamed from: i */
    private boolean m11250i(Context context) {
        return m11248f(context, "RCTI18nUtil_forceRTL", false);
    }

    /* renamed from: j */
    private void m11251j(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: a */
    public void mo9189a(Context context, boolean z) {
        m11251j(context, "RCTI18nUtil_allowRTL", z);
    }

    /* renamed from: b */
    public boolean mo9190b(Context context) {
        return m11248f(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    /* renamed from: c */
    public void mo9191c(Context context, boolean z) {
        m11251j(context, "RCTI18nUtil_forceRTL", z);
    }

    /* renamed from: g */
    public boolean mo9192g(Context context) {
        if (m11250i(context)) {
            return true;
        }
        return m11249h(context) && m11247e();
    }

    /* renamed from: k */
    public void mo9193k(Context context, boolean z) {
        m11251j(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }
}
