package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.g6 */
public final class C7249g6 extends C3730a {
    public static final Parcelable.Creator<C7249g6> CREATOR = new C7196cd();

    /* renamed from: f */
    public C7311ka f19326f;

    /* renamed from: o */
    public String f19327o;

    /* renamed from: p */
    public String f19328p;

    /* renamed from: q */
    public C7326lb[] f19329q;

    /* renamed from: r */
    public C7281i8[] f19330r;

    /* renamed from: s */
    public String[] f19331s;

    /* renamed from: t */
    public C7201d3[] f19332t;

    public C7249g6() {
    }

    public C7249g6(C7311ka kaVar, String str, String str2, C7326lb[] lbVarArr, C7281i8[] i8VarArr, String[] strArr, C7201d3[] d3VarArr) {
        this.f19326f = kaVar;
        this.f19327o = str;
        this.f19328p = str2;
        this.f19329q = lbVarArr;
        this.f19330r = i8VarArr;
        this.f19331s = strArr;
        this.f19332t = d3VarArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14447p(parcel, 2, this.f19326f, i, false);
        C3733c.m14448q(parcel, 3, this.f19327o, false);
        C3733c.m14448q(parcel, 4, this.f19328p, false);
        C3733c.m14451t(parcel, 5, this.f19329q, i, false);
        C3733c.m14451t(parcel, 6, this.f19330r, i, false);
        C3733c.m14449r(parcel, 7, this.f19331s, false);
        C3733c.m14451t(parcel, 8, this.f19332t, i, false);
        C3733c.m14433b(parcel, a);
    }
}
