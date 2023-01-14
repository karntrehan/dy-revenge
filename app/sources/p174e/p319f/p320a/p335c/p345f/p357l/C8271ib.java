package p174e.p319f.p320a.p335c.p345f.p357l;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.l.ib */
public final class C8271ib extends C3730a {
    public static final Parcelable.Creator<C8271ib> CREATOR = new C8290jb();

    /* renamed from: f */
    private final int f22636f;

    /* renamed from: o */
    private final PointF f22637o;

    public C8271ib(int i, PointF pointF) {
        this.f22636f = i;
        this.f22637o = pointF;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f22636f);
        C3733c.m14447p(parcel, 2, this.f22637o, i, false);
        C3733c.m14433b(parcel, a);
    }
}
