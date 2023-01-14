package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.k.qb */
public final class C7989qb implements Parcelable.Creator<C7976pb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 2) {
                i = C3731b.m14425t(parcel, r);
            } else if (k == 3) {
                i2 = C3731b.m14425t(parcel, r);
            } else if (k == 4) {
                i3 = C3731b.m14425t(parcel, r);
            } else if (k == 5) {
                j = C3731b.m14426u(parcel, r);
            } else if (k != 6) {
                C3731b.m14429x(parcel, r);
            } else {
                i4 = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7976pb(i, i2, i3, j, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7976pb[i];
    }
}
