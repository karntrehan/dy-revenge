package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.db */
public final class C3857db implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String str2 = str;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    str3 = C3731b.m14410e(parcel2, r);
                    break;
                case 3:
                    str4 = C3731b.m14410e(parcel2, r);
                    break;
                case 4:
                    str5 = C3731b.m14410e(parcel2, r);
                    break;
                case 5:
                    str6 = C3731b.m14410e(parcel2, r);
                    break;
                case 6:
                    j = C3731b.m14426u(parcel2, r);
                    break;
                case 7:
                    j2 = C3731b.m14426u(parcel2, r);
                    break;
                case 8:
                    str7 = C3731b.m14410e(parcel2, r);
                    break;
                case 9:
                    z = C3731b.m14417l(parcel2, r);
                    break;
                case 10:
                    z2 = C3731b.m14417l(parcel2, r);
                    break;
                case 11:
                    j6 = C3731b.m14426u(parcel2, r);
                    break;
                case 12:
                    str8 = C3731b.m14410e(parcel2, r);
                    break;
                case 13:
                    j3 = C3731b.m14426u(parcel2, r);
                    break;
                case 14:
                    j4 = C3731b.m14426u(parcel2, r);
                    break;
                case 15:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 16:
                    z3 = C3731b.m14417l(parcel2, r);
                    break;
                case 18:
                    z4 = C3731b.m14417l(parcel2, r);
                    break;
                case 19:
                    str9 = C3731b.m14410e(parcel2, r);
                    break;
                case 21:
                    bool = C3731b.m14418m(parcel2, r);
                    break;
                case 22:
                    j5 = C3731b.m14426u(parcel2, r);
                    break;
                case 23:
                    arrayList = C3731b.m14412g(parcel2, r);
                    break;
                case 24:
                    str10 = C3731b.m14410e(parcel2, r);
                    break;
                case 25:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 26:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 27:
                    str11 = C3731b.m14410e(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C3844cb(str3, str4, str5, str6, j, j2, str7, z, z2, j6, str8, j3, j4, i, z3, z4, str9, bool, j5, (List) arrayList, str10, str, str2, str11);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3844cb[i];
    }
}
