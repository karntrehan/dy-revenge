package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.f.i.j9 */
public final class C7296j9 extends C3730a {
    public static final Parcelable.Creator<C7296j9> CREATOR = new C7241fd();

    /* renamed from: f */
    public double f19442f;

    /* renamed from: o */
    public double f19443o;

    public C7296j9() {
    }

    public C7296j9(double d, double d2) {
        this.f19442f = d;
        this.f19443o = d2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14438g(parcel, 2, this.f19442f);
        C3733c.m14438g(parcel, 3, this.f19443o);
        C3733c.m14433b(parcel, a);
    }
}
