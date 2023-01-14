package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.k.nb */
public final class C7950nb extends C3730a {
    public static final Parcelable.Creator<C7950nb> CREATOR = new C7963ob();

    /* renamed from: f */
    public final int f21642f;

    /* renamed from: o */
    public final float f21643o;

    /* renamed from: p */
    public final float f21644p;

    /* renamed from: q */
    public final int f21645q;

    public C7950nb(int i, float f, float f2, int i2) {
        this.f21642f = i;
        this.f21643o = f;
        this.f21644p = f2;
        this.f21645q = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f21642f);
        C3733c.m14440i(parcel, 2, this.f21643o);
        C3733c.m14440i(parcel, 3, this.f21644p);
        C3733c.m14443l(parcel, 4, this.f21645q);
        C3733c.m14433b(parcel, a);
    }
}
