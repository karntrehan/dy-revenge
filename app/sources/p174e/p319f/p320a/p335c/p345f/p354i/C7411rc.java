package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.rc */
public final class C7411rc implements Parcelable.Creator<C7494xb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                str = C3731b.m14410e(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                str2 = C3731b.m14410e(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7494xb(str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7494xb[i];
    }
}
