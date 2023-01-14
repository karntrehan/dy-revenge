package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.lc */
public final class C7327lc extends C3730a {
    public static final Parcelable.Creator<C7327lc> CREATOR = new C7167b();

    /* renamed from: f */
    public String f19676f;

    /* renamed from: o */
    public String f19677o;

    public C7327lc() {
    }

    public C7327lc(String str, String str2) {
        this.f19676f = str;
        this.f19677o = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f19676f, false);
        C3733c.m14448q(parcel, 3, this.f19677o, false);
        C3733c.m14433b(parcel, a);
    }
}
