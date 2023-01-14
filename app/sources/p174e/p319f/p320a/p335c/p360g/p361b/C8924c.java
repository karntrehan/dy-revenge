package p174e.p319f.p320a.p335c.p360g.p361b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.g.b.c */
public final class C8924c implements Parcelable.Creator<C8923b> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 1) {
                i = C3731b.m14425t(parcel, r);
            } else if (k == 2) {
                i2 = C3731b.m14425t(parcel, r);
            } else if (k != 3) {
                C3731b.m14429x(parcel, r);
            } else {
                intent = (Intent) C3731b.m14409d(parcel, r, Intent.CREATOR);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C8923b(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8923b[i];
    }
}
