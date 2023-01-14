package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.measurement.internal.e */
public final class C3858e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        C4045sa saVar = null;
        String str3 = null;
        C4094x xVar = null;
        C4094x xVar2 = null;
        C4094x xVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 3:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 4:
                    saVar = (C4045sa) C3731b.m14409d(parcel2, r, C4045sa.CREATOR);
                    break;
                case 5:
                    j = C3731b.m14426u(parcel2, r);
                    break;
                case 6:
                    z = C3731b.m14417l(parcel2, r);
                    break;
                case 7:
                    str3 = C3731b.m14410e(parcel2, r);
                    break;
                case 8:
                    xVar = (C4094x) C3731b.m14409d(parcel2, r, C4094x.CREATOR);
                    break;
                case 9:
                    j2 = C3731b.m14426u(parcel2, r);
                    break;
                case 10:
                    xVar2 = (C4094x) C3731b.m14409d(parcel2, r, C4094x.CREATOR);
                    break;
                case 11:
                    j3 = C3731b.m14426u(parcel2, r);
                    break;
                case 12:
                    xVar3 = (C4094x) C3731b.m14409d(parcel2, r, C4094x.CREATOR);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C3845d(str, str2, saVar, j, z, str3, xVar, j2, xVar2, j3, xVar3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3845d[i];
    }
}
