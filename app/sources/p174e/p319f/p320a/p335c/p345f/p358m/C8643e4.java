package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.m.e4 */
public final class C8643e4 extends C3730a {
    public static final Parcelable.Creator<C8643e4> CREATOR = new C8657f5();

    /* renamed from: f */
    public final int f23682f;

    /* renamed from: o */
    public final int f23683o;

    /* renamed from: p */
    public final int f23684p;

    /* renamed from: q */
    public final int f23685q;

    /* renamed from: r */
    public final float f23686r;

    public C8643e4(int i, int i2, int i3, int i4, float f) {
        this.f23682f = i;
        this.f23683o = i2;
        this.f23684p = i3;
        this.f23685q = i4;
        this.f23686r = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f23682f);
        C3733c.m14443l(parcel, 3, this.f23683o);
        C3733c.m14443l(parcel, 4, this.f23684p);
        C3733c.m14443l(parcel, 5, this.f23685q);
        C3733c.m14440i(parcel, 6, this.f23686r);
        C3733c.m14433b(parcel, a);
    }
}
