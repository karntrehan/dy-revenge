package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.measurement.internal.w */
public final class C4082w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            if (C3731b.m14416k(r) != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                bundle = C3731b.m14406a(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C4070v(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4070v[i];
    }
}
