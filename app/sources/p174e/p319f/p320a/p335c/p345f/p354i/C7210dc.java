package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.dc */
public final class C7210dc implements Parcelable.Creator<C7195cc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            if (C3731b.m14416k(r) != 1) {
                C3731b.m14429x(parcel, r);
            } else {
                i = C3731b.m14425t(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7195cc(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7195cc[i];
    }
}
