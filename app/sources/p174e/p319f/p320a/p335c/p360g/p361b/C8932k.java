package p174e.p319f.p320a.p335c.p360g.p361b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3712t0;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.g.b.k */
public final class C8932k implements Parcelable.Creator<C8931j> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        C3712t0 t0Var = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k != 2) {
                C3731b.m14429x(parcel, r);
            } else {
                t0Var = (C3712t0) C3731b.m14409d(parcel, r, C3712t0.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C8931j(i, t0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8931j[i];
    }
}
