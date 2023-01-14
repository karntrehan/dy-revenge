package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.w */
public final class C3461w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 2) {
                str = C3731b.m14410e(parcel, r);
            } else if (k != 5) {
                C3731b.m14429x(parcel, r);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C3731b.m14409d(parcel, r, GoogleSignInOptions.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
