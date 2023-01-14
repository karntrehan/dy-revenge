package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.h0 */
public final class C3636h0 implements Parcelable.Creator<C3634g0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                str = C3731b.m14410e(parcel, r);
            } else if (k == 2) {
                iBinder = C3731b.m14424s(parcel, r);
            } else if (k == 3) {
                z = C3731b.m14417l(parcel, r);
            } else if (k != 4) {
                C3731b.m14429x(parcel, r);
            } else {
                z2 = C3731b.m14417l(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3634g0(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3634g0[i];
    }
}
