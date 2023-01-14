package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.d */
public final class C3442d implements Parcelable.Creator<C3439a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k == 2) {
                i2 = C3731b.m14425t(parcel, r);
            } else if (k != 3) {
                C3731b.m14429x(parcel, r);
            } else {
                bundle = C3731b.m14406a(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3439a(i, i2, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3439a[i];
    }
}
