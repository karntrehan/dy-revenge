package com.google.firebase.crashlytics.p139h;

import android.util.Log;

/* renamed from: com.google.firebase.crashlytics.h.f */
public class C4542f {

    /* renamed from: a */
    static final C4542f f12876a = new C4542f("FirebaseCrashlytics");

    /* renamed from: b */
    private final String f12877b;

    /* renamed from: c */
    private int f12878c = 4;

    public C4542f(String str) {
        this.f12877b = str;
    }

    /* renamed from: a */
    private boolean m17258a(int i) {
        return this.f12878c <= i || Log.isLoggable(this.f12877b, i);
    }

    /* renamed from: f */
    public static C4542f m17259f() {
        return f12876a;
    }

    /* renamed from: b */
    public void mo14104b(String str) {
        mo14105c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo14105c(String str, Throwable th) {
        if (m17258a(3)) {
            Log.d(this.f12877b, str, th);
        }
    }

    /* renamed from: d */
    public void mo14106d(String str) {
        mo14107e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo14107e(String str, Throwable th) {
        if (m17258a(6)) {
            Log.e(this.f12877b, str, th);
        }
    }

    /* renamed from: g */
    public void mo14108g(String str) {
        mo14109h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo14109h(String str, Throwable th) {
        if (m17258a(4)) {
            Log.i(this.f12877b, str, th);
        }
    }

    /* renamed from: i */
    public void mo14110i(String str) {
        mo14111j(str, (Throwable) null);
    }

    /* renamed from: j */
    public void mo14111j(String str, Throwable th) {
        if (m17258a(2)) {
            Log.v(this.f12877b, str, th);
        }
    }

    /* renamed from: k */
    public void mo14112k(String str) {
        mo14113l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo14113l(String str, Throwable th) {
        if (m17258a(5)) {
            Log.w(this.f12877b, str, th);
        }
    }
}
