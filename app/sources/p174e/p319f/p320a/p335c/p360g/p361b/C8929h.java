package p174e.p319f.p320a.p335c.p360g.p361b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.g.b.h */
public final class C8929h extends C3730a implements C3612k {
    public static final Parcelable.Creator<C8929h> CREATOR = new C8930i();

    /* renamed from: f */
    private final List<String> f24331f;

    /* renamed from: o */
    private final String f24332o;

    public C8929h(List<String> list, String str) {
        this.f24331f = list;
        this.f24332o = str;
    }

    /* renamed from: k */
    public final Status mo11102k() {
        return this.f24332o != null ? Status.f9819f : Status.f9823r;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14450s(parcel, 1, this.f24331f, false);
        C3733c.m14448q(parcel, 2, this.f24332o, false);
        C3733c.m14433b(parcel, a);
    }
}
