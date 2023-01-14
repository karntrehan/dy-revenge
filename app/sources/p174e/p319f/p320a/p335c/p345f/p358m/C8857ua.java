package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.m.ua */
public final class C8857ua extends C3730a {
    public static final Parcelable.Creator<C8857ua> CREATOR = new C8870va();

    /* renamed from: f */
    private final int f24147f;

    /* renamed from: o */
    private final int f24148o;

    /* renamed from: p */
    private final int f24149p;

    /* renamed from: q */
    private final int f24150q;

    /* renamed from: r */
    private final long f24151r;

    public C8857ua(int i, int i2, int i3, int i4, long j) {
        this.f24147f = i;
        this.f24148o = i2;
        this.f24149p = i3;
        this.f24150q = i4;
        this.f24151r = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f24147f);
        C3733c.m14443l(parcel, 2, this.f24148o);
        C3733c.m14443l(parcel, 3, this.f24149p);
        C3733c.m14443l(parcel, 4, this.f24150q);
        C3733c.m14445n(parcel, 5, this.f24151r);
        C3733c.m14433b(parcel, a);
    }
}
