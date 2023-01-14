package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.m.kb */
public final class C8728kb implements Parcelable.Creator<C8715jb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            C3731b.m14416k(r);
            C3731b.m14429x(parcel, r);
        }
        C3731b.m14415j(parcel, y);
        return new C8715jb();
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C8715jb[i];
    }
}
