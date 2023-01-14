package p174e.p319f.p320a.p335c.p345f.p357l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.l.va */
public final class C8507va extends C3730a {
    public static final Parcelable.Creator<C8507va> CREATOR = new C8525wa();

    /* renamed from: f */
    private final int f23181f;

    /* renamed from: o */
    private final int f23182o;

    /* renamed from: p */
    private final int f23183p;

    /* renamed from: q */
    private final int f23184q;

    /* renamed from: r */
    private final long f23185r;

    public C8507va(int i, int i2, int i3, int i4, long j) {
        this.f23181f = i;
        this.f23182o = i2;
        this.f23183p = i3;
        this.f23184q = i4;
        this.f23185r = j;
    }

    /* renamed from: C */
    public final int mo22198C() {
        return this.f23182o;
    }

    /* renamed from: E */
    public final long mo22199E() {
        return this.f23185r;
    }

    /* renamed from: o */
    public final int mo22200o() {
        return this.f23183p;
    }

    /* renamed from: p */
    public final int mo22201p() {
        return this.f23181f;
    }

    /* renamed from: r */
    public final int mo22202r() {
        return this.f23184q;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f23181f);
        C3733c.m14443l(parcel, 2, this.f23182o);
        C3733c.m14443l(parcel, 3, this.f23183p);
        C3733c.m14443l(parcel, 4, this.f23184q);
        C3733c.m14445n(parcel, 5, this.f23185r);
        C3733c.m14433b(parcel, a);
    }
}
