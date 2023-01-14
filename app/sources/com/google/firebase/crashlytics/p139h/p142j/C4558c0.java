package com.google.firebase.crashlytics.p139h.p142j;

import android.content.Context;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.j.c0 */
class C4558c0 {

    /* renamed from: a */
    private String f12898a;

    C4558c0() {
    }

    /* renamed from: b */
    private static String m17304b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? HttpUrl.FRAGMENT_ENCODE_SET : installerPackageName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo14123a(Context context) {
        if (this.f12898a == null) {
            this.f12898a = m17304b(context);
        }
        return HttpUrl.FRAGMENT_ENCODE_SET.equals(this.f12898a) ? null : this.f12898a;
    }
}
