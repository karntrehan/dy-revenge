package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.measurement.internal.y */
public final class C4106y implements Parcelable.Creator {
    /* renamed from: a */
    static void m15457a(C4094x xVar, Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, xVar.f11381f, false);
        C3733c.m14447p(parcel, 3, xVar.f11382o, i, false);
        C3733c.m14448q(parcel, 4, xVar.f11383p, false);
        C3733c.m14445n(parcel, 5, xVar.f11384q);
        C3733c.m14433b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        String str = null;
        C4070v vVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            int k = C3731b.m14416k(r);
            if (k == 2) {
                str = C3731b.m14410e(parcel, r);
            } else if (k == 3) {
                vVar = (C4070v) C3731b.m14409d(parcel, r, C4070v.CREATOR);
            } else if (k == 4) {
                str2 = C3731b.m14410e(parcel, r);
            } else if (k != 5) {
                C3731b.m14429x(parcel, r);
            } else {
                j = C3731b.m14426u(parcel, r);
            }
        }
        C3731b.m14415j(parcel, y);
        return new C4094x(str, vVar, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4094x[i];
    }
}
