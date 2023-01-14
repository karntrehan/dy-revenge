package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.credentials.b */
public final class C3425b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList<IdToken> arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    str = C3731b.m14410e(parcel, r);
                    break;
                case 2:
                    str2 = C3731b.m14410e(parcel, r);
                    break;
                case 3:
                    uri = (Uri) C3731b.m14409d(parcel, r, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C3731b.m14414i(parcel, r, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C3731b.m14410e(parcel, r);
                    break;
                case 6:
                    str4 = C3731b.m14410e(parcel, r);
                    break;
                case 9:
                    str5 = C3731b.m14410e(parcel, r);
                    break;
                case 10:
                    str6 = C3731b.m14410e(parcel, r);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}
