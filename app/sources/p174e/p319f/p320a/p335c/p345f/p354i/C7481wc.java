package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.wc */
public final class C7481wc extends C3730a {
    public static final Parcelable.Creator<C7481wc> CREATOR = new C7182c();

    /* renamed from: f */
    public String f20102f;

    /* renamed from: o */
    public String f20103o;

    public C7481wc() {
    }

    public C7481wc(String str, String str2) {
        this.f20102f = str;
        this.f20103o = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f20102f, false);
        C3733c.m14448q(parcel, 3, this.f20103o, false);
        C3733c.m14433b(parcel, a);
    }
}
