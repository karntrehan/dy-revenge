package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.e */
public final class C7212e extends C3730a {
    public static final Parcelable.Creator<C7212e> CREATOR = new C7227f();

    /* renamed from: f */
    public int f19251f;

    /* renamed from: o */
    public boolean f19252o;

    public C7212e() {
    }

    public C7212e(int i, boolean z) {
        this.f19251f = i;
        this.f19252o = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f19251f);
        C3733c.m14434c(parcel, 3, this.f19252o);
        C3733c.m14433b(parcel, a);
    }
}
