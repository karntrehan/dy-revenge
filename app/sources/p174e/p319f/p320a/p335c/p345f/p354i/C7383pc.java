package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.pc */
public final class C7383pc implements Parcelable.Creator<C7466vb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    str = C3731b.m14410e(parcel, r);
                    break;
                case 2:
                    str2 = C3731b.m14410e(parcel, r);
                    break;
                case 3:
                    str3 = C3731b.m14410e(parcel, r);
                    break;
                case 4:
                    str4 = C3731b.m14410e(parcel, r);
                    break;
                case 5:
                    str5 = C3731b.m14410e(parcel, r);
                    break;
                case 6:
                    str6 = C3731b.m14410e(parcel, r);
                    break;
                case 7:
                    str7 = C3731b.m14410e(parcel, r);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7466vb(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7466vb[i];
    }
}
