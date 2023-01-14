package p174e.p319f.p320a.p335c.p360g.p361b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: e.f.a.c.g.b.i */
public final class C8930i implements Parcelable.Creator<C8929h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                arrayList = C3731b.m14412g(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                str = C3731b.m14410e(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C8929h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8929h[i];
    }
}
