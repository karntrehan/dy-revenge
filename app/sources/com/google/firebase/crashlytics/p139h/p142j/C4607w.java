package com.google.firebase.crashlytics.p139h.p142j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.C4825h;
import com.google.firebase.crashlytics.p139h.C4542f;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.firebase.crashlytics.h.j.w */
public class C4607w {

    /* renamed from: a */
    private final SharedPreferences f13037a;

    /* renamed from: b */
    private final C4825h f13038b;

    /* renamed from: c */
    private final Object f13039c;

    /* renamed from: d */
    C8965m<Void> f13040d = new C8965m<>();

    /* renamed from: e */
    boolean f13041e = false;

    /* renamed from: f */
    private boolean f13042f = false;

    /* renamed from: g */
    private Boolean f13043g;

    /* renamed from: h */
    private final C8965m<Void> f13044h = new C8965m<>();

    public C4607w(C4825h hVar) {
        Object obj = new Object();
        this.f13039c = obj;
        Context j = hVar.mo14733j();
        this.f13038b = hVar;
        this.f13037a = C4577n.m17389r(j);
        Boolean b = m17536b();
        this.f13043g = b == null ? m17535a(j) : b;
        synchronized (obj) {
            if (mo14229d()) {
                this.f13040d.mo22786e(null);
                this.f13041e = true;
            }
        }
    }

    /* renamed from: a */
    private Boolean m17535a(Context context) {
        Boolean f = m17538f(context);
        if (f == null) {
            this.f13042f = false;
            return null;
        }
        this.f13042f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    /* renamed from: b */
    private Boolean m17536b() {
        if (!this.f13037a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f13042f = false;
        return Boolean.valueOf(this.f13037a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: e */
    private void m17537e(boolean z) {
        C4542f.m17259f().mo14104b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{z ? "ENABLED" : "DISABLED", this.f13043g == null ? "global Firebase setting" : this.f13042f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
    }

    /* renamed from: f */
    private static Boolean m17538f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            C4542f.m17259f().mo14107e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: h */
    private static void m17539h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    /* renamed from: c */
    public void mo14228c(boolean z) {
        if (z) {
            this.f13044h.mo22786e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo14229d() {
        boolean booleanValue;
        Boolean bool = this.f13043g;
        booleanValue = bool != null ? bool.booleanValue() : this.f13038b.mo14738u();
        m17537e(booleanValue);
        return booleanValue;
    }

    /* renamed from: g */
    public synchronized void mo14230g(Boolean bool) {
        if (bool != null) {
            try {
                this.f13042f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13043g = bool != null ? bool : m17535a(this.f13038b.mo14733j());
        m17539h(this.f13037a, bool);
        synchronized (this.f13039c) {
            if (mo14229d()) {
                if (!this.f13041e) {
                    this.f13040d.mo22786e(null);
                    this.f13041e = true;
                }
            } else if (this.f13041e) {
                this.f13040d = new C8965m<>();
                this.f13041e = false;
            }
        }
    }

    /* renamed from: i */
    public C8963l<Void> mo14231i() {
        C8963l<Void> a;
        synchronized (this.f13039c) {
            a = this.f13040d.mo22782a();
        }
        return a;
    }

    /* renamed from: j */
    public C8963l<Void> mo14232j(Executor executor) {
        return C4570i0.m17350g(executor, this.f13044h.mo22782a(), mo14231i());
    }
}
