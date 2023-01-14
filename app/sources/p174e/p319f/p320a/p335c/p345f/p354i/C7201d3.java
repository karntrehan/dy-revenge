package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.d3 */
public final class C7201d3 extends C3730a {
    public static final Parcelable.Creator<C7201d3> CREATOR = new C7185c2();

    /* renamed from: f */
    public int f19232f;

    /* renamed from: o */
    public String[] f19233o;

    public C7201d3() {
    }

    public C7201d3(int i, String[] strArr) {
        this.f19232f = i;
        this.f19233o = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f19232f);
        C3733c.m14449r(parcel, 3, this.f19233o, false);
        C3733c.m14433b(parcel, a);
    }
}
