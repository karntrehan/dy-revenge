package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.bd */
public final class C7181bd implements Parcelable.Creator<C7233f5> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C7217e4 e4Var = null;
        C7217e4 e4Var2 = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    str = C3731b.m14410e(parcel, r);
                    break;
                case 3:
                    str2 = C3731b.m14410e(parcel, r);
                    break;
                case 4:
                    str3 = C3731b.m14410e(parcel, r);
                    break;
                case 5:
                    str4 = C3731b.m14410e(parcel, r);
                    break;
                case 6:
                    str5 = C3731b.m14410e(parcel, r);
                    break;
                case 7:
                    e4Var = (C7217e4) C3731b.m14409d(parcel, r, C7217e4.CREATOR);
                    break;
                case 8:
                    e4Var2 = (C7217e4) C3731b.m14409d(parcel, r, C7217e4.CREATOR);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7233f5(str, str2, str3, str4, str5, e4Var, e4Var2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7233f5[i];
    }
}
