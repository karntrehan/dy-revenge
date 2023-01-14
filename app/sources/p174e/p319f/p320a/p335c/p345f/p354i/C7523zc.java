package p174e.p319f.p320a.p335c.p345f.p354i;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.zc */
public final class C7523zc implements Parcelable.Creator<C7509yc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        C7281i8 i8Var = null;
        C7326lb lbVar = null;
        C7327lc lcVar = null;
        C7495xc xcVar = null;
        C7481wc wcVar = null;
        C7296j9 j9Var = null;
        C7233f5 f5Var = null;
        C7249g6 g6Var = null;
        C7265h7 h7Var = null;
        byte[] bArr = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 3:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 4:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 5:
                    i2 = C3731b.m14425t(parcel2, r);
                    break;
                case 6:
                    pointArr = (Point[]) C3731b.m14413h(parcel2, r, Point.CREATOR);
                    break;
                case 7:
                    i8Var = (C7281i8) C3731b.m14409d(parcel2, r, C7281i8.CREATOR);
                    break;
                case 8:
                    lbVar = (C7326lb) C3731b.m14409d(parcel2, r, C7326lb.CREATOR);
                    break;
                case 9:
                    lcVar = (C7327lc) C3731b.m14409d(parcel2, r, C7327lc.CREATOR);
                    break;
                case 10:
                    xcVar = (C7495xc) C3731b.m14409d(parcel2, r, C7495xc.CREATOR);
                    break;
                case 11:
                    wcVar = (C7481wc) C3731b.m14409d(parcel2, r, C7481wc.CREATOR);
                    break;
                case 12:
                    j9Var = (C7296j9) C3731b.m14409d(parcel2, r, C7296j9.CREATOR);
                    break;
                case 13:
                    f5Var = (C7233f5) C3731b.m14409d(parcel2, r, C7233f5.CREATOR);
                    break;
                case 14:
                    g6Var = (C7249g6) C3731b.m14409d(parcel2, r, C7249g6.CREATOR);
                    break;
                case 15:
                    h7Var = (C7265h7) C3731b.m14409d(parcel2, r, C7265h7.CREATOR);
                    break;
                case 16:
                    bArr = C3731b.m14407b(parcel2, r);
                    break;
                case 17:
                    z = C3731b.m14417l(parcel2, r);
                    break;
                case 18:
                    d = C3731b.m14419n(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C7509yc(i, str, str2, i2, pointArr, i8Var, lbVar, lcVar, xcVar, wcVar, j9Var, f5Var, g6Var, h7Var, bArr, z, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7509yc[i];
    }
}
