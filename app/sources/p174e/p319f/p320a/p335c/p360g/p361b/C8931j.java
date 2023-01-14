package p174e.p319f.p320a.p335c.p360g.p361b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3712t0;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.g.b.j */
public final class C8931j extends C3730a {
    public static final Parcelable.Creator<C8931j> CREATOR = new C8932k();

    /* renamed from: f */
    final int f24333f;

    /* renamed from: o */
    final C3712t0 f24334o;

    C8931j(int i, C3712t0 t0Var) {
        this.f24333f = i;
        this.f24334o = t0Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f24333f);
        C3733c.m14447p(parcel, 2, this.f24334o, i, false);
        C3733c.m14433b(parcel, a);
    }
}
