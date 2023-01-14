package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.k.e4 */
public final class C7826e4 extends C3730a {
    public static final Parcelable.Creator<C7826e4> CREATOR = new C7840f5();

    /* renamed from: A */
    public final C7798c2[] f21346A;

    /* renamed from: B */
    public final float f21347B;

    /* renamed from: f */
    public final int f21348f;

    /* renamed from: o */
    public final int f21349o;

    /* renamed from: p */
    public final float f21350p;

    /* renamed from: q */
    public final float f21351q;

    /* renamed from: r */
    public final float f21352r;

    /* renamed from: s */
    public final float f21353s;

    /* renamed from: t */
    public final float f21354t;

    /* renamed from: u */
    public final float f21355u;

    /* renamed from: v */
    public final float f21356v;

    /* renamed from: w */
    public final C7950nb[] f21357w;

    /* renamed from: x */
    public final float f21358x;

    /* renamed from: y */
    public final float f21359y;

    /* renamed from: z */
    public final float f21360z;

    public C7826e4(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, C7950nb[] nbVarArr, float f8, float f9, float f10, C7798c2[] c2VarArr, float f11) {
        this.f21348f = i;
        this.f21349o = i2;
        this.f21350p = f;
        this.f21351q = f2;
        this.f21352r = f3;
        this.f21353s = f4;
        this.f21354t = f5;
        this.f21355u = f6;
        this.f21356v = f7;
        this.f21357w = nbVarArr;
        this.f21358x = f8;
        this.f21359y = f9;
        this.f21360z = f10;
        this.f21346A = c2VarArr;
        this.f21347B = f11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f21348f);
        C3733c.m14443l(parcel, 2, this.f21349o);
        C3733c.m14440i(parcel, 3, this.f21350p);
        C3733c.m14440i(parcel, 4, this.f21351q);
        C3733c.m14440i(parcel, 5, this.f21352r);
        C3733c.m14440i(parcel, 6, this.f21353s);
        C3733c.m14440i(parcel, 7, this.f21354t);
        C3733c.m14440i(parcel, 8, this.f21355u);
        C3733c.m14451t(parcel, 9, this.f21357w, i, false);
        C3733c.m14440i(parcel, 10, this.f21358x);
        C3733c.m14440i(parcel, 11, this.f21359y);
        C3733c.m14440i(parcel, 12, this.f21360z);
        C3733c.m14451t(parcel, 13, this.f21346A, i, false);
        C3733c.m14440i(parcel, 14, this.f21356v);
        C3733c.m14440i(parcel, 15, this.f21347B);
        C3733c.m14433b(parcel, a);
    }
}
