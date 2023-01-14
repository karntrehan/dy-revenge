package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.m.ob */
public final class C8780ob implements Parcelable.Creator<C8767nb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        C8715jb[] jbVarArr = null;
        C8643e4 e4Var = null;
        C8643e4 e4Var2 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 2:
                    jbVarArr = (C8715jb[]) C3731b.m14413h(parcel, r, C8715jb.CREATOR);
                    break;
                case 3:
                    e4Var = (C8643e4) C3731b.m14409d(parcel, r, C8643e4.CREATOR);
                    break;
                case 4:
                    e4Var2 = (C8643e4) C3731b.m14409d(parcel, r, C8643e4.CREATOR);
                    break;
                case 5:
                    str = C3731b.m14410e(parcel, r);
                    break;
                case 6:
                    f = C3731b.m14421p(parcel, r);
                    break;
                case 7:
                    str2 = C3731b.m14410e(parcel, r);
                    break;
                case 8:
                    z = C3731b.m14417l(parcel, r);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new C8767nb(jbVarArr, e4Var, e4Var2, str, f, str2, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C8767nb[i];
    }
}
