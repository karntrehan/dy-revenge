package p174e.p319f.p320a.p335c.p345f.p357l;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.f.l.bb */
public final class C8138bb extends C3730a {
    public static final Parcelable.Creator<C8138bb> CREATOR = new C8157cb();

    /* renamed from: f */
    private final int f22114f;

    /* renamed from: o */
    private final Rect f22115o;

    /* renamed from: p */
    private final float f22116p;

    /* renamed from: q */
    private final float f22117q;

    /* renamed from: r */
    private final float f22118r;

    /* renamed from: s */
    private final float f22119s;

    /* renamed from: t */
    private final float f22120t;

    /* renamed from: u */
    private final float f22121u;

    /* renamed from: v */
    private final float f22122v;

    /* renamed from: w */
    private final List<C8271ib> f22123w;

    /* renamed from: x */
    private final List<C8543xa> f22124x;

    public C8138bb(int i, Rect rect, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<C8271ib> list, List<C8543xa> list2) {
        this.f22114f = i;
        this.f22115o = rect;
        this.f22116p = f;
        this.f22117q = f2;
        this.f22118r = f3;
        this.f22119s = f4;
        this.f22120t = f5;
        this.f22121u = f6;
        this.f22122v = f7;
        this.f22123w = list;
        this.f22124x = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f22114f);
        C3733c.m14447p(parcel, 2, this.f22115o, i, false);
        C3733c.m14440i(parcel, 3, this.f22116p);
        C3733c.m14440i(parcel, 4, this.f22117q);
        C3733c.m14440i(parcel, 5, this.f22118r);
        C3733c.m14440i(parcel, 6, this.f22119s);
        C3733c.m14440i(parcel, 7, this.f22120t);
        C3733c.m14440i(parcel, 8, this.f22121u);
        C3733c.m14440i(parcel, 9, this.f22122v);
        C3733c.m14452u(parcel, 10, this.f22123w, false);
        C3733c.m14452u(parcel, 11, this.f22124x, false);
        C3733c.m14433b(parcel, a);
    }
}
