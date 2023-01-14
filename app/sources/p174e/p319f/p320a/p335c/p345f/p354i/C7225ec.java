package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.ec */
public final class C7225ec implements Parcelable.Creator<C7382pb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel, r);
                    break;
                case 2:
                    i2 = C3731b.m14425t(parcel, r);
                    break;
                case 3:
                    i3 = C3731b.m14425t(parcel, r);
                    break;
                case 4:
                    i4 = C3731b.m14425t(parcel, r);
                    break;
                case 5:
                    i5 = C3731b.m14425t(parcel, r);
                    break;
                case 6:
                    i6 = C3731b.m14425t(parcel, r);
                    break;
                case 7:
                    z = C3731b.m14417l(parcel, r);
                    break;
                case 8:
                    str = C3731b.m14410e(parcel, r);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7382pb(i, i2, i3, i4, i5, i6, z, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7382pb[i];
    }
}
