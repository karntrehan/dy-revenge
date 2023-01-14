package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.internal.t0 */
public final class C3712t0 extends C3730a {
    public static final Parcelable.Creator<C3712t0> CREATOR = new C3715u0();

    /* renamed from: f */
    final int f10384f;

    /* renamed from: o */
    private final Account f10385o;

    /* renamed from: p */
    private final int f10386p;

    /* renamed from: q */
    private final GoogleSignInAccount f10387q;

    C3712t0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f10384f = i;
        this.f10385o = account;
        this.f10386p = i2;
        this.f10387q = googleSignInAccount;
    }

    public C3712t0(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f10384f);
        C3733c.m14447p(parcel, 2, this.f10385o, i, false);
        C3733c.m14443l(parcel, 3, this.f10386p);
        C3733c.m14447p(parcel, 4, this.f10387q, i, false);
        C3733c.m14433b(parcel, a);
    }
}
