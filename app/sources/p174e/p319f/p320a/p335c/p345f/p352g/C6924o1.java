package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.g.o1 */
public final class C6924o1 extends C3730a {
    public static final Parcelable.Creator<C6924o1> CREATOR = new C6940p1();

    /* renamed from: f */
    public final long f18730f;

    /* renamed from: o */
    public final long f18731o;

    /* renamed from: p */
    public final boolean f18732p;

    /* renamed from: q */
    public final String f18733q;

    /* renamed from: r */
    public final String f18734r;

    /* renamed from: s */
    public final String f18735s;

    /* renamed from: t */
    public final Bundle f18736t;

    /* renamed from: u */
    public final String f18737u;

    public C6924o1(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f18730f = j;
        this.f18731o = j2;
        this.f18732p = z;
        this.f18733q = str;
        this.f18734r = str2;
        this.f18735s = str3;
        this.f18736t = bundle;
        this.f18737u = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14445n(parcel, 1, this.f18730f);
        C3733c.m14445n(parcel, 2, this.f18731o);
        C3733c.m14434c(parcel, 3, this.f18732p);
        C3733c.m14448q(parcel, 4, this.f18733q, false);
        C3733c.m14448q(parcel, 5, this.f18734r, false);
        C3733c.m14448q(parcel, 6, this.f18735s, false);
        C3733c.m14436e(parcel, 7, this.f18736t, false);
        C3733c.m14448q(parcel, 8, this.f18737u, false);
        C3733c.m14433b(parcel, a);
    }
}
