package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.internal.w0 */
public final class C3721w0 implements Parcelable.Creator<C3718v0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        IBinder iBinder = null;
        C3623b bVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k == 2) {
                iBinder = C3731b.m14424s(parcel, r);
            } else if (k == 3) {
                bVar = (C3623b) C3731b.m14409d(parcel, r, C3623b.CREATOR);
            } else if (k == 4) {
                z = C3731b.m14417l(parcel, r);
            } else if (k != 5) {
                C3731b.m14429x(parcel, r);
            } else {
                z2 = C3731b.m14417l(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3718v0(i, iBinder, bVar, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3718v0[i];
    }
}
