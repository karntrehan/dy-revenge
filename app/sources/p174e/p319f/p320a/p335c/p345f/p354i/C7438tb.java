package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.tb */
public final class C7438tb extends C3730a {
    public static final Parcelable.Creator<C7438tb> CREATOR = new C7285ic();

    /* renamed from: f */
    private final int f20004f;

    /* renamed from: o */
    private final String f20005o;

    /* renamed from: p */
    private final String f20006p;

    /* renamed from: q */
    private final String f20007q;

    public C7438tb(int i, String str, String str2, String str3) {
        this.f20004f = i;
        this.f20005o = str;
        this.f20006p = str2;
        this.f20007q = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f20004f);
        C3733c.m14448q(parcel, 2, this.f20005o, false);
        C3733c.m14448q(parcel, 3, this.f20006p, false);
        C3733c.m14448q(parcel, 4, this.f20007q, false);
        C3733c.m14433b(parcel, a);
    }
}
