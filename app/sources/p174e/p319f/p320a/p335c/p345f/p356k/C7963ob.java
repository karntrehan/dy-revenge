package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.k.ob */
public final class C7963ob implements Parcelable.Creator<C7950nb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k == 2) {
                f = C3731b.m14421p(parcel, r);
            } else if (k == 3) {
                f2 = C3731b.m14421p(parcel, r);
            } else if (k != 4) {
                C3731b.m14429x(parcel, r);
            } else {
                i2 = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7950nb(i, f, f2, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7950nb[i];
    }
}
