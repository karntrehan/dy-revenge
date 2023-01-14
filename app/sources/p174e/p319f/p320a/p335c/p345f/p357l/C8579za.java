package p174e.p319f.p320a.p335c.p345f.p357l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.l.za */
public final class C8579za extends C3730a {
    public static final Parcelable.Creator<C8579za> CREATOR = new C8119ab();

    /* renamed from: f */
    private final int f23355f;

    /* renamed from: o */
    private final int f23356o;

    /* renamed from: p */
    private final int f23357p;

    /* renamed from: q */
    private final int f23358q;

    /* renamed from: r */
    private final boolean f23359r;

    /* renamed from: s */
    private final float f23360s;

    public C8579za(int i, int i2, int i3, int i4, boolean z, float f) {
        this.f23355f = i;
        this.f23356o = i2;
        this.f23357p = i3;
        this.f23358q = i4;
        this.f23359r = z;
        this.f23360s = f;
    }

    /* renamed from: C */
    public final int mo22284C() {
        return this.f23356o;
    }

    /* renamed from: E */
    public final int mo22285E() {
        return this.f23355f;
    }

    /* renamed from: G */
    public final boolean mo22286G() {
        return this.f23359r;
    }

    /* renamed from: o */
    public final float mo22287o() {
        return this.f23360s;
    }

    /* renamed from: p */
    public final int mo22288p() {
        return this.f23357p;
    }

    /* renamed from: r */
    public final int mo22289r() {
        return this.f23358q;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f23355f);
        C3733c.m14443l(parcel, 2, this.f23356o);
        C3733c.m14443l(parcel, 3, this.f23357p);
        C3733c.m14443l(parcel, 4, this.f23358q);
        C3733c.m14434c(parcel, 5, this.f23359r);
        C3733c.m14440i(parcel, 6, this.f23360s);
        C3733c.m14433b(parcel, a);
    }
}
