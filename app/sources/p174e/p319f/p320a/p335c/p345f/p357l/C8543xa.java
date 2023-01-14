package p174e.p319f.p320a.p335c.p345f.p357l;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.f.l.xa */
public final class C8543xa extends C3730a {
    public static final Parcelable.Creator<C8543xa> CREATOR = new C8561ya();

    /* renamed from: f */
    private final int f23286f;

    /* renamed from: o */
    private final List<PointF> f23287o;

    public C8543xa(int i, List<PointF> list) {
        this.f23286f = i;
        this.f23287o = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f23286f);
        C3733c.m14452u(parcel, 2, this.f23287o, false);
        C3733c.m14433b(parcel, a);
    }
}
