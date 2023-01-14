package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.m.lb */
public final class C8741lb extends C3730a {
    public static final Parcelable.Creator<C8741lb> CREATOR = new C8754mb();

    /* renamed from: f */
    private final String f23885f;

    public C8741lb(String str) {
        this.f23885f = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f23885f, false);
        C3733c.m14433b(parcel, a);
    }
}
