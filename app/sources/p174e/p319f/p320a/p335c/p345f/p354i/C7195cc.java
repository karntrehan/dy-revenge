package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.cc */
public final class C7195cc extends C3730a {
    public static final Parcelable.Creator<C7195cc> CREATOR = new C7210dc();

    /* renamed from: f */
    private final int f19223f;

    public C7195cc(int i) {
        this.f19223f = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f19223f);
        C3733c.m14433b(parcel, a);
    }
}
