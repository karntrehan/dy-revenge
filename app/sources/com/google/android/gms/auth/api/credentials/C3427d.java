package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.auth.api.credentials.d */
public final class C3427d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k != 1000) {
                switch (k) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) C3731b.m14409d(parcel, r, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = C3731b.m14417l(parcel, r);
                        break;
                    case 3:
                        z2 = C3731b.m14417l(parcel, r);
                        break;
                    case 4:
                        strArr = C3731b.m14411f(parcel, r);
                        break;
                    case 5:
                        z3 = C3731b.m14417l(parcel, r);
                        break;
                    case 6:
                        str = C3731b.m14410e(parcel, r);
                        break;
                    case 7:
                        str2 = C3731b.m14410e(parcel, r);
                        break;
                    default:
                        C3731b.m14429x(parcel, r);
                        break;
                }
            } else {
                i = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
