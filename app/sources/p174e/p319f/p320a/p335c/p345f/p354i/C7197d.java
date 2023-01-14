package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.d */
public final class C7197d implements Parcelable.Creator<C7495xc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 2) {
                str = C3731b.m14410e(parcel, r);
            } else if (k == 3) {
                str2 = C3731b.m14410e(parcel, r);
            } else if (k != 4) {
                C3731b.m14429x(parcel, r);
            } else {
                i = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7495xc(str, str2, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7495xc[i];
    }
}
