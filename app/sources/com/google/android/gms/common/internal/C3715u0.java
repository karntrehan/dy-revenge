package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.internal.u0 */
public final class C3715u0 implements Parcelable.Creator<C3712t0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k == 2) {
                account = (Account) C3731b.m14409d(parcel, r, Account.CREATOR);
            } else if (k == 3) {
                i2 = C3731b.m14425t(parcel, r);
            } else if (k != 4) {
                C3731b.m14429x(parcel, r);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C3731b.m14409d(parcel, r, GoogleSignInAccount.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3712t0(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3712t0[i];
    }
}
