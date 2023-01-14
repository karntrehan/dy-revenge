package p174e.p319f.p320a.p335c.p345f.p354i;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.bc */
public final class C7180bc implements Parcelable.Creator<C7165ac> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        C7438tb tbVar = null;
        C7480wb wbVar = null;
        C7494xb xbVar = null;
        C7522zb zbVar = null;
        C7508yb ybVar = null;
        C7452ub ubVar = null;
        C7396qb qbVar = null;
        C7410rb rbVar = null;
        C7424sb sbVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 2:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 3:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 4:
                    bArr = C3731b.m14407b(parcel2, r);
                    break;
                case 5:
                    pointArr = (Point[]) C3731b.m14413h(parcel2, r, Point.CREATOR);
                    break;
                case 6:
                    i2 = C3731b.m14425t(parcel2, r);
                    break;
                case 7:
                    tbVar = (C7438tb) C3731b.m14409d(parcel2, r, C7438tb.CREATOR);
                    break;
                case 8:
                    wbVar = (C7480wb) C3731b.m14409d(parcel2, r, C7480wb.CREATOR);
                    break;
                case 9:
                    xbVar = (C7494xb) C3731b.m14409d(parcel2, r, C7494xb.CREATOR);
                    break;
                case 10:
                    zbVar = (C7522zb) C3731b.m14409d(parcel2, r, C7522zb.CREATOR);
                    break;
                case 11:
                    ybVar = (C7508yb) C3731b.m14409d(parcel2, r, C7508yb.CREATOR);
                    break;
                case 12:
                    ubVar = (C7452ub) C3731b.m14409d(parcel2, r, C7452ub.CREATOR);
                    break;
                case 13:
                    qbVar = (C7396qb) C3731b.m14409d(parcel2, r, C7396qb.CREATOR);
                    break;
                case 14:
                    rbVar = (C7410rb) C3731b.m14409d(parcel2, r, C7410rb.CREATOR);
                    break;
                case 15:
                    sbVar = (C7424sb) C3731b.m14409d(parcel2, r, C7424sb.CREATOR);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C7165ac(i, str, str2, bArr, pointArr, i2, tbVar, wbVar, xbVar, zbVar, ybVar, ubVar, qbVar, rbVar, sbVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7165ac[i];
    }
}
