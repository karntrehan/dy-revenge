package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.vb */
public final class C7466vb extends C3730a {
    public static final Parcelable.Creator<C7466vb> CREATOR = new C7383pc();

    /* renamed from: f */
    private final String f20053f;

    /* renamed from: o */
    private final String f20054o;

    /* renamed from: p */
    private final String f20055p;

    /* renamed from: q */
    private final String f20056q;

    /* renamed from: r */
    private final String f20057r;

    /* renamed from: s */
    private final String f20058s;

    /* renamed from: t */
    private final String f20059t;

    public C7466vb(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f20053f = str;
        this.f20054o = str2;
        this.f20055p = str3;
        this.f20056q = str4;
        this.f20057r = str5;
        this.f20058s = str6;
        this.f20059t = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f20053f, false);
        C3733c.m14448q(parcel, 2, this.f20054o, false);
        C3733c.m14448q(parcel, 3, this.f20055p, false);
        C3733c.m14448q(parcel, 4, this.f20056q, false);
        C3733c.m14448q(parcel, 5, this.f20057r, false);
        C3733c.m14448q(parcel, 6, this.f20058s, false);
        C3733c.m14448q(parcel, 7, this.f20059t, false);
        C3733c.m14433b(parcel, a);
    }
}
