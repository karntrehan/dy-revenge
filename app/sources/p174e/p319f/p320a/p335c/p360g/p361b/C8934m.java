package p174e.p319f.p320a.p335c.p360g.p361b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.internal.C3718v0;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.g.b.m */
public final class C8934m implements Parcelable.Creator<C8933l> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        C3623b bVar = null;
        C3718v0 v0Var = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k == 2) {
                bVar = (C3623b) C3731b.m14409d(parcel, r, C3623b.CREATOR);
            } else if (k != 3) {
                C3731b.m14429x(parcel, r);
            } else {
                v0Var = (C3718v0) C3731b.m14409d(parcel, r, C3718v0.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C8933l(i, bVar, v0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8933l[i];
    }
}
