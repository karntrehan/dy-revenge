package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.c0 */
public final class C3626c0 implements Parcelable.Creator<C3624b0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                str = C3731b.m14410e(parcel, r);
            } else if (k == 2) {
                z = C3731b.m14417l(parcel, r);
            } else if (k == 3) {
                z2 = C3731b.m14417l(parcel, r);
            } else if (k == 4) {
                iBinder = C3731b.m14424s(parcel, r);
            } else if (k != 5) {
                C3731b.m14429x(parcel, r);
            } else {
                z3 = C3731b.m14417l(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3624b0(str, z, z2, iBinder, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3624b0[i];
    }
}
