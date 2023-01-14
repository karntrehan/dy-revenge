package p174e.p319f.p320a.p335c.p345f.p356k;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.k.lb */
public final class C7924lb extends C3730a {
    public static final Parcelable.Creator<C7924lb> CREATOR = new C7937mb();

    /* renamed from: f */
    private final int f21582f;

    /* renamed from: o */
    private final PointF f21583o;

    public C7924lb(int i, PointF pointF) {
        this.f21582f = i;
        this.f21583o = pointF;
    }

    /* renamed from: o */
    public final int mo21446o() {
        return this.f21582f;
    }

    /* renamed from: p */
    public final PointF mo21447p() {
        return this.f21583o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f21582f);
        C3733c.m14447p(parcel, 2, this.f21583o, i, false);
        C3733c.m14433b(parcel, a);
    }
}
