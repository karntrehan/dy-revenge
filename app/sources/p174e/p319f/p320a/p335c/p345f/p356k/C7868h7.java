package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.k.h7 */
public final class C7868h7 implements Parcelable.Creator<C7854g6> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    i = C3731b.m14425t(parcel, r);
                    break;
                case 3:
                    i2 = C3731b.m14425t(parcel, r);
                    break;
                case 4:
                    i3 = C3731b.m14425t(parcel, r);
                    break;
                case 5:
                    z = C3731b.m14417l(parcel, r);
                    break;
                case 6:
                    z2 = C3731b.m14417l(parcel, r);
                    break;
                case 7:
                    f = C3731b.m14421p(parcel, r);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7854g6(i, i2, i3, z, z2, f);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7854g6[i];
    }
}
