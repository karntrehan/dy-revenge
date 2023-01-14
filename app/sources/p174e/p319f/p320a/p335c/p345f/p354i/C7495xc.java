package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.xc */
public final class C7495xc extends C3730a {
    public static final Parcelable.Creator<C7495xc> CREATOR = new C7197d();

    /* renamed from: f */
    public String f20143f;

    /* renamed from: o */
    public String f20144o;

    /* renamed from: p */
    public int f20145p;

    public C7495xc() {
    }

    public C7495xc(String str, String str2, int i) {
        this.f20143f = str;
        this.f20144o = str2;
        this.f20145p = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f20143f, false);
        C3733c.m14448q(parcel, 3, this.f20144o, false);
        C3733c.m14443l(parcel, 4, this.f20145p);
        C3733c.m14433b(parcel, a);
    }
}
