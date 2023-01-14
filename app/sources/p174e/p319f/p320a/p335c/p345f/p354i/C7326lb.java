package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.lb */
public final class C7326lb extends C3730a {
    public static final Parcelable.Creator<C7326lb> CREATOR = new C7271hd();

    /* renamed from: f */
    public int f19674f;

    /* renamed from: o */
    public String f19675o;

    public C7326lb() {
    }

    public C7326lb(int i, String str) {
        this.f19674f = i;
        this.f19675o = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 2, this.f19674f);
        C3733c.m14448q(parcel, 3, this.f19675o, false);
        C3733c.m14433b(parcel, a);
    }
}
