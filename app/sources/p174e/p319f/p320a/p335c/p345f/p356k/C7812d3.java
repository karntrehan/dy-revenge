package p174e.p319f.p320a.p335c.p345f.p356k;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.k.d3 */
public final class C7812d3 implements Parcelable.Creator<C7798c2> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 2) {
                pointFArr = (PointF[]) C3731b.m14413h(parcel, r, PointF.CREATOR);
            } else if (k != 3) {
                C3731b.m14429x(parcel, r);
            } else {
                i = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7798c2(pointFArr, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7798c2[i];
    }
}
