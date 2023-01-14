package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C3435f implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 2:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 3:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 4:
                    str3 = C3731b.m14410e(parcel2, r);
                    break;
                case 5:
                    str4 = C3731b.m14410e(parcel2, r);
                    break;
                case 6:
                    uri = (Uri) C3731b.m14409d(parcel2, r, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C3731b.m14410e(parcel2, r);
                    break;
                case 8:
                    j = C3731b.m14426u(parcel2, r);
                    break;
                case 9:
                    str6 = C3731b.m14410e(parcel2, r);
                    break;
                case 10:
                    arrayList = C3731b.m14414i(parcel2, r, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C3731b.m14410e(parcel2, r);
                    break;
                case 12:
                    str8 = C3731b.m14410e(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
