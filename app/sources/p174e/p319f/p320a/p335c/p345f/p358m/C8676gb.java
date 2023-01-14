package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.f.m.gb */
public final class C8676gb extends C3730a {
    public static final Parcelable.Creator<C8676gb> CREATOR = new C8689hb();

    /* renamed from: f */
    private final String f23748f;

    /* renamed from: o */
    private final List<C8598ab> f23749o;

    public C8676gb(String str, List<C8598ab> list) {
        this.f23748f = str;
        this.f23749o = list;
    }

    /* renamed from: o */
    public final String mo22427o() {
        return this.f23748f;
    }

    /* renamed from: p */
    public final List<C8598ab> mo22428p() {
        return this.f23749o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f23748f, false);
        C3733c.m14452u(parcel, 2, this.f23749o, false);
        C3733c.m14433b(parcel, a);
    }
}
