package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.f */
public final class C7227f implements Parcelable.Creator<C7212e> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 2) {
                i = C3731b.m14425t(parcel, r);
            } else if (k != 3) {
                C3731b.m14429x(parcel, r);
            } else {
                z = C3731b.m14417l(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7212e(i, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7212e[i];
    }
}
