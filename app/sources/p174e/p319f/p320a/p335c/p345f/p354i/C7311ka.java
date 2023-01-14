package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.ka */
public final class C7311ka extends C3730a {
    public static final Parcelable.Creator<C7311ka> CREATOR = new C7256gd();

    /* renamed from: f */
    public String f19513f;

    /* renamed from: o */
    public String f19514o;

    /* renamed from: p */
    public String f19515p;

    /* renamed from: q */
    public String f19516q;

    /* renamed from: r */
    public String f19517r;

    /* renamed from: s */
    public String f19518s;

    /* renamed from: t */
    public String f19519t;

    public C7311ka() {
    }

    public C7311ka(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f19513f = str;
        this.f19514o = str2;
        this.f19515p = str3;
        this.f19516q = str4;
        this.f19517r = str5;
        this.f19518s = str6;
        this.f19519t = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f19513f, false);
        C3733c.m14448q(parcel, 3, this.f19514o, false);
        C3733c.m14448q(parcel, 4, this.f19515p, false);
        C3733c.m14448q(parcel, 5, this.f19516q, false);
        C3733c.m14448q(parcel, 6, this.f19517r, false);
        C3733c.m14448q(parcel, 7, this.f19518s, false);
        C3733c.m14448q(parcel, 8, this.f19519t, false);
        C3733c.m14433b(parcel, a);
    }
}
