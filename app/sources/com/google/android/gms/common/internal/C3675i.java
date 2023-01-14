package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.i */
public final class C3675i {

    /* renamed from: a */
    private final String f10318a;

    /* renamed from: b */
    private final String f10319b;

    public C3675i(String str) {
        this(str, (String) null);
    }

    public C3675i(String str, String str2) {
        C3705r.m14347l(str, "log tag cannot be null");
        C3705r.m14338c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f10318a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f10319b = null;
        } else {
            this.f10319b = str2;
        }
    }

    /* renamed from: g */
    private final String m14283g(String str) {
        String str2 = this.f10319b;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: a */
    public boolean mo11608a(int i) {
        return Log.isLoggable(this.f10318a, i);
    }

    /* renamed from: b */
    public void mo11609b(String str, String str2) {
        if (mo11608a(3)) {
            Log.d(str, m14283g(str2));
        }
    }

    /* renamed from: c */
    public void mo11610c(String str, String str2) {
        if (mo11608a(6)) {
            Log.e(str, m14283g(str2));
        }
    }

    /* renamed from: d */
    public void mo11611d(String str, String str2, Throwable th) {
        if (mo11608a(6)) {
            Log.e(str, m14283g(str2), th);
        }
    }

    /* renamed from: e */
    public void mo11612e(String str, String str2) {
        if (mo11608a(2)) {
            Log.v(str, m14283g(str2));
        }
    }

    /* renamed from: f */
    public void mo11613f(String str, String str2) {
        if (mo11608a(5)) {
            Log.w(str, m14283g(str2));
        }
    }
}
