package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.pb */
public final class C7382pb extends C3730a {
    public static final Parcelable.Creator<C7382pb> CREATOR = new C7225ec();

    /* renamed from: f */
    private final int f19841f;

    /* renamed from: o */
    private final int f19842o;

    /* renamed from: p */
    private final int f19843p;

    /* renamed from: q */
    private final int f19844q;

    /* renamed from: r */
    private final int f19845r;

    /* renamed from: s */
    private final int f19846s;

    /* renamed from: t */
    private final boolean f19847t;

    /* renamed from: u */
    private final String f19848u;

    public C7382pb(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f19841f = i;
        this.f19842o = i2;
        this.f19843p = i3;
        this.f19844q = i4;
        this.f19845r = i5;
        this.f19846s = i6;
        this.f19847t = z;
        this.f19848u = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f19841f);
        C3733c.m14443l(parcel, 2, this.f19842o);
        C3733c.m14443l(parcel, 3, this.f19843p);
        C3733c.m14443l(parcel, 4, this.f19844q);
        C3733c.m14443l(parcel, 5, this.f19845r);
        C3733c.m14443l(parcel, 6, this.f19846s);
        C3733c.m14434c(parcel, 7, this.f19847t);
        C3733c.m14448q(parcel, 8, this.f19848u, false);
        C3733c.m14433b(parcel, a);
    }
}
