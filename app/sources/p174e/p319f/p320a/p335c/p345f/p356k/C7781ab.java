package p174e.p319f.p320a.p335c.p345f.p356k;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.f.k.ab */
public final class C7781ab extends C3730a {
    public static final Parcelable.Creator<C7781ab> CREATOR = new C7794bb();

    /* renamed from: f */
    private final int f21098f;

    /* renamed from: o */
    private final List<PointF> f21099o;

    public C7781ab(int i, List<PointF> list) {
        this.f21098f = i;
        this.f21099o = list;
    }

    /* renamed from: o */
    public final int mo21228o() {
        return this.f21098f;
    }

    /* renamed from: p */
    public final List<PointF> mo21229p() {
        return this.f21099o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f21098f);
        C3733c.m14452u(parcel, 2, this.f21099o, false);
        C3733c.m14433b(parcel, a);
    }
}
