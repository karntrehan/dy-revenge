package p174e.p319f.p320a.p335c.p345f.p358m;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.f.m.eb */
public final class C8650eb extends C3730a {
    public static final Parcelable.Creator<C8650eb> CREATOR = new C8663fb();

    /* renamed from: f */
    private final String f23699f;

    /* renamed from: o */
    private final Rect f23700o;

    /* renamed from: p */
    private final List<Point> f23701p;

    /* renamed from: q */
    private final String f23702q;

    /* renamed from: r */
    private final List<C8624cb> f23703r;

    public C8650eb(String str, Rect rect, List<Point> list, String str2, List<C8624cb> list2) {
        this.f23699f = str;
        this.f23700o = rect;
        this.f23701p = list;
        this.f23702q = str2;
        this.f23703r = list2;
    }

    /* renamed from: C */
    public final List<Point> mo22392C() {
        return this.f23701p;
    }

    /* renamed from: E */
    public final List<C8624cb> mo22393E() {
        return this.f23703r;
    }

    /* renamed from: o */
    public final Rect mo22394o() {
        return this.f23700o;
    }

    /* renamed from: p */
    public final String mo22395p() {
        return this.f23702q;
    }

    /* renamed from: r */
    public final String mo22396r() {
        return this.f23699f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f23699f, false);
        C3733c.m14447p(parcel, 2, this.f23700o, i, false);
        C3733c.m14452u(parcel, 3, this.f23701p, false);
        C3733c.m14448q(parcel, 4, this.f23702q, false);
        C3733c.m14452u(parcel, 5, this.f23703r, false);
        C3733c.m14433b(parcel, a);
    }
}
