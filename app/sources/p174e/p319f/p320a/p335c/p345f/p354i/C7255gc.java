package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.i.gc */
public final class C7255gc implements Parcelable.Creator<C7410rb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        C7466vb vbVar = null;
        String str = null;
        String str2 = null;
        C7480wb[] wbVarArr = null;
        C7438tb[] tbVarArr = null;
        String[] strArr = null;
        C7368ob[] obVarArr = null;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    vbVar = (C7466vb) C3731b.m14409d(parcel, r, C7466vb.CREATOR);
                    break;
                case 2:
                    str = C3731b.m14410e(parcel, r);
                    break;
                case 3:
                    str2 = C3731b.m14410e(parcel, r);
                    break;
                case 4:
                    wbVarArr = (C7480wb[]) C3731b.m14413h(parcel, r, C7480wb.CREATOR);
                    break;
                case 5:
                    tbVarArr = (C7438tb[]) C3731b.m14413h(parcel, r, C7438tb.CREATOR);
                    break;
                case 6:
                    strArr = C3731b.m14411f(parcel, r);
                    break;
                case 7:
                    obVarArr = (C7368ob[]) C3731b.m14413h(parcel, r, C7368ob.CREATOR);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new C7410rb(vbVar, str, str2, wbVarArr, tbVarArr, strArr, obVarArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7410rb[i];
    }
}
