package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.i8 */
public final class C7281i8 extends C3730a {
    public static final Parcelable.Creator<C7281i8> CREATOR = new C7226ed();

    /* renamed from: f */
    public int f19402f;

    /* renamed from: o */
    public String f19403o;

    /* renamed from: p */
    public String f19404p;

    /* renamed from: q */
    public String f19405q;

    public C7281i8() {
    }

    public C7281i8(int i, String str, String str2, String str3) {
        this.f19402f = i;
        this.f19403o = str;
        this.f19404p = str2;
        this.f19405q = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f19402f);
        C3733c.m14448q(parcel, 3, this.f19403o, false);
        C3733c.m14448q(parcel, 4, this.f19404p, false);
        C3733c.m14448q(parcel, 5, this.f19405q, false);
        C3733c.m14433b(parcel, a);
    }
}
