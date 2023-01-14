package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;

/* renamed from: e.f.a.c.f.k.f5 */
public final class C7840f5 implements Parcelable.Creator<C7826e4> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        C7950nb[] nbVarArr = null;
        C7798c2[] c2VarArr = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = -1.0f;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 2:
                    i2 = C3731b.m14425t(parcel2, r);
                    break;
                case 3:
                    f = C3731b.m14421p(parcel2, r);
                    break;
                case 4:
                    f2 = C3731b.m14421p(parcel2, r);
                    break;
                case 5:
                    f3 = C3731b.m14421p(parcel2, r);
                    break;
                case 6:
                    f4 = C3731b.m14421p(parcel2, r);
                    break;
                case 7:
                    f5 = C3731b.m14421p(parcel2, r);
                    break;
                case 8:
                    f6 = C3731b.m14421p(parcel2, r);
                    break;
                case 9:
                    nbVarArr = (C7950nb[]) C3731b.m14413h(parcel2, r, C7950nb.CREATOR);
                    break;
                case 10:
                    f8 = C3731b.m14421p(parcel2, r);
                    break;
                case 11:
                    f9 = C3731b.m14421p(parcel2, r);
                    break;
                case 12:
                    f10 = C3731b.m14421p(parcel2, r);
                    break;
                case 13:
                    c2VarArr = (C7798c2[]) C3731b.m14413h(parcel2, r, C7798c2.CREATOR);
                    break;
                case 14:
                    f7 = C3731b.m14421p(parcel2, r);
                    break;
                case 15:
                    f11 = C3731b.m14421p(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C7826e4(i, i2, f, f2, f3, f4, f5, f6, f7, nbVarArr, f8, f9, f10, c2VarArr, f11);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C7826e4[i];
    }
}
