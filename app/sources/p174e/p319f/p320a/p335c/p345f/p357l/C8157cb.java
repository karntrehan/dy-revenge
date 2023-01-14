package p174e.p319f.p320a.p335c.p345f.p357l;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: e.f.a.c.f.l.cb */
public final class C8157cb implements Parcelable.Creator<C8138bb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        Rect rect = null;
        ArrayList<C8271ib> arrayList = null;
        ArrayList<C8543xa> arrayList2 = null;
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 2:
                    rect = (Rect) C3731b.m14409d(parcel2, r, Rect.CREATOR);
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
                    f7 = C3731b.m14421p(parcel2, r);
                    break;
                case 10:
                    arrayList = C3731b.m14414i(parcel2, r, C8271ib.CREATOR);
                    break;
                case 11:
                    arrayList2 = C3731b.m14414i(parcel2, r, C8543xa.CREATOR);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C8138bb(i, rect, f, f2, f3, f4, f5, f6, f7, arrayList, arrayList2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C8138bb[i];
    }
}
