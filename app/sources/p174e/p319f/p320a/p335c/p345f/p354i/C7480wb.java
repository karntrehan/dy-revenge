package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.wb */
public final class C7480wb extends C3730a {
    public static final Parcelable.Creator<C7480wb> CREATOR = new C7397qc();

    /* renamed from: f */
    private final int f20100f;

    /* renamed from: o */
    private final String f20101o;

    public C7480wb(int i, String str) {
        this.f20100f = i;
        this.f20101o = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f20100f);
        C3733c.m14448q(parcel, 2, this.f20101o, false);
        C3733c.m14433b(parcel, a);
    }
}
