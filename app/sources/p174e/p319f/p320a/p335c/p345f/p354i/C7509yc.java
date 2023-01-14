package p174e.p319f.p320a.p335c.p345f.p354i;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.yc */
public final class C7509yc extends C3730a {
    public static final Parcelable.Creator<C7509yc> CREATOR = new C7523zc();

    /* renamed from: A */
    public C7265h7 f20194A;

    /* renamed from: B */
    public byte[] f20195B;

    /* renamed from: C */
    public boolean f20196C;

    /* renamed from: D */
    public double f20197D;

    /* renamed from: f */
    public int f20198f;

    /* renamed from: o */
    public String f20199o;

    /* renamed from: p */
    public String f20200p;

    /* renamed from: q */
    public int f20201q;

    /* renamed from: r */
    public Point[] f20202r;

    /* renamed from: s */
    public C7281i8 f20203s;

    /* renamed from: t */
    public C7326lb f20204t;

    /* renamed from: u */
    public C7327lc f20205u;

    /* renamed from: v */
    public C7495xc f20206v;

    /* renamed from: w */
    public C7481wc f20207w;

    /* renamed from: x */
    public C7296j9 f20208x;

    /* renamed from: y */
    public C7233f5 f20209y;

    /* renamed from: z */
    public C7249g6 f20210z;

    public C7509yc() {
    }

    public C7509yc(int i, String str, String str2, int i2, Point[] pointArr, C7281i8 i8Var, C7326lb lbVar, C7327lc lcVar, C7495xc xcVar, C7481wc wcVar, C7296j9 j9Var, C7233f5 f5Var, C7249g6 g6Var, C7265h7 h7Var, byte[] bArr, boolean z, double d) {
        this.f20198f = i;
        this.f20199o = str;
        this.f20195B = bArr;
        this.f20200p = str2;
        this.f20201q = i2;
        this.f20202r = pointArr;
        this.f20196C = z;
        this.f20197D = d;
        this.f20203s = i8Var;
        this.f20204t = lbVar;
        this.f20205u = lcVar;
        this.f20206v = xcVar;
        this.f20207w = wcVar;
        this.f20208x = j9Var;
        this.f20209y = f5Var;
        this.f20210z = g6Var;
        this.f20194A = h7Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f20198f);
        C3733c.m14448q(parcel, 3, this.f20199o, false);
        C3733c.m14448q(parcel, 4, this.f20200p, false);
        C3733c.m14443l(parcel, 5, this.f20201q);
        C3733c.m14451t(parcel, 6, this.f20202r, i, false);
        C3733c.m14447p(parcel, 7, this.f20203s, i, false);
        C3733c.m14447p(parcel, 8, this.f20204t, i, false);
        C3733c.m14447p(parcel, 9, this.f20205u, i, false);
        C3733c.m14447p(parcel, 10, this.f20206v, i, false);
        C3733c.m14447p(parcel, 11, this.f20207w, i, false);
        C3733c.m14447p(parcel, 12, this.f20208x, i, false);
        C3733c.m14447p(parcel, 13, this.f20209y, i, false);
        C3733c.m14447p(parcel, 14, this.f20210z, i, false);
        C3733c.m14447p(parcel, 15, this.f20194A, i, false);
        C3733c.m14437f(parcel, 16, this.f20195B, false);
        C3733c.m14434c(parcel, 17, this.f20196C);
        C3733c.m14438g(parcel, 18, this.f20197D);
        C3733c.m14433b(parcel, a);
    }
}
