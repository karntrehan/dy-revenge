package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.m.c2 */
public final class C8615c2 extends C3730a {
    public static final Parcelable.Creator<C8615c2> CREATOR = new C8629d3();

    /* renamed from: f */
    public int f23599f;

    /* renamed from: o */
    public int f23600o;

    /* renamed from: p */
    public int f23601p;

    /* renamed from: q */
    public long f23602q;

    /* renamed from: r */
    public int f23603r;

    public C8615c2(int i, int i2, int i3, long j, int i4) {
        this.f23599f = i;
        this.f23600o = i2;
        this.f23601p = i3;
        this.f23602q = j;
        this.f23603r = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f23599f);
        C3733c.m14443l(parcel, 3, this.f23600o);
        C3733c.m14443l(parcel, 4, this.f23601p);
        C3733c.m14445n(parcel, 5, this.f23602q);
        C3733c.m14443l(parcel, 6, this.f23603r);
        C3733c.m14433b(parcel, a);
    }
}
