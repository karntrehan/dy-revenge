package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3731b;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.measurement.internal.ta */
public final class C4057ta implements Parcelable.Creator {
    /* renamed from: a */
    static void m15346a(C4045sa saVar, Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, saVar.f11275f);
        C3733c.m14448q(parcel, 2, saVar.f11276o, false);
        C3733c.m14445n(parcel, 3, saVar.f11277p);
        C3733c.m14446o(parcel, 4, saVar.f11278q, false);
        C3733c.m14441j(parcel, 5, (Float) null, false);
        C3733c.m14448q(parcel, 6, saVar.f11279r, false);
        C3733c.m14448q(parcel, 7, saVar.f11280s, false);
        C3733c.m14439h(parcel, 8, saVar.f11281t, false);
        C3733c.m14433b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 2:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 3:
                    j = C3731b.m14426u(parcel2, r);
                    break;
                case 4:
                    l = C3731b.m14427v(parcel2, r);
                    break;
                case 5:
                    f = C3731b.m14422q(parcel2, r);
                    break;
                case 6:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                case 7:
                    str3 = C3731b.m14410e(parcel2, r);
                    break;
                case 8:
                    d = C3731b.m14420o(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C4045sa(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4045sa[i];
    }
}
