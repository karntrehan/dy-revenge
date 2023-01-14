package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
public final class C3428e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                str = C3731b.m14410e(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                str2 = C3731b.m14410e(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new IdToken(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new IdToken[i];
    }
}
