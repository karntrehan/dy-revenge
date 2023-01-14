package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: com.google.android.gms.common.internal.o1 */
public final class C3696o1 implements Parcelable.Creator<C3663e> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        C3711t tVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    tVar = (C3711t) C3731b.m14409d(parcel, r, C3711t.CREATOR);
                    break;
                case 2:
                    z = C3731b.m14417l(parcel, r);
                    break;
                case 3:
                    z2 = C3731b.m14417l(parcel, r);
                    break;
                case 4:
                    iArr = C3731b.m14408c(parcel, r);
                    break;
                case 5:
                    i = C3731b.m14425t(parcel, r);
                    break;
                case 6:
                    iArr2 = C3731b.m14408c(parcel, r);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new C3663e(tVar, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3663e[i];
    }
}
