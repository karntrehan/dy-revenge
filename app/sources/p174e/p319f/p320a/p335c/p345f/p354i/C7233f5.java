package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.f5 */
public final class C7233f5 extends C3730a {
    public static final Parcelable.Creator<C7233f5> CREATOR = new C7181bd();

    /* renamed from: f */
    public String f19287f;

    /* renamed from: o */
    public String f19288o;

    /* renamed from: p */
    public String f19289p;

    /* renamed from: q */
    public String f19290q;

    /* renamed from: r */
    public String f19291r;

    /* renamed from: s */
    public C7217e4 f19292s;

    /* renamed from: t */
    public C7217e4 f19293t;

    public C7233f5() {
    }

    public C7233f5(String str, String str2, String str3, String str4, String str5, C7217e4 e4Var, C7217e4 e4Var2) {
        this.f19287f = str;
        this.f19288o = str2;
        this.f19289p = str3;
        this.f19290q = str4;
        this.f19291r = str5;
        this.f19292s = e4Var;
        this.f19293t = e4Var2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f19287f, false);
        C3733c.m14448q(parcel, 3, this.f19288o, false);
        C3733c.m14448q(parcel, 4, this.f19289p, false);
        C3733c.m14448q(parcel, 5, this.f19290q, false);
        C3733c.m14448q(parcel, 6, this.f19291r, false);
        C3733c.m14447p(parcel, 7, this.f19292s, i, false);
        C3733c.m14447p(parcel, 8, this.f19293t, i, false);
        C3733c.m14433b(parcel, a);
    }
}
