package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.ob */
public final class C7368ob extends C3730a {
    public static final Parcelable.Creator<C7368ob> CREATOR = new C7354nb();

    /* renamed from: f */
    private final int f19810f;

    /* renamed from: o */
    private final String[] f19811o;

    public C7368ob(int i, String[] strArr) {
        this.f19810f = i;
        this.f19811o = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f19810f);
        C3733c.m14449r(parcel, 2, this.f19811o, false);
        C3733c.m14433b(parcel, a);
    }
}
