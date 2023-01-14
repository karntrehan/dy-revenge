package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.auth.api.signin.l */
public final class C3466l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 4) {
                str = C3731b.m14410e(parcel, r);
            } else if (k == 7) {
                googleSignInAccount = (GoogleSignInAccount) C3731b.m14409d(parcel, r, GoogleSignInAccount.CREATOR);
            } else if (k != 8) {
                C3731b.m14429x(parcel, r);
            } else {
                str2 = C3731b.m14410e(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
