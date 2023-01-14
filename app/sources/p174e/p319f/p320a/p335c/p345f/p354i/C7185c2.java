package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.c2 */
public final class C7185c2 implements Parcelable.Creator<C7201d3> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 2) {
                i = C3731b.m14425t(parcel, r);
            } else if (k != 3) {
                C3731b.m14429x(parcel, r);
            } else {
                strArr = C3731b.m14411f(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7201d3(i, strArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7201d3[i];
    }
}
