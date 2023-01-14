package p174e.p319f.p320a.p335c.p345f.p358m;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.f.m.ab */
public final class C8598ab extends C3730a {
    public static final Parcelable.Creator<C8598ab> CREATOR = new C8611bb();

    /* renamed from: f */
    private final String f23520f;

    /* renamed from: o */
    private final Rect f23521o;

    /* renamed from: p */
    private final List<Point> f23522p;

    /* renamed from: q */
    private final String f23523q;

    /* renamed from: r */
    private final List<C8650eb> f23524r;

    public C8598ab(String str, Rect rect, List<Point> list, String str2, List<C8650eb> list2) {
        this.f23520f = str;
        this.f23521o = rect;
        this.f23522p = list;
        this.f23523q = str2;
        this.f23524r = list2;
    }

    /* renamed from: C */
    public final List<Point> mo22312C() {
        return this.f23522p;
    }

    /* renamed from: E */
    public final List<C8650eb> mo22313E() {
        return this.f23524r;
    }

    /* renamed from: o */
    public final Rect mo22314o() {
        return this.f23521o;
    }

    /* renamed from: p */
    public final String mo22315p() {
        return this.f23523q;
    }

    /* renamed from: r */
    public final String mo22316r() {
        return this.f23520f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f23520f, false);
        C3733c.m14447p(parcel, 2, this.f23521o, i, false);
        C3733c.m14452u(parcel, 3, this.f23522p, false);
        C3733c.m14448q(parcel, 4, this.f23523q, false);
        C3733c.m14452u(parcel, 5, this.f23524r, false);
        C3733c.m14433b(parcel, a);
    }
}
