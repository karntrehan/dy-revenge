package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.zb */
public final class C7522zb extends C3730a {
    public static final Parcelable.Creator<C7522zb> CREATOR = new C7439tc();

    /* renamed from: f */
    private final String f20251f;

    /* renamed from: o */
    private final String f20252o;

    /* renamed from: p */
    private final int f20253p;

    public C7522zb(String str, String str2, int i) {
        this.f20251f = str;
        this.f20252o = str2;
        this.f20253p = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f20251f, false);
        C3733c.m14448q(parcel, 2, this.f20252o, false);
        C3733c.m14443l(parcel, 3, this.f20253p);
        C3733c.m14433b(parcel, a);
    }
}
