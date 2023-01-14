package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p130z.C3730a;

/* renamed from: com.google.android.gms.measurement.internal.sa */
public final class C4045sa extends C3730a {
    public static final Parcelable.Creator<C4045sa> CREATOR = new C4057ta();

    /* renamed from: f */
    public final int f11275f;

    /* renamed from: o */
    public final String f11276o;

    /* renamed from: p */
    public final long f11277p;

    /* renamed from: q */
    public final Long f11278q;

    /* renamed from: r */
    public final String f11279r;

    /* renamed from: s */
    public final String f11280s;

    /* renamed from: t */
    public final Double f11281t;

    C4045sa(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f11275f = i;
        this.f11276o = str;
        this.f11277p = j;
        this.f11278q = l;
        if (i == 1) {
            this.f11281t = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f11281t = d;
        }
        this.f11279r = str2;
        this.f11280s = str3;
    }

    C4045sa(C4069ua uaVar) {
        this(uaVar.f11330c, uaVar.f11331d, uaVar.f11332e, uaVar.f11329b);
    }

    C4045sa(String str, long j, Object obj, String str2) {
        C3705r.m14342g(str);
        this.f11275f = 2;
        this.f11276o = str;
        this.f11277p = j;
        this.f11280s = str2;
        if (obj == null) {
            this.f11278q = null;
            this.f11281t = null;
            this.f11279r = null;
        } else if (obj instanceof Long) {
            this.f11278q = (Long) obj;
            this.f11281t = null;
            this.f11279r = null;
        } else if (obj instanceof String) {
            this.f11278q = null;
            this.f11281t = null;
            this.f11279r = (String) obj;
        } else if (obj instanceof Double) {
            this.f11278q = null;
            this.f11281t = (Double) obj;
            this.f11279r = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* renamed from: o */
    public final Object mo12418o() {
        Long l = this.f11278q;
        if (l != null) {
            return l;
        }
        Double d = this.f11281t;
        if (d != null) {
            return d;
        }
        String str = this.f11279r;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C4057ta.m15346a(this, parcel, i);
    }
}
