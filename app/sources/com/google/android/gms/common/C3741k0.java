package com.google.android.gms.common;

import android.util.Log;

/* renamed from: com.google.android.gms.common.k0 */
class C3741k0 {

    /* renamed from: a */
    private static final C3741k0 f10422a = new C3741k0(true, (String) null, (Throwable) null);

    /* renamed from: b */
    final boolean f10423b;

    /* renamed from: c */
    final String f10424c;

    /* renamed from: d */
    final Throwable f10425d;

    C3741k0(boolean z, String str, Throwable th) {
        this.f10423b = z;
        this.f10424c = str;
        this.f10425d = th;
    }

    /* renamed from: b */
    static C3741k0 m14469b() {
        return f10422a;
    }

    /* renamed from: c */
    static C3741k0 m14470c(String str) {
        return new C3741k0(false, str, (Throwable) null);
    }

    /* renamed from: d */
    static C3741k0 m14471d(String str, Throwable th) {
        return new C3741k0(false, str, th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo11707a() {
        return this.f10424c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo11708e() {
        if (!this.f10423b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f10425d != null) {
                Log.d("GoogleCertificatesRslt", mo11707a(), this.f10425d);
            } else {
                Log.d("GoogleCertificatesRslt", mo11707a());
            }
        }
    }
}
