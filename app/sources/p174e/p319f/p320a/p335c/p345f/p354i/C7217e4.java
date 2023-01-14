package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.e4 */
public final class C7217e4 extends C3730a {
    public static final Parcelable.Creator<C7217e4> CREATOR = new C7166ad();

    /* renamed from: f */
    public int f19256f;

    /* renamed from: o */
    public int f19257o;

    /* renamed from: p */
    public int f19258p;

    /* renamed from: q */
    public int f19259q;

    /* renamed from: r */
    public int f19260r;

    /* renamed from: s */
    public int f19261s;

    /* renamed from: t */
    public boolean f19262t;

    /* renamed from: u */
    public String f19263u;

    public C7217e4() {
    }

    public C7217e4(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f19256f = i;
        this.f19257o = i2;
        this.f19258p = i3;
        this.f19259q = i4;
        this.f19260r = i5;
        this.f19261s = i6;
        this.f19262t = z;
        this.f19263u = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f19256f);
        C3733c.m14443l(parcel, 3, this.f19257o);
        C3733c.m14443l(parcel, 4, this.f19258p);
        C3733c.m14443l(parcel, 5, this.f19259q);
        C3733c.m14443l(parcel, 6, this.f19260r);
        C3733c.m14443l(parcel, 7, this.f19261s);
        C3733c.m14434c(parcel, 8, this.f19262t);
        C3733c.m14448q(parcel, 9, this.f19263u, false);
        C3733c.m14433b(parcel, a);
    }
}
