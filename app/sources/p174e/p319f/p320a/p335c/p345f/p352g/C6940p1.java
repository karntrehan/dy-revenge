package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.g.p1 */
public final class C6940p1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    j = C3731b.m14426u(parcel2, r);
                    break;
                case 2:
                    j2 = C3731b.m14426u(parcel2, r);
                    break;
                case 3:
                    z = C3731b.m14417l(parcel2, r);
                    break;
                case 4:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 5:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 6:
                    str3 = C3731b.m14410e(parcel2, r);
                    break;
                case 7:
                    bundle = C3731b.m14406a(parcel2, r);
                    break;
                case 8:
                    str4 = C3731b.m14410e(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C6924o1(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6924o1[i];
    }
}
