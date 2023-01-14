package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.m.ka */
public final class C8727ka extends C3730a {
    public static final Parcelable.Creator<C8727ka> CREATOR = new C8702ib();

    /* renamed from: f */
    public final C8767nb[] f23852f;

    /* renamed from: o */
    public final C8643e4 f23853o;

    /* renamed from: p */
    public final C8643e4 f23854p;

    /* renamed from: q */
    public final C8643e4 f23855q;

    /* renamed from: r */
    public final String f23856r;

    /* renamed from: s */
    public final float f23857s;

    /* renamed from: t */
    public final String f23858t;

    /* renamed from: u */
    public final int f23859u;

    /* renamed from: v */
    public final boolean f23860v;

    /* renamed from: w */
    public final int f23861w;

    /* renamed from: x */
    public final int f23862x;

    public C8727ka(C8767nb[] nbVarArr, C8643e4 e4Var, C8643e4 e4Var2, C8643e4 e4Var3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.f23852f = nbVarArr;
        this.f23853o = e4Var;
        this.f23854p = e4Var2;
        this.f23855q = e4Var3;
        this.f23856r = str;
        this.f23857s = f;
        this.f23858t = str2;
        this.f23859u = i;
        this.f23860v = z;
        this.f23861w = i2;
        this.f23862x = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14451t(parcel, 2, this.f23852f, i, false);
        C3733c.m14447p(parcel, 3, this.f23853o, i, false);
        C3733c.m14447p(parcel, 4, this.f23854p, i, false);
        C3733c.m14447p(parcel, 5, this.f23855q, i, false);
        C3733c.m14448q(parcel, 6, this.f23856r, false);
        C3733c.m14440i(parcel, 7, this.f23857s);
        C3733c.m14448q(parcel, 8, this.f23858t, false);
        C3733c.m14443l(parcel, 9, this.f23859u);
        C3733c.m14434c(parcel, 10, this.f23860v);
        C3733c.m14443l(parcel, 11, this.f23861w);
        C3733c.m14443l(parcel, 12, this.f23862x);
        C3733c.m14433b(parcel, a);
    }
}
