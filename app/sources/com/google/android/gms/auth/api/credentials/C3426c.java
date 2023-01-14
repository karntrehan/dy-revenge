package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
public final class C3426c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                z = C3731b.m14417l(parcel, r);
            } else if (k == 2) {
                z2 = C3731b.m14417l(parcel, r);
            } else if (k == 3) {
                z3 = C3731b.m14417l(parcel, r);
            } else if (k == 4) {
                i2 = C3731b.m14425t(parcel, r);
            } else if (k != 1000) {
                C3731b.m14429x(parcel, r);
            } else {
                i = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
