package p174e.p319f.p320a.p335c.p345f.p358m;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: e.f.a.c.f.m.fb */
public final class C8663fb implements Parcelable.Creator<C8650eb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList<C8624cb> arrayList2 = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                str = C3731b.m14410e(parcel, r);
            } else if (k == 2) {
                rect = (Rect) C3731b.m14409d(parcel, r, Rect.CREATOR);
            } else if (k == 3) {
                arrayList = C3731b.m14414i(parcel, r, Point.CREATOR);
            } else if (k == 4) {
                str2 = C3731b.m14410e(parcel, r);
            } else if (k != 5) {
                C3731b.m14429x(parcel, r);
            } else {
                arrayList2 = C3731b.m14414i(parcel, r, C8624cb.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C8650eb(str, rect, arrayList, str2, arrayList2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C8650eb[i];
    }
}
