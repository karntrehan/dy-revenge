package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.k.g6 */
public final class C7854g6 extends C3730a {
    public static final Parcelable.Creator<C7854g6> CREATOR = new C7868h7();

    /* renamed from: f */
    public int f21425f;

    /* renamed from: o */
    public int f21426o;

    /* renamed from: p */
    public int f21427p;

    /* renamed from: q */
    public boolean f21428q;

    /* renamed from: r */
    public boolean f21429r;

    /* renamed from: s */
    public float f21430s;

    public C7854g6(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.f21425f = i;
        this.f21426o = i2;
        this.f21427p = i3;
        this.f21428q = z;
        this.f21429r = z2;
        this.f21430s = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f21425f);
        C3733c.m14443l(parcel, 3, this.f21426o);
        C3733c.m14443l(parcel, 4, this.f21427p);
        C3733c.m14434c(parcel, 5, this.f21428q);
        C3733c.m14434c(parcel, 6, this.f21429r);
        C3733c.m14440i(parcel, 7, this.f21430s);
        C3733c.m14433b(parcel, a);
    }
}
