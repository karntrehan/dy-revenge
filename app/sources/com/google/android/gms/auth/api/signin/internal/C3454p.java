package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.p */
public final class C3454p {

    /* renamed from: a */
    private static C3454p f9797a;

    /* renamed from: b */
    final C3441c f9798b;

    /* renamed from: c */
    GoogleSignInAccount f9799c;

    /* renamed from: d */
    GoogleSignInOptions f9800d;

    private C3454p(Context context) {
        C3441c b = C3441c.m13432b(context);
        this.f9798b = b;
        this.f9799c = b.mo11120c();
        this.f9800d = b.mo11121d();
    }

    /* renamed from: a */
    public static synchronized C3454p m13465a(Context context) {
        C3454p d;
        synchronized (C3454p.class) {
            d = m13466d(context.getApplicationContext());
        }
        return d;
    }

    /* renamed from: d */
    private static synchronized C3454p m13466d(Context context) {
        synchronized (C3454p.class) {
            C3454p pVar = f9797a;
            if (pVar != null) {
                return pVar;
            }
            C3454p pVar2 = new C3454p(context);
            f9797a = pVar2;
            return pVar2;
        }
    }

    /* renamed from: b */
    public final synchronized void mo11142b() {
        this.f9798b.mo11119a();
        this.f9799c = null;
        this.f9800d = null;
    }

    /* renamed from: c */
    public final synchronized void mo11143c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f9798b.mo11123f(googleSignInAccount, googleSignInOptions);
        this.f9799c = googleSignInAccount;
        this.f9800d = googleSignInOptions;
    }
}
