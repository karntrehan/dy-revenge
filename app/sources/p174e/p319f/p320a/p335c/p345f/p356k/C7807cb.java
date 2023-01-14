package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.k.cb */
public final class C7807cb extends C3730a {
    public static final Parcelable.Creator<C7807cb> CREATOR = new C7820db();

    /* renamed from: f */
    private final int f21284f;

    /* renamed from: o */
    private final int f21285o;

    /* renamed from: p */
    private final int f21286p;

    /* renamed from: q */
    private final int f21287q;

    /* renamed from: r */
    private final boolean f21288r;

    /* renamed from: s */
    private final float f21289s;

    public C7807cb(int i, int i2, int i3, int i4, boolean z, float f) {
        this.f21284f = i;
        this.f21285o = i2;
        this.f21286p = i3;
        this.f21287q = i4;
        this.f21288r = z;
        this.f21289s = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f21284f);
        C3733c.m14443l(parcel, 2, this.f21285o);
        C3733c.m14443l(parcel, 3, this.f21286p);
        C3733c.m14443l(parcel, 4, this.f21287q);
        C3733c.m14434c(parcel, 5, this.f21288r);
        C3733c.m14440i(parcel, 6, this.f21289s);
        C3733c.m14433b(parcel, a);
    }
}
