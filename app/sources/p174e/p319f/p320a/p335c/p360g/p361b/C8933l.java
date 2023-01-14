package p174e.p319f.p320a.p335c.p360g.p361b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.internal.C3718v0;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.g.b.l */
public final class C8933l extends C3730a {
    public static final Parcelable.Creator<C8933l> CREATOR = new C8934m();

    /* renamed from: f */
    final int f24335f;

    /* renamed from: o */
    private final C3623b f24336o;

    /* renamed from: p */
    private final C3718v0 f24337p;

    C8933l(int i, C3623b bVar, C3718v0 v0Var) {
        this.f24335f = i;
        this.f24336o = bVar;
        this.f24337p = v0Var;
    }

    /* renamed from: o */
    public final C3623b mo22745o() {
        return this.f24336o;
    }

    /* renamed from: p */
    public final C3718v0 mo22746p() {
        return this.f24337p;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f24335f);
        C3733c.m14447p(parcel, 2, this.f24336o, i, false);
        C3733c.m14447p(parcel, 3, this.f24337p, i, false);
        C3733c.m14433b(parcel, a);
    }
}
