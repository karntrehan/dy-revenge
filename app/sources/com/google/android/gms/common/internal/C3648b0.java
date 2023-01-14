package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.b0 */
public final class C3648b0 implements Parcelable.Creator<C3717v> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        ArrayList<C3694o> arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                arrayList = C3731b.m14414i(parcel, r, C3694o.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3717v(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3717v[i];
    }
}
