package p174e.p319f.p320a.p335c.p345f.p356k;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: e.f.a.c.f.k.bb */
public final class C7794bb implements Parcelable.Creator<C7781ab> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                arrayList = C3731b.m14414i(parcel, r, PointF.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7781ab(i, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7781ab[i];
    }
}
