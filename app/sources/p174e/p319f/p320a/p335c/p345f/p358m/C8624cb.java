package p174e.p319f.p320a.p335c.p345f.p358m;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: e.f.a.c.f.m.cb */
public final class C8624cb extends C3730a {
    public static final Parcelable.Creator<C8624cb> CREATOR = new C8637db();

    /* renamed from: f */
    private final String f23633f;

    /* renamed from: o */
    private final Rect f23634o;

    /* renamed from: p */
    private final List<Point> f23635p;

    /* renamed from: q */
    private final String f23636q;

    public C8624cb(String str, Rect rect, List<Point> list, String str2) {
        this.f23633f = str;
        this.f23634o = rect;
        this.f23635p = list;
        this.f23636q = str2;
    }

    /* renamed from: C */
    public final List<Point> mo22337C() {
        return this.f23635p;
    }

    /* renamed from: o */
    public final Rect mo22338o() {
        return this.f23634o;
    }

    /* renamed from: p */
    public final String mo22339p() {
        return this.f23636q;
    }

    /* renamed from: r */
    public final String mo22340r() {
        return this.f23633f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f23633f, false);
        C3733c.m14447p(parcel, 2, this.f23634o, i, false);
        C3733c.m14452u(parcel, 3, this.f23635p, false);
        C3733c.m14448q(parcel, 4, this.f23636q, false);
        C3733c.m14433b(parcel, a);
    }
}
