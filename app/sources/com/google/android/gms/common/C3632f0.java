package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.f0 */
public final class C3632f0 implements Parcelable.Creator<C3630e0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                z = C3731b.m14417l(parcel, r);
            } else if (k == 2) {
                str = C3731b.m14410e(parcel, r);
            } else if (k != 3) {
                C3731b.m14429x(parcel, r);
            } else {
                i = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3630e0(z, str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3630e0[i];
    }
}
