package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.ub */
public final class C7452ub extends C3730a {
    public static final Parcelable.Creator<C7452ub> CREATOR = new C7299jc();

    /* renamed from: f */
    private final double f20029f;

    /* renamed from: o */
    private final double f20030o;

    public C7452ub(double d, double d2) {
        this.f20029f = d;
        this.f20030o = d2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14438g(parcel, 1, this.f20029f);
        C3733c.m14438g(parcel, 2, this.f20030o);
        C3733c.m14433b(parcel, a);
    }
}
