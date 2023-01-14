package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.uc */
public final class C7453uc extends C3730a {
    public static final Parcelable.Creator<C7453uc> CREATOR = new C7467vc();

    /* renamed from: f */
    private final int f20031f;

    /* renamed from: o */
    private final int f20032o;

    /* renamed from: p */
    private final int f20033p;

    /* renamed from: q */
    private final int f20034q;

    /* renamed from: r */
    private final long f20035r;

    public C7453uc(int i, int i2, int i3, int i4, long j) {
        this.f20031f = i;
        this.f20032o = i2;
        this.f20033p = i3;
        this.f20034q = i4;
        this.f20035r = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f20031f);
        C3733c.m14443l(parcel, 2, this.f20032o);
        C3733c.m14443l(parcel, 3, this.f20033p);
        C3733c.m14443l(parcel, 4, this.f20034q);
        C3733c.m14445n(parcel, 5, this.f20035r);
        C3733c.m14433b(parcel, a);
    }
}
