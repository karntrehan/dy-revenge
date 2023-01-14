package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.q */
public final class C3749q implements Parcelable.Creator<C3627d> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                str = C3731b.m14410e(parcel, r);
            } else if (k == 2) {
                i = C3731b.m14425t(parcel, r);
            } else if (k != 3) {
                C3731b.m14429x(parcel, r);
            } else {
                j = C3731b.m14426u(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3627d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3627d[i];
    }
}
