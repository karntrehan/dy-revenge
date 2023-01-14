package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.k.ya */
public final class C8092ya extends C3730a {
    public static final Parcelable.Creator<C8092ya> CREATOR = new C8105za();

    /* renamed from: f */
    private final int f22001f;

    /* renamed from: o */
    private final int f22002o;

    /* renamed from: p */
    private final int f22003p;

    /* renamed from: q */
    private final int f22004q;

    /* renamed from: r */
    private final long f22005r;

    public C8092ya(int i, int i2, int i3, int i4, long j) {
        this.f22001f = i;
        this.f22002o = i2;
        this.f22003p = i3;
        this.f22004q = i4;
        this.f22005r = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f22001f);
        C3733c.m14443l(parcel, 2, this.f22002o);
        C3733c.m14443l(parcel, 3, this.f22003p);
        C3733c.m14443l(parcel, 4, this.f22004q);
        C3733c.m14445n(parcel, 5, this.f22005r);
        C3733c.m14433b(parcel, a);
    }
}
