package p174e.p319f.p320a.p335c.p345f.p357l;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.l.jb */
public final class C8290jb implements Parcelable.Creator<C8271ib> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        PointF pointF = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                pointF = (PointF) C3731b.m14409d(parcel, r, PointF.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C8271ib(i, pointF);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C8271ib[i];
    }
}
