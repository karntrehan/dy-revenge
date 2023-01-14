package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
public class C3441c {

    /* renamed from: a */
    private static final Lock f9784a = new ReentrantLock();

    /* renamed from: b */
    private static C3441c f9785b;

    /* renamed from: c */
    private final Lock f9786c = new ReentrantLock();

    /* renamed from: d */
    private final SharedPreferences f9787d;

    C3441c(Context context) {
        this.f9787d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C3441c m13432b(Context context) {
        C3705r.m14346k(context);
        Lock lock = f9784a;
        lock.lock();
        try {
            if (f9785b == null) {
                f9785b = new C3441c(context.getApplicationContext());
            }
            C3441c cVar = f9785b;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f9784a.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    private static final String m13433i(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo11119a() {
        this.f9786c.lock();
        try {
            this.f9787d.edit().clear().apply();
        } finally {
            this.f9786c.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount mo11120c() {
        String g;
        String g2 = mo11124g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo11124g(m13433i("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m13376M(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions mo11121d() {
        String g;
        String g2 = mo11124g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo11124g(m13433i("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m13390J(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String mo11122e() {
        return mo11124g("refreshToken");
    }

    /* renamed from: f */
    public void mo11123f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C3705r.m14346k(googleSignInAccount);
        C3705r.m14346k(googleSignInOptions);
        mo11125h("defaultGoogleSignInAccount", googleSignInAccount.mo11070N());
        C3705r.m14346k(googleSignInAccount);
        C3705r.m14346k(googleSignInOptions);
        String N = googleSignInAccount.mo11070N();
        mo11125h(m13433i("googleSignInAccount", N), googleSignInAccount.mo11071O());
        mo11125h(m13433i("googleSignInOptions", N), googleSignInOptions.mo11083O());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo11124g(String str) {
        this.f9786c.lock();
        try {
            return this.f9787d.getString(str, (String) null);
        } finally {
            this.f9786c.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo11125h(String str, String str2) {
        this.f9786c.lock();
        try {
            this.f9787d.edit().putString(str, str2).apply();
        } finally {
            this.f9786c.unlock();
        }
    }
}
