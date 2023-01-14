package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.m.ib */
public final class C8702ib implements Parcelable.Creator<C8727ka> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        C8767nb[] nbVarArr = null;
        C8643e4 e4Var = null;
        C8643e4 e4Var2 = null;
        C8643e4 e4Var3 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    nbVarArr = (C8767nb[]) C3731b.m14413h(parcel2, r, C8767nb.CREATOR);
                    break;
                case 3:
                    e4Var = (C8643e4) C3731b.m14409d(parcel2, r, C8643e4.CREATOR);
                    break;
                case 4:
                    e4Var2 = (C8643e4) C3731b.m14409d(parcel2, r, C8643e4.CREATOR);
                    break;
                case 5:
                    e4Var3 = (C8643e4) C3731b.m14409d(parcel2, r, C8643e4.CREATOR);
                    break;
                case 6:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 7:
                    f = C3731b.m14421p(parcel2, r);
                    break;
                case 8:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 9:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 10:
                    z = C3731b.m14417l(parcel2, r);
                    break;
                case 11:
                    i2 = C3731b.m14425t(parcel2, r);
                    break;
                case 12:
                    i3 = C3731b.m14425t(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C8727ka(nbVarArr, e4Var, e4Var2, e4Var3, str, f, str2, i, z, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C8727ka[i];
    }
}
