package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.jc */
public final class C7299jc implements Parcelable.Creator<C7452ub> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                d = C3731b.m14419n(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                d2 = C3731b.m14419n(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7452ub(d, d2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7452ub[i];
    }
}
