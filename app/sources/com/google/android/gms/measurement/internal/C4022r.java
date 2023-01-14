package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.core.content.C1135a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C4022r extends C3878f6 {

    /* renamed from: c */
    private long f11217c;

    /* renamed from: d */
    private String f11218d;

    /* renamed from: e */
    private AccountManager f11219e;

    /* renamed from: f */
    private Boolean f11220f;

    /* renamed from: g */
    private long f11221g;

    C4022r(C3955l5 l5Var) {
        super(l5Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11958j() {
        Calendar instance = Calendar.getInstance();
        this.f11217c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f11218d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final long mo12335o() {
        mo11931h();
        return this.f11221g;
    }

    /* renamed from: p */
    public final long mo12336p() {
        mo11959k();
        return this.f11217c;
    }

    /* renamed from: q */
    public final String mo12337q() {
        mo11959k();
        return this.f11218d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo12338r() {
        mo11931h();
        this.f11220f = null;
        this.f11221g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo12339s() {
        mo11931h();
        long a = this.f10651a.mo11936c().mo11730a();
        if (a - this.f11221g > 86400000) {
            this.f11220f = null;
        }
        Boolean bool = this.f11220f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C1135a.m4415a(this.f10651a.mo11938f(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f10651a.mo11935b().mo12551y().mo12476a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f11219e == null) {
                this.f11219e = AccountManager.get(this.f10651a.mo11938f());
            }
            try {
                Account[] result = this.f11219e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f11219e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f11220f = Boolean.TRUE;
                        this.f11221g = a;
                        return true;
                    }
                } else {
                    this.f11220f = Boolean.TRUE;
                    this.f11221g = a;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                this.f10651a.mo11935b().mo12546t().mo12477b("Exception checking account types", e);
            }
        }
        this.f11221g = a;
        this.f11220f = Boolean.FALSE;
        return false;
    }
}
