package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.yb */
public final class C7508yb extends C3730a {
    public static final Parcelable.Creator<C7508yb> CREATOR = new C7425sc();

    /* renamed from: f */
    private final String f20192f;

    /* renamed from: o */
    private final String f20193o;

    public C7508yb(String str, String str2) {
        this.f20192f = str;
        this.f20193o = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f20192f, false);
        C3733c.m14448q(parcel, 2, this.f20193o, false);
        C3733c.m14433b(parcel, a);
    }
}
