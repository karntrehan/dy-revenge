package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.internal.o0 */
public final class C3695o0 implements Parcelable.Creator<C3694o> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 2:
                    i2 = C3731b.m14425t(parcel2, r);
                    break;
                case 3:
                    i3 = C3731b.m14425t(parcel2, r);
                    break;
                case 4:
                    j = C3731b.m14426u(parcel2, r);
                    break;
                case 5:
                    j2 = C3731b.m14426u(parcel2, r);
                    break;
                case 6:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 7:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 8:
                    i4 = C3731b.m14425t(parcel2, r);
                    break;
                case 9:
                    i5 = C3731b.m14425t(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C3694o(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3694o[i];
    }
}
