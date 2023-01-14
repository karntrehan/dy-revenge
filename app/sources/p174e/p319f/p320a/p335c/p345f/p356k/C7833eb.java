package p174e.p319f.p320a.p335c.p345f.p356k;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.f.k.eb */
public final class C7833eb extends C3730a {
    public static final Parcelable.Creator<C7833eb> CREATOR = new C7846fb();

    /* renamed from: f */
    private final int f21377f;

    /* renamed from: o */
    private final Rect f21378o;

    /* renamed from: p */
    private final float f21379p;

    /* renamed from: q */
    private final float f21380q;

    /* renamed from: r */
    private final float f21381r;

    /* renamed from: s */
    private final float f21382s;

    /* renamed from: t */
    private final float f21383t;

    /* renamed from: u */
    private final float f21384u;

    /* renamed from: v */
    private final float f21385v;

    /* renamed from: w */
    private final List<C7924lb> f21386w;

    /* renamed from: x */
    private final List<C7781ab> f21387x;

    public C7833eb(int i, Rect rect, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<C7924lb> list, List<C7781ab> list2) {
        this.f21377f = i;
        this.f21378o = rect;
        this.f21379p = f;
        this.f21380q = f2;
        this.f21381r = f3;
        this.f21382s = f4;
        this.f21383t = f5;
        this.f21384u = f6;
        this.f21385v = f7;
        this.f21386w = list;
        this.f21387x = list2;
    }

    /* renamed from: C */
    public final float mo21321C() {
        return this.f21379p;
    }

    /* renamed from: E */
    public final float mo21322E() {
        return this.f21384u;
    }

    /* renamed from: G */
    public final float mo21323G() {
        return this.f21381r;
    }

    /* renamed from: H */
    public final int mo21324H() {
        return this.f21377f;
    }

    /* renamed from: I */
    public final Rect mo21325I() {
        return this.f21378o;
    }

    /* renamed from: J */
    public final List<C7781ab> mo21326J() {
        return this.f21387x;
    }

    /* renamed from: L */
    public final List<C7924lb> mo21327L() {
        return this.f21386w;
    }

    /* renamed from: o */
    public final float mo21328o() {
        return this.f21382s;
    }

    /* renamed from: p */
    public final float mo21329p() {
        return this.f21380q;
    }

    /* renamed from: r */
    public final float mo21330r() {
        return this.f21383t;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f21377f);
        C3733c.m14447p(parcel, 2, this.f21378o, i, false);
        C3733c.m14440i(parcel, 3, this.f21379p);
        C3733c.m14440i(parcel, 4, this.f21380q);
        C3733c.m14440i(parcel, 5, this.f21381r);
        C3733c.m14440i(parcel, 6, this.f21382s);
        C3733c.m14440i(parcel, 7, this.f21383t);
        C3733c.m14440i(parcel, 8, this.f21384u);
        C3733c.m14440i(parcel, 9, this.f21385v);
        C3733c.m14452u(parcel, 10, this.f21386w, false);
        C3733c.m14452u(parcel, 11, this.f21387x, false);
        C3733c.m14433b(parcel, a);
    }
}
