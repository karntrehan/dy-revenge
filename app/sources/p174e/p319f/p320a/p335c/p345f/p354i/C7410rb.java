package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.rb */
public final class C7410rb extends C3730a {
    public static final Parcelable.Creator<C7410rb> CREATOR = new C7255gc();

    /* renamed from: f */
    private final C7466vb f19907f;

    /* renamed from: o */
    private final String f19908o;

    /* renamed from: p */
    private final String f19909p;

    /* renamed from: q */
    private final C7480wb[] f19910q;

    /* renamed from: r */
    private final C7438tb[] f19911r;

    /* renamed from: s */
    private final String[] f19912s;

    /* renamed from: t */
    private final C7368ob[] f19913t;

    public C7410rb(C7466vb vbVar, String str, String str2, C7480wb[] wbVarArr, C7438tb[] tbVarArr, String[] strArr, C7368ob[] obVarArr) {
        this.f19907f = vbVar;
        this.f19908o = str;
        this.f19909p = str2;
        this.f19910q = wbVarArr;
        this.f19911r = tbVarArr;
        this.f19912s = strArr;
        this.f19913t = obVarArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14447p(parcel, 1, this.f19907f, i, false);
        C3733c.m14448q(parcel, 2, this.f19908o, false);
        C3733c.m14448q(parcel, 3, this.f19909p, false);
        C3733c.m14451t(parcel, 4, this.f19910q, i, false);
        C3733c.m14451t(parcel, 5, this.f19911r, i, false);
        C3733c.m14449r(parcel, 6, this.f19912s, false);
        C3733c.m14451t(parcel, 7, this.f19913t, i, false);
        C3733c.m14433b(parcel, a);
    }
}
