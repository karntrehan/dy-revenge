package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.dd */
public final class C7211dd implements Parcelable.Creator<C7265h7> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 3:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 4:
                    str3 = C3731b.m14410e(parcel2, r);
                    break;
                case 5:
                    str4 = C3731b.m14410e(parcel2, r);
                    break;
                case 6:
                    str5 = C3731b.m14410e(parcel2, r);
                    break;
                case 7:
                    str6 = C3731b.m14410e(parcel2, r);
                    break;
                case 8:
                    str7 = C3731b.m14410e(parcel2, r);
                    break;
                case 9:
                    str8 = C3731b.m14410e(parcel2, r);
                    break;
                case 10:
                    str9 = C3731b.m14410e(parcel2, r);
                    break;
                case 11:
                    str10 = C3731b.m14410e(parcel2, r);
                    break;
                case 12:
                    str11 = C3731b.m14410e(parcel2, r);
                    break;
                case 13:
                    str12 = C3731b.m14410e(parcel2, r);
                    break;
                case 14:
                    str13 = C3731b.m14410e(parcel2, r);
                    break;
                case 15:
                    str14 = C3731b.m14410e(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C7265h7(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7265h7[i];
    }
}
