package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.qb */
public final class C7396qb extends C3730a {
    public static final Parcelable.Creator<C7396qb> CREATOR = new C7240fc();

    /* renamed from: f */
    private final String f19877f;

    /* renamed from: o */
    private final String f19878o;

    /* renamed from: p */
    private final String f19879p;

    /* renamed from: q */
    private final String f19880q;

    /* renamed from: r */
    private final String f19881r;

    /* renamed from: s */
    private final C7382pb f19882s;

    /* renamed from: t */
    private final C7382pb f19883t;

    public C7396qb(String str, String str2, String str3, String str4, String str5, C7382pb pbVar, C7382pb pbVar2) {
        this.f19877f = str;
        this.f19878o = str2;
        this.f19879p = str3;
        this.f19880q = str4;
        this.f19881r = str5;
        this.f19882s = pbVar;
        this.f19883t = pbVar2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f19877f, false);
        C3733c.m14448q(parcel, 2, this.f19878o, false);
        C3733c.m14448q(parcel, 3, this.f19879p, false);
        C3733c.m14448q(parcel, 4, this.f19880q, false);
        C3733c.m14448q(parcel, 5, this.f19881r, false);
        C3733c.m14447p(parcel, 6, this.f19882s, i, false);
        C3733c.m14447p(parcel, 7, this.f19883t, i, false);
        C3733c.m14433b(parcel, a);
    }
}
