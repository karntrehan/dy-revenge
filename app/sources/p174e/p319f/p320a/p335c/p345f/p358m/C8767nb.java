package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.m.nb */
public final class C8767nb extends C3730a {
    public static final Parcelable.Creator<C8767nb> CREATOR = new C8780ob();

    /* renamed from: f */
    public final C8715jb[] f23950f;

    /* renamed from: o */
    public final C8643e4 f23951o;

    /* renamed from: p */
    public final C8643e4 f23952p;

    /* renamed from: q */
    public final String f23953q;

    /* renamed from: r */
    public final float f23954r;

    /* renamed from: s */
    public final String f23955s;

    /* renamed from: t */
    public final boolean f23956t;

    public C8767nb(C8715jb[] jbVarArr, C8643e4 e4Var, C8643e4 e4Var2, String str, float f, String str2, boolean z) {
        this.f23950f = jbVarArr;
        this.f23951o = e4Var;
        this.f23952p = e4Var2;
        this.f23953q = str;
        this.f23954r = f;
        this.f23955s = str2;
        this.f23956t = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14451t(parcel, 2, this.f23950f, i, false);
        C3733c.m14447p(parcel, 3, this.f23951o, i, false);
        C3733c.m14447p(parcel, 4, this.f23952p, i, false);
        C3733c.m14448q(parcel, 5, this.f23953q, false);
        C3733c.m14440i(parcel, 6, this.f23954r);
        C3733c.m14448q(parcel, 7, this.f23955s, false);
        C3733c.m14434c(parcel, 8, this.f23956t);
        C3733c.m14433b(parcel, a);
    }
}
