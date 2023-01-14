package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.api.u */
public final class C3622u implements Parcelable.Creator<Status> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C3623b bVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i2 = C3731b.m14425t(parcel, r);
            } else if (k == 2) {
                str = C3731b.m14410e(parcel, r);
            } else if (k == 3) {
                pendingIntent = (PendingIntent) C3731b.m14409d(parcel, r, PendingIntent.CREATOR);
            } else if (k == 4) {
                bVar = (C3623b) C3731b.m14409d(parcel, r, C3623b.CREATOR);
            } else if (k != 1000) {
                C3731b.m14429x(parcel, r);
            } else {
                i = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new Status(i, i2, str, pendingIntent, bVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
