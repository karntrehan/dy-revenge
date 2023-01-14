package com.google.firebase.p163q;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C1135a;
import com.google.firebase.C4824g;
import com.google.firebase.p160n.C4907a;
import com.google.firebase.p160n.C4909c;

/* renamed from: com.google.firebase.q.a */
public class C4928a {

    /* renamed from: a */
    private final Context f13781a;

    /* renamed from: b */
    private final SharedPreferences f13782b;

    /* renamed from: c */
    private final C4909c f13783c;

    /* renamed from: d */
    private boolean f13784d = m18787c();

    public C4928a(Context context, String str, C4909c cVar) {
        Context a = m18786a(context);
        this.f13781a = a;
        this.f13782b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f13783c = cVar;
    }

    /* renamed from: a */
    private static Context m18786a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C1135a.m4416b(context);
    }

    /* renamed from: c */
    private boolean m18787c() {
        return this.f13782b.contains("firebase_data_collection_default_enabled") ? this.f13782b.getBoolean("firebase_data_collection_default_enabled", true) : m18788d();
    }

    /* renamed from: d */
    private boolean m18788d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f13781a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f13781a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: f */
    private synchronized void m18789f(boolean z) {
        if (this.f13784d != z) {
            this.f13784d = z;
            this.f13783c.mo14018b(new C4907a(C4824g.class, new C4824g(z)));
        }
    }

    /* renamed from: b */
    public synchronized boolean mo14935b() {
        return this.f13784d;
    }

    /* renamed from: e */
    public synchronized void mo14936e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f13782b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = m18788d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f13782b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        m18789f(equals);
    }
}
