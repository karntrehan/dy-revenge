package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: e.f.a.c.f.m.hb */
public final class C8689hb implements Parcelable.Creator<C8676gb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        ArrayList<C8598ab> arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                str = C3731b.m14410e(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                arrayList = C3731b.m14414i(parcel, r, C8598ab.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C8676gb(str, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C8676gb[i];
    }
}
