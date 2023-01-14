package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.internal.n1 */
public final class C3693n1 implements Parcelable.Creator<C3690m1> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        Bundle bundle = null;
        C3627d[] dVarArr = null;
        C3663e eVar = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                bundle = C3731b.m14406a(parcel, r);
            } else if (k == 2) {
                dVarArr = (C3627d[]) C3731b.m14413h(parcel, r, C3627d.CREATOR);
            } else if (k == 3) {
                i = C3731b.m14425t(parcel, r);
            } else if (k != 4) {
                C3731b.m14429x(parcel, r);
            } else {
                eVar = (C3663e) C3731b.m14409d(parcel, r, C3663e.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3690m1(bundle, dVarArr, i, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3690m1[i];
    }
}
