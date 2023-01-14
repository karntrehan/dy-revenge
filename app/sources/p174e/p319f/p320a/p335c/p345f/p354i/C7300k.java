package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.k */
public final class C7300k extends C3730a {
    public static final Parcelable.Creator<C7300k> CREATOR = new C7314l();

    /* renamed from: f */
    public int f19444f;

    /* renamed from: o */
    public int f19445o;

    /* renamed from: p */
    public int f19446p;

    /* renamed from: q */
    public long f19447q;

    /* renamed from: r */
    public int f19448r;

    public C7300k(int i, int i2, int i3, long j, int i4) {
        this.f19444f = i;
        this.f19445o = i2;
        this.f19446p = i3;
        this.f19447q = j;
        this.f19448r = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f19444f);
        C3733c.m14443l(parcel, 3, this.f19445o);
        C3733c.m14443l(parcel, 4, this.f19446p);
        C3733c.m14445n(parcel, 5, this.f19447q);
        C3733c.m14443l(parcel, 6, this.f19448r);
        C3733c.m14433b(parcel, a);
    }
}
