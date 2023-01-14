package p174e.p319f.p320a.p335c.p345f.p354i;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.ac */
public final class C7165ac extends C3730a {
    public static final Parcelable.Creator<C7165ac> CREATOR = new C7180bc();

    /* renamed from: A */
    private final C7410rb f19156A;

    /* renamed from: B */
    private final C7424sb f19157B;

    /* renamed from: f */
    private final int f19158f;

    /* renamed from: o */
    private final String f19159o;

    /* renamed from: p */
    private final String f19160p;

    /* renamed from: q */
    private final byte[] f19161q;

    /* renamed from: r */
    private final Point[] f19162r;

    /* renamed from: s */
    private final int f19163s;

    /* renamed from: t */
    private final C7438tb f19164t;

    /* renamed from: u */
    private final C7480wb f19165u;

    /* renamed from: v */
    private final C7494xb f19166v;

    /* renamed from: w */
    private final C7522zb f19167w;

    /* renamed from: x */
    private final C7508yb f19168x;

    /* renamed from: y */
    private final C7452ub f19169y;

    /* renamed from: z */
    private final C7396qb f19170z;

    public C7165ac(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, C7438tb tbVar, C7480wb wbVar, C7494xb xbVar, C7522zb zbVar, C7508yb ybVar, C7452ub ubVar, C7396qb qbVar, C7410rb rbVar, C7424sb sbVar) {
        this.f19158f = i;
        this.f19159o = str;
        this.f19160p = str2;
        this.f19161q = bArr;
        this.f19162r = pointArr;
        this.f19163s = i2;
        this.f19164t = tbVar;
        this.f19165u = wbVar;
        this.f19166v = xbVar;
        this.f19167w = zbVar;
        this.f19168x = ybVar;
        this.f19169y = ubVar;
        this.f19170z = qbVar;
        this.f19156A = rbVar;
        this.f19157B = sbVar;
    }

    /* renamed from: C */
    public final String mo20573C() {
        return this.f19160p;
    }

    /* renamed from: E */
    public final Point[] mo20574E() {
        return this.f19162r;
    }

    /* renamed from: o */
    public final int mo20575o() {
        return this.f19158f;
    }

    /* renamed from: p */
    public final int mo20576p() {
        return this.f19163s;
    }

    /* renamed from: r */
    public final String mo20577r() {
        return this.f19159o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f19158f);
        C3733c.m14448q(parcel, 2, this.f19159o, false);
        C3733c.m14448q(parcel, 3, this.f19160p, false);
        C3733c.m14437f(parcel, 4, this.f19161q, false);
        C3733c.m14451t(parcel, 5, this.f19162r, i, false);
        C3733c.m14443l(parcel, 6, this.f19163s);
        C3733c.m14447p(parcel, 7, this.f19164t, i, false);
        C3733c.m14447p(parcel, 8, this.f19165u, i, false);
        C3733c.m14447p(parcel, 9, this.f19166v, i, false);
        C3733c.m14447p(parcel, 10, this.f19167w, i, false);
        C3733c.m14447p(parcel, 11, this.f19168x, i, false);
        C3733c.m14447p(parcel, 12, this.f19169y, i, false);
        C3733c.m14447p(parcel, 13, this.f19170z, i, false);
        C3733c.m14447p(parcel, 14, this.f19156A, i, false);
        C3733c.m14447p(parcel, 15, this.f19157B, i, false);
        C3733c.m14433b(parcel, a);
    }
}
