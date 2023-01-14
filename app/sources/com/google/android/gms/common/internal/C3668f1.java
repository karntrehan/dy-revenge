package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.internal.f1 */
public final class C3668f1 implements Parcelable.Creator<C3711t> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k == 2) {
                z = C3731b.m14417l(parcel, r);
            } else if (k == 3) {
                z2 = C3731b.m14417l(parcel, r);
            } else if (k == 4) {
                i2 = C3731b.m14425t(parcel, r);
            } else if (k != 5) {
                C3731b.m14429x(parcel, r);
            } else {
                i3 = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3711t(i, z, z2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3711t[i];
    }
}
