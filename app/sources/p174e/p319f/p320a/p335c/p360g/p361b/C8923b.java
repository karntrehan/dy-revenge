package p174e.p319f.p320a.p335c.p360g.p361b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: e.f.a.c.g.b.b */
public final class C8923b extends C3730a implements C3612k {
    public static final Parcelable.Creator<C8923b> CREATOR = new C8924c();

    /* renamed from: f */
    final int f24328f;

    /* renamed from: o */
    private int f24329o;

    /* renamed from: p */
    private Intent f24330p;

    public C8923b() {
        this(2, 0, (Intent) null);
    }

    C8923b(int i, int i2, Intent intent) {
        this.f24328f = i;
        this.f24329o = i2;
        this.f24330p = intent;
    }

    /* renamed from: k */
    public final Status mo11102k() {
        return this.f24329o == 0 ? Status.f9819f : Status.f9823r;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f24328f);
        C3733c.m14443l(parcel, 2, this.f24329o);
        C3733c.m14447p(parcel, 3, this.f24330p, i, false);
        C3733c.m14433b(parcel, a);
    }
}
