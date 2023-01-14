package p174e.p319f.p320a.p335c.p345f.p356k;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.k.c2 */
public final class C7798c2 extends C3730a {
    public static final Parcelable.Creator<C7798c2> CREATOR = new C7812d3();

    /* renamed from: f */
    public final PointF[] f21259f;

    /* renamed from: o */
    public final int f21260o;

    public C7798c2(PointF[] pointFArr, int i) {
        this.f21259f = pointFArr;
        this.f21260o = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14451t(parcel, 2, this.f21259f, i, false);
        C3733c.m14443l(parcel, 3, this.f21260o);
        C3733c.m14433b(parcel, a);
    }
}
