package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.k.pb */
public final class C7976pb extends C3730a {
    public static final Parcelable.Creator<C7976pb> CREATOR = new C7989qb();

    /* renamed from: f */
    public int f21699f;

    /* renamed from: o */
    public int f21700o;

    /* renamed from: p */
    public int f21701p;

    /* renamed from: q */
    public long f21702q;

    /* renamed from: r */
    public int f21703r;

    public C7976pb(int i, int i2, int i3, long j, int i4) {
        this.f21699f = i;
        this.f21700o = i2;
        this.f21701p = i3;
        this.f21702q = j;
        this.f21703r = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f21699f);
        C3733c.m14443l(parcel, 3, this.f21700o);
        C3733c.m14443l(parcel, 4, this.f21701p);
        C3733c.m14445n(parcel, 5, this.f21702q);
        C3733c.m14443l(parcel, 6, this.f21703r);
        C3733c.m14433b(parcel, a);
    }
}
