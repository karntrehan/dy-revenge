package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.cd */
public final class C7196cd implements Parcelable.Creator<C7249g6> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        C7311ka kaVar = null;
        String str = null;
        String str2 = null;
        C7326lb[] lbVarArr = null;
        C7281i8[] i8VarArr = null;
        String[] strArr = null;
        C7201d3[] d3VarArr = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    kaVar = (C7311ka) C3731b.m14409d(parcel, r, C7311ka.CREATOR);
                    break;
                case 3:
                    str = C3731b.m14410e(parcel, r);
                    break;
                case 4:
                    str2 = C3731b.m14410e(parcel, r);
                    break;
                case 5:
                    lbVarArr = (C7326lb[]) C3731b.m14413h(parcel, r, C7326lb.CREATOR);
                    break;
                case 6:
                    i8VarArr = (C7281i8[]) C3731b.m14413h(parcel, r, C7281i8.CREATOR);
                    break;
                case 7:
                    strArr = C3731b.m14411f(parcel, r);
                    break;
                case 8:
                    d3VarArr = (C7201d3[]) C3731b.m14413h(parcel, r, C7201d3.CREATOR);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7249g6(kaVar, str, str2, lbVarArr, i8VarArr, strArr, d3VarArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7249g6[i];
    }
}
