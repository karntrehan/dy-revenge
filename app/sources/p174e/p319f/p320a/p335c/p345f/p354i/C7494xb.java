package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.xb */
public final class C7494xb extends C3730a {
    public static final Parcelable.Creator<C7494xb> CREATOR = new C7411rc();

    /* renamed from: f */
    private final String f20141f;

    /* renamed from: o */
    private final String f20142o;

    public C7494xb(String str, String str2) {
        this.f20141f = str;
        this.f20142o = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f20141f, false);
        C3733c.m14448q(parcel, 2, this.f20142o, false);
        C3733c.m14433b(parcel, a);
    }
}
